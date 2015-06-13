/*
 * HEADER
 */
package edu.hdsb.gwss.protheroe.ics3u.performanceTask;

/**
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashHeader = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rulesAndInstruction = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        splashHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        splashHeader.setForeground(new java.awt.Color(255, 255, 255));
        splashHeader.setText("Welcome to \"The Quiz\"");
        getContentPane().add(splashHeader);
        splashHeader.setBounds(81, 33, 337, 47);

        startButton.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startQuiz(evt);
            }
        });
        getContentPane().add(startButton);
        startButton.setBounds(135, 291, 221, 79);

        rulesAndInstruction.setColumns(20);
        rulesAndInstruction.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        rulesAndInstruction.setRows(5);
        rulesAndInstruction.setText("Rules/Instructions  \n1. NO LOOKING ON THE INTERNET \n2. Click start to begin the 10 multiple choice question quiz\n3. Press submit answer once you've selectd your answer\n4. Now let's see if you can survive the quiz");
        jScrollPane1.setViewportView(rulesAndInstruction);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(81, 98, 337, 175);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/protheroe/ics3u/performanceTask/QuizShowStart.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startQuiz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startQuiz
        new Quiz().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_startQuiz

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea rulesAndInstruction;
    private javax.swing.JLabel splashHeader;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}