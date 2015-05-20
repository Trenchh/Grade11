/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1protheroery
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("DATA1.txt"));

        StringTokenizer time;
        StringTokenizer line;
        int hours;
        int delay;

        while (input.hasNext()) {
            line = new StringTokenizer(input.nextLine(), " ");
            time = new StringTokenizer(line.nextToken(), ":");

            while (line.hasMoreTokens()) {
                System.out.println(line.nextToken());
                System.out.println();

            }
        }
    }
}
