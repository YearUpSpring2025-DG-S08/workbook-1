package com.pluralsight;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Hello user, welcome to BasicCalculator"); // Introduced the BasicCalculator application
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: "); // Asks User for first number - print allows for the input field
        // to be on the same line
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: "); // Asks User for second number - println moves the input field
        // to a new line
        double number2 = scanner.nextDouble(); // leaves a CRLF on the stream

        // double product = number1 * number2; // Initializes product variable to hold the product of two numbers that will
        // be inputting by User - no longer need this variable due to if/else if statement

        scanner.nextLine(); // removes the CRLF to prepare for getting a string

        System.out.println("Choose your preferred calculation method: ");
        System.out.println("Addition: " + "A");
        System.out.println("Subtraction: " + "S");
        System.out.println("Multiplication: " + "M");
        System.out.println("Division: " + "D");

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        String method = scanner.nextLine();

        if (method.equals("A")){System.out.printf("The sum of %.0f and %.0f is: %.0f", number1, number2, addition);
        }
        else if (method.equals("S")) {System.out.printf("The difference of %.0f and %.0f is: %.0f", number1, number2, subtraction);
        }
        else if (method.equals("M")) {System.out.printf("The product of %.0f and %.0f is: %.0f", number1, number2, multiplication);
        }
        else if (method.equals("D")) {System.out.printf("The quotient of %.0f and %.0f is: %.0f", number1, number2, division);
        }

        // System.out.println("The product of: " + String.format("%.0f", number1) + " and " + String.format("%.0f", number2) + " is " + product);
        // Formats the system output message to print as a floating point number -- editing the "%.2f" changes the
        // floating point number that is outputted

        // System.out.printf("The product of %.0f and %.0f is %.0f", number1, number2, product); // Another way to format - previous statement to print before adding if/else if statement
        // system output; similar to previous format, which can edit how the numbers print as a foating point number

    }
}
