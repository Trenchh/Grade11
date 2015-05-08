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
        int place;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER ENTERS NUMBER TO SEARCH FOR
        System.out.println("Enter the value you wish to search for: ");
        int userChoice = input.nextInt();
        System.out.println();

        //LOOP CHECKS FOR MATCH
        for (int counter = 0; counter < data.length; counter++) {
            numberOfComparisons++;
            if (data[counter] == userChoice) {
                check++;
                place = counter;
                System.out.println("This value was found at " + (place + 1));
            }
        }
        if (check == 0) {
            System.out.println("This value was found not found");
        }
        System.out.println("Number of comparisons: " + numberOfComparisons);
    }

    public static void binarySearch(int[] data) {
        ArrayHelper.bubbleSort(data);

        int place = -1;
        int l = 0;
        int r = data.length;
        int mid;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER ENTERS NUMBER TO SEARCH FOR
        System.out.println("Enter the value you wish to search for: ");
        int userChoice = input.nextInt();
        System.out.println();

        while (place == -1) {
            if (l < r) {
                mid = average((l + r), 2);
                if (data[mid] > userChoice) {
                    r = mid - 1;
                } else if (data[mid] < userChoice) {
                    l = mid + 1;
                } else {
                    place = mid;
                    System.out.println("Value found at " + (place + 1));
                }
            } else {
                System.out.println("Value not found");
                place = 1;
            }
        }
    }

    public static int average(int i, int j) {
        int average = i / j;
        return average;
    }

    public static int sum(int i, int j) {
        int sum = 0;
        return sum;
    }
}
