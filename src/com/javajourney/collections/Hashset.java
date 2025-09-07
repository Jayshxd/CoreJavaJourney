package com.javajourney.collections;
import java.util.Iterator;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        /*   Read karna → for-each / Iterator chalega.
            Remove karna → Iterator ka remove().
            Add/Update karna → loop ke baad hi karna (HashSet me).
         */

        HashSet<String> set = new HashSet<>();
        set.add("Jayesh");
        set.add("Mahesh");
        set.add("Bhagyesh");
        set.add("Ramesh");
        set.add("Suresh");
        set.add("Dipesh");
        //updating an element from set
        //1.remove that element
        //2.add new element
        //**cant use normal for each loop have to use iterator**
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String val =  it.next();
            if(val.equals("Ramesh")){
                it.remove();

                set.add("Paresh");

            }
        }

        System.out.println(set);
    }
}
