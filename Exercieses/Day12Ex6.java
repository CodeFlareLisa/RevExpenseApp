package com.revature.TWeek3.Day12.Exercises;

// Day 12, Exercise question 6, Write a Java program to read a file content line by line.
// Finished

import java.io.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;


public class Day12Ex6 {
    public static void main(String[] args) throws IOException {
        File file = new File("first.txt");
        Scanner scanner = new Scanner(file);

        try {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}