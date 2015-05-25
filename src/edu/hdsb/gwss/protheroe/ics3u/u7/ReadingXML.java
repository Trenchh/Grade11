/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ReadingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File file = new File("friends.xml");

        Builder builder = new Builder();
        Document friendsDocument;
        Element friendsRoot;

        try {
            //Builder parses file and creates doc
            friendsDocument = builder.build(file);
            friendsRoot = friendsDocument.getRootElement();

            Elements friends = friendsRoot.getChildElements();

            for (int friend = 0; friend < friends.size(); friend++) {
                System.out.println(friends.get(friend).getFirstChildElement("name").getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
