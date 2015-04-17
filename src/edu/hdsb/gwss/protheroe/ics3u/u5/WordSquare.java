/*
 * Name: LabAnimals.java
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
        String word1;
        String word2 = " ";

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Word Square ");
        System.out.println();
        System.out.println("This program displays a square out of the word inputed ");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter a word: ");
        word1 = input.nextLine();
        word1 = word1.toUpperCase();

        //DISPLAYS SQUARE
        for (int counter = 0; counter < word1.length() + word1.length(); counter++) {

            System.out.println(word1 + word2);
            word2 = word1.substring(counter, word1.length());
            word1 = word1.substring(counter, word1.length());

        }
    }
}
