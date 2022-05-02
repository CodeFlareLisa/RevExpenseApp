package com.revature.AssignWk1.Day1Ex;

// star pattern, prints
// 8
// 8 8
// 8 8 8
// 8 8 8 8
// 8 8 8 8 8

// from https://youtu.be/u3ROQ6RmWuE

public class AssignWk1Day1Ex2 {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){  // this loop is responsible for vertical lines- rows

            for(int j=5; j>i; j--) {  // this loop is responsible for horizontal lines - columns

                System.out.print(" 8");

            }
            System.out.println("  ");  // if you need a mixed line, remove the ln
        }

    }
}


