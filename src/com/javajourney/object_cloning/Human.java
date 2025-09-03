package com.javajourney.object_cloning;

public class Human implements Cloneable {
    int[] arr;
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3};
    }
    Human(Human other){
        this.name = other.name;
        this.age=other.age;
        this.arr = other.arr;

    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

}

