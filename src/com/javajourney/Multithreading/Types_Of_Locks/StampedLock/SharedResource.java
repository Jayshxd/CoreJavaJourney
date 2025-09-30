package com.javajourney.Multithreading.Types_Of_Locks.StampedLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int balance = 100;
    private final StampedLock lock = new StampedLock();

    // Likhne ka method
    public void deposit(int amount) {
        long stamp = lock.writeLock(); // Write lock liya
        try {
            System.out.println(Thread.currentThread().getName() + " is writing...");
            balance += amount;
        } finally {
            lock.unlockWrite(stamp); // Stamp se unlock kiya
        }
    }

    // Optimistic Reading ka method (Super Fast)
    public int getBalanceOptimistic() {
        long stamp = lock.tryOptimisticRead(); // 1. Jhalak maarne ki koshish
        int currentBalance = balance; // 2. Data padha

        // 3. Check karo ki dhoka toh nahi hua
        if (lock.validate(stamp)) {
            System.out.println("Optimistic Read SUCCESS!");
            return currentBalance; // Sab theek tha, data return karo
        } else {
            // Dhoka hua! Ab proper lock lo
            System.out.println("Optimistic Read FAILED! Falling back to pessimistic read lock...");
            stamp = lock.readLock(); // Proper read lock liya
            try {
                currentBalance = balance; // Data dobara padha
                return currentBalance;
            } finally {
                lock.unlockRead(stamp); // Stamp se unlock kiya
            }
        }
    }
}