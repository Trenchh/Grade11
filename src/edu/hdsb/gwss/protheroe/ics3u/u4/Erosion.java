/*
 * Name: Erosion.java
 * Date: April 7th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will determine when the depth of soil will reach 9cm
 * therefore prohibiting crops to grow on a large scale
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

/**
 *
 * @author 1protheroery
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int year = 1;
        double rate = .01;
        double topsoil = 30;

        //DESCRIPTION OF PROGRAM
        System.out.println("Erosion");
        System.out.println();
        System.out.println("This program will determine when the depth of soil will reach 9cm\n"
                + "therefore prohibiting crops to grow on a large scale");
        System.out.println();

        while (topsoil >= 9) {
            topsoil = topsoil - (topsoil * rate);
            year++;
            if (year >= 500) {
            topsoil = topsoil + 2.5 / 500;
            }
        }

        System.out.println("It will take " + year + " years in order for the soil to erode\n"
                + "beyond a point where crops are no longer growable");
    }
}
