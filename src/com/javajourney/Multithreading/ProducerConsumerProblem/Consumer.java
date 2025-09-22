package com.javajourney.Multithreading.ProducerConsumerProblem;

public class Consumer implements Runnable{
    SharedRes sharedRes;
    Consumer(SharedRes sharedRes){
        this.sharedRes = sharedRes;
    }
    @Override
    public void run() {
        System.out.println("Savita is running");
        for(int j=0;j<=6;j++){
            try {
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName()+" is going to remove");
                sharedRes.removeItem();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
