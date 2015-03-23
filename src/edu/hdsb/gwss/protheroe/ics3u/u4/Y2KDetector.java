/*
 * Name: Y2KDetector.java
 * Date: March 22nd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Determines age of user given certain variables
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner gets birth year and current year
        Scanner input = new Scanner(System.in);

        //User inputs data
        int birthYear;
        System.out.println("Please enter the last two digits of your birth year:");
        birthYear = input.nextInt();
        int currentYear;
        System.out.println("Please enter the last two digits of the current year:");
        currentYear = input.nextInt();

        //Calculates age
        if (birthYear == currentYear) {
            int age = 100;
            System.out.println("Your age is:" + age);
        } else if (birthYear > currentYear) {
            int age1 = 100 - birthYear;
            int finalAge = age1 + currentYear;
            System.out.println("Your age is:" + finalAge);
        } else {
            int finalAge1 = currentYear - birthYear;
            System.out.println("Your age is:" + finalAge1);
        }
    }

}
