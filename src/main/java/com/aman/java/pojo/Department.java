package com.aman.java.pojo;

public class Department {
    private String deptName;
    private int deptId;
    private String deptDetails;

    public Department(String deptName, int deptId, String deptDetails) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.deptDetails = deptDetails;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptDetails() {
        return deptDetails;
    }

    public void setDeptDetails(String deptDetails) {
        this.deptDetails = deptDetails;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                ", deptDetails='" + deptDetails + '\'' +
                '}';
    }
}
