/*
 * Name: FibonacciSeries.java
 * Date: April 5th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will print the first twenty terms of the Fibonacci
 * series
 */
package LoopingStructureAssignment.u4;

/**
 *
 * @author Ryan
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int number1 = 1;
        int number2 = 1;
        int next;

        //DESCRIPTION OF PROGRAM
        System.out.println("Fibonacci Series");
        System.out.println();
        System.out.println("This program will print the first twenty terms of the Fibonacci series");
        System.out.println();

        //PRINTS NUMBERS
        for (int counter = 0; counter < 20; counter++) {
            next = number1 + number2;
            System.out.print(number1 + ", ");
            number1 = number2;
            number2 = next;

        }
    }
}
