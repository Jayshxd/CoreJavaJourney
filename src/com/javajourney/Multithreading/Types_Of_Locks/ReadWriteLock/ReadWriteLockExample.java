package com.javajourney.Multithreading.Types_Of_Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    ReadWriteLockExample(String data){
        this.data = data;
    }

    private String data = "Default Data";
    private final ReadWriteLock myLock = new ReentrantReadWriteLock(true);
    public String readData(){
        myLock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+"is reading....");
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+"is reading finished");
            return data;
        }catch(Exception e){
            //
        }finally{
            System.out.println(Thread.currentThread().getName()+"is going to unlock");
            myLock.readLock().unlock();
        }
        return null;
    }
    public void writeData(String data){
        myLock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+"is Writing....");
            Thread.sleep(5000);
            this.data = this.data.concat(data);
            System.out.println(Thread.currentThread().getName()+"is Writing finished");
        }catch(Exception e){
            //
        }finally{
            System.out.println(Thread.currentThread().getName()+"is going to unlock");
            myLock.writeLock().unlock();
        }
    }
}
