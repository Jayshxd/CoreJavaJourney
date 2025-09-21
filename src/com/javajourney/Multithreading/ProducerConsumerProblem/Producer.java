package com.javajourney.Multithreading.ProducerConsumerProblem;

public class Producer implements Runnable {
    private Box box;
    Producer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is now in producer run now trying to go inside its method");
        for(int i = 0; i<3;i++){
        box.putInBox();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " is job finished box full kar diya");
    }
}
