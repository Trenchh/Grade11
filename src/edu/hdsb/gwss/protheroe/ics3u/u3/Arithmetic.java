/*
 * Name: Arithmetic.java
 * Date: Feb 27th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
 * Description: Does and displays addition, subtraction, multiplication and mod 
 * of varibles given.
*/
package edu.hdsb.gwss.protheroe.ics3u.u3;

/**
 *
 * @author 1protheroery
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int mod = a % b;
        
        System.out.println("The sum is:         " + a + "+" + b + "=" + sum);
        System.out.println("The difference is:  " + a + "-" + b + "=" + difference);
        System.out.println("The product is:     " + a + "x" + b + "=" + product);
        System.out.println("The mod is:         " + a + "%" + b + "=" + mod);
        
    }
    
}
