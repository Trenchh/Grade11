/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Temperatures ");
        System.out.println();
        System.out.println("This program will print the the weekly temperatures");
        System.out.println();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String[] temperatures = new String[7];

        for (int counter = 1; 7 >= counter; counter++) {

            //USER INPUT
            System.out.println("Please enter the temperature of " + days[counter - 1]);
            temperatures[counter - 1] = input.nextLine();
            temperatures[counter - 1] = days[counter - 1] + ":  " + temperatures[counter - 1];
        }
        for (int counter = 1; 7 >= counter; counter++) {
            System.out.println(temperatures[counter - 1]);
        }
    }
}
