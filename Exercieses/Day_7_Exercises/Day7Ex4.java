package com.revature.AssignWk2;

// Day 7, exercise 4,Program for chained exception

public class Day7Ex4 {
    public static void main(String[] args) throws Exception {
        chain1(); // methods inside the public class, call them
    }

    public static void chain1() throws Exception {
        chain2();
    }

    public static void chain2() throws Exception {
        chain3();
    }

    public static void chain3() throws Exception { // throws is in the signature of the method
        throw new Exception("End of the chain.");
    }
}

