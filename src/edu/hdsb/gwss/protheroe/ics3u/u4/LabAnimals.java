/*
 * Name: LabAnimals.java
 * Date: April 5th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will determine when the food supply will no longer
 * support the amount of animals given certain values.
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int initialPop;
        int food;
        int foodPerHour;
        int endFood;
        int hour = 1;
        int endPop;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //DESCRIPTION OF PROGRAM
        System.out.println("Lab Animals");
        System.out.println();
        System.out.println("This program will determine when the food supply will no longer \nsupport"
                + " the amount of animals given certain values");
        System.out.println();

        //USER INPUT AND ERROR CHECK
        System.out.println("Please enter the initial population: ");
        initialPop = input.nextInt();
        if (initialPop > 0) {
            System.out.println("Please enter the initial food supply: ");
            food = input.nextInt();
            if (food > 0) {
                System.out.println("Please enter the amount of food to add each hour: ");
                foodPerHour = input.nextInt();
                if (foodPerHour > 0) {
                    System.out.println();

                    //HEADER
                    System.out.format("%-6s %-18s %-15s %-13s %-18s", "Hour |", "Animals at Start |", "Food at Start |", "Food at End |", "Animals at End |");
                    System.out.println();

                    //DISPLAYS TABLE AND DETERMINES WHEN FOOD SUPPLY IS INSUFFICIENT
                    while (initialPop <= food) {
                        endPop = initialPop * 2;
                        endFood = food + foodPerHour - initialPop;
                        System.out.format("%-13s %-15s %-15s %-16s %-18s \n", hour, initialPop, food, endFood, endPop);
                        food = endFood;
                        initialPop = endPop;
                        hour++;
                    }
                    //PRINTS WHEN FOOD SUPPLY BECOMES INSUFFICIENT
                    System.out.println();
                    System.out.println("The food supply will become insuffticient at " + hour + " hour(s).");
                    System.out.println("The number of animals will begin to decrease.");
                    System.out.println("Increase the food rate in order to allow more animals to live longer and happier.");
                } else {
                    System.out.println("Invalid food rate");
                }
            } else {
                System.out.println("Invalid initial food amount");
            }
        } else {
            System.out.println("Invalid initial population");
        }
    }
}
