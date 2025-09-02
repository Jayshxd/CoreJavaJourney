package com.javajourney.comparator;

import java.util.Comparator;

public class ByPercent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getPercent()-o2.getPercent();
    }
}
