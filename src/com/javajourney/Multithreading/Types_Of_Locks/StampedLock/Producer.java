package com.javajourney.Multithreading.Types_Of_Locks.StampedLock;

public class Producer implements Runnable {
    SharedResource resource;
    public Producer(SharedResource sr) {
        this.resource = sr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                resource.deposit(10);
                Thread.sleep(1000); // Thoda ruk kar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
