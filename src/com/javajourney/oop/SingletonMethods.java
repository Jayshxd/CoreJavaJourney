package com.javajourney.oop;

public class SingletonMethods {

    //1 eager initialization
//    public static SingletonMethods singleton = new SingletonMethods();
//    private SingletonMethods(){
//    }
//    public static SingletonMethods getInstance(){
//        return singleton;
//    }

    //2.Lazy initialization
//    public static SingletonMethods lazyObj;
//    private SingletonMethods(){
//
//    }
//    public static SingletonMethods getInstance(){
//        if(lazyObj==null){
//            lazyObj = new SingletonMethods();
//        }
//        return lazyObj;
//    }

//3. Synchronised Method
//    public static SingletonMethods synco;
//    private SingletonMethods(){
//
//    }
//    synchronized public static SingletonMethods getInstance(){
//        if(synco==null){
//            synco = new SingletonMethods();
//        }
//        return synco;
//    }


    //4.Double Check
//    public static volatile SingletonMethods instance;
//    private SingletonMethods(){
//
//    }
//    public static SingletonMethods getInstance(){
//        if(instance==null){
//            synchronized (SingletonMethods.class){
//                if(instance==null){
//                    instance = new SingletonMethods();
//                }
//            }
//        }
//        return instance;
//    }

    //5. bill pugh
//    private SingletonMethods(){
//
//    }
//    private static class helper{
//        private static final SingletonMethods billpough = new SingletonMethods();
//    }
//    public static SingletonMethods getInstance(){
//        return helper.billpough;
//    }



}