/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import celeste.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dani
 */
public class CelesteGUI extends javax.swing.JFrame {

    Celeste c;

    /**
     * Creates new form CelesteGUI
     */
    public CelesteGUI() throws IOException {
        c = new Celeste();
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

        mercurio_button = new javax.swing.JButton();
        venus_button = new javax.swing.JButton();
        tierra_button = new javax.swing.JButton();
        marte_button = new javax.swing.JButton();
        jupiter_butt = new javax.swing.JButton();
        saturno_button = new javax.swing.JButton();
        nept_button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        text_tierra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mercurio_button.setText("Mercurio");
        mercurio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurio_buttonActionPerformed(evt);
            }
        });

        venus_button.setText("Venus");
        venus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venus_buttonActionPerformed(evt);
            }
        });

        tierra_button.setText("Tierra");
        tierra_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierra_buttonActionPerformed(evt);
            }
        });

        marte_button.setText("Marte");
        marte_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marte_buttonActionPerformed(evt);
            }
        });

        jupiter_butt.setText("Jupiter");
        jupiter_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiter_buttActionPerformed(evt);
            }
        });

        saturno_button.setText("Saturno");
        saturno_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturno_buttonActionPerformed(evt);
            }
        });

        nept_button.setText("Neptuno");
        nept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nept_buttonActionPerformed(evt);
            }
        });

        jButton3.setText("Todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        text_tierra.setText("jTextField1");
        text_tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tierraActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nept_button)
                    .addComponent(venus_button)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tierra_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(text_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(marte_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jupiter_butt)
                    .addComponent(saturno_button)
                    .addComponent(mercurio_button))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mercurio_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(venus_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tierra_button)
                    .addComponent(text_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marte_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jupiter_butt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saturno_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nept_button)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tierra_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierra_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(2);
    }//GEN-LAST:event_tierra_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c.pintarTodosTrayectorias();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mercurio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurio_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(0);
    }//GEN-LAST:event_mercurio_buttonActionPerformed

    private void venus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venus_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(1);
    }//GEN-LAST:event_venus_buttonActionPerformed

    private void marte_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marte_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(3);
    }//GEN-LAST:event_marte_buttonActionPerformed

    private void jupiter_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiter_buttActionPerformed
        c.pintarTrayectoriaPlaneta(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jupiter_buttActionPerformed

    private void saturno_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturno_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(5);        // TODO add your handling code here:
    }//GEN-LAST:event_saturno_buttonActionPerformed

    private void nept_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nept_buttonActionPerformed
        c.pintarTrayectoriaPlaneta(6);        // TODO add your handling code here:
    }//GEN-LAST:event_nept_buttonActionPerformed

    private void text_tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tierraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_text_tierraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.pintarPlaneta(2,Double.parseDouble(text_tierra.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CelesteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CelesteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CelesteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CelesteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CelesteGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CelesteGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jupiter_butt;
    private javax.swing.JButton marte_button;
    private javax.swing.JButton mercurio_button;
    private javax.swing.JButton nept_button;
    private javax.swing.JButton saturno_button;
    private javax.swing.JTextField text_tierra;
    private javax.swing.JButton tierra_button;
    private javax.swing.JButton venus_button;
    // End of variables declaration//GEN-END:variables
}
