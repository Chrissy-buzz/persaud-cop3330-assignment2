package example.org;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Random;
import java.util.Scanner;

class randomcl
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = scan1.next();
        System.out.println(randomcl());
    }

    public static String randomcl()
    {
        String[] possibleWords = {"yes", "no", "maybe later"};
        Random random = new Random(); //random initialized
        int randomint = random.nextInt(possibleWords.length); //pick random index
        return possibleWords[randomint]; //return random word
    }
}