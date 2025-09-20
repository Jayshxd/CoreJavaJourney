package com.javajourney.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> opt = getName("Jayesh").map(String::toUpperCase);
        String name = opt.orElse("unknown");
        System.out.println(name);
    }
    static Optional<String> getName(String str){
        return Optional.ofNullable(str);
    }


}
