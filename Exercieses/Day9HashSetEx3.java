package com.revature.AssignWk3;

// Day 9, Hash Set Exercises # 3, Write a java program to get the number of elements in a hash set

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day9HashSetEx3 {
    public static void main(String[] args) {
       String strArr[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
       Set s = new HashSet(Arrays.asList(strArr));

        System.out.println("Elements: " + s);
        System.out.println("Number of Elements in the Hash Set: " + s.size());


    }
}
