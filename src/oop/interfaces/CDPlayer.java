package oop.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Playing Music ....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Music ....");
    }
}
