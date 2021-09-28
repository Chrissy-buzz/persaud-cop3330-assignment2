
package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */


import java.util.*;
import java.lang.*;

//create employee
class Employee {
    String fname, lname, pos, term;

    public Employee(String fname, String lname, String pos, String term) {
        this.fname = fname;
        this.lname = lname;
        this.pos = pos;
        this.term = term;
    }
}


public class sorting {
        public static void main(String args[]) {
            Map<Integer, Employee> map = new HashMap<Integer, Employee>();
//set hashmap values
            Employee b1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
            Employee b2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
            Employee b3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
            Employee b4 = new Employee("Jake", "Jacobson", "Programmer", "");
            Employee b5 = new Employee("Jacquelyn", "Jackson", "DBA", "");
            Employee b6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

            //set key, value
            map.put(1, b1);
            map.put(2, b2);
            map.put(3, b3);
            map.put(4, b4);
            map.put(5, b5);
            map.put(6, b6);
            System.out.format("Name \t\t Position \t\t Separation Date\n");

            //print by using for loop
            for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                int key = entry.getKey();
                Employee b = entry.getValue();
                System.out.format("%s %s\t |%s\t|%s\n", b.fname, b.lname, b.pos, b.term);
            }
        }

}
