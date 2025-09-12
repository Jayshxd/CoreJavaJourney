package com.javajourney.Types_of_functional_interfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printUpper = str -> {
            System.out.println(str.toUpperCase());
        };
        printUpper.accept("Hello");


        Supplier<Integer> rands = () -> new Random().nextInt(100);
        System.out.print(rands.get());


    }
}
