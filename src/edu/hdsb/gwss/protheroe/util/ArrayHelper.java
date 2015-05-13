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
        System.out.println();
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
        System.out.println();
    }

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static int min(int[] data, int listSize) {
        int indexOfTheMin = 0;
        for (int counter = 0; counter <= listSize; counter++) {
            if (data[counter] < data[indexOfTheMin]) {
                indexOfTheMin = counter;
            }
        }
        return indexOfTheMin;
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

    public static int linearSearch(int[] data, int searchValue) {
        int numberOfComparisons = 0;
        int check = 0;
        int place = 0;

        //LOOP CHECKS FOR MATCH
        for (int counter = 0; counter < data.length; counter++) {
            numberOfComparisons++;
            if (data[counter] == searchValue) {
                check++;
                place = counter;
                System.out.println("This value was found at " + place);
            }
        }
        if (check == 0) {
            System.out.println("This value was found not found");
        }
        System.out.println("Number of comparisons: " + numberOfComparisons);
        return place;
    }

    public static int binarySearch(int[] data, int userChoice) {
       // for (int i = 0; i < data.length; i++) {
       //     if (data[i] > data[i + 1]) {
      //          ArrayHelper.bubbleSort(data);
       //     }
      //  }

        ArrayHelper.bubbleSort(data);
        
        int place = -1;
        int l = 0;
        int r = data.length;
        int mid;

        while (place == -1) {
            if (l < r) {
                mid = (l + r) / 2;
                if (data[mid] > userChoice) {
                    r = mid - 1;
                } else if (data[mid] < userChoice) {
                    l = mid + 1;
                } else {
                    place = mid;
                    System.out.println("This value was found at " + place);
                }
            } else {
                System.out.println("This value was found not found");
                place = 1;
            }
        }
        return place;
    }

    public static int average(int[] data) {
        int average = sum(data) / data.length;
        return average;
    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int counter = 0; data.length > counter; counter++) {
            sum = data[counter] + sum;
        }
        return sum;
    }
}
