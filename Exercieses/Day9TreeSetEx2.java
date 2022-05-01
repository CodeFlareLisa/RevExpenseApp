package com.revature.AssignWk3;

// Day 9 TreeSet Exercise # 2, Write a java program to iterate through all elements in a tree set.

import java.util.TreeSet;

public class Day9TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();  // sorted naturally by ascending order

        numbers.add(8);
        numbers.add(15);
        numbers.add(22);
        numbers.add(28);
        numbers.add(12);
        numbers.add(18);
        numbers.add(49);
        //System.out.println(numbers);
        System.out.println("The original TreeSet is: " + numbers);
        System.out.println("-----------------------------");

        TreeSet<Integer> oddNumbers = new TreeSet<>();
        oddNumbers.add(1);

        //using the addAll() method
        numbers.addAll(oddNumbers);
        System.out.println("The New TreeSet is: " + numbers);

    }
}
