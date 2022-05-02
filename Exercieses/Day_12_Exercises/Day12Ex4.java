package com.revature.TWeek3.Day12.Exercises;

// Day 12, Ex # 4, Write a Java program to check if given pathname is a directory or a file.
// is this a file or a directory - finished

import java.io.File;
import java.io.IOException;


public class Day12Ex4 {
    public static void main(String[] args) {

        // is this a file or directory
        File file = new File("C:\\Users\\lisa\\IdeaProjects\\java-demo\\Thursday1");
        if(file.isDirectory()){
            System.out.println(file.getAbsolutePath() + " is a directory. \n");
        }
        else {
            System.out.println(file.getAbsolutePath() + " is NOT a directory. \n");
        }
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + " is a file. \n");
        }
        else{
            System.out.println(file.getAbsolutePath() + " is not a file. \n");


        }
    }
}
