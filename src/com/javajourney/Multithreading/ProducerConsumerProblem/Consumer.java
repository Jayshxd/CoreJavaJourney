package com.javajourney.Multithreading.ProducerConsumerProblem;

public class Consumer implements Runnable {
    private Box box;
    Consumer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is inside consumer run now going inside its method");
        for(int i=0;i<3;i++) {
            box.getFromBox();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " is finished box khali kar diya");
    }
}
