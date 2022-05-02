package com.revature.AssignWk3;

// Day 9, HashSet Exercise 1; Write a Java program to append the specified element ot the end of the hash set.
// Hash set will not print in a specific order, it prints from the unix

import java.util.HashSet;
import java.util.Scanner;

public class Day9HashSetEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        // create an empty hash set
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("San Francisco");  // add = append
        h_set.add("Las Vegas");
        h_set.add("San Diego");
        h_set.add("Fort Bragg");
        h_set.add("Ocean Beach");

        // print the hash set
        System.out.println("The Original Hash Set: " + h_set);
        System.out.println("Please type the city you want to add: ");
        String city = scanner.next();
        h_set.add(city);
        System.out.println("The new set is: " + h_set);
        //System.out.println("The Hash Set is: " + h_set);

    }
}
