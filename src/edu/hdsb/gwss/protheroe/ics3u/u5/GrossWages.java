/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1protheroery
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //VARIABLES
        int hours;
        int wage;
        int overtime;
        int total;

        //Object
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println(" Gross Wages ");
        System.out.println();
        System.out.println("This program will calculate the gros wage given rate and hours. ");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter the amount of hours worked: ");
        hours = input.nextInt();
        System.out.println();
        System.out.println("Please enter your hourly wage: ");
        wage = input.nextInt();
        System.out.println();
        
        if (hours > 40) {
            overtime(hours);
            
        } else {
            normalWage(hours);
        }
    } public static void overtime(hours) {     
        
        overtime = hours - 40;
        wage = wage * 40; 
        overtime = overtime * (wage * 1.5);
        total = overtime + wage;
        System.out.println("The total is:" + total);
        
        
    } public static void normalWage(hours) {
        
        
        
    }
    
}
