package com.javajourney.Multithreading.ProducerConsumerProblem;

//yeh apna shared resource
public class Box {
    boolean isBoxFull = false;
    private final Object lock = new Object();
    public void putInBox(){
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is in putInBox");
            //agar box bhara hua hai toh wait karo
            while (isBoxFull) {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                try {
                    lock.wait();
                }catch(Exception e){
                    //
                }
            }
            //agar box nahi bhara hua hai means khali hai means false hai toh bhardo
            System.out.println(Thread.currentThread().getName() + " is going to fill the box");
            isBoxFull = true;
            lock.notify();
        }
    }
    public void getFromBox(){
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is inside getfromBox");
            //agar khali hai toh wait karo bharne tak ka
            while(!isBoxFull){
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                try{
                    //sone chale jao
                    lock.wait();
                }catch (Exception e){

                }
            }
            //agar box bhara hua hai toh lelo usme jo hai aur usko khali kardo
            System.out.println(Thread.currentThread().getName() + " is going to take out from box");
            isBoxFull = false;
            lock.notify();
        }
    }
}
