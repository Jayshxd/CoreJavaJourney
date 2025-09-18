package com.javajourney.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        Stream.of(1,2,3,4,5).map(i->i*i).forEach(str->System.out.print(str+"->"));
        System.out.println();

        List<Integer> listOfAsci = Stream.of('a','b','c').map(ch->(int)ch).collect(Collectors.toList());
        System.out.println(listOfAsci);

        System.out.println("------------------------------------------------------------------------------");
        //iterate and Limit
        Stream<Integer> streamOfIntegers=Stream.iterate(100,n->n+100).limit(10);
        List<Integer> listOfIteratedIntegers = streamOfIntegers.collect(Collectors.toList());
        System.out.println(listOfIteratedIntegers);

        List<Integer> limitedIntegers = Stream.of(1,2,2,2,2,2,2,2,2).limit(2).collect(Collectors.toList());
        System.out.println(limitedIntegers);

        System.out.println("------------------------------------------------------------------------------");
        //Sorted
        List<Integer> sortedList = Stream.of(2,6,3,1,2,3,5,1,3,5,7,3,7,3,7,4,7,6,3,2,2,262,8,4,2,3,7,8,3,3).sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("------------------------------------------------------------------------------");
        //distinct
        List<Integer> distinctList = Stream.of(2,6,3,1,2,3,5,1,3,5,7,3,7,3,7,4,7,6,3,2,2,262,8,4,2,3,7,8,3,3).distinct().sorted().collect(Collectors.toList());
        System.out.println(distinctList);


        System.out.println("------------------------------------------------------------------------------");
        //peek
        Stream.of(1,2,3).peek(p->System.out.print(p+",")).map(p->p*p*p).collect(Collectors.toList()).forEach(System.out::print);



        System.out.println("------------------------------------------------------------------------------");
        //boxed() ***
        //IntStream -> Stream<Integer> -> List<Integer>
        Stream<Integer> boxedStreamOfIntegers=IntStream.range(1,6).boxed();
        List<Integer> listOfBoxedIntegers = boxedStreamOfIntegers.collect(Collectors.toList());
        System.out.println(listOfBoxedIntegers);




        System.out.println("------------------------------------------------------------------------------");

        //mapTOInt()
        //Stream<T>  ->  IntStream (Primitive Stream)

        Stream<Integer> streamOfArrayIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntStream streamOfMapToInt = streamOfArrayIntegers.mapToInt(j->j.intValue());


        //converting to normal array
        int[] arr = streamOfMapToInt.toArray();
        //or chaining
        Stream<Integer> streamOfArrayIntegers2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int[] arr1 = streamOfArrayIntegers2.mapToInt(Integer::intValue).toArray();


        //for Objects like Strings it requires arguments in toArray()
        //that what type of array do you want
        Stream<String> streamOfString = Stream.of("jayesh","mahesh","suresh");
        String[] stringArray = streamOfString.toArray(String[]::new);
        System.out.println(Arrays.toString(stringArray));









    }
}
