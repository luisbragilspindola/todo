package com.luis.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luis.todo.domain.Todo;
import com.luis.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
