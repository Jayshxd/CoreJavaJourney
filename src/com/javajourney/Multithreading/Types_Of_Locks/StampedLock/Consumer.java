package com.javajourney.Multithreading.Types_Of_Locks.StampedLock;

public class Consumer implements Runnable {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        // Yeh consumer 10 baar balance check karega
        for (int i = 0; i < 10; i++) {
            try {
                int balance = resource.getBalanceOptimistic();
                System.out.println(Thread.currentThread().getName() + " ne balance padha: " + balance);
                Thread.sleep(500); // Thoda ruk kar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}