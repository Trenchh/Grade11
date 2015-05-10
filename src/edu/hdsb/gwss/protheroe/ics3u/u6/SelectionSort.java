/*
 * Name: SelctionSort.java
 * Date: May 6th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will sort an array by selecting the highest value, 
 * put it to the bottom and so on
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import edu.hdsb.gwss.protheroe.util.ArrayHelper;

/**
 *
 * @author 1protheroery
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] values = new int[10];

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }
        System.out.println("Unsorted");
        ArrayHelper.display(values);
        System.out.println();
        ArrayHelper.selectionSort(values);
        System.out.println("Sorted");
        ArrayHelper.display(values);
        System.out.println();

    }
}
