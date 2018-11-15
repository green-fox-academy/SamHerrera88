package com.greenfoxacademy;

import com.greenfoxacademy.Model.Todo;
import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainToDo {

    private TodoRepo repo;

    @Autowired
    public MainToDo(TodoRepo todoRepo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainToDo.class, args);
    }


    public void run(String... args) throws Exception {
        repo.save(new Todo("Praise the Lord today", true, true));
        repo.save(new Todo("Finish The ToDo App", false, true));
        repo.save(new Todo("Get a haircut", false, false));
        repo.save(new Todo("Make someone's day", false, true));
        repo.save(new Todo("Get a snack", true, false));
        repo.save(new Todo("Breath in the air of the Spirit", true, true));
        repo.save(new Todo("Buy plant-based groceries", false, false));
        repo.save(new Todo("Organize wardrobe", false, false));
        repo.save(new Todo("Go for a run", false, true));
    }
}