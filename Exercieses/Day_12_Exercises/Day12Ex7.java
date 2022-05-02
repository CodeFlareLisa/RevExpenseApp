package com.revature.TWeek3.Day12.Exercises;

// Day 12, Exercise 7, Write a Java program to read first 3 lines from a file.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Day12Ex7 {
    public static void main(String[] args) throws IOException {
        // int counter == 3, String strLines
        String fileName = "first.txt";
        String String;
        File file = new File("Thursday1", fileName);
        String line = null;
//file reader
        FileReader fileRead = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileRead);


        try {
            for (int i = 1; i < 4; i++) {
                line = bufferedReader.readLine();
                System.out.println(line);
            }

        } finally {
            bufferedReader.close();
        }
    }

}