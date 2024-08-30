package com.aman.java.util;

import com.aman.java.pojo.Department;
import com.aman.java.pojo.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleEmployeeData {
    public static List<Employee> getListOfEmployees(){
        List<Employee> empList = new ArrayList<>();
        try{
            Department hr = new Department("HR", 1, "HR Department");
            Department it = new Department("IT", 2, "IT Department");
            Department finance = new Department("Finance", 3, "Finance Department");

            Employee e1 = new Employee("Yudhistir", 1, new Date(), 100.02, it);
            Employee e2 = new Employee("Bheem", 2, new Date(), 100.03, hr);
            Employee e3 = new Employee("Arjun", 3, new Date(), 100.04, it);
            Employee e4 = new Employee("Nakul", 4, new Date(), 100.05, it);
            Employee e5 = new Employee("Sahdev", 5, new Date(), 100.06, finance);
            Employee e6 = new Employee("Karn", 6, new Date(), 100.07, finance);

            empList.add(e1);
            empList.add(e2);
            empList.add(e3);
            empList.add(e4);
            empList.add(e5);
            empList.add(e6);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return empList;
    }
}
