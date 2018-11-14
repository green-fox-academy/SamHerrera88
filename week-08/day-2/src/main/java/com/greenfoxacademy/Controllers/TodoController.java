package com.greenfoxacademy.Controllers;

import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    @Autowired
    TodoRepo repo;

    public TodoController() {
        System.out.println("asdfgh");
    }

}
