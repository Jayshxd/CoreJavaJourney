package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        MyCar Maruti = new MyCar();
        Maruti.start();
        Maruti.accelerate();
        Maruti.startMedia();
        Maruti.accelerate();
        Maruti.accelerate();
        Maruti.stopMedia();
        Maruti.stop();

        MyCar jaguar = new MyCar(new ElectricEngine(),new DiskBrake());
        jaguar.start();
        jaguar.accelerate();
        jaguar.accelerate();
        jaguar.startMedia();
        jaguar.accelerate();
        jaguar.accelerate();
        jaguar.stopMedia();
        jaguar.stop();


    }
}
