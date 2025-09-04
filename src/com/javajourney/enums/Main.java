package com.javajourney.enums;

public class Main {
    public static void main(String[] args) {
        Size sizes = Size.LARGE;
        for(Size x : Size.values()) {
            System.out.println(x);
        }
    }
}
