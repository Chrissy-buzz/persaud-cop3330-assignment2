package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class multiTable {

    public static void main(String[] args) {
        int num = 1, i = 1;
        int num2 = 2, j = 1;
        while (i <= 12)
            while (j <= 12) {
                {
                    System.out.printf("%d \t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", num * i, num2 * j, 3*j, 4*j, 5*j, 6*j, 7*j, 8*j, 9*j, 10*j, 11*j, 12*j);
                    i++;
                    j++;
                }
            }
    }
}