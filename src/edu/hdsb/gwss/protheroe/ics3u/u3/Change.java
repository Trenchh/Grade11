/*
 * Name: Change.java
 * Date: March 2nd, 2015
 * Version: v0.3
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
        int change             = 46;
        final int QUARTERVALUE = 25;
        final int DIMEVALUE    = 10;
        final int NICKELVALUE  = 5;
        final int PENNYVALUE   = 1;
        int quartersNeeded = (change/QUARTERVALUE);
        int remainder1     = (change - (QUARTERVALUE * quartersNeeded));
        int dimesNeeded    = (remainder1/DIMEVALUE);
        int remainder2     = (remainder1 - (DIMEVALUE * dimesNeeded));
        int nickelsNeeded  = (remainder2/NICKELVALUE);
        int remainder3     = (remainder2 - (NICKELVALUE * nickelsNeeded));
        int penniesNeeded  = (remainder3 /PENNYVALUE);
       
        System.out.println("You require " + quartersNeeded + " quarters");
        System.out.println("You require " + dimesNeeded    + " dimes");
        System.out.println("You require " + nickelsNeeded  + " nickels");
        System.out.println("You require " + penniesNeeded  + " pennies");
        
    }
    
}
