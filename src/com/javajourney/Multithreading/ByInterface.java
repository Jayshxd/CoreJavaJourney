package com.javajourney.Multithreading;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ByInterface implements Runnable{
    @Override
    public void run() {
        IntStream.range(1, 5).boxed().forEach(i -> System.out.println(i + " " + Thread.currentThread().getName()));
    }
}
