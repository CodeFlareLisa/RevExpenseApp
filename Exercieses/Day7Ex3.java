package com.revature.AssignWk2.Day7;

// Day 7 Exercises, Question 3, Program illustrating throws keyword
// java throws keyword s used to declare an exception

public class Day7Ex3 {
    public static void main(String[] args) throws Exception{
        doThat();
    }
    public static void doThat(){
        doThis();
    }
    public static void doThis(){
         throw new NullPointerException();
    }
    public static void doThatdoThatNow(){


    }
}
