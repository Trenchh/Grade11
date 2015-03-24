/*
 * Name: AcidRain.java
 * Date: March 23rd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Determines water purity
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //User inputs data
        double phLevel;
        System.out.println("Please enter the pH level:");
        phLevel = input.nextDouble();

        //Determines water purity
        if (phLevel >= 7.6 && phLevel <= 14) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (phLevel >= 6.5 && phLevel <= 7.5) {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else if (phLevel >= 0 && phLevel <= 6.4) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else {
            System.out.println("INVALID PH LEVEL");
        }

    }
}
