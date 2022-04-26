package com.revature.AssignWk1.Day2;

// question 9 write a program to calculate the sum of the numbers occurring in the multiplication table of 8;

import java.util.Scanner;

public class AssignWk1Day2Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number do you want to multiply and show the multiplication table?: ");

        int userNum = scanner.nextInt();
        int sum = 0;   /// keeps track
        for (int i = 1; i <= 10; i++) {
            sum +=i * userNum;
            System.out.println(userNum + " X " +i+" = "+ (userNum * i));
        }
        System.out.println("Sum: " + sum);


    }


}

