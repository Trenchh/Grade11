/*
 * Name: TestingMethods.java
 * Date: May 11th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will test every method in ArrayHelper
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

import edu.hdsb.gwss.protheroe.util.ArrayHelper;

/**
 *
 * @author 1protheroery
 */
public class TestingMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] values = new int[10];

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }

        //TEST 1
        System.out.println("-------------------------");
        System.out.println("TEST #1: MAX");
        System.out.println("PRE: ARRAY OF INTS ");
        System.out.println("POST: INDEX OF THE MAX ");

        //FIND MAX
        int indexOfTheMax = ArrayHelper.max(values, values.length - 1);
        //TEST
        for (int i = 0; i < values.length; i++) {
            assert (values[indexOfTheMax] >= values[i]);
        }
        System.out.println("TEST #1 PASSED ");

        //TEST 2
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #2: MIN");
        System.out.println("PRE: ARRAY OF INTS ");
        System.out.println("POST: INDEX OF THE MIN ");

        //FIND MIN
        int indexOfTheMin = ArrayHelper.min(values, values.length - 1);

        //TEST
        for (int i = 0; i < values.length - 1; i++) {
            assert (values[indexOfTheMin] <= values[i]);
        }
        System.out.println("TEST #2 PASSED ");

        //TEST 3
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #3: SELECTION SORT");
        System.out.println("PRE: UNSORTED ARRAY OF INTS ");
        System.out.println("POST: SORTED ARRAY OF INTS ");
        System.out.println();

        //UNSORTED
        System.out.println("UNSORTED");
        ArrayHelper.display(values);
        System.out.println();

        //SORT
        ArrayHelper.selectionSort(values);

        //SORTED
        System.out.println("SORTED");
        ArrayHelper.display(values);

        //TEST
        for (int i = 0; i < values.length - 1; i++) {
            assert (values[i] <= values[i + 1]);
        }
        System.out.println();
        System.out.println("TEST #3 PASSED ");

        //TEST 4
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #4: BUBBLE SORT");
        System.out.println("PRE: UNSORTED ARRAY OF INTS ");
        System.out.println("POST: SORTED ARRAY OF INTS ");
        System.out.println();

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }

        //UNSORTED
        System.out.println("UNSORTED");
        ArrayHelper.display(values);
        System.out.println();

        //SORT
        ArrayHelper.bubbleSort(values);

        //SORTED
        System.out.println("SORTED");
        ArrayHelper.display(values);

        //TEST
        for (int i = 0; i < values.length - 1; i++) {
            assert (values[i] <= values[i + 1]);
        }
        System.out.println();
        System.out.println("TEST #4 PASSED ");

        //TEST 5
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #5: BINARY SEARCH");
        System.out.println("PRE: UNSORTED ARRAY OF INTS, 'LOST' VARIABLE ");
        System.out.println("POST: SORTED ARRAY OF INTS. NOT/'FOUND' VARIABLE ");
        System.out.println();

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }

        //UNSORTED
        System.out.println("UNSORTED");
        ArrayHelper.display(values);
        System.out.println();

        //SORT
        ArrayHelper.selectionSort(values);

        //SEARCH FOR EVERY VALUE IN THE ARRAY
        for (int i = 0; i < values.length; i++) {
            assert (i == ArrayHelper.binarySearch(values, values[i]));
        }

        //SEARCH FOR A VALUE NOT IN THE ARRAY
        for (int i = 0; i < values.length; i++) {
            assert (-1 == ArrayHelper.binarySearch(values, 0));
        }

        //SORTED
        System.out.println("SORTED");
        ArrayHelper.display(values);

        System.out.println();
        System.out.println("TEST #5 PASSED ");

        //TEST 6
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #6: LINEAR SEARCH");
        System.out.println("PRE: 'LOST' VARIABLE ");
        System.out.println("POST: 'FOUND' VARIABLE ");
        System.out.println();

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = (int) (Math.random() * 1000) + 1;
        }

        //SEARCH FOR EVERY VALUE IN THE ARRAY
        for (int i = 0; i < values.length; i++) {
            assert (i == ArrayHelper.linearSearch(values, values[i]));
        }

        //SEARCH FOR A VALUE NOT IN THE ARRAY
        for (int i = 0; i < values.length; i++) {
            assert (-1 == ArrayHelper.linearSearch(values, 0));
        }

        System.out.println("TEST #6 PASSED ");

        //TEST 7
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #7: SUM");
        System.out.println("PRE: ARRAY OF INTS ");
        System.out.println("POST: THE SUM OF INTS");
        System.out.println();

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = 1;
        }
        int sum = ArrayHelper.sum(values);
        assert (sum == 10);

        System.out.println("TEST #7 PASSED ");

        //TEST 8
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("TEST #8: AVERAGE");
        System.out.println("PRE: ARRAY OF INTS ");
        System.out.println("POST: AVERAGE OF THE SUM OF INTS");
        System.out.println();

        //VALUE CREATOR
        for (int counter = 0; counter < 10; counter++) {
            values[counter] = 1;
        }
        int average = ArrayHelper.average(values);
        assert (average == 1);

        System.out.println("TEST #7 PASSED ");
        System.out.println();
        System.out.println("YOU PASSED ALL THE TESTS!");
    }
}
