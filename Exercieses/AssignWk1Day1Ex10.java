package com.revature.AssignWk1.Day1Ex;

// print a diamond

import java.util.Scanner;

public class AssignWk1Day1Ex10 {
    public static void main(String[] args) {

        int i, j, k;
        Scanner scanner = new Scanner(System.in); // end of the line, use ;
        System.out.println("How Many Rows for a full diamond do You Want to Print?:  ");
        int n = scanner.nextInt();

        for (i = 0; i < n; i++) {  // this loop is responsible for vertical lines- rows
            for (j = 0; j < n - i - 1; j++) {  // this loop is responsible for horizontal lines - columns
                System.out.print(" ");  //top(length, length); can also be used.
            }
            for (k = 0; k < 2 * i + 1; k++) {  // this loop is responsible for vertical lines- rows
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = n - 1; i > 0; i--) {  // this loop is responsible for horizontal lines - columns
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for(k = 2 * i - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("  ");  // if you need a mixed line, remove the ln
        }

    }
}
