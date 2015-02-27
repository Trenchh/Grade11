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
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = 10;
        int width = 20;
        int area = length * width;
        int perimeter = length + width;
        
        System.out.println("The area of the rectangle is:" + area + "cm2");
        System.out.println("The perimeter of the rectangle is:" + perimeter+ "cm");
    }
    
}
