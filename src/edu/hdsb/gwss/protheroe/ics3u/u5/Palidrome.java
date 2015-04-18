/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Palidrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //VARIABLES
        String word;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Palidrome ");
        System.out.println();
        System.out.println("This program will reverse the word entered and check if it is a palindrome");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter a word: ");
        word = input.next();
        System.out.println();
        
    }
    
}
