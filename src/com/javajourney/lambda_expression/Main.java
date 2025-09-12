package com.javajourney.lambda_expression;

import com.javajourney.comparable.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(2,"jayesh"));
        students.add(new Students(6,"paresh"));
        students.add(new Students(3,"mahesh"));
        students.add(new Students(1,"jignesh"));

//        students.sort(new byNum());
//        System.out.println(students);
//
        // As You can see so many things had to to just to make it sort
        //but by using lambda exp below



        students.sort((x1,x2) -> x1.getId()-x2.getId());
        System.out.println(students);
        students.sort((n1,n2)-> n1.getName().compareTo(n2.getName()));
        System.out.println(students);

    }
}
