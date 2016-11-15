/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlVentanaInicio;
public class VentanaP2 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaP2
     */
    public VentanaP2() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modificar = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        informe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 462));
        getContentPane().setLayout(null);

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar estado de licencias");
        modificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        modificar.setOpaque(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar);
        modificar.setBounds(60, 200, 260, 21);

        pagos.setBackground(new java.awt.Color(255, 255, 255));
        pagos.setText("Administrar Pagos ");
        pagos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pagos.setOpaque(false);
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        getContentPane().add(pagos);
        pagos.setBounds(450, 200, 190, 21);

        informe.setBackground(new java.awt.Color(255, 255, 255));
        informe.setText("Informe del día");
        informe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        informe.setOpaque(false);
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });
        getContentPane().add(informe);
        informe.setBounds(280, 330, 190, 21);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setText("APROVECHAMIENTO AMBIENTAL UMWELT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 60, 450, 24);

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.png"))); // NOI18N
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        login.setOpaque(false);
        login.setSelected(true);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(640, 390, 80, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo2.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(750, 462));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 462);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
       VentanaPagos pag = new VentanaPagos();
       pag.setVisible(true);
       dispose();
    }//GEN-LAST:event_pagosActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
      VentanaModificarEstado mo = new VentanaModificarEstado();
      mo.setVisible(true);
      dispose();
    }//GEN-LAST:event_modificarActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     VentanaInicio vi = new VentanaInicio();
     ControlVentanaInicio cvi = new ControlVentanaInicio(vi);
     vi.setVisible(true);
     dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
       VentanaInforme vi = new VentanaInforme();
       vi.setVisible(true);
       dispose();
    }//GEN-LAST:event_informeActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JButton modificar;
    private javax.swing.JButton pagos;
    // End of variables declaration//GEN-END:variables
}
