package com.javajourney.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        l1.addAll(l2);
        System.out.println(l1);



    }
}
