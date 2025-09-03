package com.javajourney.object_cloning;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jayesh = new Human("Jayesh",12);

        Human mahesh = new Human(jayesh);

        Human paresh = (Human) jayesh.clone();

        paresh.age=20;
        System.out.println(paresh.age);
        System.out.println(jayesh.age);
        paresh.name="pare";
        System.out.println(paresh.name);
        System.out.println(jayesh.name);
        System.out.println(Arrays.toString(paresh.arr));
        paresh.arr[0]=12;
        System.out.println(Arrays.toString(jayesh.arr));



    }
}
