package com.example.example.controller;

import com.example.example.repository.ProductService;
import com.example.example.service.EmployeeService;
import com.example.example.service.MathService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    MathService mathService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ProductService productService;

    @GetMapping("/sum")
    @Operation(summary = "Get sum")
    @ApiResponse(responseCode = "200", description = "to add the integers")
    public int getSum(@RequestParam("num") String num){
        return mathService.checkMaximumProductTriplet();
    }

    @GetMapping("")
    public int getSums(){
        return mathService.checkMaximumProductTriplet();
    }

    @GetMapping("cbr/{id}")
    public String getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    public String fallback(String id, Throwable t) {
        // fallback method stays in the service
        return productService.fallback(id, t);
    }
}
