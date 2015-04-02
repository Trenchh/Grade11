/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.text.NumberFormat;

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
        double interestRate = 9;
        double yearlyInvestment = 100;
        int numberOfYears = 5;
        double interest = 0;
        double total;
        
        //MONEY FORMAT
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //TABLE HEADERS
        System.out.format("%-10s %-24s %-16s %-10s","Year","Amount in Account","Interest","Total");
        System.out.println();
        
        for(int year = 1 ;year <= numberOfYears; year++ ) { 
            yearlyInvestment = yearlyInvestment + interest;
            interest = interestRate/100 * yearlyInvestment;
            total = interest + yearlyInvestment;
            System.out.format("%-15s %-20s %-14s %-8s \n",year,money.format( yearlyInvestment ),money.format( interest ),money.format( total ) );
            //total = total * 2 - yearlyInvestment;
        }
    }
    
}
