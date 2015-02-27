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
public class RestaurantTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double subtotal = 43.67;
        double tax = subtotal * 0.13;
        double total = subtotal + tax;
        
        System.out.println("The subtotal of the meal is: $" + subtotal);
        System.out.println("The total of the meal is: $" + total);
    }
    
}
