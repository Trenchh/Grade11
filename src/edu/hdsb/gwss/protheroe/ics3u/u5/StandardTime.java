/*
 * Name: WordSquare.java
 * Date: April 20th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will reverse the word entered and check if it is a palindrome
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int choice;

        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Time Converter ");
        System.out.println();
        System.out.println("This program will convert either standard or traditional time into the other. ");
        System.out.println();

        //USER INPUT
        System.out.println("Press 1 to convert traditional time to standard time or 2 to convert standard time to traditional time: ");
        choice = input.nextInt();
        System.out.println();

        if (choice == 1) {
            traditionalToStandard();

        } else if (choice == 2) {

        }
    }

    public static void traditionalToStandard() {
        //VARIABLES
        String time;
        String colonCheck;
        String strHours;
        int hours;
        int mins;
        String amOrPm;

        //Object
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter a traditional time: (hh:mm xx)");
        time = input.nextLine();
        System.out.println();

        hours = Integer.parseInt(time.substring(0, 2));
        mins = Integer.parseInt(time.substring(3, 5));
        strHours = Integer.toString(hours);
        strHours = "" + strHours.charAt(1);
        amOrPm = "" + time.substring(6, 8);
        amOrPm = amOrPm.toUpperCase();
        System.out.println(strHours);

        if (strHours.equals(":")) {
            hours = Integer.parseInt("" + time.charAt(0));
            mins = Integer.parseInt(time.substring(2, 4));
            amOrPm = "" + time.substring(5, 7);
            amOrPm = amOrPm.toUpperCase();
            switch (amOrPm) {
                case "AM":
                    System.out.println("Standard Time : 0" + hours + ":" + mins + " " + amOrPm);
                    break;
                case "PM":
                    hours = hours + 12;
                    System.out.println("Standard Time :" + hours + ":" + mins + " " + amOrPm);
                    break;
            }
        }
        if (amOrPm.equals("AM") && hours == 12) {
            System.out.println("Standard Time : 00:" + mins + " " + amOrPm);
        } else if (amOrPm.equals("PM") && hours == 12) {
            System.out.println("Standard Time : " + hours + ":" + mins + " " + amOrPm);
        }

    }
}
