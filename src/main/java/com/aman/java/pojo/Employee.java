package com.aman.java.pojo;

import java.util.Date;

public class Employee {
    private String name;
    private int id;
    private Date dob;
    private double salary;
    private Department empDepartment;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", salary=" + salary +
                ", empDepartment=" + empDepartment +
                '}';
    }

    public Employee(String name, int id, Date dob, double salary, Department empDepartment) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.salary = salary;
        this.empDepartment = empDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Department empDepartment) {
        this.empDepartment = empDepartment;
    }
}
