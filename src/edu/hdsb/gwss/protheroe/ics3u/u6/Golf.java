/*
 * Name: Golf.java
 * Date: April 27th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will display golf scores given the ones entered
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

        int amountOfHoles;
        double total = 0;
        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Golf Scores ");
        System.out.println();
        System.out.println("This program will print the score of your golf game in a table");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter the amount of holes: ");
        amountOfHoles = input.nextInt();
        System.out.println();

        int[] golfScore = new int[amountOfHoles];

        //ACQUIRES SCORES AND ADDS SCORE
        for (int counter = 1; amountOfHoles >= counter; counter++) {

            //USER INPUT
            System.out.println("Please enter the score of hole #" + counter);
            golfScore[counter - 1] = input.nextInt();
            total = total + golfScore[counter - 1];

        }
        //PRINTS SCORES
        for (int counter = 1; amountOfHoles >= counter; counter++) {
            System.out.println("Hole #" + counter + ":  " + golfScore[counter - 1]);
        }
        //HIGHEST SCORE
        int max = -1;
        for (int counter = 0; counter < golfScore.length; counter++) {
            if ((golfScore[counter]) > max) {
                max = (golfScore[counter]);
            }
        }
        System.out.println();
        System.out.println("Your highest Score was: " + max);

        //LOWEST SCORE
        int low = 99999;
        for (int counter = 0; counter < golfScore.length; counter++) {
            if ((golfScore[counter]) < low) {
                low = (golfScore[counter]);
            }
        }
        System.out.println("Your lowest Score was: " + low);
        System.out.println("The total Score was: " + total);
    }
}
