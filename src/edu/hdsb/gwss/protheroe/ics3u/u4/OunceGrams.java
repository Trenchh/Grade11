/*
 * Name: OunceGrams.java
 * Date: April 1st, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Converts ounces to grams up to a value of 15
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;
/**
 *
 * @author 1protheroery
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //VARIABLES
        int ounces = 1;
        double grams;
        //Decimal format
        NumberFormat decimal = NumberFormat.getNumberInstance(); 
        decimal.setMinimumFractionDigits( 2 );
        decimal.setMaximumFractionDigits( 2 );
        
        System.out.format("%-10s %5s", "Ounces", "Grams");
        System.out.println();

        for (grams = 1; ounces <= 15; grams++, ounces++) {
            System.out.println(ounces + "       " + decimal.format(grams * 28.35) );
        }
    }
    
}
