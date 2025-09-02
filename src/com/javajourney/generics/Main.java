package com.javajourney.generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> obj = new Box<>(100);
        System.out.println(obj.getValue());
    }
}
