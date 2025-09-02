package com.javajourney.comparator;

public class Student{
    private String name;
    private int rollNo;
    private int percent;

    Student(String name,int rollNo, int percent){
        this.name=name;
        this.rollNo=rollNo;
        this.percent=percent;
    }




    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getrollNo(){
        return this.rollNo;
    }
    public void setPercent(int percent){
        this.percent=percent;
    }
    public int getPercent(){
        return this.percent;
    }

    public String toString(){
        return this.name+" "+this.rollNo+" "+this.percent;
    }

}
