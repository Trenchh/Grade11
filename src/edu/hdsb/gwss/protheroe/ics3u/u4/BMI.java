/*
 * Name: BMI.java
 * Date: March 25th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Determines BMI 
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 1protheroery
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getIntegerInstance();

        //Constants
        final int LBS_INCHES = 1;
        final int KG_METERS = 2;

        //Variables
        int select;
        double weight;
        double height;
        double bmi = 0;
        
        decimal.setMinimumFractionDigits( 1 );
        decimal.setMaximumFractionDigits( 1 );

        //Provides description of program
        System.out.println("BMI");
        System.out.println("This program calculates your BMI (Body Mass Index) based on your weight and height and classifies your state of health.");
        System.out.println(" ");

        //User selects imperial or metric
        System.out.println("Press 1 for lbs and inches (imperial) or press 2 for kg and meters (metric): ");
        select = input.nextInt();

        //User inputs data and program calculates BMI
        if (select == LBS_INCHES) {
            System.out.println("Please enter weight(lbs): ");
            weight = input.nextDouble();
            System.out.println("Please enter height(inches): ");
            height = input.nextDouble();
            bmi = (weight * 703) / (height * height);
        } else if (select == KG_METERS) {
            System.out.println("Please enter weight(kg): ");
            weight = input.nextDouble();
            System.out.println("Please enter height(meters): ");
            height = input.nextDouble();
            bmi = weight / (height * height);
        } else {
            System.out.println("Invalid option");
        }

        //Determines state of health
        if (bmi <= 0) {
            System.out.println("Invalid BMI");
        } else if (bmi <= 16) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'starvation'");
        } else if (bmi <= 19.5) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'underweight'");
        } else if (bmi <= 25) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'ideal'");
        } else if (bmi <= 30) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'overweight'");
        } else if (bmi <= 40) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'obese'");
        } else if (bmi < 40) {
            System.out.println("Your BMI is: " + (decimal.format(bmi)) + ", you classify as 'morbidly obese'");
        } else {
        }
    }
}
