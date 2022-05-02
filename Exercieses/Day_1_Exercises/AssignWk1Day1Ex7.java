package com.revature.AssignWk1.Day1Ex;

// Write a program in Java to display the multiplication table of a given number

import java.util.Scanner;

public class AssignWk1Day1Ex7 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in); //

        System.out.println("User, chose a number:  ");

        int userNum = inputNum.nextInt();

        for (int i = 5; i >= 1; i--) {
            System.out.println(userNum + " x " +i  + " = " + userNum * i);
        }
    }
}

