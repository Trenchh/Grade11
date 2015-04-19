/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class NumbersToWords {

    //VARIABLES
    public static int number;
    public static String strNumber;
    public static String tens;
    public static String teens;
    public static String ones;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DESCRIPTION OF PROGRAM
        System.out.println(" Numbers To Words");
        System.out.println();
        System.out.println("This program will write out any number from 10-99");
        System.out.println();

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter a 2 digit number: ");
        number = input.nextInt();
        System.out.println();

        if (number >= 10 & number <= 19) {
            teens();
            System.out.println(teens);
        } else if (number >= 20 & number <= 99) {
            tens();
            ones();
            System.out.println("Your number is: " + tens + " " + ones);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void ones() {

        strNumber = Integer.toString(number);

        switch (strNumber.charAt(1)) {
            case '1':
                ones = "One";
                break;
            case '2':
                ones = "Two";
                break;
            case '3':
                ones = "Three";
                break;
            case '4':
                ones = "Four";
                break;
            case '5':
                ones = "Five";
                break;
            case '6':
                ones = "Six";
                break;
            case '7':
                ones = "Seven";
                break;
            case '8':
                ones = "Eight";
                break;
            case '9':
                ones = "Nine";
                break;
        }
    }

    public static void tens() {

        strNumber = Integer.toString(number);

        switch (strNumber.charAt(0)) {
            case '2':
                tens = "Twenty";
                break;
            case '3':
                tens = "Thirty";
                break;
            case '4':
                tens = "Fourty";
                break;
            case '5':
                tens = "Fifty";
                break;
            case '6':
                tens = "Sixty";
                break;
            case '7':
                tens = "Seventy";
                break;
            case '8':
                tens = "Eighty";
                break;
            case '9':
                tens = "Ninety";
                break;
        }
    }

    public static void teens() {

        strNumber = Integer.toString(number);

        switch (strNumber.charAt(1)) {
            case '0':
                teens = "Ten";
                break;
            case '1':
                teens = "Eleven";
                break;
            case '2':
                teens = "Twelve";
                break;
            case '3':
                teens = "Thirteen";
                break;
            case '4':
                teens = "Fourteen";
                break;
            case '5':
                teens = "Fifteen";
                break;
            case '6':
                teens = "Sixteen";
                break;
            case '7':
                teens = "Seventeen";
                break;
            case '8':
                teens = "Eighteen";
                break;
            case '9':
                teens = "Nineteen";
                break;
        }
    }
}
