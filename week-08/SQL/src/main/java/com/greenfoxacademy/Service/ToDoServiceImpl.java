package com.greenfoxacademy.Service;

import com.greenfoxacademy.Model.Todo;

import java.util.List;
import java.util.Optional;

public interface ToDoServiceImpl {

    List<Todo> getAllTodos();

    void saveTodo(Todo todo);

    void removeById(Long id);

    Optional<Todo> getTodoById(Long id);

    void updateTodo(Todo todo);
}

