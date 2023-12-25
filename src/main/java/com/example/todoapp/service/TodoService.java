package com.example.todoapp.service;

import com.example.todoapp.domain.Todos;
import com.example.todoapp.dto.AddTodoRequest;
import com.example.todoapp.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodosRepository todosRepository;

    // Todos 리스트 추가 메서드
    public Todos save(AddTodoRequest request) {

        return todosRepository.save(request.toEntity());
    }
}
