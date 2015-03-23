/*
 * Name: DiscountPrices.java
 * Date: March 12th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: appplies a 10% discount if necessary
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class DiscountPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double DISCOUNT = 0.10;
        final double AMOUNTNEEDED = 10.00;

        //Scanner
        Scanner input = new Scanner(System.in);
        // Money format
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //gets price of purcahse
        double customerPurchase;
        System.out.println("Enter in the purchase amount:");
        customerPurchase = input.nextDouble();

        //Boolean functions that check if you're qualified for discount, 
        // if so, it shows new price 
        if (customerPurchase >= AMOUNTNEEDED) {
            double qualified = customerPurchase;
            System.out.println("You qualify for the 10% off discount!");
            double newPrice = customerPurchase - (qualified * DISCOUNT);
            System.out.println("Your new price is :" + money.format(newPrice));
        } else {
            System.out.println("Sorry, you do not qualify for the 10% off discount, make a purchase of $10.00 or more to qualify!");

        }
    }

}
