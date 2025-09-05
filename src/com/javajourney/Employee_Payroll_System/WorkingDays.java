package com.javajourney.Employee_Payroll_System;

public enum WorkingDays {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(1000),
    Sunday(2000);

    private final int EXTRA;

    WorkingDays(int EXTRA) {
        this.EXTRA = EXTRA;
    }

    WorkingDays() {
        this.EXTRA = 0;
    }

    public int getEXTRA() {
        return EXTRA;
    }
}
