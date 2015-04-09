/*
 * Name: SlotMachine.java
 * Date: April 7th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: User operated Slot Machine that generates random numbers and allows user
 * to WIN WIN WIN big in fake tokens
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int slot1;
        int slot2;
        int slot3;
        int coinAmount = 50;
        int choice;
        final int PLAY = 1;
        final int EXIT = 2;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println("Welcome to Super Swaggy Slots");
        System.out.println("Everyone's a winner, eventually.");
        System.out.println();
        System.out.println("You will begin with 50 coins and let the odds be ever in your favor");

        //USER SELECTS INITIAL OPTION
        System.out.println("Enter 1 to play (1 token per spin) or 2 to exit");
        choice = input.nextInt();

        //LOOP THAT VALIDATES WHETHER PLAYER HAS ENNOUGH COINS
        while (coinAmount > 0) {
            if (choice == PLAY) {

                //USER PULLS LEVER
                System.out.println("Enter 1 to SPIN!!!");
                choice = input.nextInt();
                System.out.println();

                if (choice == PLAY) {
                    coinAmount--;

                    //SLOT HEADER
                    System.out.format("%11s %11s %11s\n", "|SLOT 1|", "|SLOT 2|", "|SLOT 3|");

                    //NUMBER GENERATION & NUMBER DISPLAY
                    slot1 = (int) (Math.random() * 4) + 1;
                    slot2 = (int) (Math.random() * 4) + 1;
                    slot3 = (int) (Math.random() * 4) + 1;
                    System.out.format("%11s %11s %11s\n", "|  " + slot1 + "   |", "|  " + slot2 + "   |", "|  " + slot3 + "   |");
                    System.out.println();

                    //CHECKS IF YOU HAVE WON ANYTHING
                    if (slot1 != slot2 || slot2 != slot3) {
                        System.out.println("You Lost, you now have " + coinAmount + " coins");
                    } else if (slot1 == 1) {
                        coinAmount = coinAmount + 4;
                        System.out.println("YOU WON 4 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 2) {
                        coinAmount = coinAmount + 6;
                        System.out.println("YOU WON 6 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 3) {
                        coinAmount = coinAmount + 8;
                        System.out.println("YOU WON 8 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 4) {
                        coinAmount = coinAmount + 10;
                        System.out.println("YOU WON 10 COINS, you now have " + coinAmount + " coins");
                    }
                    //ASSURES THAT USER ENTERS 1 TO SPIN   
                } else {
                    System.out.println("Invalid selection");
                }
                System.out.println("Press 1 to PLAY AGAIN or 2 to CASH OUT");
                choice = input.nextInt();

                //PROGRAM EXITS IF USER SELECTS 2 & SAYS HOW MUCH THEY'VE WON
            } else if (choice == EXIT) {
                System.out.println("Thanks for Playing, you cashed out with " + coinAmount + " coins");
                System.out.println("Come back soon!");
                break;

                //MAKES SURE USER PICKS 1 OR 2
            } else {
                System.out.println("Invalid Selection");
                System.out.println("Press 1 to PLAY AGAIN or 2 to CASH OUT");
                choice = input.nextInt();
            }
            //PROGRAM ENDS IF USER RUNS OUT OF COINS
            if (coinAmount == 0) {
                System.out.println("You have run out of coins \nThanks for playing and come back soon!");
                break;
            }
        }
    }
}
