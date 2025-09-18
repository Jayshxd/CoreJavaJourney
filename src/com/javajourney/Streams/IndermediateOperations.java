package com.javajourney.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IndermediateOperations {
    public static void main(String[] args) {
        //FILTER
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i->i%2==0).forEach(System.out::print);
        //or
        Stream<Integer> s =  Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i->i%2==0);
        List<Integer> list = s.collect(Collectors.toList());
        System.out.println(list);
System.out.println("------------------------------------------------------------------------------");
        //MAP




    }
}
