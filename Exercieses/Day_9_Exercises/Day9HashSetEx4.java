package com.revature.AssignWk3;

// Day 9, HashSet Exercises # 4, Write a java program to empty a Hash Set.

import java.util.HashSet;

public class Day9HashSetEx4 {
    public static void main(String[] args) {
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
        System.out.println("------------------------------------");

        h_set.clear();
        //System.out.println("Is the HashSet empty? " + h_set.isEmpty());
        System.out.println("The HashSet after clearing: " + h_set);

    }
}
