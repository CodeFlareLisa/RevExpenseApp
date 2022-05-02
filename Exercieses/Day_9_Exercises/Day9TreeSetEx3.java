package com.revature.AssignWk3;

// Day 9, TreeSet Ex # 3, Write a java program to add all elements of a specified tree set to another tree set.

import java.util.TreeSet;

public class Day9TreeSetEx3 {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(50);
        evenNumbers.add(10);
        evenNumbers.add(16);
        evenNumbers.add(20);
        evenNumbers.add(42);
        System.out.println("TreeSet 1: " + evenNumbers);
        System.out.println("---------------------------------");

        TreeSet<Integer> oddNum = new TreeSet<>();
        oddNum.add(3);
        oddNum.add(13);
        oddNum.add(43);
        oddNum.add(33);
        oddNum.add(21);
        System.out.println("TreeSet 2: " + oddNum);
        System.out.println("---------------------------------");

        // Union of two sets
        oddNum.addAll(evenNumbers);
        System.out.println("The Union of both TreeSets: " + oddNum);

    }

}

