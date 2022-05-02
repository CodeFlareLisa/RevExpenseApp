package com.revature.AssignWk2;

// Day 7 Exercises, question 7, Program to create custom exception - See Demo 5, Day 7

// Finished

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.constant.Constable;
import java.util.Scanner;

import static com.revature.AssignWk2.TestCustomException1.validate;

// class representing custom exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        // calling the constructor of parent Exception
        super(str);
    }
}
class TestCustomException1{
    // method to check the age
    static void validate(int age)throws InvalidAgeException{
        if(age<18){

        throw new InvalidAgeException("Sorry, your age is not valid to vote") ;
        }
        else{
            System.out.println("Welcome, you are eligible to vote!");
        }
    }
}

public class Day7Ex7 {  // main method
    public static void main(String[] args) {
        Scanner ageObj = new Scanner(System.in);
        System.out.println("Enter your age: ");

         int userAge = ageObj.nextInt();
        System.out.println();

        try {
            //calling the method
            validate(userAge);
        }
        catch(InvalidAgeException ex){
            System.out.println("Caught the exception");

            // printing the message from Invalid Age Exception object
            System.out.println("Exception Occurred: "+ex);
        }
        System.out.println("rest of the code...");


        //} catch(InvalidAgeException e) {
         //   e.printStackTrace();
        }
    }


