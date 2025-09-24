package com.example.example.service;

import com.example.example.model.Employee;
import com.example.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository repository;


    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElse(null);  // returns Employee or null if not found
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}
