package com.aman.java.javapractice;

import com.aman.java.pojo.Department;
import com.aman.java.pojo.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
    public static void main(String[] args) {
        sortByAge();
    }

    public static void averageOfTop3Salaries(){
        List<Employee> empList = getListOfEmployees();
        double averageOfTop3 = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).limit(3).mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("averageOfTop3: " + averageOfTop3);
    }

    public static void countNumberOfEmployeesInDept(){
        List<Employee> empList = getListOfEmployees();
        System.out.println("number of employees in IT dept: " + empList.stream().filter(e -> "IT".equalsIgnoreCase(e.getEmpDepartment().getDeptName())).count());
    }

    public static void sortByDept(){
        List<Employee> empList = getListOfEmployees();
        List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(e -> e.getEmpDepartment().getDeptName())).collect(Collectors.toList());
        sortedList.forEach(e ->
                System.out.println("Department: " + e.getEmpDepartment().getDeptName() + " Employee Name: " + e.getName()));
    }

    public static void sortByAge(){
        List<Employee> empList = getListOfEmployees();
        List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(e -> e.getDob())).collect(Collectors.toList());
        sortedList.forEach(e ->
                System.out.println("Employee Name: " + e.getName() + " Age: " + e.getDob()));
    }

    public static List<Employee> getListOfEmployees(){
        List<Employee> empList = new ArrayList<>();
        try{
            Department hr = new Department("HR", 1, "HR Department");
            Department it = new Department("IT", 2, "IT Department");
            Department finance = new Department("Finance", 3, "Finance Department");

            Employee e1 = new Employee("Yudhistir", 1, new Date(), 100.02, it);
            Thread.sleep(1000);
            Employee e2 = new Employee("Bheem", 2, new Date(), 100.03, hr);
            Thread.sleep(1000);
            Employee e3 = new Employee("Arjun", 3, new Date(), 100.04, it);
            Thread.sleep(1000);
            Employee e4 = new Employee("Nakul", 4, new Date(), 100.05, it);
            Employee e5 = new Employee("Sahdev", 5, new Date(), 100.06, finance);
            Thread.sleep(1000);
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
