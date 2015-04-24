/*
 * Name: WordSquare.java
 * Date: April 20th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will reverse the word entered and check if it is a palindrome
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

public class StandardTime {

    public static void main(String[] args) {
        //VARIABLES
        int choice = 0;
        String time = "";

        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println("Time Converter");
        System.out.println();
        System.out.println("This program will convert either standard or traditional time into the other. ");
        System.out.println();

        userChoiceAndConversion(choice, time);
    }

    public static void userChoiceAndConversion(int choice, String time) {

        //Object
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Press 1 to convert traditional time to standard time or 2 to convert standard time to traditional time: ");
        choice = input.nextInt();
        System.out.println();

        //CONVERSION PROCESS
        if (choice == 1) {
            time = getTraditionalTime();
            traditionalToStandard(time);

        } else if (choice == 2) {
            time = getStandardTime();
            standardToTraditional(time);
        } else {
            System.out.println("Invalid Selection");
        }
    }

    public static String getTraditionalTime() {
        //VARIABLES
        String time;

        //Object
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter the time (hh:mm xx) : ");
        time = input.nextLine();
        System.out.println();

        return time;
    }

    public static String getStandardTime() {
        //VARIABLES
        String time;

        //Object
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter the time (hh:mm) : ");
        time = input.nextLine();
        System.out.println();

        return time;
    }

    public static void traditionalToStandard(String time) {
        //VARIABLES
        int hours;
        String mins;
        String amOrPm;

        //LOCATING VARIABLES
        hours = Integer.parseInt(time.substring(0, time.indexOf(":")));
        mins = time.substring(time.indexOf(":") + 1, time.indexOf(" "));
        amOrPm = "" + time.substring(time.indexOf(" ") + 1);
        amOrPm = amOrPm.toUpperCase();

        //ERROR CHECK & CONVERTS TIME
        if (hours >= 13 || Integer.parseInt(mins) >= 60 || !amOrPm.equals("PM") && !amOrPm.equals("AM") || hours <= 0 || Integer.parseInt(mins) < 0) {
            System.out.println("Invalid Time");
        } else if (Integer.toString(hours).length() == 1) {
            switch (amOrPm) {
                case "AM":
                    System.out.println("Standard Time : 0" + hours + ":" + mins + " ");
                    break;
                case "PM":
                    hours = hours + 12;
                    System.out.println("Standard Time : " + hours + ":" + mins + " ");
                    break;
            }
        } else if (amOrPm.equals("AM") && hours == 12) {
            System.out.println("Standard Time : 00:" + mins + " ");
        } else if (amOrPm.equals("AM") && hours < 12) {
            System.out.println("Standard Time : " + hours + ":" + mins + " ");
        } else if (amOrPm.equals("PM") && hours == 12) {
            System.out.println("Standard Time : " + hours + ":" + mins + " ");
        }
    }

    public static void standardToTraditional(String time) {
        //VARIABLES
        int hours;
        String mins;

        //LOCATING VARIABLES
        hours = Integer.parseInt(time.substring(0, time.indexOf(":")));
        mins = (time.substring(time.indexOf(":") + 1));

        //ERROR CHECK & CONVERTS TIME
        if (hours >= 24 || Integer.parseInt(mins) >= 60 || hours < 0 || Integer.parseInt(mins) < 0) {
            System.out.println("Invalid Time");
        } else if (hours == 0) {
            hours = hours + 12;
            System.out.println("Traditional Time : " + hours + ":" + mins + " AM");
        } else if (hours < 12) {
            System.out.println("Traditional Time : " + hours + ":" + mins + " AM");
        } else if (hours == 12) {
            System.out.println("Traditional Time : " + hours + ":" + mins + " PM");
        } else if (hours > 12) {
            hours = hours - 12;
            System.out.println("Traditional Time : " + hours + ":" + mins + " PM");
        }
    }
}
