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
import nu.xom.Serializer;

/**
 *
 * @author 1protheroery
 */
public class CulminatingPart1 extends javax.swing.JFrame {

    Element menuRoot;
    Document menuDocument;

    public CulminatingPart1() {
        initComponents();

        try {
            File file = new File("culminating.xml");

            if (file.length() == 0) {
                menuRoot = new Element("food");
                menuDocument = new Document(menuRoot);
            } else {
                Builder builder = new Builder();
                menuDocument = builder.build(file);
                menuRoot = menuDocument.getRootElement();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel sizeHeader = new javax.swing.JLabel();
        quantityHeader = new javax.swing.JLabel();
        typeHeader = new javax.swing.JLabel();
        sizeBox = new javax.swing.JComboBox();
        quantityInput = new javax.swing.JSpinner();
        javax.swing.JLabel priceHeader = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        priceInput = new javax.swing.JTextField();
        javax.swing.JButton addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        typeBox = new javax.swing.JComboBox();
        javax.swing.JLabel nameHeader = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        sizeHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        sizeHeader.setForeground(new java.awt.Color(255, 255, 255));
        sizeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sizeHeader.setText("Size:");
        sizeHeader.setToolTipText("");
        getContentPane().add(sizeHeader);
        sizeHeader.setBounds(80, 200, 35, 27);

        quantityHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        quantityHeader.setForeground(new java.awt.Color(255, 255, 255));
        quantityHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityHeader.setText("Quantity");
        quantityHeader.setToolTipText("");
        getContentPane().add(quantityHeader);
        quantityHeader.setBounds(140, 280, 68, 26);

        typeHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        typeHeader.setForeground(new java.awt.Color(255, 255, 255));
        typeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeHeader.setText("Type:");
        typeHeader.setToolTipText("");
        getContentPane().add(typeHeader);
        typeHeader.setBounds(80, 100, 40, 26);

        sizeBox.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        sizeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Medium", "Large" }));
        getContentPane().add(sizeBox);
        sizeBox.setBounds(140, 200, 260, 30);

        quantityInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(quantityInput);
        quantityInput.setBounds(140, 320, 55, 26);

        priceHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        priceHeader.setForeground(new java.awt.Color(255, 255, 255));
        priceHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceHeader.setText("Price:");
        priceHeader.setToolTipText("");
        getContentPane().add(priceHeader);
        priceHeader.setBounds(70, 250, 44, 27);

        nameInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(nameInput);
        nameInput.setBounds(140, 150, 260, 27);

        priceInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(priceInput);
        priceInput.setBounds(140, 250, 260, 27);

        addButton.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(262, 314, 133, 34);

        clearButton.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setToolTipText("");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(300, 360, 61, 29);

        typeBox.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hamburger", "Fries", "Salad", "Breakfast", "Drink", "Desert" }));
        typeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeBoxActionPerformed(evt);
            }
        });
        getContentPane().add(typeBox);
        typeBox.setBounds(140, 100, 260, 30);

        nameHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        nameHeader.setForeground(new java.awt.Color(255, 255, 255));
        nameHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameHeader.setText("Name:");
        nameHeader.setToolTipText("");
        getContentPane().add(nameHeader);
        nameHeader.setBounds(70, 150, 44, 27);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/protheroe/ics3u/u7/McDonaldsMenu.jpg"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background);
        background.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        Element food = new Element("type");

        Element type = new Element(ELEMENT_TYPE);
        type.appendChild(typeBox.getSelectedItem().toString());
        Element name = new Element(ELEMENT_NAME);
        name.appendChild(nameInput.getText());
        Element size = new Element(ELEMENT_SIZE);
        size.appendChild(sizeBox.getSelectedItem().toString());
        Element price = new Element("price");
        price.appendChild("" + priceInput.getText());
        Element quantity = new Element("quantity");
        quantity.appendChild("" + quantityInput.getValue());

        food.appendChild(type);
        food.appendChild(name);
        food.appendChild(price);
        food.appendChild(quantity);
        food.appendChild(size);
        menuRoot.appendChild(food);

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(menuDocument);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("culminating.xml"));
            output.write(menuDocument.toXML());
            output.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        menuRoot = new Element("food");
        menuDocument = new Document(menuRoot);

        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("culminating.xml"));
            output.write(menuDocument.toXML());
            output.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }

    }//GEN-LAST:event_clearButtonActionPerformed

    private void typeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBoxActionPerformed
        Element food = new Element("type");

        if (typeBox.getSelectedItem().toString().equals("Hamburger") || typeBox.getSelectedItem().toString().equals("Salad") || typeBox.getSelectedItem().toString().equals("Breakfast")) {
            sizeBox.setEnabled(false);
        } else {
            sizeBox.setEnabled(true);
        }
        if (typeBox.getSelectedItem().toString().equals("Fries")) {
            nameInput.setEnabled(false);
        }
    }//GEN-LAST:event_typeBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CulminatingPart1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel quantityHeader;
    private javax.swing.JSpinner quantityInput;
    private javax.swing.JComboBox sizeBox;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JLabel typeHeader;
    // End of variables declaration//GEN-END:variables
    //static final String ELEMENT_ROOT = "mcdonalds";
    static final String ELEMENT_TYPE = "type";
    static final String ELEMENT_NAME = "name";
    static final String ELEMENT_SIZE = "size";
    static final double ELEMENT_PRICE = 0;
    static final int ELEMENT_QUANTITY = 0;
}
