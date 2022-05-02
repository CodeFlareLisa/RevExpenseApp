package com.revature.AssignWk2;

// Day 7 Exercises, Question 2 Program for multiple catch with single try
// Throws ArithmeticException

public class Day7Ex2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[3] = 10 / 0;
            System.out.println("First print statement in tr block");

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");

        } catch (Exception e) {
            System.out.println("Warning: Some other exception");

            System.out.println("Out of try-catch block");
        }
    }

    public static class Day7Ex4 {
        public static void main(String[] args) throws Exception {

            System.out.println("Chained Exceptions");
            doThat1();
        }

        public static void doThat1() throws Exception {
            doThat2();
        }

        public static void doThat2() throws Exception {
            doThat3();
        }
        public static void doThat3() throws Exception {
            doThat4();
        }

        public static void doThat4() throws Exception {
            doThat5();
        }
        public static void doThat5() throws Exception {
            doThat6();
        }

        public static void doThat6() throws Exception {
            doThat7();
        }

        private static void doThat7() throws Exception {
            throw new Exception();
        }


    }
}
