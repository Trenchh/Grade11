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
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int mod = a % b;
        
        System.out.println("The sum is:         " + a + "+" + b + "=" + sum);
        System.out.println("The difference is:  " + a + "-" + b + "=" + difference);
        System.out.println("The product is:     " + a + "x" + b + "=" + product);
        System.out.println("The mod is:         " + a + "%" + b + "=" + mod);
        
    }
    
}
