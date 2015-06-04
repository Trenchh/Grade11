/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author Swag God
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //pull file
        File file = new File("cool.xml");

        //create root and doc
        Element pizza = new Element("root name");
        Document coolio = new Document(pizza);

        //sub element
        Element jesus = new Element("what's inside the <>");
        jesus.appendChild("what's between <> </>");

        //build file
        try {
            Builder builder = new Builder();
            coolio = builder.build(file);
            pizza = coolio.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //write to file
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("cool.xml"));
            output.write(coolio.toXML());
            output.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

        //Search/read file
        Elements wings = pizza.getChildElements();

        for (int i = 0; i < wings.size(); i++) {
            //Read
            System.out.println(wings.get(i).getFirstChildElement("name").getValue());

            //Search
            if (wings.get(i).getFirstChildElement("whats inside the <> that youre searching for").getValue().equals("condition youre searchinfg for")) {
                System.out.println(wings.get(i).getFirstChildElement("what you want to print").getValue());

            }
        }
    }
}
