/*
 * Name: CompoundInvesting.java
 * Date: April 3rd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Displays user a table showing the growth of their investment given
 * certain variables
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        double interestRate;
        double yearlyInvestment;
        double interest;
        double total;
        double originalInvestment;
        double tmp;
        int numberOfYears;

        //OBJECTS
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        
        //DESCRIPTION OF PROGRAM
        System.out.println(" Compound Investing ");
        System.out.println(" This program will print out a table displaying the total "
                + "amount of a yearly investment over a period of up to 15 years");
        System.out.println();

        //USER INPUT
        System.out.println("Please enter the amount you wish to deposit anually: ");
        yearlyInvestment = input.nextDouble();
        tmp = yearlyInvestment;
        originalInvestment = yearlyInvestment;
        yearlyInvestment = tmp;
        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();
        if (interestRate < 100 && interestRate > 1) {
            System.out.println("Please enter the number of years you wish to continue doing this: ");
            numberOfYears = input.nextInt();
            if (numberOfYears > 1 && numberOfYears < 15) {

                //TABLE HEADERS
                System.out.format("%-10s %-24s %-16s %-10s", "Year", "Amount in Account", "Interest", "Total");
                System.out.println();

                //GENERATES TABLE
                for (int year = 1; year <= numberOfYears; year++) {
                    interest = interestRate / 100 * yearlyInvestment;
                    total = interest + yearlyInvestment;
                    System.out.format("%-15s %-20s %-14s %-8s \n", year, money.format(yearlyInvestment), money.format(interest), money.format(total));
                    yearlyInvestment = total + originalInvestment;
                }
            } else {
                System.out.println(" Number of years can not be greater than 15 ");
            }
        } else {
            System.out.println(" Interest rate can not be greater than 100 ");
        }
    }
}
