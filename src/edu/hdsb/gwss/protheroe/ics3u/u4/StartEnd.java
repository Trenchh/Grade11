/*
 * Name: StartEnd.java
 * Date: March 30th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Counts down, or up given start and end number
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int number1;
        int number2;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //GETS INPUT
        System.out.println("Please enter a number");
        number1 = input.nextInt();
        System.out.println("Please enter a number");
        number2 = input.nextInt();

        //SPACE
        System.out.println(" ");

        //COUNTS DOWN/UP
        for (; number1 >= number2; number1--) {
            System.out.println(number1);
        }
        for (; number1 <= number2; number1++) {
            System.out.println(number1);
        }
    }
}
