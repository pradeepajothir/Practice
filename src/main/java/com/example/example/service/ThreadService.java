package com.example.example.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Service
public class ThreadService {

    private final ExecutorService executorService;

    public ThreadService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void runTasks() {
        Runnable task = () -> {
            System.out.println("Running in thread: " + Thread.currentThread().getName());
            // your task logic here
        };

        executorService.submit(task);
    }
    public Future<String> asyncTask() {
        Callable<String> callable = () -> {
            Thread.sleep(3000); // simulate long task
            return "Task completed by " + Thread.currentThread().getName();
        };

        return executorService.submit(callable);
    }
}