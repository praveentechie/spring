package com.example.ap.mongodriver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@PropertySource({ "classpath:application-test.properties" })
@ComponentScan({ "com.example.ap.mongodriver" })
@EnableMongoRepositories("com.example.ap.mongodriver.repository")
public class TestConfig {}
