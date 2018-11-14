package com.greenfoxacademy;

import com.greenfoxacademy.Model.Todo;
import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
    @Autowired
    TodoRepo repo;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("asd");
    repo.save(new Todo("I have to learn Object Relational Mapping"));
    }

}

