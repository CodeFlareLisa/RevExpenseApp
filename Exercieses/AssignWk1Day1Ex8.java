package com.revature.AssignWk1.Day1Ex;

// Write a program in Java to display the pattern like right angle triangle with a number
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910

import java.util.Scanner;

public class AssignWk1Day1Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // end of the line, use ;


        System.out.println("How many number of rows do you want to print?:  ");
        int sc = scanner.nextInt();

        for(int i=0; i<sc; i++){

            for(int j=1; j<=i+1; j++) {
                System.out.print(j);


            }
            System.out.println();  // remove the ln for the mixed line
        }
    }
}
