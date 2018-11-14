package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.Todo;
import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    TodoRepo repo;

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }

    @GetMapping("/add")
    public String createToDo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "createtodo";
    }

    @PostMapping("/create")
    public String saveTodo(@ModelAttribute Todo todo) {

    }
}
