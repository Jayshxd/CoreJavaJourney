package com.javajourney.Multithreading.Types_Of_Locks.ReadWriteLock;

public class Consumer implements Runnable{
    ReadWriteLockExample obj;
    public Consumer(ReadWriteLockExample obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        String str = obj.readData();
        System.out.println(Thread.currentThread().getName()+" has printed this below ______________");
        System.out.println(str);
    }
}
