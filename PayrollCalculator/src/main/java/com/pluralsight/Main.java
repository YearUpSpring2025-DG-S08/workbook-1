package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Welcome to PayrollCalculator."); // Introduces the PayrollCalculator

        String name = promptForName(); // variable that calls on the promptForName() method

        double hoursWorked = hoursWorked(); // variable that calls on the hoursWorked() method

        double payRate = payRate(); // variable that calls on the payRate() method

        double grossPay = calcGrossPay(hoursWorked, payRate); // variable that calls on the calcGrossPay() method
        // inputs parameters of hoursWorked and payRate


        System.out.printf("Hello %s, you worked %.0f hours at a rate of $%.0f and made $%.0f", name, hoursWorked, payRate, grossPay);
    }

    public static String promptForName(){           // class that creates a method that prompts the User to enter their name
        System.out.println("What is your name?");
        return scanner.nextLine();
    }

    public static double hoursWorked(){             // class that creates a method that prompts the User to enter how many hours worked
        System.out.println("How many hours have you worked?");
        return scanner.nextDouble();
    }

    public static double payRate(){                 // class that creates a method that prompts the User to enter their pay rate
        System.out.println("What is your pay rate?");
        return scanner.nextDouble();
    }

    public static double calcGrossPay(double hoursWorked, double payRate) {         // class that creates a method to calculate overtime pay
//        double grossPay;
//        if (hoursWorked > 40) {
//            return grossPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
//        } else {
//           return grossPay = hoursWorked * payRate;
//        }

        return (hoursWorked > 40) ? (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5) : hoursWorked * payRate;
        // formatted code that uses conditional statement to calculate overtime pay
    }
}
