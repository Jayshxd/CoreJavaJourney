package com.javajourney.coupling;

public class Car {
    Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    public void run(){
        System.out.println("Car is running ...");
    }
}
