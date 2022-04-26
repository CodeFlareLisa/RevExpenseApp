package com.revature.AssignWk1.Day2;

// Question 5, write a program to find the factorial of a given number using loops

import java.util.Scanner;

public class AssignWk1Day2Ex5 {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);  // to take the number given

        System.out.println("Pick a number to factor: ");


        int divNum = 1;
        int n = newInput.nextInt();


        for(int i=1;i<=n;i++){
            divNum *=i;
        }
        System.out.println(divNum);

    }


    }

