package com.revature.AssignWk2.Day7;

// Day 7 Exercises, Question 2 Program for multiple catch with single try

public class Day7Ex2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[3] = 10 / 0;
            System.out.println("First print statement in tr block");

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");

        } catch (Exception e) {
            System.out.println("Warning: Some other exception");

            System.out.println("Out of try-catch block");
        }
    }

}
