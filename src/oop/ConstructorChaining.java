package oop;

public class ConstructorChaining {
    public static void main(String[] args) {
        Students jay = new Students();

    }

}

class Students{
    Students(){
        this(20);
    }
    Students(int age){
        System.out.print(age);
    }

}