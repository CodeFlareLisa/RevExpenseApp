package com.revature.AssignWk3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Day 9, Question 4, Write a Java program to iterate a linked list in reverse order.
// use the get method
// NEED HELP

public class Day9Ex4 {
    public static void main(String[] args) {

        //System.out.println("What index number do you want to print from 0-50 : ");

       ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<=49;i++)
            numbers.add(i);

        for(int i = numbers.size()-1; i>=0;i--){ // decrementing down
            System.out.println(numbers.get(i));

        }

        //Iterator iterator = numbers.();

        }

    }
