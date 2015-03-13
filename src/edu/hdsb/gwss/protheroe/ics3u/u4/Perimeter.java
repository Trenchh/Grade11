/*
 * Name: Perimeter.java
 * Date: March 2nd, 2015
 * Version: v0.3
 * Author: Ryan Protheroe
 * Description: Program calculates and displays the total perimeter and area of
 * a rectangle given the dimensions
*/
package edu.hdsb.gwss.protheroe.ics3u.u4;

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
        int perimeter = ((length + width) * 2);
        
        System.out.println("The area of the rectangle is: " + area + "cm2");
        System.out.println("The perimeter of the rectangle is: " + perimeter+ "cm");
    }
    
}
