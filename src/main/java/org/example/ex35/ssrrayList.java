package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ssrrayList {

    public static void main(String[] args) {
        List l=new ArrayList();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while(running){ //scanning for input
            System.out.println("Enter a name ");
            String s = input.nextLine();
            l.add(s);
            if(!(s!="")){ //if blank end scan
                l.remove(s);
                running = false;
            }
        }

        for (int i = 0; i < 1; i++)
        {
            int index = (int)(Math.random() * l.size()); //math random for index

            System.out.println("The winner is...."
                    + l.get(index)); //get list value from the random index
        }
    }
}
