package com.greenfoxacademy.Service;

import com.greenfoxacademy.Model.Todo;
import com.greenfoxacademy.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements ToDoServiceImpl {

    private TodoRepo todoRepo;

    @Autowired
    public TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todoRepo.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepo.save(todo);
    }

    @Override
    public void removeById(Long id) {
        todoRepo.deleteById(id);
    }

    @Override
    public Optional<Todo> getTodoById(Long id) {
        return todoRepo.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepo.save(todo);
    }
}
