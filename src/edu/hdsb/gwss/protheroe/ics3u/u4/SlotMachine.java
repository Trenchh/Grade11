/*
 * Name: SlotMachine.java
 * Date: April 7th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description:
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
        int lever;
        int choice;
        int play = 1;
        int exit = 2;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println("Welcome to Super Swaggy Slots");
        System.out.println("Everyone's a winner, eventually.");
        System.out.println();
        System.out.println("You will begin with 50 coins and let the odds be ever in your favor");

        //USER SELECTS OPTION
        System.out.println("Press 1 to play, or 2 to exit");
        choice = input.nextInt();
        //LOOP THAT VALIDATES WHETHER PLAYER HAS ENNOUGH COINS
        while (coinAmount > 0) {
            if (choice == play) {

                //USER PULLS LEVER
                System.out.println("Enter 1 to spin");
                lever = input.nextInt();

                if (lever == 1) {
                    
                    //NUMBER GENERATION
                    slot1 = (int) (Math.random() * 4) + 1;
                    slot2 = (int) (Math.random() * 4) + 1;
                    slot3 = (int) (Math.random() * 4) + 1;
                    System.out.println(slot1 + "  " + slot2 + "  " + slot3);

                    //CHECKS IF YOU HAVE WON ANYTHING
                    if (slot1 != slot2 || slot2 != slot3) {
                        coinAmount--;
                        System.out.println("You Lost, you now have " + coinAmount + " coins");
                    } else if (slot1 == 1 && slot2 == 1 && slot3 == 1) {
                        coinAmount = coinAmount + 2;
                        System.out.println("YOU WON 2 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 2 && slot2 == 2 && slot3 == 2) {
                        coinAmount = coinAmount + 4;
                        System.out.println("YOU WON 4 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 3 && slot2 == 3 && slot3 == 3) {
                        coinAmount = coinAmount + 6;
                        System.out.println("YOU WON 6 COINS, you now have " + coinAmount + " coins");
                    } else if (slot1 == 4 && slot2 == 4 && slot3 == 4) {
                        coinAmount = coinAmount + 8;
                        System.out.println("YOU WON 8 COINS, you now have " + coinAmount + " coins");
                    }
                } else {
                    System.out.println("Invalid selection");
                }
                System.out.println("Press 1 to play, or 2 to exit");
                choice = input.nextInt();
            } else if (choice == exit) {
                System.out.println("Thanks for Playing, you cashed out with " + coinAmount + " coins \n Come back soon!");
                break;
            } else {
                System.out.println("Invalid Selection");
                System.out.println("Press 1 to play, or 2 to exit");
                choice = input.nextInt();
            }if (coinAmount == 0) {
            System.out.println("You have run out of coins \n Thanks for playing and come back soon!");
            break;
        }
        }
    }
}
