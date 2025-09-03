package com.javajourney.object_cloning;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jayesh = new Human("Jayesh",12);

        Human mahesh = new Human(jayesh);

        Human paresh = (Human) jayesh.clone();

        System.out.println(paresh);
        System.out.println(jayesh);
        System.out.println(mahesh);


    }
}
