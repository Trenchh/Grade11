/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

        int listSize;
        int[] values = new int[10];
        int numberOfSwaps = 0;
        int numberOfComparisons = 0;

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }
        System.out.println("Unsorted");
        ArrayHelper.display(values);
        System.out.println();
        ArrayHelper.selectionSort(values);
        System.out.println();
        System.out.println("Sorted");
        ArrayHelper.display(values);
        System.out.println();

    }
}
