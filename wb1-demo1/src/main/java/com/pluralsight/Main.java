package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello"; // typing out a literal string within double quotes

        String word2 = "World!"; // a literal is the value that is given to a variable not from an expression

        String greeting; // defining a variable

        greeting = word1 + " " + word2 + "! "; // through an expression, we assigned the value of greeting
        // the + symbol is an operator that is concatenating strings together


        System.out.println(greeting);

    }
}