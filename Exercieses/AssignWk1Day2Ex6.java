package com.revature.AssignWk1.Day2;

// Question 6: Repeat problem 5 using a while loop; which is to find the factorial of a given number.

import java.util.Scanner;

public class AssignWk1Day2Ex6 {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        System.out.println("What number do you want to see the Factorial of:  ");

        int i, fact=1;
        int number =factorial.nextInt();  // number to calculate factorial


        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of: " + number + " is: " +fact);
    }
}
