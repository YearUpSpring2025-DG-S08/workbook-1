package com.pluralsight;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Welcome to PayrollCalculator."); // Introduces the PayrollCalculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?"); // Asks User for name
        String name = scanner.nextLine();

        System.out.println("How many hours have you worked?"); // Asks User for how many hours they worked
        Double hoursWorked = scanner.nextDouble();

        System.out.println("What is your pay rate?"); // Asks User what their pay rate is
        Double payRate = scanner.nextDouble();

        double grossPay = hoursWorked * payRate; // Initializes a formula to calculate the gross pay

        if (hoursWorked > 40){                   // If statement that will calculate overtime pay
            double OTP = payRate * 1.4;          // Initializes a formula to calculate overtime pay
            double OTHours = (hoursWorked - 40) * OTP;      // Initializes a formula to calculate overtime hours
            // and the amount of pay


            System.out.printf("Hello %s, your gross pay is $%.0f and your overtime pay is $%.0f", name, grossPay, OTHours);
            // Print statement that gives gross pay and the overtime pay
        }
        else {
            System.out.printf("Hello %s, your gross pay is $%.0f", name, grossPay);
            // Else statement that only prints gross pay if the 'if' statement does not pass true
        }
        // System.out.printf("Hello %s, your gross pay is $%.0f", name, grossPay); <-- original print statement


    }
}
