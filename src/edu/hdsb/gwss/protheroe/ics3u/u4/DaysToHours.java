/*
 * Name: DaysToHours.java
 * Date: March 2nd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Program calculates the weeks, days, and hours that majke up the 
 * number of hours given
*/
package edu.hdsb.gwss.protheroe.ics3u.u4;

/**
 *
 * @author 1protheroery
 */
public class DaysToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfTotalHours = 185;
        int numberOfWeeks = numberOfTotalHours/168;
        int remainder1 = (numberOfTotalHours - (numberOfWeeks * 168));
        int numberOfDays = (remainder1/24);
        int remainder2 = (remainder1 - (numberOfDays * 24));
        int numberOfHours = (remainder2/1);
    }
    
}
