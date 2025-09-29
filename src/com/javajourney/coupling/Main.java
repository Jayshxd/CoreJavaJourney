package com.javajourney.coupling;

public class Main {
    public static void main(String[] args) {

        Engine myEninge = EngineFactory.getEngine("petrol");
        Car car = new Car(myEninge);
        myEninge.start();
        car.run();


    }
}
