package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.lang.*;


public class PaymentCalculator {
    //attributes
    double b;
    double a;
    double m;

    //parameterized constructor
    public PaymentCalculator(double b, double a, double m) {
        this.b=b;
        this.a=a;
        this.m=m;
    }

    //calculations for months until paid off
    public double calculateMonthsUntilPaidOff(double b, double a, double m) {
        double months;
        a /= 36500;

        months = (-1.0/30.0)  * Math.log(1 + ((b/m) * (1 - (Math.pow((1 + a), 30))))) /Math.log(1 + a);
        return Math.ceil(months);
    }
}

    class App2 {
        public static void main(String[] args) {

            Scanner scan1 = new Scanner(System.in);
            System.out.print("What is your balance? ");
            double balance = scan1.nextInt();

            Scanner scan2 = new Scanner(System.in);
            System.out.print("What is the APR on the card (as a percent)? ");
            double APR = scan2.nextInt();

            Scanner scan3 = new Scanner(System.in);
            System.out.print("What is the monthly payment you can make? ");
            double mpayment = scan3.nextInt();

            PaymentCalculator myObj = new PaymentCalculator(balance, APR, mpayment);

            System.out.print("It will take you " + (int)myObj.calculateMonthsUntilPaidOff(balance, APR, mpayment) + " months to pay off this card.\n");
        }
    }



