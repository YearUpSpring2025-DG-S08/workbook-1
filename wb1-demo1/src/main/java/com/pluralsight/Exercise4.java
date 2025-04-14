package com.pluralsight;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){

        System.out.println("Welcome to PayrollCalculator.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
            String name = scanner.nextLine();

        System.out.println("How many hours have you worked?");
            Float hoursWorked = scanner.nextFloat();

        System.out.println("What is your pay rate?");
            Float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.printf("Hello %s, your gross pay is $%.0f", name, grossPay);


    }
}
