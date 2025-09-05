package com.javajourney.Employee_Payroll_System;

import java.util.List;

public class FullTimeEmp extends Employee {

    FullTimeEmp() {
        super();
    }

    FullTimeEmp(String empName) {
        super(empName);
    }

    FullTimeEmp(String empName, List<WorkingDays> daysList, int hours, int hourlyRate) {
        super(empName, daysList);
        //this.hours=hours;
        this.setHours(hours);
        //this.hourlyRate=hourlyRate;
        this.setHourlyRate(hourlyRate);
        //this.permEmpSal = calculateSalary(hours,hourlyRate);
        this.setEmpSalary(calculateSalary(hours, hourlyRate));
    }

    FullTimeEmp(FullTimeEmp permanentEmp) {
        super(permanentEmp);
    }


    @Override
    long calculateSalary(int hours, int hourlyRate) {
        return (long) this.getHourlyRate() * this.getHours() * 30;
    }
}
