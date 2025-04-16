package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Rental Car Company");
        System.out.println("When will you be picking up your car? (mm/dd/yyyy)");
        String rentalCar = scanner.nextLine();

        System.out.println("How many days will you need the rental?");
        int numDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you want an electronic toll tag? (y/n)");
        String eTag = scanner.nextLine();

        System.out.println("Do you want a GPS? (y/n)");
        String gps = scanner.nextLine();

        System.out.println("Do you want roadside assistance? (y/n)");
        String roadAssistance = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();


        double carRental = 29.99 * numDays;
        double tollTag = 3.95 * numDays;
        double navDevice = 2.95 * numDays;
        double roadAssist = 3.95 * numDays;
        double options = 0;
        double underageSurcharge = 0;


        if (age <= 25){
            underageSurcharge = carRental - (carRental * .3);
            System.out.printf("There is an underage driver surcharge of 30 percent: %.2f \n", underageSurcharge);
        }


        if (eTag.equalsIgnoreCase("y")){
            options += tollTag;
            System.out.printf("Electronic Toll Tag price is $3.95/day: %.2f \n", tollTag);
        }


        if (gps.equalsIgnoreCase("y")){
            options += navDevice;
            System.out.printf("GPS price is $2.95/day: %.2f \n", navDevice);
        }


        if (roadAssistance.equalsIgnoreCase("y")){
           options += roadAssist;
            System.out.printf("Roadside Assistance price is $3.95/day: %.2f \n", roadAssist);
        }


        double totalCost = carRental + options + underageSurcharge;

        System.out.printf("Thank you for choosing the Car Rental Company! Your total cost is: $%.2f \n", totalCost);

    }
}