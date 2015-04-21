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
        String time;

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
            time = getTime();
            traditionalToStandard(time);

        } else if (choice == 2) {

        }
    }

    public static String getTime() {
        //VARIABLES
        String time;

        //Object
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter the time: ");
        time = input.nextLine();
        System.out.println();

        return time;
    }

    public static void traditionalToStandard(String time) {

        //VARIABLES
        int hours;
        int mins;
        String amOrPm;

        //LOCATING VARIABLES
        hours = Integer.parseInt(time.substring(0, time.indexOf(":")));
        mins = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.indexOf(" ")));
        amOrPm = "" + time.substring(time.indexOf(" ") + 1);
        amOrPm = amOrPm.toUpperCase();

        //CONVERTS TIME
        if (Integer.toString(hours).length() == 1) {
            switch (amOrPm) {
                case "AM":
                    System.out.println("Standard Time : 0" + hours + ":" + mins + " " + amOrPm);
                    break;
                case "PM":
                    hours = hours + 12;
                    System.out.println("Standard Time : " + hours + ":" + mins + " " + amOrPm);
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
