package com.javajourney.Multithreading;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ByInterface runObj =  new ByInterface();
        Thread thread = new Thread(runObj);
        thread.start();
        IntStream.range(1, 5).boxed().forEach(i -> System.out.println(i + " " + Thread.currentThread().getName()));

    }
}
