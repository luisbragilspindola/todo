package com.luis.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.luis.todo.domain.Todo;
import com.luis.todo.repositories.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = repository.findAllOpen();
		return list;

	}
	
	public List<Todo> findAllClose() {
		List<Todo> list = repository.findAllClose();
		return list;
		
	}

	public List<Todo> findAll() {
		List<Todo> list = repository.findAll();
		return list;
	}

}
