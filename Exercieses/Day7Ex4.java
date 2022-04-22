package com.revature.AssignWk2.Day7;

// Day 7, Exercises, Question 4, Program for chained exception

// see Demo 12

import javax.management.InvalidApplicationException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Day7Ex4 {
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

  /*  }

    public void setBirthday(String birthday) {
        DateFormat formatter = new SimpleDateFormat();
        try{
            Date birthday = formatter.parse(birthDate);
        }catch(ParseException ex){
            throw new InvalidBirthdayException("Date of birth is invalid", ex);
        }
    }

*/









       /* ArithmeticException a = new ArithmeticException();
        StringIndexOutOfBoundsException b = new StringIndexOutOfBoundsException();
        ArrayStoreException c = new ArrayStoreException();

        Throwable t1 = b.initCause(a);
        Throwable t2 = c.initCause(b);

        System.out.println(b.getCause() + "caused\n" + b);

    }

    static void A() {

    }

    static void B() {

    }

    static void C() {

    }
}*/


//class InvalidA extends Exception{
//    public InvalidApplicationException(Exception e){
/*Throwable getTest();
    Throwable intTest(Throwable);
    Throwable(String, Throwable);
    Throwable(Throwable);*/
//        super(e);

