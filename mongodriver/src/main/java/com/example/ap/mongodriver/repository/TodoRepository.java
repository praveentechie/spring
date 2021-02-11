package com.example.ap.mongodriver.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ap.mongodriver.domain.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, String>, TodoRepositoryCustom {
    List<Todo> findAll();
}
