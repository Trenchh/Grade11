/*
 * Name: Perimeter.java
 * Date: Feb 27th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
 * Description: Program calculates and displays the total perimeter and area of
 * a rectangle given the dimensions
*/
package edu.hdsb.gwss.protheroe.ics3u.u3;

/**
 *
 * @author 1protheroery
 */
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = 10;
        int width = 20;
        int area = length * width;
        int perimeter = length + width;
        
        System.out.println("The area of the rectangle is: " + area + "cm2");
        System.out.println("The perimeter of the rectangle is: " + perimeter+ "cm");
    }
    
}
