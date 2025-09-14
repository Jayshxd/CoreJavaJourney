package com.javajourney.VarArgs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.show("Jayesh");
        main.show("Jayesh","mahesh","paresh","suresh");
    }
    static void show(String...s){
        System.out.println(Arrays.toString(s));
    }
}
