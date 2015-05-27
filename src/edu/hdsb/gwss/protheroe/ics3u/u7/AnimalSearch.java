/*
 * Name: AnimalSearch.java
 * Date: May 27th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will display certain variables within an XML file
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1protheroery
 */
public class AnimalSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("animalSearch.xml");

        Builder builder = new Builder();
        Document animalDocument;
        Element animalRoot;

        try {
            //Builder parses file and creates doc
            animalDocument = builder.build(file);
            animalRoot = animalDocument.getRootElement();

            Elements animals = animalRoot.getChildElements();

            //QUESTION1
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("diet").getValue().equals("Carnivore")) {
                    System.out.println(animals.get(i).toXML());
                }
            }
            //QUESTION2
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("flying").getValue().equals("Yes")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            //QUESTION3
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("habitat").getValue().equals("North America")) {
                    System.out.println(animals.get(i).toXML());
                }
            }
            //QUESTION4
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalName").getValue().equals("Moose")) {
                    System.out.println(animals.get(i).toXML());
                }
            }
            //QUESTION5
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalName").getValue().equals("Toucan")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            //QUESTION6
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalClass").getValue().equals("Mammalia")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").toXML());
                }
            }
            //QUESTION7
            System.out.println();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("diet").getValue().equals("Omnivore")) {
                    System.out.println(animals.get(i).toXML());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
