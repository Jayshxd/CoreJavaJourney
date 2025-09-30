package com.javajourney.Multithreading.Types_Of_Locks.ReadWriteLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String temp = "Hi my name is Jayesh";
        ReadWriteLockExample sharedResource = new ReadWriteLockExample(temp);

        // --- Workers Banaye ---
        // Ek Writer banaya
        Producer writerJob = new Producer(sharedResource);
        Thread writerThread = new Thread(writerJob, "Writer-Thread");

        // Do alag-alag Readers banaye
        Consumer readerJob = new Consumer(sharedResource);
        Thread readerThread1 = new Thread(readerJob, "Reader-Thread-1");
        Thread readerThread2 = new Thread(readerJob, "Reader-Thread-2");
        Thread readerThread3 = new Thread(readerJob, "Reader-Thread-3");


        // --- Sabko Kaam Par Lagaya ---
        // Sabko lagbhag ek saath start karo
        readerThread1.start();
        readerThread2.start();
        writerThread.start();
        readerThread3.start();
    }
}
