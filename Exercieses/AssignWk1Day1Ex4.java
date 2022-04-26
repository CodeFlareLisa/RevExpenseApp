package com.revature.AssignWk1.Day1Ex;

// Day 1, Exercise num 4
//  *****    5
//   ***     3
//    *      1

// star pattern upside down triangle

public class AssignWk1Day1Ex4 {

    public static void main(String[] args) {

        int min = 3; // 3 is the middle point
        int max = 3;


        for (int i = 3; i >= 1; i--) {  // i<= min, max int, this loop responsible for vertical lines - rows
            for (int k = i; k <= max; k++) {
                System.out.print(" ");// spacing controls the spaces before the star
            }
            // (int i=0; i<5; i++) this printed first line w 5 starts
            for (int j =i; j >= 1; j--) { //j = i, needs to subtract 2 instead of one

                System.out.print("* "); // no new line until is actually prints spaces between stars, stars per line

            }
            System.out.println("");
        }

    }
}







