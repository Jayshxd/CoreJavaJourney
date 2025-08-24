package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StaticKeywordUse obj = new StaticKeywordUse("Jayesh");
        StaticKeywordUse obj2 = new StaticKeywordUse("Ramesh");
        StaticKeywordUse obj3 = new StaticKeywordUse("Suresh");
        StaticKeywordUse obj4 = new StaticKeywordUse("Mahesh");
        System.out.println(obj.name+" "+StaticKeywordUse.population);
        System.out.println(obj2.name+" "+StaticKeywordUse.population);
        System.out.println(obj3.name+" "+StaticKeywordUse.population);
        System.out.println(obj4.name+" "+StaticKeywordUse.population);

    }

}
