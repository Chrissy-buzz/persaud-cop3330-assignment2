package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.lang.*;

public class karvonen {

    public static void main(String[] args) {

        double rate=0;
        double intensity=55;


        Scanner scan1 = new Scanner(System.in);
        System.out.print("Age: ");
        int age = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Resting Pulse: ");
        int restingHR = scan2.nextInt();

        System.out.println("Intensity   | Rate");
        System.out.println("________________________");
        for (int i=55; i<=95; i+=5){ //calculate
            rate= (((220-age) - restingHR) * (intensity/100) + restingHR);
            System.out.print(i + "%\t");
            System.out.print("\t\t|" + Math.round(rate) + " bpm\n");
            intensity+=5; //increment intensity
        }

    }

}