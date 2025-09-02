package com.javajourney.oop;

public class StaticKeywordUse {
    String name;
    static int population;

    StaticKeywordUse(String name) {
        this.name = (name == null || name.trim().isEmpty())?"Unknown":name;
        StaticKeywordUse.population +=1;
    }
}
