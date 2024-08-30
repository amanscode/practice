package com.aman.java.service;

import com.aman.java.pojo.Employee;
import com.aman.java.util.SampleEmployeeData;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee getById(int id){
        return SampleEmployeeData.getListOfEmployees().stream().filter(e -> e.getId()==id).findFirst().orElse(null);
    }
}
