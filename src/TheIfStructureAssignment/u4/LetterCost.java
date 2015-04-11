/*
 * Name: LetterCost.java
 * Date: March 26th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Determines cost of mailing letter
 */
package TheIfStructureAssignment.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        // Money format
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // CONSTANT
        final int FIRST_CLASS = 1;
        final int SECOND_CLASS = 2;

        //Variables
        int select;
        double weight;
        double cost = 0;
        double over;

        //Provides description of program
        System.out.println("Letter Cost");
        System.out.println("This program calculates the cost of sending a letter given the mass and mail class.");
        System.out.println(" ");
        
        //User selects mail class and enters weight of letter
        System.out.println("Press 1 for first class mail or press 2 for second class mail: ");
        select = input.nextInt();

        System.out.println("Please enter weight of letter (grams): ");
        weight = input.nextDouble();
            
        //Determines cost for first class mail
        if (select == FIRST_CLASS) {
            over = (((weight - 100) / 50) * .29) + .80;
            if (weight >= 100) {
                cost = over;
            } else if (weight >= 51) {
                cost = 0.8;
            } else if (weight >= 31) {
                cost = 0.6;
            } else if (weight >= 1) {
                cost = 0.4;
            } else {
                System.out.println("Invalid");
            }
        } else if (select == SECOND_CLASS) {
            over = (((weight - 100) / 50) * .19) + .80;
            if (weight >= 100) {
                cost = over;
            } else if (weight >= 51) {
                cost = 0.6;
            } else if (weight >= 31) {
                cost = 0.5;
            } else if (weight >= 1) {
                cost = 0.3;
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid class option");
        }
        //Tells user cost of mail
        System.out.println("The cost of your mail is:" + money.format(cost));
    }
}
