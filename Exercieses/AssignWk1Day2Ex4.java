package com.revature.AssignWk1.Day2;

// Question 4; Write a program to print a multiplication table of 10 in reverse order.

import java.util.Scanner;

public class AssignWk1Day2Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // end of the line, use ;

        System.out.println("What number do you want to multiply and show the multiplication table?:  ");

        int userNum = scanner.nextInt();

        for (int i = 10; i>= 1; i--) {
            System.out.println(userNum + " X " + i + " = " + userNum * i);
        }

    }
}
