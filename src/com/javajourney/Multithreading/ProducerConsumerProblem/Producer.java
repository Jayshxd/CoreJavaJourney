package com.javajourney.Multithreading.ProducerConsumerProblem;

public class Producer implements Runnable{
    SharedRes sharedRes;
    Producer(SharedRes sharedRes){
        this.sharedRes=sharedRes;
    }
    @Override
    public void run() {
        System.out.println("Jayesh is running");
        for(int i = 0; i<=6; i++){
            try {
                sharedRes.addItem(i);
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
