/*
 * Name: ArrayHelper.java
 * Date: May 4th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This class stores methods to be used in any main class
 */
package edu.hdsb.gwss.protheroe.util;

import java.util.Scanner;

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
        System.out.println("Bubble Sort Process");
        System.out.println("Number of Swaps: " + numberOfSwaps);
        System.out.println("Number of comparisons: " + numberOfComparisons);
    }

    public static void selectionSort(int[] data) {
        int numberOfComparisons = 0;
        int numberOfSwaps = 0;

        for (int pass = 0; pass < data.length; pass++) {
            int listSize = data.length - pass - 1;
            swap(data, max(data, listSize), listSize);
            numberOfSwaps++;
            numberOfComparisons = numberOfComparisons + listSize;
        }
        System.out.println("Selection Sort Process");
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
        for (int counter = 0; counter <= listSize; counter++) {
            if (data[counter] > data[indexOfTheMax]) {
                indexOfTheMax = counter;
            }
        }
        return indexOfTheMax;
    }

    public static void linearSearch(int[] data) {
        int numberOfComparisons = 0;
        int check = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER SELECTS INITIAL OPTION
        System.out.println("Enter the value you wish to search for: ");
        int userChoice = input.nextInt();
        System.out.println();

        for (int counter = 0; counter < data.length; counter++) {
            numberOfComparisons++;
            if (data[counter] == userChoice) {
                check++;
            }
        }
        System.out.println("Search Process");
        if (check == 1) {
            System.out.println("This value was found " + check + " time");
        } else if (check > 1) {
            System.out.println("This value was found " + check + " times");
        } else {
            System.out.println("This value was found not found");
        }
        System.out.println("Number of comparisons: " + numberOfComparisons);
    }
}
