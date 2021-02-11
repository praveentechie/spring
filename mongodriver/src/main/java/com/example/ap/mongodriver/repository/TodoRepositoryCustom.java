package com.example.ap.mongodriver.repository;

import com.example.ap.mongodriver.domain.Todo;

public interface TodoRepositoryCustom {
    Todo updateTestMap(String id, String key, String value);
}
