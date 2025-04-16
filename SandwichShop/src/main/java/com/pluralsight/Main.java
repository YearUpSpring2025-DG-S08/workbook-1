package com.pluralsight;
import java.util.Scanner; // import statement allowing use of scanner throughout the program

public class Main {
    public static Scanner scanner = new Scanner(System.in); // scanner class to allow scanner to be called within the program for User input

    public static void main(String[] args){

        System.out.println("Welcome to the Sandwich Shop!"); // introducing the program

        System.out.println("What size sandwich do you want?"); // print statement prompting user to choose

        System.out.println("1: Regular: base price $5.45"); // print statement showing the price of regular sandwich
        System.out.println("2: Large: base price $8.95 "); // print statement showing the price of large sandwich
        double regPrice = 5.45; // variable initializing the price of a regular sandwich
        double largePrice = 8.95; // variable initializing the price of a large sandwich

        int choice = scanner.nextInt(); // scanner variable to allow for User input on sandwich choice

        scanner.nextLine(); // called scanner to remove CRLF to prepare for string input

        System.out.println("Would you like to have the sandwich loaded? (y/n)"); // statement prompting User to choose loaded or not
        String loaded = scanner.nextLine(); // scanner variable to allow for User input on loaded sandwich

        double regLoaded = 1; // variable initializing the price increase for a regular loaded sandwich
        double largeLoaded = 1.75; // variable initializing the price increase for a large loaded sandwich


        if (loaded.equalsIgnoreCase("y")){ // if statement checking if User input equals to 'y' - ignoring case sensitivity
            if (choice == 1){ // nested if statement to check if User input for sandwich equals to 1
                regPrice = regLoaded + regPrice; // variable initializing new value for regPrice after loaded upcharge
                System.out.printf("Your loaded sandwich price is: $%.3f \n", regPrice); // print statement showing the new price
            } else if (choice == 2){ // else if statement checking if User input for sandwich equals to 2
                largePrice = largeLoaded + largePrice; // variable initializing new value for largePrice after loaded upcharge
                System.out.printf("Your loaded sandwich price is: $%.3f \n", largePrice); // print statement showing the new price
            }
        }

//        if (choice == 1){ // if statement checking if choice is 1
//            System.out.println("Your price will be $" + regPrice); // print statement showing regPrice
//        } else {
//            System.out.println("Your price is $ " + largePrice); // else statement showing largePrice
//        }

        System.out.print("Share your age for a discount: "); // print statement prompting User for their age
        int age = scanner.nextInt(); // scanner variable to allow User to input age


        if (age <= 17 && choice == 1){ // if statement checking if age is greater than or equal to 17 and choice equals 1
            double studentDiscount = .1; // initializing variable for the price of student discount
            regPrice = (regPrice - (regPrice * studentDiscount)); // variable initializing new regPrice after student discount

            System.out.printf("You get a 10 percent discount, your new price is: $%.3f", regPrice); // formatted print statement showing the updated price
        } else if (age <= 17 && choice == 2){ // else if statement checking if age is less than or equal to and choice equals 2
            double studentDiscount = .1; // initializing variable for the price of student discount
            largePrice = (largePrice - (largePrice * studentDiscount)); // updating variable largePrice after student discount

            System.out.printf("You get a 10 percent discount, your new price is: $%.3f", largePrice); // formatted print statement showing the updated price
        }
        else if (age >= 65 && choice == 1){ // else if statement checking if age is greater than or equal to 65 and choice is 1
            double seniorDiscount = .2; // initializing variable for senior discount price
            regPrice = (regPrice - (regPrice * seniorDiscount)); // updating new regPrice after senior discount

            System.out.printf("You get a 20 percent discount, your new price is: $%.3f", regPrice); // formatted print statement showing the updated price
        } else if (age >= 65 && choice == 2) { // else if statement checking if age is greater than or equal to 65 and choice is 2
            double seniorDiscount = .2; // initializing variable for the senior discount price
            largePrice = (largePrice - (largePrice * seniorDiscount)); // updating new largePrice after senior discount

            System.out.printf("You get a 20 percent discount, your new price is: $%.3f", largePrice); // formatted print statement showing the updated price
        } else {
            System.out.println("Sorry, you do not qualify for a discount."); // else statement notifying User they don't get a discount
        }

        System.out.println("\nThank you for coming to the Sandwich Shop!"); // farewell print statement
    }
}