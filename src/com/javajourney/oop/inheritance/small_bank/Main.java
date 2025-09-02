package com.javajourney.oop.inheritance.small_bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount p1 = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your balance want to add : ");
        long balance = sc.nextLong();
        while(balance<500){
            System.out.println("add minimum 500rs");
            System.out.println("Enter your balance want to add : ");
            balance = sc.nextLong();
        }
        System.out.println("Welcome to Sabka Bank");
        int choice;
        do{
            System.out.println("Enter what you want to do");
            System.out.println("Enter 1 to add money : ");
            System.out.println("Enter 2 to withdraw money : ");
            System.out.println("Enter 3 to View balance : ");
            System.out.println("Enter 4 to Quit: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){

                case 1:
                    p1.addM(sc);
                    break;
                case 2:
                    p1.withD(sc);
                    break;
                case 3:
                    p1.view();
                    break;
                    default:
                        System.out.println("Invalid choice");
            }

        }while(choice!=4);

        sc.nextLine();



    }
}
