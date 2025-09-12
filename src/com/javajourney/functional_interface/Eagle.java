package com.javajourney.functional_interface;

public class Eagle implements Bird {
    public static void main(String[] args) {
        Bird bird = new Eagle();

    }

    @Override
    public void canFly() {
        System.out.println("canFly");
    }
}
