/*
 * Name: Golf.java
 * Date: April 27th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program 
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String amountOfHoles;

        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Golf Scores ");
        System.out.println();
        System.out.println("This program will print the score of your golf game in a table");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter the amount of holes: ");
        amountOfHoles = input.nextLine();
        System.out.println();

        String[] golfScore = new String[Integer.parseInt(amountOfHoles)];

        for (int counter = 1; Integer.parseInt(amountOfHoles) >= counter; counter++) {

            //USER INPUT
            System.out.println("Please enter the score of hole #" + counter);
            golfScore[counter - 1] = input.nextLine();
            golfScore[counter - 1] = "Hole #" + counter + ":   " + golfScore[counter - 1];
        }
        for (int counter = 1; Integer.parseInt(amountOfHoles) >= counter; counter++) {
            System.out.println(golfScore[counter - 1]);
        }
    }
}
