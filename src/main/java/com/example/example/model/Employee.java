package com.example.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "employee")
@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Employee {
    @Id
    Long id;
    String name;
    Integer age;
    Double salary;
    @Override
    public String toString() {
        return "Employee{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

