package com.javajourney.Multithreading.ProducerConsumerProblem;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedRes sharedObj = new SharedRes(new ArrayDeque<>(),3);
        Producer producer = new Producer(sharedObj);
        Consumer consumer = new Consumer(sharedObj);
        Thread t1 = new Thread(producer,"Jayesh");
        Thread t2 = new Thread(consumer,"Savita");
        t2.start();
        Thread.sleep(2000);
        t1.start();
    }
}
