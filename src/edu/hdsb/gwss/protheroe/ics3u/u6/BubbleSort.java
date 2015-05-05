/*
 * Name: BubbleSort.java
 * Date: May 4th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will 
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import edu.hdsb.gwss.protheroe.util.ArrayHelper;

/**
 *
 * @author 1protheroery
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int listSize;
        int[] values = new int[10];

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }
        ArrayHelper.display(values);

        //BUBBLE SORT
        for (int pass = 0; pass < values.length - 1; pass++) {
            listSize = values.length - pass - 1;
            for (int i = 0; i < listSize; i++) {
                if (values[i] > values[i + 1]) {
                    swap(values, i, i + 1);
                }
            }
        }
        ArrayHelper.display(values);
    }

    public static void swap(int[] values, int i, int j) {
        int tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }
}
