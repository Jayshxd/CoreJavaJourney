package com.javajourney.generics.boundedGenrics;

public class Printing<T extends Number> {
    T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    Printing(T value){
        this.value = value;
    }

}
