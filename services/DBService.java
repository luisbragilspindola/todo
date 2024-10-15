package com.luis.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.todo.domain.Todo;
import com.luis.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void IntanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);

		Todo t2 = new Todo(null, "Exercícios", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);

		Todo t3 = new Todo(null, "Testar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), true);
		
		Todo t4 = new Todo(null, "Publicar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
