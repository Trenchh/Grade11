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
        int rightSequence = 0;
        int errorCheck = 0;

        //DESCRIPTION OF PROGRAM
        System.out.println("Welcome to Mastermind");
        System.out.println();
        System.out.println("Correctly guess the colours (R,G,B,Y) and the sequence of which they're generated in to win");

        //LOOP THAT LETS USER KEEP GUESSING AND SINGLE CODE GENERATION
        colourCode = colourCode();
        while (rightSequence != 3) {
            userGuess = userGuess();
            //errorCheck = errorCheck(userGuess);
            rightSequence = rightSequence(colourCode, userGuess);
            colourCheck(colourCode, userGuess, rightSequence);
        }
    }

    public static void colourCheck(String colourCode, String userGuess, int rightSequence) {
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
        if (rightSequence != 3) {
            System.out.println("You have " + rightColour + " colour(s) correct.");
            System.out.println();
        }
    }

    public static int rightSequence(String colourCode, String userGuess) {
        int rightSequence = 0;

        for (int counter = 0; counter <= colourCode.length() - 1; counter++) {
            if (userGuess.charAt(counter) == colourCode.charAt(counter)) {
                rightSequence++;
            }
            if (rightSequence == 3) {
                System.out.println("CONGRATULATIONS, YOU GUESSED CORRECT.");
                System.out.println("The Colours Were: " + colourCode);
                break;
            }
        }
        if (rightSequence != 3) {
            System.out.println("You have " + rightSequence + " colour(s) in the correct order.");
        }
        return rightSequence;
    }

    public static String userGuess() {
        //VARIABLES
        String userGuess;
        int errorCheck = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Enter your guess: ");
        userGuess = input.next();
        userGuess = userGuess.toUpperCase();
        System.out.println();


        // errorCheck(userGuess);

        return userGuess;
    }

    public static String colourCode() {
        //VARIABLES
        String colourCode = "";
        String letter;
        String tmp1;
        String tmp2 = "";

        //COMPUTER GENERATION
        for (int counter = 0; counter <= 2; counter++) {
            tmp1 = Integer.toString((int) (Math.random() * 4) + 1);

            switch (tmp1) {
                case "1":
                    tmp2 = ("R");
                    break;
                case "2":
                    tmp2 = ("G");
                    break;
                case "3":
                    tmp2 = ("B");
                    break;
                case "4":
                    tmp2 = ("Y");
                    break;
            }
            letter = tmp2;
            colourCode = colourCode + letter;
        }

        return colourCode;
    }

   // public static int errorCheck(String userGuess) {

      //  int errorCheck = 0;

      //  //ERROR CHECK
      //  for (int counter = 0; counter <= userGuess.length() - 1; counter++) {
      //      if (userGuess.charAt(counter) != 'R') {
      //          errorCheck = 1;
      //      } else if (userGuess.charAt(counter) != 'G') {
      //          errorCheck = 1;
       //     } else if (userGuess.charAt(counter) != 'B') {
      //          errorCheck = 1;
      //      } else if (userGuess.charAt(counter) != 'Y') {
      //          errorCheck = 1;
     //      }
     //   }
    //    if (errorCheck == 1) {
    //        System.out.println("Invalid Guess");
    //    }
//
   //     return errorCheck;
  //  }
}
