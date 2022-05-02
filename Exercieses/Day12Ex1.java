package com.revature.TWeek3.Day12.Exercises;

// Day 12, Question 1, Write a java program to get a list of all file/directory names from the given

// finished

import java.io.File;


public class Day12Ex1 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("Thursday1");
        String[] list = file.list();
        for (String s : list) {
            count++;
            System.out.println(s);

        }
        System.out.println("Total number of fle and folders: " + count);
    }

}