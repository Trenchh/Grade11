/*
 * Name: SINCheck.java
 * Date: April 18th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will verify your SIN
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

public class SINCheck {

    public static void main(String[] args) {

        //VARIABLES
        String sinNumber;
        int oddSum = 0;
        int evenSum = 0;
        int tmp;
        int digit2;
        int digit1;
        int total;

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

        //ERROR CHECK
        if (sinNumber.length() == 9) {
            //LOOP DOES STEP 1, 2 & 3
            for (int counter = 0; counter < sinNumber.length() - 1; counter++) {
                if (counter % 2 == 0) {
                    oddSum = oddSum + Integer.parseInt("" + sinNumber.charAt(counter));
                } else if (counter % 2 == 1) {
                    if ((Integer.parseInt("" + sinNumber.charAt(counter)) * 2) >= 10) {
                        tmp = Integer.parseInt("" + sinNumber.charAt(counter)) * 2;
                        digit1 = Integer.parseInt(Integer.toString(tmp).substring(0, 1));
                        digit2 = Integer.parseInt(Integer.toString(tmp).substring(1, 2));
                        evenSum = evenSum + digit1 + digit2;
                    } else if ((Integer.parseInt("" + sinNumber.charAt(counter)) * 2) <= 9) {
                        evenSum = evenSum + (Integer.parseInt("" + sinNumber.charAt(counter)) * 2);
                    }
                }
            } //VERIFIES SIN
            total = evenSum + oddSum + (Integer.parseInt(("" + sinNumber.charAt(sinNumber.length() - 1))));
            if (Integer.toString(total).substring(1, 2).equals("0")) {
                System.out.println("This is a valid SIN");
            } else {
                System.out.println("This is not a valid SIN");
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
