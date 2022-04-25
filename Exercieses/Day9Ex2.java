package com.revature.AssignWk3;
// Day 9, Questions 2, Write a java program to iterate through all elements in a linked list
// NEED HELP
import java.util.ArrayList;
import java.util.Iterator;

public class Day9Ex2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Dodge Journey");
        cars.add("BMW 320i");
        cars.add("Ford Mustang");

        //iterator
        Iterator iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            }
        System.out.println("-----------------------------------------");

        //for-each
        for(String car : cars){
            System.out.println(car);
        }
      /*  System.out.println("__________________________________________");

        //for loop
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));

        }
        System.out.println("-------------------------------------------");*/

        //for-each
        cars.forEach(car -> System.out.println(car));
    }
}
