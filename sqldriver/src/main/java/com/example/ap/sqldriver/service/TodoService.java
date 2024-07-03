package com.example.ap.sqldriver.service;

import com.example.ap.sqldriver.domain.Todo;
import com.example.ap.sqldriver.repository.interfaces.TodoRepository;
import com.example.ap.sqldriver.util.exception.custom_exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long todoId) {
        Optional<Todo> optionalTodo = todoRepository.findById(todoId);
        return optionalTodo.orElseThrow(() -> new NotFoundException("Todo item doesn't exists"));
    }
}
