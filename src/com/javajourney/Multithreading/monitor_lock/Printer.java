package com.javajourney.Multithreading.monitor_lock;

public class Printer {
    private final Object lock = new Object();

    void print() {
        try {
            System.out.print(Thread.currentThread().getName()+" is getting ready to print");
            int x= 0;
            while (x < 4) {
                System.out.print('.');
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                x++;
            }
            System.out.println();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                System.out.println(">> " + i + " <<" + "Printed by -> " + Thread.currentThread().getName());
                int x = 0;
                System.out.print("Printing");
                while (x < 4) {
                    System.out.print('.');
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    x++;
                }
                System.out.println();
            }

        }

    }
}
