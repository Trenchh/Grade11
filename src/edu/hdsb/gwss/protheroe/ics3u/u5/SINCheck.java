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
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String sinNumber;
        int sum1;
        int sum2;
        int even1;
        int even2;
        int even3;
        int even4;
        int checkDigit;

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

        if (sinNumber.length() == 9) {

            even1 = Integer.parseInt(sinNumber.substring(0, 1));
            even2 = Integer.parseInt(sinNumber.substring(2, 3));
            even3 = Integer.parseInt(sinNumber.substring(4, 5));
            even4 = Integer.parseInt(sinNumber.substring(6, 7));

            sum1 = even1 + even2 + even3 + even4;

            System.out.println(sum1);

        }

    }

}
