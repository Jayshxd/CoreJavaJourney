package com.javajourney.Multithreading.Daemon;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        Thread thread = new Thread(myDaemon);
        thread.setDaemon(true);
        System.out.println("Main thread started");
        thread.start();
        Thread.sleep(10000);

    }
}
