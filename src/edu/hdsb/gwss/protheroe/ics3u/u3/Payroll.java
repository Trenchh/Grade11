/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u3;

/**
 *
 * @author 1protheroery
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long   hoursWorked = 40;    
        double payRate     = 10.0, taxRate = 0.10;    
        System.out.println("Hours Worked: " + hoursWorked );
        System.out.println("pay Amount  : " + (hoursWorked * payRate) );
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
    }
    
}
