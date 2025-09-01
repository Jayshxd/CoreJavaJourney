package oop.interfaces;

public class PowerBrake implements Brake{

    @Override
    public void apply() {
        System.out.println("Applying Power Brake....");
    }
}
