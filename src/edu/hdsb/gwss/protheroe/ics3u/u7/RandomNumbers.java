/*
 * Name: RandomNumbers.java
 * Date: May 15th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: 
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import edu.hdsb.gwss.protheroe.util.ArrayHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File file = new File("random.txt");
        PrintWriter output = new PrintWriter(file);

        //VALUE CREATOR
        for (int counter = 0; counter < 1000; counter++) {
            output.println(Integer.toString((int) (Math.random() * 1000) + 1));
        }

        output.close();
        
        Scanner input = new Scanner(file);
        int i = 0;
        int[] values = new int[1000];
        int[] values2 = new int[1000];
        
        while (input.hasNext()) {
            values[i] = Integer.parseInt(input.nextLine());
            values2[i] = Integer.parseInt(input.nextLine());
            i++;
    }

        ArrayHelper.selectionSort(values);
        ArrayHelper.bubbleSort(values2);
}
}
