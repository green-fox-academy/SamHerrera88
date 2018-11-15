package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.Todo;
import com.greenfoxacademy.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;

    }

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "todolist";
    }

    @GetMapping("/add")
    public String createToDo(Model model) {
        model.addAttribute("newTodo",new Todo());
        return "createtodo";
    }

    @PostMapping("/create")
    public String saveTodo(@ModelAttribute Todo todo) {
    todoService.saveTodo(todo);
    return "redirect:/list";
    }
    @PostMapping
    public String deleteTodo(@PathVariable(value = "id") Long id){
        todoService.removeById(id);
        return "redirect:/list";

    }
//    @PostMapping("update/{id}")
//    public String updateTodo(@PathVariable(value = "id") Long id, @ModelAttribute Todo todo){
//        todo.setId(id);
//        todoService.updateTodo(todo);
//        Optional<Todo> needToEditTodo = todoService.getTodoById(id);
//        return "redirect:/list";
//    }
}
