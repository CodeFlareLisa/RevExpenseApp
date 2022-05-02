package com.revature.AssignWk1.Day2;

// Question 2; write a program to sum first and even numbers using while loop

public class AssignWk1Day2Ex2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("sum of even number is : "+ sum);
        // first 4 even number - 0 2 4 6
    }
}



