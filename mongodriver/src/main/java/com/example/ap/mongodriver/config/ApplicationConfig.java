package com.example.ap.mongodriver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.example.ap.mongodriver.repository")
@ComponentScan({
      "com.example.ap.mongodriver.config",
      "com.example.ap.mongodriver.controller",
      "com.example.ap.mongodriver.repository"
})
@Import({
      RestConfig.class
})
public class ApplicationConfig {}
