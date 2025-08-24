package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car maruti = new Car();
        maruti.show();

        System.out.println("Enter Brand : ");
        String brand = sc.nextLine();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        sc.nextLine();

        Car audi = new Car(brand,year);
        audi.show();

        System.out.println("Enter Model : ");
        String model = sc.nextLine();
        Car audi1 = new Car(brand,year,model);
        audi1.show();


    }

}
