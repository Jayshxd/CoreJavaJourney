package com.javajourney.Multithreading;

import java.util.stream.IntStream;

public class ThreadLifeCycles extends Thread {
    public static void main(String[] args) {

        Thread t1 = new Thread();
        ThreadLifeCycles t2 = new ThreadLifeCycles();
        System.out.println(t1.getName()+" "+t1.getState());
        t1.start();
        System.out.println(t1.getName()+" "+t1.getState());
       t2.start();
       
        System.out.println(t1.getName()+" "+t2.getState());
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        IntStream.range(0,5).boxed().forEach(x-> System.out.println(x+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getState()));
    }
}
