package com.example.ap.mongodriver.domain;

import static com.example.ap.mongodriver.domain.Todo.TODO_COLLECTION;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = TODO_COLLECTION)
public class Todo {
    public static final String TODO_COLLECTION = "todo";
    public static final String TO_STRING_TEMPLATE = "Todo{id='%s', description='%s', completed='%s', '%s'}";
    public static final String NUMERIC_ID = "601237118970110001826374";
    public static final String ALPHA_NUMERIC_ID = "602162c98bc9f737f749d4f2";

    @Id
    private String id;
    public static final String ID_FIELD = "id";

    private String description;
    public static final String DESCRIPTION_FIELD = "description";

    private Boolean completed;
    public static final String COMPLETED_FIELD = "completed";

    private Map<String, String> testMap;
    public static final String TEST_MAP_FIELD = "testMap";

    public Todo() {
        this.testMap = new HashMap<>();
    }

    public Todo(String id, String description, Boolean completed) {
        this();
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Map<String, String> getTestMap() {
        return testMap;
    }

    public void setTestMap(Map<String, String> testMap) {
        this.testMap = testMap;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE, id, description, completed, testMap);
    }
}
