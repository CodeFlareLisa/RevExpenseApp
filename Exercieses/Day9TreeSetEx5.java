package com.revature.AssignWk3;

// Day 9, TreeSet Exercise # 5, Write a java program to get first and last elements in a tree set.

import java.util.*;
import java.util.TreeSet;

public class Day9TreeSetEx5 {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<String> t_set = new TreeSet<String>();
        // use the add() method to add values to the tree set
        t_set.add("Sunday");
        t_set.add("Monday");
        t_set.add("Tuesday");
        t_set.add("Wednesday");
        t_set.add("Thursday");
        t_set.add("Friday");
        t_set.add("Saturday");
        // print original list
        System.out.println("-------------------------------");
        System.out.println("\n" + "Original Tree Set: " + t_set);
        System.out.println("\n" + "----------");

        // first element
        System.out.println("The first element is: " + t_set.first());
        System.out.println("\n" + "---------");

        // last element
        System.out.println("The last element is: " + t_set.last());
        System.out.println("\n" + "---------");

    }
}