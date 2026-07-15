package com.example.todo_backend.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController{
//    @GetMapping("/sayHello")
//    public String sayHello(@RequestParam String name){
//        return "Hello "+name;
//    }
//
//    @GetMapping("/tasks/{id}")
//    public int getTask(@PathVariable int id){
//        return id;
//    }

    @PostMapping("/tasks")
    public String createTask(@RequestBody String task){
        return task;
    }





}