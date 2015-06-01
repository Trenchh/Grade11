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
import nu.xom.Serializer;

/**
 *
 * @author 1protheroery
 */
public class Culminating extends javax.swing.JFrame {

    Element menuRoot = new Element(ELEMENT_FOOD);
    Document menuDocument = new Document(menuRoot);

    public Culminating() {
        initComponents();

        try {
            File file = new File("culminating.xml");
            if (menuDocument.getRootElement() == menuRoot) {
                Builder builder = new Builder();
                menuDocument = builder.build(file);
            }

            menuRoot = menuDocument.getRootElement();
            Elements food = menuRoot.getChildElements();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel nameHeader = new javax.swing.JLabel();
        quantityHeader = new javax.swing.JLabel();
        typeHeader = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        quantityInput = new javax.swing.JSpinner();
        javax.swing.JLabel priceHeader = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        priceInput = new javax.swing.JTextField();
        javax.swing.JButton addButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        nameHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        nameHeader.setForeground(new java.awt.Color(255, 255, 255));
        nameHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameHeader.setText("Name:");
        nameHeader.setToolTipText("");
        getContentPane().add(nameHeader);
        nameHeader.setBounds(65, 173, 44, 27);

        quantityHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        quantityHeader.setForeground(new java.awt.Color(255, 255, 255));
        quantityHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityHeader.setText("Quantity");
        quantityHeader.setToolTipText("");
        getContentPane().add(quantityHeader);
        quantityHeader.setBounds(130, 280, 68, 26);

        typeHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        typeHeader.setForeground(new java.awt.Color(255, 255, 255));
        typeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeHeader.setText("Type:");
        typeHeader.setToolTipText("");
        getContentPane().add(typeHeader);
        typeHeader.setBounds(69, 100, 40, 26);

        typeBox.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hamburger", "Salad", "Breakfast", "Drink", "Desert" }));
        getContentPane().add(typeBox);
        typeBox.setBounds(135, 96, 260, 30);

        quantityInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(quantityInput);
        quantityInput.setBounds(135, 318, 55, 26);

        priceHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        priceHeader.setForeground(new java.awt.Color(255, 255, 255));
        priceHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceHeader.setText("Price:");
        priceHeader.setToolTipText("");
        getContentPane().add(priceHeader);
        priceHeader.setBounds(65, 245, 44, 27);

        nameInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(nameInput);
        nameInput.setBounds(135, 173, 260, 27);

        priceInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        getContentPane().add(priceInput);
        priceInput.setBounds(135, 245, 260, 27);

        addButton.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(262, 314, 133, 34);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/protheroe/ics3u/u7/McDonaldsMenu.jpg"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background);
        background.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Element food = new Element(ELEMENT_FOOD);

        Element type = new Element(ELEMENT_TYPE);
        type.appendChild(typeBox.getSelectedItem().toString());
        Element name = new Element(ELEMENT_NAME);
        name.appendChild(nameInput.getText());
        Element price = new Element("price");
        price.appendChild("" + priceInput.getText());
        Element quantity = new Element("quantity");
        quantity.appendChild("" + quantityInput.getValue());

        menuRoot.appendChild(type);
        menuRoot.appendChild(name);
        menuRoot.appendChild(price);
        menuRoot.appendChild(quantity);
        //food.appendChild(menuRoot);

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
            java.util.logging.Logger.getLogger(Culminating.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Culminating.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Culminating.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Culminating.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Culminating().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel quantityHeader;
    private javax.swing.JSpinner quantityInput;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JLabel typeHeader;
    // End of variables declaration//GEN-END:variables
    //static final String ELEMENT_ROOT = "mcdonalds";
    static final String ELEMENT_TYPE = "type";
    static final String ELEMENT_FOOD = "food";
    static final String ELEMENT_NAME = "name";
    static final double ELEMENT_PRICE = 0;
    static final int ELEMENT_QUANTITY = 0;
}
