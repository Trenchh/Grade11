/*
 * Name: CloserToTwo.java
 * Date: April 3rd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: 
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;

/**
 *
 * @author Ryan
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double denominator = 1;
        double start = 0;
        double total = 0;

        //Decimal format
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Closer to Two ");
        System.out.println(" This program demonstrates that the result of adding "
                + "the numbers 1, 1/2, 1/4, 1/16, ... and so on will eventually get to 2 ");
        System.out.println();

        //DISPLAYS MATH
        while (total < 2) {
            total = start + (1 / denominator);
            System.out.println(start + " + 1/" + decimal.format(denominator) + " = " + total);
            start = total;
            denominator = denominator * 2;
        }
    }
}
