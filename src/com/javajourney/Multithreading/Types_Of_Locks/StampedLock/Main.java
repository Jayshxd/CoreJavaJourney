package com.javajourney.Multithreading.Types_Of_Locks.StampedLock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        // Ek producer banaya
        Producer producer = new Producer(sharedResource);
        Thread producerThread = new Thread(producer, "Producer");

        // Do consumer banaye taaki optimistic reading ka fayda dikhe
        Consumer consumer = new Consumer(sharedResource);
        Thread consumerThread1 = new Thread(consumer, "Consumer-1");
        Thread consumerThread2 = new Thread(consumer, "Consumer-2");

        // Sabko kaam par lagaya
        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
