package com.example.example.controller;

import com.example.example.service.ThreadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class ThreadController {

    private final ThreadService threadService;

    public ThreadController(ThreadService threadService) {
        this.threadService = threadService;
    }

    @GetMapping("/run-task")
    public String runTask() {
        threadService.runTasks();
        return "Task submitted!";
    }
    @GetMapping("/start-task")
    public String startTask() throws ExecutionException, InterruptedException {
        Future<String> futureResult = threadService.asyncTask();

        // You can do other things here...

        // Wait for the task to complete and get the result
        String result = futureResult.get();

        return result;
    }
}