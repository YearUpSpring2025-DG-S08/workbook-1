package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in); // creating Scanner class for future 'scanner' usage in code

    public static void main(String[] args) {

        System.out.println("Welcome to the Rental Car Company");
        System.out.println("When will you be picking up your car? (mm/dd/yyyy)");
        String rentalCar = scanner.nextLine(); // scanner input for date User is picking up car

        System.out.println("How many days will you need the rental?");
        int numDays = scanner.nextInt(); // scanner input for num days Usesr will keep the car
        scanner.nextLine(); // scanner line that will remove the CRLF to prepare for string input

        System.out.println("Do you want an electronic toll tag? (y/n)");
        String eTag = scanner.nextLine(); // scanner input whether User wants a toll tag

        System.out.println("Do you want a GPS? (y/n)");
        String gps = scanner.nextLine(); // scanner input whether User wants a gps

        System.out.println("Do you want roadside assistance? (y/n)");
        String roadAssistance = scanner.nextLine(); // scanner input whether User wants roadside assistance

        System.out.println("What is your age?");
        int age = scanner.nextInt(); // scanner input for User age


        double carRental = 29.99 * numDays; // variable initializing price of carRental per day
        double tollTag = 3.95 * numDays; // variable initializing price of tollTag per day
        double navDevice = 2.95 * numDays; // variable initializing price of navDevice per day
        double roadAssist = 3.95 * numDays; // variable initializing price of roadAssist per day
        double options = 0; // variable initializing options to store whether User adds on additional packages
        double underageSurcharge = 0; // variable intitialziing underageSurcharge depending on User age


        if (age <= 25){ // if statement to determine whether to apply underageSurcharge based on User age
            underageSurcharge = carRental - (carRental * .3); // storing new price of underageSurcharge
            System.out.printf("There is an underage driver surcharge of 30 percent: %.2f \n", underageSurcharge);
        }


        if (eTag.equalsIgnoreCase("y")){ // if statement to determine price increase with option chosen by User
            options += tollTag; // statement changing value of variable 'options' based on User choice
            System.out.printf("Electronic Toll Tag price is $3.95/day: %.2f \n", tollTag);
        }


        if (gps.equalsIgnoreCase("y")){ // if statement to determine price increase with option chosen by User
            options += navDevice; // statement changing value of variable 'options' based on User choice
            System.out.printf("GPS price is $2.95/day: %.2f \n", navDevice);
        }


        if (roadAssistance.equalsIgnoreCase("y")){ // if statement to determine price increase with option chosen by User
           options += roadAssist; // statement changing value of variable 'options' based on User choice
            System.out.printf("Roadside Assistance price is $3.95/day: %.2f \n", roadAssist);
        }


        double totalCost = carRental + options + underageSurcharge; // initializing variable to store total cost

        System.out.printf("Thank you for choosing the Car Rental Company! Your total cost is: $%.2f \n", totalCost);

    }
}