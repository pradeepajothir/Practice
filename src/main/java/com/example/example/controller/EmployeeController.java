package com.example.example.controller;

import com.example.example.model.Employee;
import com.example.example.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    @Operation(summary = "Get employee by ID")
    @ApiResponse(responseCode = "200", description = "Found the employee")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    @Operation(summary = "save employee details")
    @ApiResponse(responseCode = "200", description = "saved the employee details")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
