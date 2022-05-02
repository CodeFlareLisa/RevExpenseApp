package com.revature.AssignWk2;
// Day 7 Exercises, Question 6, write a program to validate student record, similar to login demo

// finished
//import com.revature.Practice.MyPack1.Student;

import java.util.InputMismatchException;
import java.util.Scanner;


class StudentMgmt extends Exception{
    StudentMgmt(String error){
        super(error);
    }
}

public class Day7Ex6 {  // my Exception
    public static void main(String[] args) {

        try{

            Scanner KB=new Scanner(System.in);

            // enter mark between 1-100
            System.out.println("Enter marks here : ");
            int h=KB.nextInt();

            // condition for checking valid entry of marks
            if(!(h>=0 && h<=100)){
                throw (new StudentMgmt("invalid marks: " + h));
            }
            System.out.println("Entered marks are : " + h);
        }
        catch(InputMismatchException | StudentMgmt e){
            System.out.println("Invalid Input... Please Input Integers from 0 - 100 Only..");
        }
        //catch(studentMgmt e){
            //System.out.println("Error: "+e);
        }

    }


