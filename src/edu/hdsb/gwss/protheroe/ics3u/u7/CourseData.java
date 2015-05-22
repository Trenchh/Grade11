/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1protheroery
 */
public class CourseData {

    static final String ELEMENT_COURSE = "course";
    static final String ELEMENT_DESC = "description";
    static final String ELEMENT_CODE = "code";
    static final String ELEMENT_TEACHER = "teacher";
    static final String ELEMENT_SCHOOLBOARD = "schoolboard";

    public static void main(String[] args) {

        Element course = new Element(ELEMENT_COURSE);
        Document courseDocument = new Document(course);

        Element code = new Element(ELEMENT_CODE);
        code.appendChild("ICS3U");
        Element description = new Element(ELEMENT_DESC);
        description.appendChild("Computer Science");
        Element teacher = new Element(ELEMENT_TEACHER);
        teacher.appendChild("Mr.Muir");
        Element schoolBoard = new Element(ELEMENT_SCHOOLBOARD);
        schoolBoard.appendChild("HDSB");

        course.appendChild(code);
        course.appendChild(description);
        course.appendChild(teacher);
        course.appendChild(schoolBoard);

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(courseDocument);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
