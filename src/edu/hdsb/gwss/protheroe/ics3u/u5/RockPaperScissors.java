/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        //VARIABLES
        int computerChoice;
        int userChoice;

        //DESCRIPTION OF PROGRAM
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println();
        System.out.println("First one to 3 wins");

        userChoice = userChoice();
        computerChoice = computerGeneration();
        game(userChoice, computerChoice);
    }

    public static void game(int userChoice, int computerChoice) {
        //VARIABLES
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int compWins = 0;
        int playerWins = 0;
        int ties = 0;

        //LOOP THAT VALIDATES IF THE GAME IS DONE
        while (compWins < 3 || playerWins < 3) {
            if (userChoice == computerChoice) {
                System.out.println("Tie");
                ties++;
            } else if (userChoice == rock && computerChoice == scissors) {
                System.out.println("Rock vs. Scissors, You Won ");
                playerWins++;
            } else if (userChoice == scissors && computerChoice == rock) {
                System.out.println("Scissors Vs. Rock, You Lost ");
                compWins++;
            } else if (userChoice == paper && computerChoice == rock) {
                System.out.println("Paper vs. Rock, You Won ");
                playerWins++;
            } else if (userChoice == rock && computerChoice == paper) {
                System.out.println("Rock Vs. Paper, You Lost ");
                compWins++;
            } else if (userChoice == scissors && computerChoice == paper) {
                System.out.println("Scissors Vs. Paper, You Won ");
                playerWins++;
            } else if (userChoice == paper && computerChoice == scissors) {
                System.out.println("Paper Vs. Scissors, You Lost ");
                compWins++;
            }
            if (compWins == 3) {
                System.out.println();
                System.out.println("YOU LOST " + compWins + ":" + playerWins + " TO THE COMPUTER");
                System.out.println("Come back soon");
                break;
            } else if (playerWins == 3) {
                System.out.println();
                System.out.println("YOU WON " + playerWins + ":" + compWins + " TO THE COMPUTER");
                System.out.println("Come back soon");
                break;
            }
            System.out.println("Your wins: " + playerWins + " | Computer Wins:" + compWins + " | Ties:" + ties);
            System.out.println();
            userChoice = userChoice();
            computerChoice = computerGeneration();
        }
    }

    public static int userChoice() {
        //VARIABLES
        int userChoice;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER SELECTS INITIAL OPTION
        System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors.");
        userChoice = input.nextInt();
        System.out.println();

        return userChoice;
    }

    public static int computerGeneration() {
        //VARIABLES
        int computerChoice;

        //COMPUTER GENERATION
        computerChoice = (int) (Math.random() * 3) + 1;
        return computerChoice;
    }
}
