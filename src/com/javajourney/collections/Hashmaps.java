package com.javajourney.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        //----------------Methods---------
//        System.out.println(map.size());
//
//        System.out.println(map.isEmpty());
//
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsKey(0));
//
//
//        System.out.println(map.containsValue("two"));
//
//        System.out.println(map.get(1));


        int[] arr  = {1,2,23,4,5};
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int k =0;
        for(int i = 0; i<arr.length;i++){
            map2.put(i,arr[i]);

        }
        System.out.println(map2);




    }
}
