package com.revature.TWeek3.Day12.Exercises;

// Day 12, Question 3; Write a Java program to check if a file or directory specified by pathname exists or not.
// 3 check to see if the path is there, is it a thing / true

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day12Ex3 {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\lisa\\IdeaProjects\\java-demo\\Thursday1");
            file.createNewFile();
            System.out.println(file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }



        }
   }

