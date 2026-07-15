package com.example.todo_backend.controller;

import org.springframework.web.bind.annotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;*;

@RestController
@RequestMapping("/tasks")

public class TaskController{

    @GetMapping
    public String getAllTasks(){
        return "Returning all tasks";
    }

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable long id){
        return "Task ID : "+id;
    }

    @PostMapping
    public String createTask(){
        return "Task created";
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable long id){
        return "Updated Task "+id;

    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable long id){
        return "Deleted Task "+id;
    }
}