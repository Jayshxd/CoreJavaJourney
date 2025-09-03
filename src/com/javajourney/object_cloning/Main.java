package com.javajourney.object_cloning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
//        Human jayesh = new Human("Jayesh",12);
//
//        Human mahesh = new Human(jayesh);
//
//        Human paresh = (Human) jayesh.clone();
//
//        paresh.age=20;
//        System.out.println(paresh.age);
//        System.out.println(jayesh.age);
//        paresh.name="pare";
//        System.out.println(paresh.name);
//        System.out.println(jayesh.name);
//        System.out.println(Arrays.toString(paresh.arr));
//        paresh.arr[0]=12;
//        System.out.println(Arrays.toString(jayesh.arr));


        List<String> hobbies = new ArrayList<>();
        hobbies.add("cricket");
        hobbies.add("video editing");

        ShallowCopy human1 = new ShallowCopy("Jayesh",hobbies);
        ShallowCopy human2 = new ShallowCopy(human1);

        System.out.println(human1.getHobbies());
        human2.hobbies.add("chess"); //output : [cricket, video editing]
        System.out.println(human1.getHobbies()); // output : [cricket, video editing, chess]






        System.out.println("---------------------DeepCopy---------------------");
        System.out.println();
        List<String> hobbies2 = new ArrayList<>();
        hobbies2.add("cricket");
        hobbies2.add("video editing");
        DeepCopy human3 = new DeepCopy("Jayesh",hobbies2);
        DeepCopy human4 = new DeepCopy(human3);
        System.out.println(human3.getHobbies());
        System.out.println(human4.getHobbies());
        System.out.println();
        human4.hobbies.add("chess");
        System.out.println(human3.getHobbies());
        System.out.println(human4.getHobbies());


    }
}
