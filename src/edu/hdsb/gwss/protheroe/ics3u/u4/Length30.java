/*
 * Name: Length30.java
 * Date: March 31st, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Creates enough dots between 2 words to make length = 30 characters
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class Length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String word1;
        String word2;
        final int LENGTH = 30;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //GETS INPUT
        System.out.println("Please enter your first word");
        word1 = input.next();
        System.out.println("Please enter your second word");
        word2 = input.next();
        
        //DOES THE WORK
        while (LENGTH > word1.length() + word2.length()) {
            
        }
        
    }

}
