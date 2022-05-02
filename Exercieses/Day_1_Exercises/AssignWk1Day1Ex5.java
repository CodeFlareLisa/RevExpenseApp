package com.revature.AssignWk1.Day1Ex;

// Day 1 Exercise Num 4
// mirrored right triangle star with 5 rows

//        *   6 sp, 1 star
//       **   5 sp, 2 stars
//      ***   4 sp, 3 stars
//     ****   3 sp, 4 stars
//   ******   1 sp, 6 stars


// following code actually prints out a mirrored left triangle

import java.util.Scanner;

public class AssignWk1Day1Ex5 {

    public static void main(String[] args) {


        for (int i = 1; i <= 6-1; i++) {

            for (int j =i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");// controls the spaces before the stars
            }
            System.out.println();
        }

    }
}






