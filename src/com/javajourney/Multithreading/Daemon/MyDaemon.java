package com.javajourney.Multithreading.Daemon;

public class MyDaemon implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Daemon is running");
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
