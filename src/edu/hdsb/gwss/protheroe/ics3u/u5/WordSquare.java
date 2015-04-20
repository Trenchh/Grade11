/*
 * Name: WordSquare.java
 * Date: April 14th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will display display a square using the word inputed
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String word;
        String original;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Word Square ");
        System.out.println();
        System.out.println("This program displays a square out of the word inputed ");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter a word: ");
        word = input.nextLine();
        original = word;
        System.out.println();

        //DISPLAYS SQUARE
        for (int counter = 0; counter <= original.length(); counter++) {

            word = original.substring(counter) + original.substring(0, counter);
            System.out.println(word);

        }
    }
}
