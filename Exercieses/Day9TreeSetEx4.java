package com.revature.AssignWk3;

// Day 9, TreeSet Exercise # 4, Write a java program to create a reverse order view of the elements contained in a
// given tree set.

import java.util.Iterator;
import java.util.TreeSet;

public class Day9TreeSetEx4 {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<Integer> t_set = new TreeSet<Integer>();    // or you can use String
        // use add() method to add values in the tree set
        t_set.add(2);
        t_set.add(6);
        t_set.add(8);
        t_set.add(10);
        t_set.add(12);
        t_set.add(14);
        t_set.add(4);  // program is smart to list the numbers in correct numerical order as integers

        // print original list
        System.out.println("The Original Tree Set: " + t_set);
        Iterator itr = t_set.descendingIterator();
        // print list elements in reverse order
        System.out.println("Elements in Reverse Order: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
