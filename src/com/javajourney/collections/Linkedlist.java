package com.javajourney.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10));
        ll.removeAll(al);
        System.out.println(ll);

    }
}
