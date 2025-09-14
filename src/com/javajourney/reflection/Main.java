package com.javajourney.reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1 load the Class
        Class<?> classObj = Class.forName("com.javajourney.reflection.Stud");

        //2 Create obj dynamically
        Object obj = classObj.getDeclaredConstructor().newInstance();

        //3 Invoke Method Dynamically
        classObj.getDeclaredMethod("show").invoke(obj);

    }
}
