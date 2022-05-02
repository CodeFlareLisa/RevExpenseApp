
package com.revature.TWeek3.Day12.Exercises;

// Day 12, Question 2, Write a Java program to get specific files by extensions from a specified folder.

import java.io.File;

public class Day12Ex2 {
    public static void main(String[] args) {
        File file = new File("Thursday1");
        String[] listFiles = file.list();
        for (String fName : listFiles) {
            //System.out.println(fName);
            int indexN = fName.lastIndexOf('.');
            if (fName.substring(indexN + 1).equals("html")) { // this line filters it out by extension name
                System.out.println(fName);
            }

        }

    }
}
