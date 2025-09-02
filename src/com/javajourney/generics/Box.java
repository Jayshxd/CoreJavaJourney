package com.javajourney.generics;

public class Box<T> {
    T value;

    Box(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
