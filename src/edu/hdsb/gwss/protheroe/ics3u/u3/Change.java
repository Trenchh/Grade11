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
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int change = 48;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int quartersNeeded = change/quarter;
       
        System.out.println("You require " + quartersNeeded + " quarter");
        
    }
    
}
