package com.example.example.repository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    //@Retry(name = "backendA", fallbackMethod = "fallback")
    @CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
   // @RateLimiter(name = "backendA", fallbackMethod = "fallback")
    public String getProduct(String id) {
        System.out.println("Trying to get product: " + id);
        throw new RuntimeException("Something went wrong");
    }

    public String fallback(String id, Throwable t) {
        System.out.println("Fallback called for id: " + id + ", cause: " + t.getMessage());
        return "Fallback response for product: " + id;
    }
}
