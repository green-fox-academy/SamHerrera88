package com.greenfoxacademy.Controllers;

import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Another {


    @Autowired
    TodoRepo repo;

    @GetMapping("/asd")
    public String asd(){
        return "todolist34";
    }


    @GetMapping("/todo")
    public String asdfghjk(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }
}
