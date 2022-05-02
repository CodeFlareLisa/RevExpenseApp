package com.revature.TWeek3.Day12.Exercises;

//Day 12, Exercise Question 5, Write Java program to read input from java console.
// the console stops and asks user for input each time

import java.util.Scanner;

public class Day12Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String str = scanner.nextLine();
        System.out.println("The string is " + str);

        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        System.out.println("The integer is " + number);

        System.out.println("Enter a decimal number greater than .5: ");
        float flt = scanner.nextFloat();
        System.out.println("The float value is " + flt);
    }

}