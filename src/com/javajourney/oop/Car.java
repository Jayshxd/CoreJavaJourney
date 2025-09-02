package com.javajourney.oop;

public class Car {
    String brand;
    String model;
    int year;

    Car(){
        this("unknown",2000);
    }
    Car(String brand,int year){
        this(brand,year,"unnown");
    }
    Car(String brand,int year,String model){

        this.brand=(brand == null || brand.trim().isEmpty()) ? "unknown" : brand;
        this.year=year;
        this.model=(model == null || model.trim().isEmpty()) ? "Unknown" : model;

    }

    void show(){
        System.out.println("model : " +this.brand+" "+"Year : "+this.year+" "+"Model : "+this.model);
    }
}
