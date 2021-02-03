package com.example.ap.mongodriver.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ap.mongodriver.api.interfaces.TodoInterface;
import com.example.ap.mongodriver.commons.exception.StandardException;
import com.example.ap.mongodriver.controller.TodoController;
import com.example.ap.mongodriver.domain.Todo;

@Service
public class TodoInterfaceImpl implements TodoInterface {

    @Autowired
    private TodoController todoController;

    @Override
    public List<Todo> getAllTodo() {
        return todoController.getAllTodos();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoController.createTodo(todo);
    }

    @Override
    public Todo getTodoById(String id) throws StandardException {
        return todoController.getTodoById(id);
    }

    @Override
    public Todo updateTodo(String id, Todo todo) {
        return todoController.updateTodo(id, todo);
    }
}
