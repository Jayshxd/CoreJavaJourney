package com.javajourney.Types_of_functional_interfaces;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printUpper = str -> {
            System.out.println(str.toUpperCase());
        };

        printUpper.accept("Hello");

    }
}
