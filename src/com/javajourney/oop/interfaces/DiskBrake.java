package com.javajourney.oop.interfaces;

public class DiskBrake implements Brake {

    @Override
    public void apply() {
        System.out.println("Applying Disk Brake....");
    }
}
