package com.javajourney.Employee_Payroll_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WorkingDays> days = new ArrayList<>();
        List<WorkingDays> days2 = new ArrayList<>();
        List<WorkingDays> days3 = new ArrayList<>();
        days.add(WorkingDays.Monday);
        days.add(WorkingDays.Wednesday);
        days.add(WorkingDays.Friday);
        days.add(WorkingDays.Sunday);
        Employee emp1 = new FullTimeEmp("Jayesh", days, 8, 500);
        System.out.println(emp1);
        days2.add(WorkingDays.Monday);
        days2.add(WorkingDays.Tuesday);
        days2.add(WorkingDays.Wednesday);
        days2.add(WorkingDays.Friday);
        Employee emp2 = new FullTimeEmp("Mahesh", days, 8, 200);
        System.out.println(emp2);
        days3.add(WorkingDays.Monday);
        days3.add(WorkingDays.Wednesday);
        days3.add(WorkingDays.Friday);
        Employee emp3 = new PartTimeEmp("Paresh",days3,6,50);
        System.out.println(emp3);

    }
}
