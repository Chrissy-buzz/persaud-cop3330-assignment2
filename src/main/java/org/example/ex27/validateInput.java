package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.lang.*;


public class validateInput {
    //attributes
    String first;
    String last;
    String zip;
    String id;

    public validateInput(String first, String last, String zip, String id) {
        this.first = first;
        this.last = last;
        this.zip = zip;
        this.id = id;
    }

    public String fullName(String first, String last) {
        if (first.isEmpty() || last.isEmpty()) {
            return "The first name must be filled in.\n";
        }
        if (first.length() < 2) {
            return "The first name must be at least 2 characters long.\n";
        }
        if (last.length() < 2) {
            return "The last name must be at least 2 characters long.\n";
        }
        return "";
    }

    public String zipCode(String zip) {
        if (zip.length() < 5) {
            return "The zipcode must be a 5 digit number.\n";
        }
        if (zip.matches(".*[a-z].*")) {
            return "The zipcode must be a 5 digit number.\n";
        } else {
            return "";
        }
    }

    public String EmplID(String id) {
        if (id.matches("\\a{2}-\\d{4}")){
    return "";
        }
        else{
            return "The employee ID must be in the format of AA-1234.\n";
        }
    }
}

    class App3 {
        public static void main(String[] args) {

            Scanner scan1 = new Scanner(System.in);
            System.out.print("Enter the first name: ");
            String first = scan1.next();

            Scanner scan2 = new Scanner(System.in);
            System.out.print("Enter the last name: ");
            String last = scan2.next();

            Scanner scan3 = new Scanner(System.in);
            System.out.print("Enter the ZIP code: ");
            String zip = scan3.next();

            Scanner scan4 = new Scanner(System.in);
            System.out.print("Enter the employee ID: ");
            String id = scan4.next();

            validateInput myObj = new validateInput(first, last, zip, id);
            System.out.print(myObj.fullName(first, last)  + myObj.zipCode(zip) + myObj.EmplID(id));
        }
    }



