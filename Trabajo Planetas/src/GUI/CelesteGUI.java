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
        t_mercurio = new javax.swing.JTextField();
        info_merc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        info_venus = new javax.swing.JButton();
        t_venus = new javax.swing.JTextField();
        info_tierra = new javax.swing.JButton();
        t_tierra = new javax.swing.JTextField();
        info_mart = new javax.swing.JButton();
        info_jup = new javax.swing.JButton();
        info_sat = new javax.swing.JButton();
        info_nept = new javax.swing.JButton();
        t_mart = new javax.swing.JTextField();
        t_jup = new javax.swing.JTextField();
        t_sat = new javax.swing.JTextField();
        t_nept = new javax.swing.JTextField();
        t_todos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        t_nept1 = new javax.swing.JTextField();
        nept_button1 = new javax.swing.JButton();
        info_nept1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mercurio_button.setText("Trayectoria");
        mercurio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurio_buttonActionPerformed(evt);
            }
        });

        venus_button.setText("Trayectoria");
        venus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venus_buttonActionPerformed(evt);
            }
        });

        tierra_button.setText("Trayectoria");
        tierra_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierra_buttonActionPerformed(evt);
            }
        });

        marte_button.setText("Trayectoria");
        marte_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marte_buttonActionPerformed(evt);
            }
        });

        jupiter_butt.setText("Trayectoria");
        jupiter_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiter_buttActionPerformed(evt);
            }
        });

        saturno_button.setText("Trayectoria");
        saturno_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturno_buttonActionPerformed(evt);
            }
        });

        nept_button.setText("Trayectoria");
        nept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nept_buttonActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar todas las trayectorias");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        t_mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_mercurioActionPerformed(evt);
            }
        });

        info_merc.setText("Información");
        info_merc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_mercActionPerformed(evt);
            }
        });

        jLabel1.setText("Mercurio");

        jLabel2.setText("Venus");

        jLabel3.setText("Tierra");

        jLabel4.setText("Marte");

        jLabel5.setText("Jupiter");

        jLabel6.setText("Saturno");

        jLabel7.setText("Urano");

        jLabel8.setText("Instante de tiempo");

        info_venus.setText("Información");
        info_venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_venusActionPerformed(evt);
            }
        });

        t_venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_venusActionPerformed(evt);
            }
        });

        info_tierra.setText("Información");
        info_tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_tierraActionPerformed(evt);
            }
        });

        t_tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tierraActionPerformed(evt);
            }
        });

        info_mart.setText("Información");
        info_mart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_martActionPerformed(evt);
            }
        });

        info_jup.setText("Información");
        info_jup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_jupActionPerformed(evt);
            }
        });

        info_sat.setText("Información");
        info_sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_satActionPerformed(evt);
            }
        });

        info_nept.setText("Información");
        info_nept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_neptActionPerformed(evt);
            }
        });

        t_mart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_martActionPerformed(evt);
            }
        });

        t_jup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jupActionPerformed(evt);
            }
        });

        t_sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_satActionPerformed(evt);
            }
        });

        t_nept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_neptActionPerformed(evt);
            }
        });

        jButton1.setText("Posicion de todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Neptuno");

        t_nept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nept1ActionPerformed(evt);
            }
        });

        nept_button1.setText("Trayectoria");
        nept_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nept_button1ActionPerformed(evt);
            }
        });

        info_nept1.setText("Información");
        info_nept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_nept1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nept1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_venus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_mart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_jup, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_sat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_nept, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_mercurio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mercurio_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(venus_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tierra_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marte_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jupiter_butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saturno_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nept_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nept_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info_merc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_venus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_mart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_jup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_sat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_nept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_nept1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(t_todos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(t_mercurio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mercurio_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info_merc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(t_venus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(venus_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info_venus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tierra_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(info_tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marte_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info_mart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_mart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_jup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jupiter_butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(info_jup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saturno_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(info_sat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nept_button)
                    .addComponent(info_nept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(t_nept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(t_nept1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nept_button1)
                    .addComponent(info_nept1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_todos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
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

    private void t_mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_mercurioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_t_mercurioActionPerformed

    private void info_mercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_mercActionPerformed
        double t = Double.parseDouble(t_mercurio.getText());
        info = new infoPanel(c.getPlanetas().get(0),t);
        info.setVisible(true);
        c.pintarPlaneta(0, t);
    }//GEN-LAST:event_info_mercActionPerformed

    private void info_venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_venusActionPerformed
        double t = Double.parseDouble(t_venus.getText());
        info = new infoPanel(c.getPlanetas().get(1),t);
        info.setVisible(true);
        c.pintarPlaneta(1, t);
          
    }//GEN-LAST:event_info_venusActionPerformed

    private void t_venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_venusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_venusActionPerformed

    private void info_tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_tierraActionPerformed
        double t = Double.parseDouble(t_tierra.getText());
        info = new infoPanel(c.getPlanetas().get(2),t);
        info.setVisible(true);
        c.pintarPlaneta(2, t);
    }//GEN-LAST:event_info_tierraActionPerformed

    private void t_tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tierraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tierraActionPerformed

    private void info_martActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_martActionPerformed
        double t = Double.parseDouble(t_mart.getText());
        
       info = new infoPanel(c.getPlanetas().get(3),t);
        info.setVisible(true);
        c.pintarPlaneta(3, t);
    }//GEN-LAST:event_info_martActionPerformed

    private void info_jupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_jupActionPerformed
       double t = Double.parseDouble(t_jup.getText());
        info = new infoPanel(c.getPlanetas().get(4),t);
        info.setVisible(true);
        c.pintarPlaneta(4, t);
    }//GEN-LAST:event_info_jupActionPerformed

    private void info_satActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_satActionPerformed
        double t = Double.parseDouble(t_sat.getText());
        info = new infoPanel(c.getPlanetas().get(5),t);
        info.setVisible(true);
        c.pintarPlaneta(5, t);
    }//GEN-LAST:event_info_satActionPerformed

    private void info_neptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_neptActionPerformed
        double t = Double.parseDouble(t_nept.getText());
        info = new infoPanel(c.getPlanetas().get(6),t);
        info.setVisible(true);
        c.pintarPlaneta(6, t);
    }//GEN-LAST:event_info_neptActionPerformed

    private void t_martActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_martActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_martActionPerformed

    private void t_jupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jupActionPerformed

    private void t_satActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_satActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_satActionPerformed

    private void t_neptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_neptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_neptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.todasPosiciones(Double.parseDouble(t_todos.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_nept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nept1ActionPerformed
        
    }//GEN-LAST:event_t_nept1ActionPerformed

    private void nept_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nept_button1ActionPerformed
        
        c.pintarTrayectoriaPlaneta(7);
    }//GEN-LAST:event_nept_button1ActionPerformed

    private void info_nept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_nept1ActionPerformed
       double t = Double.parseDouble(t_nept1.getText());
        info = new infoPanel(c.getPlanetas().get(7),t);
        info.setVisible(true);
        c.pintarPlaneta(7, t);
    }//GEN-LAST:event_info_nept1ActionPerformed

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
    private javax.swing.JButton info_jup;
    private javax.swing.JButton info_mart;
    private javax.swing.JButton info_merc;
    private javax.swing.JButton info_nept;
    private javax.swing.JButton info_nept1;
    private javax.swing.JButton info_sat;
    private javax.swing.JButton info_tierra;
    private javax.swing.JButton info_venus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jupiter_butt;
    private javax.swing.JButton marte_button;
    private javax.swing.JButton mercurio_button;
    private javax.swing.JButton nept_button;
    private javax.swing.JButton nept_button1;
    private javax.swing.JButton saturno_button;
    private javax.swing.JTextField t_jup;
    private javax.swing.JTextField t_mart;
    private javax.swing.JTextField t_mercurio;
    private javax.swing.JTextField t_nept;
    private javax.swing.JTextField t_nept1;
    private javax.swing.JTextField t_sat;
    private javax.swing.JTextField t_tierra;
    private javax.swing.JTextField t_todos;
    private javax.swing.JTextField t_venus;
    private javax.swing.JButton tierra_button;
    private javax.swing.JButton venus_button;
    // End of variables declaration//GEN-END:variables
    infoPanel info;
}
