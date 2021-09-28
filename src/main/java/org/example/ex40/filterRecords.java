
package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */


import java.util.*;
import java.lang.*;

//create Employee
class Emp {
    String fname, lname, pos, term;

    public Emp(String fname, String lname, String pos, String term) {
        this.fname = fname;
        this.lname = lname;
        this.pos = pos;
        this.term = term;
    }
}


public class filterRecords {
    public static void main(String args[]) {
        Map<Integer, Emp> map = new HashMap<Integer, Emp>();
//set HashMap values
        Emp b1 = new Emp("John", "Johnson", "Manager", "2016-12-31");
        Emp b2 = new Emp("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Emp b3 = new Emp("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Emp b4 = new Emp("Jake", "Jacobson", "Programmer", "");
        Emp b5 = new Emp("Jacquelyn", "Jackson", "DBA", "");
        Emp b6 = new Emp("Sally", "Webber", "Web Developer", "2015-12-18");
//set key, values
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        map.put(4, b4);
        map.put(5, b5);
        map.put(6, b6);

        //user search prompt
        System.out.println("Enter a search string: ");
        Scanner scan = new Scanner(System.in);
        String rem = scan.next();


        System.out.format("Name \t\t Position \t\t Separation Date\n");
        for (Map.Entry<Integer, org.example.Emp> entry : map.entrySet()) { //search within a for loop
            org.example.Emp b = entry.getValue();
            if ((entry.getValue().fname).contains(rem)|| (entry.getValue().lname).contains(rem) ) { //contains sequence of characters
               System.out.print(b.fname + " " + b.lname + " " + " " +  b.pos + " " + " " + b.term + "\n");
            }
        }
    }
}

