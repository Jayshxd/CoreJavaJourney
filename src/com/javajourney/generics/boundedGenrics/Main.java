package com.javajourney.generics.boundedGenrics;

public class Main {
    public static void main(String[] args) {
        Printing<Float> pF = new Printing<>(2.3F);
        Printing<Double> pD = new Printing<>(2.3444D);
        Printing<Integer> pI = new Printing<>(123123);
        Printing<Long> pL = new Printing<>(32112331L);
        System.out.println(pF.getValue()+" "+pD.getValue()+" "+pI.getValue()+" "+pL.getValue());

    }
}

