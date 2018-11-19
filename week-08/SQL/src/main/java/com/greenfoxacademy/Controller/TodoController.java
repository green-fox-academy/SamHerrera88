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

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "todolist";
    }

    @GetMapping("/add")
    public String createToDo() {
        return "createtodo";
    }

    @PostMapping("/")
    public String saveTodo(@RequestParam String newTodo) {
    todoService.saveTodo(new Todo (newTodo));
    return "redirect:/list";
    }
    @DeleteMapping("/{id}/delete")
    public String deleteTodo(@PathVariable(value = "id") long id){
        todoService.removeById(id);
        return "redirect:/list";

    }
    @GetMapping("/{id}/edit")
    public String editTodo(@PathVariable(value = "id") long id, Model model) {
        Optional<Todo> todo = todoService.getTodoById(id);
        model.addAttribute("todo", todo.get());
        return "updatepage";
    }

    @PostMapping("/{id}/update")
    public String updateTodo(@PathVariable(value = "id") long id, @ModelAttribute Todo todo){
        todo.setId(id);
        todoService.updateTodo(todo);
        Optional<Todo> needToEditTodo = todoService.getTodoById(id);
        return "updatepage";
    }
}
