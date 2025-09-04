package com.javajourney.enums;

public class Main {
    public static void main(String[] args) {
        String mySize = "Large";

        Size sizes = Size.valueOf(mySize.toUpperCase());
        System.out.println(sizes);


        for(Size x : Size.values()) {
            //System.out.println(x);
        }
    }
}
