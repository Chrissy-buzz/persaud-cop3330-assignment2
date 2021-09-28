
package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;

public class filtering {

    //filter for even #s
    public static int filterEvenNumbers(int myArr) {
        if (myArr % 2 == 0) {
            return myArr;
        } else {
            myArr = 0; //will return 0 in place of odd #
        }
        return myArr;
    }


    public static void main(String args[]) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a list of numbers, separated by spaces: ");

        String str = myObj.nextLine();

        // calling replaceAll() method and split() method on
        // string
        String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(" ");

        // declaring an array with the size of string
        int[] arr = new int[string.length];
        int j=0;

        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < string.length; i++) {
            arr[i] = filterEvenNumbers(Integer.valueOf(string[i]));
            }
        System.out.println("The even numbers are ");
        for (j=0;j<string.length; j++){
        if (arr[j] != 0) { //take out the 0s
            System.out.println(arr[j] + " ");
        }
        }
    }
}