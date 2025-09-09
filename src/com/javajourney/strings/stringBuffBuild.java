package com.javajourney.strings;

public class stringBuffBuild {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Jayesh");
        System.out.println(s.insert(s.length()," "));
        s.append("Hiwarkar");
        System.out.println(s);
        System.out.println();
        System.out.println(s.charAt(6));
        System.out.println(s.deleteCharAt(6).insert(6,"<->"));
        System.out.println(s.indexOf("J"));
        System.out.println(s.reverse());
        System.out.println(s.capacity());
        System.out.println(s);





    }
}
