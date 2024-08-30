package com.aman.java.controller;

import com.aman.java.pojo.Employee;
import com.aman.java.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aman/practice/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/id/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") int id){
        return ResponseEntity.ok().body(employeeService.getById(id));
    }
}
