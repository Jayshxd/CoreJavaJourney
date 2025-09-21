package com.javajourney.Multithreading;

public class ByClass extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

}
