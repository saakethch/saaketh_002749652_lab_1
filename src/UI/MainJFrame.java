/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;

/**
 *
 * @author Nidhi Raghavendra
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Application application;
    
    public MainJFrame() {
        initComponents();
        
        this.application = new Application();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        assignBtn = new javax.swing.JButton();
        createObservationBtn = new javax.swing.JButton();
        viewVitalsBtn = new javax.swing.JButton();
        medCatalogBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignBtn.setText("ASSIGN MEDICINE");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 50));

        createObservationBtn.setText("CREATE OBSERVATION");
        createObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createObservationBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(createObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 50));

        viewVitalsBtn.setText("VIEW VITAL SIGN HISTORY");
        viewVitalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalsBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(viewVitalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 50));

        medCatalogBtn.setText("MEDICINE CATALOG");
        medCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCatalogBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(medCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 50));

        jSplitPane1.setLeftComponent(ControlJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assignBtnActionPerformed

    private void createObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createObservationBtnActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createObservationBtnActionPerformed

    private void viewVitalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_viewVitalsBtnActionPerformed

    private void medCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCatalogBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CatalogJPanel(this.application));
    }//GEN-LAST:event_medCatalogBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton createObservationBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medCatalogBtn;
    private javax.swing.JButton viewVitalsBtn;
    // End of variables declaration//GEN-END:variables
}
