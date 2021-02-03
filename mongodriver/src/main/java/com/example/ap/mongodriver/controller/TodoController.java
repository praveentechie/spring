package com.example.ap.mongodriver.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ap.mongodriver.commons.exception.StandardException;
import com.example.ap.mongodriver.domain.Todo;
import com.example.ap.mongodriver.repository.TodoRepository;

@Component
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @PostConstruct
    private void postConst() {
        System.out.println("Post const: Controller");
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(String id, Todo todo) {
        todo.setId(id);
        return todoRepository.save(todo);
    }

    public Todo getTodoById(String id) throws StandardException {
        Optional<Todo> todoOptional = todoRepository.findById(id);
        if (todoOptional.isPresent()) {
            return todoOptional.get();
        } else {
            throw new StandardException("Todo item not available", Status.BAD_REQUEST);
        }
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
}
