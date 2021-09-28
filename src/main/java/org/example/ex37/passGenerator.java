package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class passGenerator {

    public static void main(String[] args) {
//lists for letters and special char
        List<String> LETTERS = Arrays.asList("a", "b", "c", "d","e", "f", "g", "h","i", "j", "k", "l","m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x","y","z" );
        List<String> SPECIAL_CHARACTERS = Arrays.asList("!", "@", "#", "$", "%", "^", "&","*", "(", ")", "+");
//collecting user input
        System.out.println("What's the minimum length? ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        System.out.println("How many special characters? ");
        Scanner input2 = new Scanner(System.in);
        int spec = input2.nextInt();

        System.out.println("How many numbers? ");
        Scanner input3 = new Scanner(System.in);
        int num = input3.nextInt();


        int together= num+spec; //len should not be less than # of spec and num
        int sep= len-(num+spec); //remaining part of pass will be letters

        StringBuilder pass = new StringBuilder(len); //String pass
        Random rand = new Random();//initialize rand

        if (len < together){ //do not let user cont if len > num and spec
            System.out.print("There must be as at least as many numbers as special characters and numbers\n");
        }
        else{
            for (int k = 0; k < sep; k++) { //letters
                int randomIndex = rand.nextInt(LETTERS.size());
                String randomElement = LETTERS.get(randomIndex); //obtain the value from ind
                pass.append(randomElement);
            }
            for (int j = 0; j < num; j++) { //numbers
                int randomnum = rand.nextInt(10);
                pass.append(randomnum);
            }
            for (int i=0; i< spec; i++) { //special char
                int randomIndex2 = rand.nextInt(SPECIAL_CHARACTERS.size());
                String randomElement2 = SPECIAL_CHARACTERS.get(randomIndex2);
                pass.append(randomElement2);
            }
            System.out.print("Your password is " + pass + "\n");
        }
    }

}