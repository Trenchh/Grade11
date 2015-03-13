/*
 * Name: OrderChecker.java
 * Date: March 13th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: makes sure you have correct amount of 
 * nuts and washers based on number of bolts
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;

        //Scanner gets number of bolts, nuts and washers
        Scanner input = new Scanner(System.in);
        // Money format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        int numberOfBolts;
        System.out.println("How many bolts are you purchasing?");
        numberOfBolts = input.nextInt();
        int numberOfNuts;
        System.out.println("How many nuts are you purchasing?");
        numberOfNuts = input.nextInt();
        int numberOfWashers;
        System.out.println("How many washers are you purchasing?");
        numberOfWashers = input.nextInt();

        //Verifies you have the correct ratio of bolts:nuts, 1:1
        if (numberOfBolts > numberOfNuts) {
            System.out.println("Check Order: Not enough nuts ");
        }

        //Verifies you have the correct ratio of washers:bolts, 2:1
        if (numberOfWashers < numberOfBolts) {
            System.out.println("Check Order: Not enough washers");
        }

        //Calculates price
        
        
        
    }

}
