/*
 * Name: HeronsFormula.java
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
public class HeronsFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aSideLength = 7;
        double bSideLength = 10;
        double cSideLength = 8;
        double halfPerimeter = ((aSideLength + bSideLength + cSideLength)/2);
        System.out.println( halfPerimeter );
        double formulaBeforeSqrt =(halfPerimeter * (halfPerimeter - aSideLength) * (halfPerimeter - bSideLength) * (halfPerimeter - cSideLength));
        System.out.println( formulaBeforeSqrt );
        double finalFormula = Math.sqrt(formulaBeforeSqrt);
        
        System.out.println("The area of the triangle is: " + finalFormula + "cm2" );
    }
    
}
