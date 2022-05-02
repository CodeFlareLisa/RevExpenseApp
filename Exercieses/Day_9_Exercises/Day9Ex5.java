package com.revature.AssignWk3;

import java.util.LinkedList;
import java.util.Scanner;
// Day 9, Question 5, Write a Java program to insert the specified element at the specified position in the linked list
// NEED HELP

public class Day9Ex5 {
    public static void main(String[] args) {
        // create an empty linked list
        //Scanner
       //         // enter color
       // please enter index value

        LinkedList<String>l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Purple");
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Pink");

        System.out.println("-----------------------------------------" +"\n");
        System.out.println("Original linked list: ");
        System.out.println("-----------------------------------------" +"\n");

        System.out.println("The List: " +l_list);
        //System.out.println("-----------------------------------------" +"\n");
        System.out.println("\n"+ "Let's add the color Burgundy after the Red Color: "+"\n");
        //System.out.println("-----------------------------------------" +"\n");


        l_list.add(1,"Burgundy");
        // print the list
        System.out.println("The linked list: "+ l_list);


    }
}
