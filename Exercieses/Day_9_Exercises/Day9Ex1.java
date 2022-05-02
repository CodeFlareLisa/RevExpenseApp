package com.revature.AssignWk3;
// Day 9, Question 1, Write a program to append the specified element to the end of a linked list

import java.util.ArrayList;

public class Day9Ex1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Daisy");
        names.add("Bengston");
        names.add("Sam Smith");
        names.add("Stan");

        System.out.println(names);

        System.out.println(names.get(2)); // index value Sam Smith

        names.set(1, "Bengston King");

        System.out.println(names);

        // foreach to print out each item of the Array
        for(String name: names){
            System.out.println(names);
        }

    }

}

