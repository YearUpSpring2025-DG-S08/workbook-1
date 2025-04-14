package com.pluralsight;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){

        System.out.println("Hello user, welcome to BasicCalculator"); // Introduced the BasicCalculator application
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: "); // Asks User for first number
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: "); // Asks User for second number
        double number2 = scanner.nextDouble();

        double product = number1 * number2; // Initializes product variable to hold the product of two numbers that will
        // be inputing by User

        // System.out.println("The product of: " + String.format("%.0f", number1) + " and " + String.format("%.0f", number2) + " is " + product);
        // Formats the system output message to print as a floating point number -- editing the "%.2f" changes the
        // floating point number that is outputted

        System.out.printf("The product of %.0f and %.0f and %.0f", number1, number2, product); // Another way to format
        // system output; similar to previous format, which can edit how the numbers print as a foating point number

    }
}
