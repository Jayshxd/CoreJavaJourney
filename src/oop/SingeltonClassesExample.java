package oop;

import javax.swing.*;

public class SingeltonClassesExample {

    private SingeltonClassesExample() {

    }
    private static class SingeltonHelper{
        //help of lazy initialization
        private static final SingeltonClassesExample INSTANCE = new SingeltonClassesExample();

    }
    public static SingeltonClassesExample getInstance(){
        return SingeltonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        SingeltonClassesExample obj1 = SingeltonClassesExample.getInstance();
        SingeltonClassesExample obj2 = SingeltonClassesExample.getInstance();
        if(obj1==obj2){
            System.out.println("obj1 and obj2 is the same");
        }else{
            System.out.println("obj1 and obj2 is not the same");
        }
    }



}
