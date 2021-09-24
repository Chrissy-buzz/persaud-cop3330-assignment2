package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class badInput {

    public static void main(String[] args) {
        int rate;
        
        while (true) {
            try {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("What is the rate of return? ");
                rate = scan1.nextInt();
                if (rate > 0) {
                    System.out.println("It will take " + 72/rate + " years to double your initial investment.");
                    break;
                }
                if (rate == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Sorry. That's not a valid input.");
            }

        }
    }
}






