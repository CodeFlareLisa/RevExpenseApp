package com.revature.AssignWk3;
// Day 9, Question 3,  Write a Java program to iterate through all elements in a linked list
// starting at the specified position. (or Array List)
// use for loop

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Day9Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What index number do you want to print from 0 - 5: ");
        int start = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        // printing elements of the list
        System.out.println("list: " + arr);

       for(int i = start; i<=arr.size()-1;i++)

        System.out.println("the element: " + arr.get(i));
    }
}
