package com.example.ap.sqldriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySQLApplication {
	private static final String URL_MAPPINGS = "/*";

	public static void main(String[] args) {
		SpringApplication.run(MySQLApplication.class, args);
	}
}
