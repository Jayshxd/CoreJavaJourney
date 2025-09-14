package com.javajourney.Annotations.custom_annotation;

import java.lang.reflect.InvocationTargetException;

@myanno
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> co = Class.forName("com.javajourney.Annotations.custom_annotation.Test");
        Object o = co.getDeclaredConstructor().newInstance();
        o.getClass().getAnnotation(myanno.class);
        System.out.println(o);

    }
}
