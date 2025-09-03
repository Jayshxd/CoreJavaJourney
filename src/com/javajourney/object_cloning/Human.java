package com.javajourney.object_cloning;

public class Human implements Cloneable {
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    Human(Human other){
        this.name = other.name;
        this.age=other.age;

    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

}

