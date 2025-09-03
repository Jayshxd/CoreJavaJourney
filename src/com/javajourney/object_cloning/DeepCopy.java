package com.javajourney.object_cloning;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {
    String name;
    List<String> hobbies;

    DeepCopy(String name, List<String> hobbies){
        this.name = name;
        this.hobbies = hobbies;
    }

    DeepCopy(DeepCopy other){
        this.name = other.name;
        this.hobbies = new ArrayList<>(other.hobbies);

    }
    public List<String> getHobbies() {
        return hobbies;
    }
}
