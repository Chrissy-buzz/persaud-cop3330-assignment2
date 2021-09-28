package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemoval {

    public static void main(String[] args) {

        List<String> myAlist = new ArrayList<String>(); //my list
        myAlist.add("John Smith");
        myAlist.add("Jackie Jackson");
        myAlist.add("Chris Jones");
        myAlist.add("Jeremy Goodwin");
        myAlist.add("Amanda Cullen");

        System.out.println("There are 5 employees: \n" + myAlist);

        System.out.println("Enter an employee name to remove: ");

        Scanner scan = new Scanner(System.in);
        String rem = scan.nextLine();
        myAlist.remove(rem); //remove from list

        System.out.println("There are 4 employees:\n" + myAlist);
    }
}