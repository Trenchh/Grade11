/*
 * Name: RestaurantTab.java
 * Date: Feb 27th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Program calculates and displays tax and grand total of bill.
*/
package edu.hdsb.gwss.protheroe.ics3u.u4;

/**
 *
 * @author 1protheroery
 */
public class RestaurantTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double subtotal = 43.67;
        double tax = subtotal * 0.13;
        double total = subtotal + tax;
        
        System.out.println("The subtotal of the meal is: $" + subtotal);
        System.out.println("The total of the meal is: $" + total);
    }
    
}
