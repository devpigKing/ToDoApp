package com.example.todoapp.dto;

import com.example.todoapp.domain.Todos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddTodoRequest {

    private String title;
    private String content;

    public Todos toEntity() {
        return Todos.builder()
                .title(title)
                .content(content)
                .build();
    }
}
