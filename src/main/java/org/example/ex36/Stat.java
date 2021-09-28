package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;


public class Stat {

    //average function
    public static double calculateAverage(List<Integer> myArray) {
        int sum = 0;
        double average=0;
        for (int i : myArray) {
            sum += i;
        }
        if (myArray.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            average = sum / (double) myArray.size();
        }
        return average;
    }
//max function
    public static double max(List<Integer> myArray) {
        return Collections.max(myArray);
    }
//min function
    public static double min(List<Integer> myArray) {

        return Collections.min(myArray);
    }

    public static double std(List<Integer> myArray, double average) {
        double mean = average;

        double square = 0;

        for (int i = 0; i < myArray.size(); i++)
        {

            square += Math.pow(myArray.indexOf(i) - mean, 2);

        }

        return Math.sqrt((square) / (myArray.size() - 1));
    }


    public static void main(String[] args) {

        List l=new ArrayList();

        boolean running = true;

        while(running){ //scan for input

            try {
                System.out.println("Enter a number: ");
                Scanner input = new Scanner(System.in);
                String s = input.next();
                if (s.matches("DONE")) { //stop scanning when user inputs DONE
                    break;
                }
                int i = Integer.parseInt(s);
                l.add(i);
            }
                catch(NumberFormatException e){ //catch non numerical values and allow user to continue entering #s
                    System.out.println("You must enter a number\n");
                    continue;
                }
        }
        System.out.println(l);
        System.out.println("The average is "+ calculateAverage(l));
        System.out.println("The maximum is " + max(l));
        System.out.println("The minimum is "+ min(l));
        System.out.println("The standard deviation is " + std(l, calculateAverage(l)));
    }
}
