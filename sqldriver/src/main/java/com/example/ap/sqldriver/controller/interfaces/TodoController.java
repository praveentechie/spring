package com.example.ap.sqldriver.controller.interfaces;

import com.example.ap.sqldriver.domain.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.ap.sqldriver.controller.interfaces.TodoController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH)
public interface TodoController {
    String BASE_PATH = "/v1/todos";

    @GetMapping(path = "/")
    List<Todo> getAllTodos();

    @PostMapping(path = "/")
    Todo getTodoById(@RequestBody Todo todo);

    @GetMapping(path = "/{id}")
    Todo getTodoById(@PathVariable Long id);
}
