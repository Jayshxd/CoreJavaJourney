package com.javajourney.Types_of_functional_interfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;



public class Main {
    public static void main(String[] args) {

        Consumer<String> printUpper = str -> {
            System.out.println(str.toUpperCase());
        };
        printUpper.accept("Hello");


        Supplier<Integer> rands = () -> new Random().nextInt(100);
        System.out.print(rands.get());

        Function<Integer,String> change = num -> num.toString();
        String ot = change.apply(0);
        System.out.println(ot);

        Predicate<Integer> isEven = num -> num % 2 ==0;

        boolean o =isEven.test(100);
        System.out.println(o);





    }
}
