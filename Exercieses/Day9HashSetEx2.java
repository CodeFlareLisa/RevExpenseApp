package com.revature.AssignWk3;

// Day 9, Hash Set Exercise 2: Write a java program to iterate through all elements in a hash list

import java.util.HashSet;
import java.util.Iterator;

public class Day9HashSetEx2 {
    public static void main(String[] args) {
        // create an empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("CIT 58A");
        h_set.add("CIT 58B");
        h_set.add("CIT 58C");
        h_set.add("CIT 58D");
        h_set.add("CIT 58E");
        h_set.add("CIT 58F");

        // set Iterator
        Iterator<String> s = h_set.iterator();
        // Iterate the has set
        while(s.hasNext()){  // better if you do not know the end
            System.out.println(s.next());
        }
       /* for (String s : h_set) {  // to get a certain value or item by item
            System.out.println(s);
        }*/

        System.out.println("\n" + "Hash List of all elements For Internet Securities Classes at FCC: " + h_set);
        // added additional code
    }
}