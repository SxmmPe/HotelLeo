/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Modelo.vhabitacion;
import Controlador.fhabitacion;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chind
 */
public class panelarchivo extends javax.swing.JPanel {

    panelhabitacion ph =  new panelhabitacion();
    panelproductos pp = new panelproductos();
    public panelarchivo() {
        initComponents();
        FlatLightLaf.setup();
        ShowJPanel(ph);
    }
     public void ShowJPanel(JPanel p) {
         p.setPreferredSize(contenedor.getSize());
        p.setSize(contenedor.getSize());
        contenedor.removeAll();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbProductos = new javax.swing.JButton();
        jbHabitaciones = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbProductos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbProductos.setText("Productos");
        jbProductos.setBorder(null);
        jbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbHabitaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbHabitaciones.setText("Habitaciones");
        jbHabitaciones.setBorder(null);
        jbHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHabitacionesActionPerformed(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(770, Short.MAX_VALUE))
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHabitacionesActionPerformed
        ShowJPanel(ph);
    }//GEN-LAST:event_jbHabitacionesActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        ShowJPanel(pp);
    }//GEN-LAST:event_jbProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbHabitaciones;
    private javax.swing.JButton jbProductos;
    // End of variables declaration//GEN-END:variables
}
