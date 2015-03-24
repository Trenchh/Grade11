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

        //User inputs data
        double sideLength1;
        System.out.println("Please enter the the 1st side length:");
        sideLength1 = input.nextDouble();
        double sideLength2;
        System.out.println("Please enter the the 2nd side length:");
        sideLength2 = input.nextDouble();
        double sideLength3;
        System.out.println("Please enter the the 3rd side length:");
        sideLength3 = input.nextDouble();

        //Determines largest side length
        if (sideLength1 > sideLength2) {
            double tmp1 = sideLength1;
            sideLength1 = sideLength2;
        }if (sideLength1 > sideLength3) {
    }

}
