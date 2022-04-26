package com.revature.AssignWk1.Day1Ex;

// write a program in Java to make such a pattern like pyramid with a number which will repeat the number in the
// same row
//  1
// 22
//333

public class AssignWk1Day1Ex9 {
    public static void main(String[] args) {

        //int nextNum = i++;

        for (int i = 1; i <= 4; i++) {  // this loop responsible for vertical lines - rows

            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
    }
}



