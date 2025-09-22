package com.javajourney.Multithreading.ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SharedRes {
    private Queue<Integer> queue ;
    private int buffer;
    SharedRes(Queue<Integer> queue,int buffer) {
        this.queue = queue;
        this.buffer = buffer;
    }
    boolean isFull = false;
    boolean isEmpty = true;
    private final Object lock = new Object();
    public void addItem(int item) throws InterruptedException {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " entered addItem() 🟢");
            Thread.sleep(2000);

            while (queue.size() == buffer) {
                System.out.println(Thread.currentThread().getName() + " 🚫 Queue FULL, going to wait...");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " 🔔 got notified, retrying add...");
            }

            queue.add(item);
            System.out.println(Thread.currentThread().getName() + " ✅ added " + item + " | Current Queue: " + queue);

            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " 🔔 notifying Savii...");
            lock.notify();
        }
    }
    public void removeItem() throws InterruptedException {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " entered removeItem() 🟢");
            Thread.sleep(2000);

            while (queue.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " 🚫 Queue EMPTY, going to wait...");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " 🔔 got notified, retrying remove...");
            }

            int removed = queue.poll();
            System.out.println(Thread.currentThread().getName() + " ✅ removed " + removed + " | Current Queue: " + queue);

            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " 🔔 notifying Jayesh...");
            lock.notify();
        }
    }
}
