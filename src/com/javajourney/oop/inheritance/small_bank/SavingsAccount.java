package com.javajourney.oop.inheritance.small_bank;

import java.util.Scanner;

public class SavingsAccount extends Account{
    void addM(Scanner sc){
        long m;
        do {
            System.out.println("How much do you want to add m? : ");
            m = sc.nextLong();
            balance += m;
        }while (String.valueOf(m).equals("q"));
    }
    void withD(Scanner sc){
        long m;
        do{
            System.out.println("How much do you want to with d? : ");
            m = sc.nextLong();
            while(balance-m<500){
                System.out.println("Low balance cant go down 500");
                m = sc.nextLong();
            }
            balance -= m;
        }while(!String.valueOf(m).equals("q"));
    }

    void view(){
        System.out.println(balance);
    }


}
