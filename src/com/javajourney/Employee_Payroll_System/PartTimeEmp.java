package com.javajourney.Employee_Payroll_System;

import java.util.List;

public class PartTimeEmp extends Employee {

    PartTimeEmp() {
        super();
    }

    PartTimeEmp(String empName) {
        super(empName);
    }

    PartTimeEmp(String empName, List<WorkingDays> daysList, int hours, int hourlyRate) {
        super(empName, daysList);
        //this.hours=hours;
        this.setHours(hours);
        //this.hourlyRate=hourlyRate;
        this.setHourlyRate(hourlyRate);
        //this.permEmpSal = calculateSalary(hours,hourlyRate);
        this.setEmpSalary(calculateSalary(hours, hourlyRate));
    }

    PartTimeEmp(PartTimeEmp partTimeEmp) {
        super(partTimeEmp);
    }

    @Override
    long calculateSalary(int hours, int hourlyRate) {
        return (long) this.getHours() * this.getHourlyRate() * 30;
    }



}
