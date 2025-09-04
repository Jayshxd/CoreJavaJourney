package com.javajourney.enums;

public enum Size {
    SMALL(250),MEDIUM(500),LARGE(1000);
    private final int price;
    Size(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return this.name() + " { Price : " + this.price+" }";
    }

}
