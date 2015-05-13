/*
 * Name: SelectionSort2.java
 * Date: May 7th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will sort an array by selecting the highest value, 
 *  put it to the bottom and so on
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import edu.hdsb.gwss.protheroe.util.ArrayHelper;
import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class SelectionSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] values = new int[10];

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }

        //OBJECTS
        Scanner input = new Scanner(System.in);

        System.out.println("Unsorted");
        ArrayHelper.display(values);

        //USER ENTERS NUMBER TO SEARCH FOR
        System.out.println("Enter the value you wish to search for: ");
        int userChoice = input.nextInt();
        System.out.println();

        System.out.println();
        ArrayHelper.linearSearch(values, userChoice);
        System.out.println();
        ArrayHelper.selectionSort(values);
        System.out.println();
        System.out.println("Sorted");
        ArrayHelper.display(values);
        System.out.println();
        ArrayHelper.binarySearch(values, userChoice);
    }
}
