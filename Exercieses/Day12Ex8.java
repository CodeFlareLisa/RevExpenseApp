package com.revature.TWeek3.Day12.Exercises;

// Day 12, Exercise question 8, Write a Java program to find the longest word in a text file
// fix the file path, line 18, then it should run correctly

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day12Ex8 {
    public static void main(String[] args) throws FileNotFoundException {
        new Day12Ex8().findLongestWord();
    }

    public String findLongestWord() throws FileNotFoundException {
        String longest_word = "";
        String current;
        Scanner scanner = new Scanner(new File("/first.txt"));

        while(scanner.hasNext()){
            current = scanner.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println("\n" + longest_word);
        return longest_word;
    }

}
