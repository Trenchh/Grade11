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
import javax.swing.DefaultComboBoxModel;
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

        File file = new File("culminating.xml");

        try {
            //Builder parses file and creates doc;
            if (menuDocument.getRootElement() == null) {
                Builder builder = new Builder();
                menuDocument = builder.build(file);
            }
            menuRoot = menuDocument.getRootElement();
            Elements food = menuRoot.getChildElements();

            // data goes in the combo box model
            DefaultComboBoxModel model = new DefaultComboBoxModel();

            model.addElement("Hamburger");
            model.addElement("Drink");
            model.addElement("Desert");

            // add model to the combo box
            typeBox.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        javax.swing.JLabel nameHeader = new javax.swing.JLabel();
        quantityHeader = new javax.swing.JLabel();
        typeHeader = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        quantityInput = new javax.swing.JSpinner();
        javax.swing.JLabel priceHeader = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        priceInput = new javax.swing.JTextField();
        javax.swing.JButton addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("McDonalds Menu");
        header.setToolTipText("");

        nameHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        nameHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameHeader.setText("Name:");
        nameHeader.setToolTipText("");

        quantityHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        quantityHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityHeader.setText("Quantity:");
        quantityHeader.setToolTipText("");

        typeHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        typeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeHeader.setText("Type:");
        typeHeader.setToolTipText("");

        typeBox.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N

        quantityInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N

        priceHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        priceHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceHeader.setText("Price:");
        priceHeader.setToolTipText("");

        nameInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N

        priceInput.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N

        addButton.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(priceHeader)
                                .addComponent(nameHeader))
                            .addComponent(quantityHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameInput)
                            .addComponent(priceInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeHeader))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(nameInput))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(priceHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(priceInput))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityHeader)
                    .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

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
        food.appendChild(menuRoot);

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
    private javax.swing.JLabel header;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel quantityHeader;
    private javax.swing.JSpinner quantityInput;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JLabel typeHeader;
    // End of variables declaration//GEN-END:variables
    static final String ELEMENT_TYPE = "type";
    static final String ELEMENT_FOOD = "food";
    static final String ELEMENT_NAME = "name";
    static final double ELEMENT_PRICE = 0;
    static final int ELEMENT_QUANTITY = 0;
}
