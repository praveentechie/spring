package com.example.ap.mongodriver.repository;

import static com.example.ap.mongodriver.domain.Todo.ID_FIELD;
import static com.example.ap.mongodriver.domain.Todo.TEST_MAP_FIELD;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.example.ap.mongodriver.domain.Todo;

public class TodoRepositoryCustomImpl implements TodoRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Todo updateTestMap(String id, String key, String value) {
        Query query = Query.query(where(ID_FIELD).is(id));
        System.out.println(mongoTemplate.find(query, Todo.class));
        Update update = new Update().set(nestedField(TEST_MAP_FIELD, key), value);
        System.out.println(update);
        System.out.println(mongoTemplate.updateFirst(query, update, Todo.class));
        return null;
    }

    private String nestedField(String... fields) {
        return StringUtils.join(fields, ".");
    }
}
