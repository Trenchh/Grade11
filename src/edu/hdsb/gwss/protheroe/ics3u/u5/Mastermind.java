/*
 * Name: Mastermind.java
 * Date: April 24th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will make the user guess the colours and 
 * the sequence of which they're generated in in order to win.
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {

        //VARIABLES
        String colourCode;
        String userGuess;

        //DESCRIPTION OF PROGRAM
        System.out.println("Welcome to Mastermind");
        System.out.println();
        System.out.println("Correctly guess the colours and the sequence of which they're generated in to win");

        colourCode = colourCode();
        userGuess = userGuess();
        sequenceCheck(colourCode, userGuess);
        colourCheck(colourCode, userGuess);
    }

    public static void colourCheck(String colourCode, String userGuess) {
        int rightColour = 0;

        for (int counter = 0; counter <= colourCode.length() - 1; counter++) {
            if (userGuess.charAt(counter) == colourCode.charAt(0)) {
                rightColour++;
            } else if (userGuess.charAt(counter) == colourCode.charAt(1)) {
                rightColour++;
            } else if (userGuess.charAt(counter) == colourCode.charAt(2)) {
                rightColour++;
            }
        }
        System.out.println("You have " + rightColour + " colour(s) correct.");
    }

    public static void sequenceCheck(String colourCode, String userGuess) {
        int rightSequence = 0;

        for (int counter = 0; counter <= colourCode.length() - 1; counter++) {
            if (userGuess.charAt(counter) == colourCode.charAt(counter)) {
                rightSequence++;
            }
            if (rightSequence == 3) {
                System.out.println("CONGRATULATIONS, YOU GUESSED CORRECT.");
                break;
            }
        }
        System.out.println("You have " + rightSequence + " colour(s) in the correct order.");
    }

    public static String userGuess() {
        //VARIABLES
        String userGuess;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Enter your guess: ");
        userGuess = input.next();
        userGuess = userGuess.toUpperCase();
        System.out.println();

        return userGuess;
    }

    public static String colourCode() {
        //VARIABLES
        String colourCode;
        String char1 = "";
        String char2 = "";
        String char3 = "";
        String tmp1;
        String tmp2;
        String tmp3;

        //COMPUTER GENERATION
        tmp1 = Integer.toString((int) (Math.random() * 4) + 1);
        tmp2 = Integer.toString((int) (Math.random() * 4) + 1);
        tmp3 = Integer.toString((int) (Math.random() * 4) + 1);

        switch (tmp1) {
            case "1":
                char1 = ("R");
                break;
            case "2":
                char1 = ("G");
                break;
            case "3":
                char1 = ("B");
                break;
            case "4":
                char1 = ("Y");
                break;
        }
        switch (tmp2) {
            case "1":
                char2 = ("R");
                break;
            case "2":
                char2 = ("G");
                break;
            case "3":
                char2 = ("B");
                break;
            case "4":
                char2 = ("Y");
                break;
        }
        switch (tmp3) {
            case "1":
                char2 = ("R");
                break;
            case "2":
                char2 = ("G");
                break;
            case "3":
                char2 = ("B");
                break;
            case "4":
                char2 = ("Y");
                break;
        }

        colourCode = char1 + char2 + char3;

        System.out.println(colourCode);

        return colourCode;
    }
}
