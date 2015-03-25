/*
 * Name: TriangleAndRightTriangle.java
 * Date: March 24th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Determines if the 3 side lengths given make a triangle
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class TriangleAndRightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Variables
        double sideLength1;
        double sideLength2;
        double sideLength3;
        double tmp;
        double tmp1;

        //User inputs data
        System.out.println("Please enter the the 1st side length:");
        sideLength1 = input.nextDouble();
        System.out.println("Please enter the the 2nd side length:");
        sideLength2 = input.nextDouble();
        System.out.println("Please enter the the 3rd side length:");
        sideLength3 = input.nextDouble();

        //Determines largest side length
        if (sideLength1 > sideLength2) {
            tmp = sideLength2;
            sideLength2 = sideLength1;
            sideLength1 = tmp;
        }
        if (sideLength2 > sideLength3) {
            tmp1 = sideLength3;
            sideLength3 = sideLength2;
            sideLength2 = tmp1;
        }
       
        //Squaring variables
        double sideLength1Sq = Math.pow(sideLength1, 2);
        double sideLength2Sq = Math.pow(sideLength2, 2);
        double sideLength3Sq = Math.pow(sideLength3, 2);

        //Determines if it's a right triangle, a triangle, or not a triangle
        if (sideLength3Sq == sideLength2Sq + sideLength1Sq) {
            System.out.println("This is a right triangle");
        } else if (sideLength2 + sideLength1 >= sideLength3) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }
}
