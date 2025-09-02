package com.javajourney.oop.Small_RPG_Game_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        Character character = null;
        do{
            System.out.println("=== RPG Simulator ===");
            System.out.println("1. Make Character");
            System.out.println("2. Attack");
            System.out.println("3: Defend");
            System.out.println("4: Special Ability");
            System.out.println("5: Show Stats");
            System.out.println("6: Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1 : System.out.println("Enter your name : ");
                         String name = input.nextLine();
                         System.out.println("Choose your character");
                         System.out.println("1. Worrier");
                         System.out.println("2. Archer");
                         int ch = input.nextInt();
                         input.nextLine();
                         switch(ch){
                             case 1 : character = new Worrier(name);
                             break;
                             case 2 : character = new Archer(name);
                             break;
                             default : System.out.println("Invalid choice");
                         }
                         break;
                case 2 : if(character!=null){
                    character.attack();
                }
                        break;
                case 3 : if(character!=null){
                    character.defend();

                }
                break;
                case 4 : if(character!=null){
                    character.specialAbility();

                }
                break;
                case 5 : if(character!=null){
                    character.stats();
                }
                break;
                default:System.out.println("Invalid choice");

            }

        }while(choice!=6);



    }
}
