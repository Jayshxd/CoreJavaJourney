package com.javajourney.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Types through which create a stream
        //1 : From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s = list.stream();
        //2 : From Arrays
        Integer[] arr = {1,33,1,3,1};
        Stream<Integer> sa = Arrays.stream(arr);
        //3: From Static Method
        Stream<Integer> sm = Stream.of(1,2,2,2,2,2,2,3,3,3,3,1,1,23,123,1,12,4);
        long res = sm.filter((Integer x) -> x==2).count();
        System.out.println(res);
        //4: From stream Iterate
        Stream<Integer> si = Stream.iterate(100,x->x+100).limit(10);
        si.forEach(s1 -> System.out.println(s1));
        //5: From Stream builder
        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(235).add(25).add(1235).add(245);
        Stream<Integer> sb1 = sb.build();
        sb1.forEach(n -> System.out.print(n+" "));

    }
}
