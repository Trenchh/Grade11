/*
 * Name: OrderChecker.java
 * Date: March 13th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Makes sure you have the correct amount of 
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
        final double BOLT_PRICE = 0.05;
        final double NUT_PRICE = 0.03;
        final double WASHER_PRICE = 0.01;

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
            System.out.println("Check Order: Not enough nuts, amount should be equivalent or larger than amount of bolts ");
        }

        //Verifies you have the correct ratio of washers:bolts, 2:1
        if (numberOfWashers < numberOfBolts) {
            System.out.println("Check Order: Not enough washers, amount should be double amount of bolts or greater ");
        }

        //Calculates price
        double boltCost = numberOfBolts * BOLT_PRICE;
        double nutCost = numberOfNuts * NUT_PRICE;
        double washerCost = numberOfWashers * WASHER_PRICE;
        double finalCost = boltCost + nutCost + washerCost;
        
        //Outputs final cost to user
        System.out.println("Final price :" + money.format(finalCost));
    }

}