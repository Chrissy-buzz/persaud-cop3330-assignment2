package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.lang.*;
import java.util.*;


public class passwordValidator {
    //create attributes
    String x;

    //parameterized constructor
    public passwordValidator(String x) {

    }

    //Function to determine strength of password
    public int ComputepasswordValidator(String x) {

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        //password contain special character
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : x.toCharArray()) {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                hasSpecial = true;
        }
        //password contain special character, letter and digit
        if (hasDigit && hasLetter && hasSpecial
                && (x.length() >= 8))
            return 1;
        else if (hasDigit && hasLetter
                && (x.length() >= 8))
            return 2;
        else if (hasDigit
                && (x.length() < 8))
            return 3;
        else if (hasLetter
                && (x.length() < 8))
            return 4;
    return 0;
    }
}


class App {
//functions to output password strength
        static void veryWeak(String z) {
            System.out.println("The password '" + z + "' is a very weak password.");
        }

        static void weak(String z) {
            System.out.println("The password '" + z + "' is a weak password.");
        }

        static void strong(String z) {
            System.out.println("The password '" + z + "' is a strong password.");
        }

        static void veryStrong(String z) {
            System.out.println("The password '" + z + "' is a very strong password.");
        }


        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);
            String str1 = scan1.next();

            passwordValidator myObj = new passwordValidator(str1);

            if (myObj.ComputepasswordValidator(str1) == 3) {
                veryWeak(str1);
            } else if (myObj.ComputepasswordValidator(str1) == 4) {
                weak(str1);
            } else if (myObj.ComputepasswordValidator(str1)==2) {
                strong(str1);
            } else if (myObj.ComputepasswordValidator(str1) == 1) {
                veryStrong(str1);
            } else {
                System.out.println("Enter a valid input\n");
            }
        }
    }



