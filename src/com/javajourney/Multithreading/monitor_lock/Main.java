package com.javajourney.Multithreading.monitor_lock;

public class Main {
    public static void main(String[] args) {
        MyWork work = new MyWork(new Printer());
        Thread jay =  new Thread(work,"jaggu");
        Thread sav = new  Thread(work,"jaggi");
        jay.start();
        sav.start();
    }
}
