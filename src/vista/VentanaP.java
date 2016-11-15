
package vista;

import controlador.*;
import javax.swing.*;

//Ventana para los usuarios
public class VentanaP extends javax.swing.JFrame {

    

    public VentanaP() {
        initComponents();
        pack();
        setTitle("APROVECHAMIENTO AMBIENTAL UMWELT");
        setLocationRelativeTo(null);
       
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        solicitud = new javax.swing.JButton();
        zonasD = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 233, 220));
        setPreferredSize(new java.awt.Dimension(750, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        solicitud.setBackground(new java.awt.Color(255, 255, 255));
        solicitud.setText("Solicitud de aprovechamiento");
        solicitud.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        solicitud.setOpaque(false);
        solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudActionPerformed(evt);
            }
        });
        getContentPane().add(solicitud);
        solicitud.setBounds(30, 190, 260, 21);

        zonasD.setBackground(new java.awt.Color(255, 255, 255));
        zonasD.setText("Zonas disponibles");
        zonasD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        zonasD.setOpaque(false);
        zonasD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonasDActionPerformed(evt);
            }
        });
        getContentPane().add(zonasD);
        zonasD.setBounds(460, 190, 230, 21);

        consultar.setBackground(new java.awt.Color(255, 255, 255));
        consultar.setText("Consultar estado de licencia");
        consultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        consultar.setOpaque(false);
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        getContentPane().add(consultar);
        consultar.setBounds(240, 320, 238, 21);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 12, 523, 0);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APROVECHAMIENTO AMBIENTAL UMWELT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 40, 446, 37);

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
        login.setBounds(640, 410, 73, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo2.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(750, 467));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudActionPerformed
     FormularioS fs = new FormularioS();
     fs.setVisible(true);
    
            
    }//GEN-LAST:event_solicitudActionPerformed

    private void zonasDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonasDActionPerformed
        ZonasDisponibles zd = new ZonasDisponibles();
        zd.setVisible(true);
        dispose();
    }//GEN-LAST:event_zonasDActionPerformed

    public JButton getConsultar() {
        return consultar;
    }

    public JButton getSolicitud() {
        return solicitud;
    }

    public JButton getZonasD() {
        return zonasD;
    }

   

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       VentanaEstadoLicencia ve = new VentanaEstadoLicencia();
       ve.setVisible(true);
       dispose();
    }//GEN-LAST:event_consultarActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     VentanaInicio vi = new VentanaInicio();
     ControlVentanaInicio cvi = new ControlVentanaInicio(vi);
     vi.setVisible(true);
     dispose();
    }//GEN-LAST:event_loginActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton login;
    private javax.swing.JButton solicitud;
    private javax.swing.JButton zonasD;
    // End of variables declaration//GEN-END:variables
}
