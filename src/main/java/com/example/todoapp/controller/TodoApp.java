package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoApp {

    @GetMapping("/todoapp")
    public String App() {

        return "todo";
    }
}
