/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

import java.util.Scanner;

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

        //Variables
        int select;
        double weight;
        double height;
        double bmi = -1;

        //User selects imperial or metric
        System.out.println("Press 1 for lbs and inches (imperial) or press 2 for kg and meters (metric): ");
        select = input.nextInt();

        //User inputs data and program calculates BMI
        if (select == 1) {
            System.out.println("Please enter weight(lbs): ");
            weight = input.nextDouble();
            System.out.println("Please enter height(inches): ");
            height = input.nextDouble();

            bmi = (weight * 703) / (height * height);

        } else if (select == 2) {
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
            System.out.println("Your BMI is: " + bmi + ", you classify as starvation");
        } else if (bmi <= 19.5) {
            System.out.println("Your BMI is: " + bmi + ", you classify as underweight");
        } else if (bmi <= 25) {
            System.out.println("Your BMI is: " + bmi + ", you classify as ideal");
        } else if (bmi <= 30) {
            System.out.println("Your BMI is: " + bmi + ", you classify as overweight");
        } else if (bmi <= 40) {
            System.out.println("Your BMI is: " + bmi + ", you classify as obese");
        } else if (bmi < 40) {
            System.out.println("Your BMI is: " + bmi + ", you classify as morbidly obese");
        } else {
        }
    }
}
