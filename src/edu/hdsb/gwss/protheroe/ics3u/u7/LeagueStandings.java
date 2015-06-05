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
 * @author 1protheroery
 */
public class LeagueStandings {

    public static void main(String[] args) {

        Element root;
        Document document;

        Element eastRoot = new Element("americanLeagueEastTeams");
        Document eastDocument = new Document(eastRoot);

        File file = new File("AL.STANDINGS.txt");
        File eastFile = new File("AL.EAST.STANDINGS.xml");

        Builder builder = new Builder();
        String team;
        String record;

        try {
            document = builder.build(file);
            root = document.getRootElement();
            Elements standings = root.getChildElements();

            System.out.println("American League East");
            System.out.println("--------------------");
            System.out.format("%-5s %13s \n", "Team", "Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("East")) {
                    team = (standings.get(i).getFirstChildElement("name").getValue());
                    record = (standings.get(i).getFirstChildElement("record").getValue());
                    System.out.format("%-10s %7s \n", team, record);

                    //Part 2
                    eastRoot.appendChild(standings.get(i).toXML());
                }
            }

            System.out.println();

            System.out.println("American League West");
            System.out.println("--------------------");
            System.out.format("%-5s %13s \n", "Team", "Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("West")) {
                    team = (standings.get(i).getFirstChildElement("name").getValue());
                    record = (standings.get(i).getFirstChildElement("record").getValue());
                    System.out.format("%-10s %7s \n", team, record);
                }
            }

            System.out.println();

            System.out.println("American League Central");
            System.out.println("-----------------------");
            System.out.format("%-5s %16s \n", "Team", "Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("Central")) {
                    team = (standings.get(i).getFirstChildElement("name").getValue());
                    record = (standings.get(i).getFirstChildElement("record").getValue());
                    System.out.format("%-11s %9s \n", team, record);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Part2
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("AL.EAST.STANDINGS.xml"));
            output.write(eastDocument.toXML());
            output.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
