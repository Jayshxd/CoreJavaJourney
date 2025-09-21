package com.javajourney.Multithreading.monitor_lock;

public class MyWork implements Runnable {
    private Printer printerObject;
    MyWork(Printer printerObject){
        this.printerObject = printerObject;
    }
    @Override
    public void run() {
        printerObject.print();
        System.out.println("finish");
    }
}