package com.example.todoapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @Column(name = "created_date", nullable = false)
    private String created_date;

    @Column(name = "modified_date", nullable = false)
    private String modified_date;

    @PrePersist
    public void onPrePersist() {
        this.created_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.modified_date = this.created_date;
    }

    @PreUpdate
    public void onPreUpdate() {
        this.modified_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
    }
}
