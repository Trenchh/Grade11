/*
 * Name: SINCheck.java
 * Date: April 18th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will verify your SIN
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String sinNumber;
        int oddSum = 0;
        int evenSum = 0;
        int checkDigit = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" SINCheck ");
        System.out.println();
        System.out.println("This program will verify a SIN");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter your SIN: ");
        sinNumber = input.next();
        System.out.println();

        for (int counter = 0; counter < sinNumber.length() - 1; counter++) {
            if (counter % 2 == 0) {
                oddSum = oddSum + Integer.parseInt("" + sinNumber.charAt(counter));
            } else if (counter % 2 == 1) {
                if ((Integer.parseInt("" + sinNumber.charAt(counter)) * 2) >= 10) {
                } else if ((Integer.parseInt("" + sinNumber.charAt(counter)) * 2) <= 9) {
                    evenSum = evenSum + (Integer.parseInt("" + sinNumber.charAt(counter)) * 2);
                }
            }
            System.out.println(evenSum);
        }

    }

}
