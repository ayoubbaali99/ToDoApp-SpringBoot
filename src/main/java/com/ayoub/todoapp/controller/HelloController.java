package com.ayoub.todoapp.controller;

import com.ayoub.todoapp.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private final TaskService taskService;

    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/hello")
    public String hello() {
        return taskService.getTask();
    }


}
