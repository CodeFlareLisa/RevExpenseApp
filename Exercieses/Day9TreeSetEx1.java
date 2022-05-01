package com.revature.AssignWk3;

// Day 9, Tree Set Exercise # 1, Write a java program to create a new tree set, add some colors in a string,

import java.util.TreeSet;

public class Day9TreeSetEx1 {
    public static void main(String[] args) {
        // create TreeSet and add elements
        TreeSet<String> colors = new TreeSet<String>();

        //TreeSet<String> treeSet = new TreeSet<>(){
            colors.add("Red");
            colors.add("White");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Pink");

        System.out.println("Tree set: " + colors);

         }
     }



