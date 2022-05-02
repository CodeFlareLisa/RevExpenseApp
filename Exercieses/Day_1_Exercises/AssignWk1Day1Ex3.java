package com.revature.AssignWk1.Day1Ex;

// Day 1, Exercise num 3
//    *
//   ***
//  *****
// *******

// star pattern triangle

public class AssignWk1Day1Ex3 {

    public static void main(String[] args) {

        int min = 4; // 4 is the middle point
        int max = 4;

        for (int i = 1; i <= 4; i++) {  // this loop responsible for vertical lines - rows
// (int i=0; i<5; i++) this printed first line w 5 starts


            for (int j = 1; j <= 7; j++) { // 7 is the max number of stars on the last row
                if(j>=min && j<=max){

                    System.out.print("*"); // no new line until is actually prints out
                }else{
                    System.out.print(" ");
                }
                // this loop is responsible for horizontal lines - columns

            }
            System.out.println(" ");
            min--; max++; // it decreases it min and increase max each time it iterates
        }


    }

}


// middle point will be 4