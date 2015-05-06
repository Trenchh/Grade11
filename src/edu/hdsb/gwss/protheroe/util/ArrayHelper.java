/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.util;

/**
 *
 * @author 1protheroery
 */
public class ArrayHelper {

    public static int min(int[] data) {
        int low = data[0];
        for (int counter = 1; counter < data.length; counter++) {
            if ((data[counter]) < low) {
                low = (data[counter]);
            }
        }
        return low;
    }

    public static void display(int[] data) {
        for (int counter = 0; counter < data.length; counter++) {
            System.out.print(data[counter] + ",");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] data) {
        int numberOfComparisons = 0;
        int numberOfSwaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            int listSize = data.length - pass - 1;
            for (int i = 0; i < listSize; i++) {
                numberOfComparisons++;
                if (data[i] > data[i + 1]) {
                    numberOfSwaps++;
                    swap(data, i, i + 1);
                }
            }
        }
        System.out.println("Number of Swaps: " + numberOfSwaps);
        System.out.println("Number of comparisons: " + numberOfComparisons);
    }

    public static void selectionSort(int[] data) {
        int numberOfComparisons = 0;
        int numberOfSwaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            int listSize = data.length - pass - 1;
            swap(data, max(data, listSize), listSize);
            numberOfSwaps++;
            numberOfComparisons = numberOfComparisons + listSize;
        }
        System.out.println("Number of comparisons: " + numberOfComparisons);
        System.out.println("Number of Swaps: " + numberOfSwaps);
    }

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static int max(int[] data, int listSize) {
        int indexOfTheMax = 0;
        for (int counter = 0; counter < listSize; counter++) {
            if (data[counter] > data[indexOfTheMax]) {
                indexOfTheMax = counter;
            }
        }
        return indexOfTheMax;
    }
}
