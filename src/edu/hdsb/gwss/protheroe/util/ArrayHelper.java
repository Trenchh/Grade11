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
    
    public static int min( int[] data ) {
        int low = data[0];
        for (int counter = 1; counter < data.length; counter++) {
            if ((data[counter]) < low) {
                low = (data[counter]);
            }
        }
        return low;
    }
    
    public static void display( int[] data ) {
        for (int counter = 0; counter < data.length; counter++) {
            System.out.print( data[counter] + "," );
        }
        System.out.println();
    }
    
}
