package com.javajourney.functional_interface;

public class Main {
    public static void main(String[] args) {

        //by how many types to imp-lement FI
        //1 -> default basic type
        class Duck implements Bird {
            @Override
            public void canFly() {
                System.out.println("I am Duck and i cant fly");
            }
        }
        //2 -> using Anonymous Class
        Bird bird = new Bird(){
            @Override
            public void canFly() {
                System.out.println("I am anonymous Bird");
            }
        };

        //3. Using lambda expression
        Bird obj = () -> System.out.println("I am LAMBDA's Bird");
        obj.canFly();


    }
}
