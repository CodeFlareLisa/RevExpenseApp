package com.revature.AssignWk1.Day2;

// Question 7 Repeat problem 2 using for/while loop
// Write a program to sum first and even numbers using a for loop

import java.util.Scanner;

public class AssignWk1Day2Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me any number: ");
        int i = 0;
        int x = s.nextInt();
        int sum = 0;



        while (i <= x)  // condition
            sum = sum + (2*i++); // body



            System.out.println("Sum of: " + x + " number is: " + sum);



        /* int sum = 0;
        int n = 4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("sum of even number is : "+ sum);
        // first 4 even number - 0 2 4 6*/

    }
    }
