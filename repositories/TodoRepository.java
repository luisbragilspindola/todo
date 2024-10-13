package com.luis.todo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luis.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{


}
