package com.example.todoapp.controller;

import com.example.todoapp.domain.Todos;
import com.example.todoapp.dto.AddTodoRequest;
import com.example.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TodoApiController {

    private final TodoService todoService;

    @PostMapping("/api/todos")
    public ResponseEntity<Todos> addTodo(@RequestBody AddTodoRequest request) {
        Todos savedTodo = todoService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedTodo);
    }
}
