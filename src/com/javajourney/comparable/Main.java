package com.javajourney.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jayesh",1,99));
        students.add(new Student("Ramesh",3,92));
        students.add(new Student("Suresh",2,23));
        students.add(new Student("Mahesh",5,96));
        students.add(new Student("Paresh",4,91));
        System.out.println(students);
        System.out.println();
        Student s1 = students.getFirst();
        System.out.println(s1);
        Collections.sort(students);
        System.out.println(students);
    }



}
