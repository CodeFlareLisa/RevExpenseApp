package com.revature.AssignWk1.Day1Ex;
/*
exercise 6:Take three numbers from the user and print the greatest number

        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87
*/

import java.util.Scanner;

public class AssignWk1Day1Ex6 {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);

        int maxNum = 0;
        int current = 0;
        int count = 0;
        while (count <= 2) {
            System.out.println("User pick a number between 1 and 99: ");
            current = inputNum.nextInt();
            if (current >= 1 && current <= 99) {
                if (current > maxNum) {
                    maxNum = current;

                }
                count++;
            }
        }
        System.out.println("The highest number is:  " + maxNum);

    }
}


