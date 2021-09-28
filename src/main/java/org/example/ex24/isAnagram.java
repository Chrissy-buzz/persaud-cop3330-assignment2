package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.lang.*;


public class isAnagram {
    //create attributes
    String x;
    String y;

    //parameterized constructor
    public isAnagram(String x, String y) {
        this.x = x;
        this.y = y;
    }

    //Function to determine if it is an Anagram or not
    static boolean ComputeisAnagram(String x, String y) {

        //Str -> char arr
        char str1[] = x.toCharArray();
        char str2[] = y.toCharArray();

        int n1 = x.length();
        int n2 = y.length();

        //first check length
        if (n1 != n2)
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < n1; i++)
            arr[x.charAt(i)-'a']++; //
        for (int i = 0; i < n2; i++)
            if(--arr[y.charAt(i)-'a'] < 0)
                return false;
        return true;
    }
}

class Demo {
    public static void main(String[] args) {
        //Prompt user input
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scan1.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the second string: ");
        String str2 = scan2.next();

        isAnagram myObj = new isAnagram(str1, str2);  //anagram object

        if (myObj.ComputeisAnagram(str1, str2)) //print results
            System.out.print("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        else
            System.out.print("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
    }
}


