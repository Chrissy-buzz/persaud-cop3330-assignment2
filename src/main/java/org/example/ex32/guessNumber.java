package org.example.ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */


import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
import java.util.Random;

public class guessNumber {

    //0-10
    public static String Easy (int guess, int random){
        int counter= 0;
        for(counter=0;counter< 20; counter++) //loop for 20 guesses
            if(guess==random) {
                return "You got it in " + counter + " guesses.\n";
            }
        else if (guess>random){
                System.out.print("Too High. Guess again: ");
                Scanner scan3= new Scanner(System.in); //new scan
                guess = scan3.nextInt();
        }
        else if (guess<random){
            System.out.print("Too Low. Guess again: ");
            Scanner scan4= new Scanner(System.in); //new scan
            guess = scan4.nextInt(); //set guess to new scan
        }
        return null;
    }
//0-100
    public static String Medium (int guess, int random){
        int counter= 0;
        for(counter=0;counter< 100; counter++)
            if(guess==random) {
                return "You got it in " + counter + " guesses.\n";
            }
            else if (guess>random){
                System.out.print("Too High. Guess again: ");
                Scanner scan3= new Scanner(System.in);
                guess = scan3.nextInt();
            }
            else if (guess<random){
                System.out.print("Too Low. Guess again: ");
                Scanner scan4= new Scanner(System.in);
                guess = scan4.nextInt();
            }
        return null;
    }

    public static String Hard (int guess, int random){
        int counter= 0;
        for(counter=0;counter< 1000; counter++)
            if(guess==random) {
                return "You got it in " + counter + " guesses.\n";
            }
            else if (guess>random){
                System.out.print("Too High. Guess again: ");
                Scanner scan3= new Scanner(System.in);
                guess = scan3.nextInt();
            }
            else if (guess<random){
                System.out.print("Too Low. Guess again: ");
                Scanner scan4= new Scanner(System.in);
                guess = scan4.nextInt();
            }
        return null;
    }



    public static void main(String[] args) {

        System.out.print("Enter the difficulty level (1, 2, or 3): ");

        int diffLevel=0;

        try {
            Scanner scan1 = new Scanner(System.in);
            diffLevel = scan1.nextInt();
        }
        catch (InputMismatchException e){ //only numerical values
            System.out.print("You must enter a number. \n");
            diffLevel=4; //take user to case 4
        }

        int random;
        Random generator = new Random();

        System.out.print("I have my number. What's your guess? ");
        Scanner scan2= new Scanner(System.in);
        int userGuess = scan2.nextInt();

        switch(diffLevel){ //cases for difficulty level
            case 1:
                random=generator.nextInt(10)+1; //random # generated
                System.out.print(Easy(userGuess, random)); //guessing function
                break;
            case 2:
                random=generator.nextInt(100)+1;
                System.out.print(Medium(userGuess, random));
                break;
            case 3:
                random=generator.nextInt(1000)+1;
                System.out.print(Hard(userGuess, random));
                break;
            case 4:
                System.out.print("Hmm...\n");
                break;
            default:
                System.out.print("Hmm...\n");
                break;
        }

    }
}