package com.javajourney.anonymousClass;

public class Main {
    public static void main(String[] args) {
        AnonymExample o = new AnonymExample(){
            public void hi(){
                System.out.println("hi from anonymous class");
            }
        };
        AnonymExample.print();
        o.hi();
    }
}
