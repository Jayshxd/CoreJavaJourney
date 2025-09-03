package com.javajourney.object_cloning;

import java.util.List;

public class ShallowCopy {
    String name;
    List<String> hobbies;

    //Parameterised Constructor
    ShallowCopy(String name,List<String> hobbies){
        this.name=name;
        this.hobbies=hobbies;
    }

    //Copy Constructor
    ShallowCopy(ShallowCopy other){
        this.name = other.name;
        this.hobbies=other.hobbies;
    }

    public List<String> getHobbies(){
        return hobbies;
    }




}
