package com.javajourney.Multithreading.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);
        Thread filler = new Thread(producer,"Filler");
        Thread taker = new Thread(consumer,"Taker");

        taker.start();
        filler.start();

    }
}
