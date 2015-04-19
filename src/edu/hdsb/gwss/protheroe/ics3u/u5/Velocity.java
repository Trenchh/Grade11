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
public class Velocity {

    public static int time;
    public static int distance;
    public static int velocity;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DESCRIPTION OF PROGRAM
        System.out.println(" Velocity ");
        System.out.println();
        System.out.println("This program will calculate the velocity given the user's input");
        System.out.println();

        dataInput();
        calculation();
    }

    public static void dataInput() {

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter the distance: ");
        distance = input.nextInt();
        System.out.println();
        System.out.println("Please enter the time: ");
        time = input.nextInt();
        System.out.println();

    }

    public static void calculation() {

        velocity = distance / time;
        System.out.println("The velocity is " + velocity);

    }
}
