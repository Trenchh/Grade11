/*
 * Name: WordEcho.java
 * Date: March 31st, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Echoes a word x amount of times given the word's length
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        String word;
        int counter = 0;
        
        //OBJECTS
        Scanner input = new Scanner(System.in);

        //GETS INPUT
        System.out.println("Please enter a word");
        word = input.next();

        //SPACE
        System.out.println(" ");
        
        //Echoes word 
        while (counter < word.length()) {
            System.out.print(word + "\t");
            counter++;
            
        }
        
    }

}
