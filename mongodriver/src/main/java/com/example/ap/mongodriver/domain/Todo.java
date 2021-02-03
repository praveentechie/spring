package com.example.ap.mongodriver.domain;

import static com.example.ap.mongodriver.domain.Todo.TODO_COLLECTION;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = TODO_COLLECTION)
public class Todo {
    public static final String TODO_COLLECTION = "todo";
    public static final String TO_STRING_TEMPLATE = "Todo{id='%s', description='%s', completed='%s'}";

    @Id
    private String id;
    public static final String ID_FIELD = "id";

    private String description;
    public static final String DESCRIPTION_FIELD = "description";

    private Boolean completed;
    public static final String COMPLETED_FIELD = "completed";

    public Todo() {}

    public Todo(String id, String description, Boolean completed) {
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

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE, id, description, completed);
    }
}
