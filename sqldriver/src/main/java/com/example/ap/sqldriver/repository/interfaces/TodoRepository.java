package com.example.ap.sqldriver.repository.interfaces;

import com.example.ap.sqldriver.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
