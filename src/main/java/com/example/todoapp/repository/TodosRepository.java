package com.example.todoapp.repository;

import com.example.todoapp.domain.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<Todos, Long> {

}
