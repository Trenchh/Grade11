/*
 * Name: Change.java
 * Date: Feb 28th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
 * Description: Program tells you how many of each currency is required for the 
 * amount needed.
*/
package edu.hdsb.gwss.protheroe.ics3u.u3;

/**
 *
 * @author 1protheroery
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int change  = 48;
        int quarter = 25;
        int dime    = 10;
        int nickel  = 5;
        int penny   = 1;
        int quartersNeeded = change/quarter;
        int dimesNeeded    = ((change -(25 * quartersNeeded))/dime);
        int nickelsNeeded  = ((change -(10 * dimesNeeded))/nickel);
        int penniesNeeded  = ((change -(5 * nickelsNeeded))/penny);
       
        System.out.println("You require " + quartersNeeded + " quarters");
        System.out.println("You require " + dimesNeeded    + " dimes");
        System.out.println("You require " + nickelsNeeded  + " nickels");
        System.out.println("You require " + penniesNeeded  + " pennies");
        
    }
    
}
