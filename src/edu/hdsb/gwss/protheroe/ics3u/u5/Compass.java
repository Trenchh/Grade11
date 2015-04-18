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
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String direction;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Compass ");
        System.out.println();
        System.out.println("This program will create a message given the direction");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter a direction: ");
        direction = input.next();
        direction = direction.toUpperCase();
        System.out.println();

        switch (direction.charAt(0)) {
            case 'S':
                System.out.print("Start facing South. ");
                break;
            case 'W':
                System.out.print("Start facing West. ");
                break;
            case 'E':
                System.out.print("Start facing East. ");
                break;
            case 'N':
                System.out.print("Start facing North. ");
                break;
        }
        System.out.print("Turn " + direction.substring(1, 3) + " degrees towards the ");

        switch (direction.charAt(3)) {
            case 'S':
                System.out.print("South.");
                break;
            case 'W':
                System.out.print("West.");
                break;
            case 'E':
                System.out.print("East.");
                break;
            case 'N':
                System.out.print("North.");
                break;

        }

    }

}
