/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u6;

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
            System.out.println("value #" + (counter + 1) + ": " + values[counter]);
        }

        //HIGHEST SCORE
        int max = -1;
        for (int counter = 0; counter < values.length; counter++) {
            if ((values[counter]) > max) {
                max = (values[counter]);
                
            }
        } System.out.println(values[9]);
    }
}
