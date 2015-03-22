/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner gets birth year and current year
        Scanner input = new Scanner(System.in);

        //User inputs data
        int birthYear;
        System.out.println("Please enter the last two digits of your birth year:");
        birthYear = input.nextInt();
        int currentYear;
        System.out.println("Please enter the last two digits of the current year:");
        currentYear = input.nextInt();
        
        //Calculates current year in thousands form and checks if 100 
        if (birthYear == currentYear) {
            int age = 100;
            System.out.println("Current age:" + age);
        } else if (currentYear <= 15) {
            int thousandsCurrentYear = currentYear + 2000;
            System.out.println("Current Year:" + thousandsCurrentYear);
        } else if (currentYear <= 99 && currentYear > 15) {
            int thousandsCurrentYear = currentYear + 1900;
            System.out.println("Current Year:" + thousandsCurrentYear);
        } else {
        }
        
        //Calculates birth year in thousands form
        if (birthYear < 15) {
            int thousandsBirthYear = birthYear + 2000;
            System.out.println("Birth Year:" + thousandsBirthYear);
        } else if (birthYear <= 99 && birthYear > 15) {
            int thousandsBirthYear = currentYear + 1900;
            System.out.println("Birth Year:" + thousandsBirthYear);
        } else {   
        }
        
        //Calculates final age
        int finalAge = thousandsCurrentYear - thousandsBirthYear;
    }

}
