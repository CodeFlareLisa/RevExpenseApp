package com.revature.AssignWk2;

// Day 7, Exercises, Question 5, create custom exception that extends to another class.

import java.util.Scanner;


class Test2 extends Throwable {

    public Test2() {
        super("Invalid number; Number is between 1 and 10");
    }

    public Test2(String message) {
        super(message);
    }
}

public class Day7Ex5 {
    public static void main(String[] args) throws Test2, Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");

        int num = keyboard.nextInt();

        if (num < 1 || num > 10) {
            throw new Exception();
        }
    }

}
