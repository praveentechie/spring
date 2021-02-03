package com.example.ap.mongodriver.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.ap.mongodriver.domain.Todo;

//TODO: not working
@ExtendWith(SpringExtension.class)
public class TodoRepositoryTest {

    @InjectMocks
    private TodoRepository todoRepository;

    @Test
    public void testGetAll() {
        List<Todo> todoList = todoRepository.findAll();
        assertEquals(0, todoList.size());
    }
}
