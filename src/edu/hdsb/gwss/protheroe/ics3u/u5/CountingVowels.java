/*
 * Name: CountingVowels.java
 * Date: April 14th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program count the amount of vowels within a sentence
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String sentence;
        int numberOfVowels = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println("Counting Vowels");
        System.out.println();
        System.out.println("This program will count the amount of vowels within the sentence typed ");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter a sentence: ");
        sentence = input.nextLine();
        sentence = sentence.toUpperCase();

        //CALCULATES AMOUNT OF VOWELS
        for (int counter = 0; counter < sentence.length(); counter++) {
            switch (sentence.charAt(counter)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    numberOfVowels++;
                    break;

            }
        }
        System.out.println("There are " + numberOfVowels + " vowels in this sentence");
    }
}
