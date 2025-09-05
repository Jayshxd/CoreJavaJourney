package com.javajourney.Employee_Payroll_System;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private static int EMPCOUNT = 0;
    private int empId;
    private String empName;
    private long empSalary;
    private final List<WorkingDays> daysList;
    private int hours;
    private int hourlyRate;

    Employee() {
        EMPCOUNT += 1;
        this.empName = "Employee" + Employee.EMPCOUNT;
        this.empSalary = 0;
        this.empId = 0;
        this.daysList = new ArrayList<>();
    }

    Employee(String empName) {
        EMPCOUNT += 1;
        this.empName = empName == null || empName.trim().isEmpty() ? "Employee" + Employee.EMPCOUNT : empName;
        this.empSalary = 0;
        this.empId = EMPCOUNT;
        this.daysList = new ArrayList<>();
    }

    Employee(String empName, List<WorkingDays> daysList) {
        EMPCOUNT += 1;
        this.empName = empName == null || empName.trim().isEmpty() ? "Employee" + Employee.EMPCOUNT : empName;
        this.empId = EMPCOUNT;
        this.daysList = new ArrayList<>(daysList);
    }

    Employee(Employee emp) {
        EMPCOUNT += 1;
        this.empName = emp.empName == null || emp.empName.trim().isEmpty() ? "Employee" + Employee.EMPCOUNT : emp.empName;
        this.empSalary = emp.empSalary;
        this.empId = EMPCOUNT;
        this.daysList = new ArrayList<>(emp.daysList);
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getEmpSalary() {
        if ((this.daysList.contains(WorkingDays.Sunday))) {
            return this.empSalary + WorkingDays.Sunday.getEXTRA();
        } else if (this.daysList.contains(WorkingDays.Saturday)) {
            return this.empSalary + WorkingDays.Saturday.getEXTRA();
        } else {
            return this.empSalary;
        }
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    //Copy Constructor
    //it looks like shallow copy but it will work as deep copy
    //1. Name is String ans Strings are immutables so new object will be created if someone try to change it
    //2. salary is primitive so , primitives are not pass by ref

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    abstract long calculateSalary(int hours, int hourlyRate);

    @Override
    public String toString() {
        return "[ " + "Emp Id : " + this.empId + " , Name : " + this.getEmpName() + " , " + "Salary : " + this.getEmpSalary() + " , " + this.daysList + " ]";
    }


}
