package com.revature.AssignWk1.Day2;

// question 3; write a program to print the multiplication table of a given numb n.

import java.util.Scanner;

public class AssignWk1Day2Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // end of the line, use ;

        System.out.println("What number do you want to multiply and show the multiplication table?:  ");

        int userNum = scanner.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(userNum +" X " + i+" = "+ userNum * i );
        }

    }
}
