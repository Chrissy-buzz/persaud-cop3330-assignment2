package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

/*
FlowChart
                                __________________
                                set total to 0
                                __________________
                                |
                                |
                                __________________
                                set for loop to start
                                at i=0
                                i < 5 so only loop 5 times
                                i ++ increment by one
                                __________________
                                |
                                |
                                __________________
                                first loop
                                num set to 1
                                total+num= 1
                                __________________
                                |
                                |
                                __________________
                                second loop
                                num set to 2
                                total(which is 1)+num (2)=3
                                __________________
                                |
                                |
                                __________________
                                third loop
                                num set to 4
                                total (which is 3)+num (4)=7
                                __________________
                                |
                                |
                                __________________
                                fourth loop
                                num set to 1
                                total (which is 7)+num (1)=8
                                __________________
                                |
                                |
                                __________________
                                fifth loop
                                num set to 2
                                total (which is 8)+num (2)=10
                                __________________
                                |
                                |
                                __________________
                                i is not 6 and
                                for loop constraint is
                                i<5
                                stop for loop
                                __________________
                                |
                                |
                                __________________
                                total printed out
                                at end
                                __________________
 */

import java.util.Scanner;

public class count {
    public static void main(String[] args) {

        int total= 0;

        for (int i=0; i<5; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scan1.nextInt();
            total+=num;
        }
        System.out.print("The total is "+ total+".");
    }
}