package com.example.ap.sqldriver.controller.impl;

import com.example.ap.sqldriver.controller.interfaces.TodoController;
import com.example.ap.sqldriver.domain.Todo;
import com.example.ap.sqldriver.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoControllerImpl implements TodoController {

    @Autowired
    private TodoService todoService;

    @Override
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @Override
    public Todo getTodoById(Todo todo) {
        return todoService.createTodo(todo);
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoService.getTodoById(id);
    }
}
