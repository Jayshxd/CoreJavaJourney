package com.javajourney.Multithreading.Types_Of_Locks.ReadWriteLock;

public class Producer implements Runnable{
    ReadWriteLockExample obj;
    Producer(ReadWriteLockExample obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.writeData(obj.getData());
    }
}
