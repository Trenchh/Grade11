/*
 * Name: Digits.java
 * Date: March 2nd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Shows the ones, tens, and hundreds value of a 3 digit number
*/
package edu.hdsb.gwss.protheroe.ics3u.u3;

/**
 *
 * @author 1protheroery
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int threeDigitNumber = 467;
        int hundredth = (threeDigitNumber/100);
        int remainder1 = (threeDigitNumber -(hundredth * 100));
        int tens = (remainder1/10);
        int remainder2 = (remainder1 -(tens * 10));
        int ones = (remainder2/1);
        
        System.out.println("The hundreds value is " + hundredth);
        System.out.println("The tens value is " + tens);
        System.out.println("The ones value is " + ones);
        
    }
    
}
