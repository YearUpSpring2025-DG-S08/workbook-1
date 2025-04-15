package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Welcome to the Sandwich Shop!");

        System.out.println("What size sandwich do you want?");

        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95 ");

        double regPrice = 5.45;
        double largePrice = 8.95;

        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Your price will be $" + regPrice);
        } else {
            System.out.println("Your price is $ " + largePrice);
        }


        System.out.print("Share your age for a discount: ");
        int age = scanner.nextInt();


        if (age <= 17 && choice == 1){
            double studentDiscount = .1;
            regPrice = (regPrice - (regPrice * studentDiscount));

            System.out.printf("You get a 10 percent discount, your new price is: $%.3f", regPrice);
        } else if (age <= 17 && choice == 2){
            double studentDiscount = .1;
            largePrice = (largePrice - (largePrice * studentDiscount));

            System.out.printf("You get a 10 percent discount, your new price is: $%.3f", largePrice);
        }
        else if (age >= 65 && choice == 1){
            double seniorDiscount = .2;
            regPrice = (regPrice - (regPrice * seniorDiscount));

            System.out.printf("You get a 20 percent discount, your new price is: $%.3f", regPrice);
        } else if (age >= 65 && choice == 2) {
            double seniorDiscount = .2;
            largePrice = (largePrice - (largePrice * seniorDiscount));

            System.out.printf("You get a 20 percent discount, your new price is: $%.3f", regPrice);
        } else {
            System.out.println("Sorry, you do not qualify for a discount.");
        }

        System.out.println("\nThank you for coming to the Sandwich Shop!");
    }
}