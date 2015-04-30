/*
 * Name: Temperature.java
 * Date: April 28th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will display the weekly temperatures
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import java.text.NumberFormat;
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
        //VARIABLE
        double total = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DECIMAL FORMAT
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Temperatures ");
        System.out.println();
        System.out.println("This program will print the the weekly temperatures");
        System.out.println();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int[] temperatures = new int[7];

        //ACQUIRES TEMPERATURES
        for (int counter = 1; 7 >= counter; counter++) {

            //USER INPUT
            System.out.println("Please enter the temperature of " + days[counter - 1]);
            temperatures[counter - 1] = input.nextInt();
            total = total + temperatures[counter - 1];
        }
        //PRINTS WEATHER
        for (int counter = 1; 7 >= counter; counter++) {
            System.out.println(days[counter - 1] + ":   " + temperatures[counter - 1]);
        }
        //CALCULATES AVERAGE
        double average;
        average = total / days.length;
        System.out.println("The average temperature was: " + decimal.format(average));
    }
}
