package com.pluralsight;

public class MathApp {

    public static void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The answer is " + highestSalary);


        ///////////////////////////////////////////////////////

        // Question 2:
        // Find and display the smallest of two variables named carPrice and truckPrice
        Long carPrice = 12000L;
        Long truckPrice = 22000L;

        int highestPrice = (int) Math.max(carPrice, truckPrice);

        System.out.println("The highest price is: " + "$" + highestPrice);

        //////////////////////////////////////////////////////

        // Question 3:
        // Find and display the area of a circle whose radius is 7.25
        float radius = 7.25f;
        double pie = 3.1415926535897932384626433832795; // learned in class there is a Math.pie method
        double areaCircle = pie * Math.pow(radius, 2);

        System.out.println("The area of the given circle is: " + areaCircle);

        /////////////////////////////////////////////////////

        // Question 4:
        // Find and display the square root a variable after it is set to 5.0
        float variable = 5.0f;
        float squareRoot = (float) Math.sqrt(variable);

        System.out.println("The square root is : " + squareRoot);

        /////////////////////////////////////////////////////

        // Question 5:
        // Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5; // data types should be chosen based off possible future values
        double y1 = 10;

        double x2 = 85;
        double y2 = 50;

        // double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

       System.out.println("The distance between points is " + distance);

        /////////////////////////////////////////////////////

        // Question 6:
        // Find and display the absolute (positive) value of a variable after it is set to -3.8
        double nValue = -3.8;
        double pValue = Math.abs(nValue);

        System.out.println(pValue);

        /////////////////////////////////////////////////////

        // Question 7:
        // Find and display a random number between 0 and 1
        double randomNumber = Math.random();

        System.out.println("Random number is: " + randomNumber);
    }

}
