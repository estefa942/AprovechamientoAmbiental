
package vista;

import controlador.ControlArchivos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaModificarEstado extends javax.swing.JFrame {
    ControlArchivos ca = new ControlArchivos();
    public VentanaModificarEstado() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("MODIFICAR ESTADO DE LAS LICENCIAS RECIBIDAS");
        ArrayList combo = ca.leerDatos("src\\Modelo\\EstadoSolicitudes.txt");
        asignarDatos(combo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        licencias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        estados = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        solicitud = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Licencias recibidas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODIFICAR ESTADO DE LAS LICENCIAS RECIBIDAS");

        jLabel3.setText("Modificar estado de licencia a:");

        estados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione----", "En estudio", "Liquidado", "Aprobado", "Rechazado" }));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        guardar.setOpaque(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        solicitud.setBackground(new java.awt.Color(255, 255, 255));
        solicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        solicitud.setText("Solicitudes");
        solicitud.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        solicitud.setOpaque(false);
        solicitud.setSelected(true);
        solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        salir.setText("Finalizar");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        salir.setOpaque(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(solicitud))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(licencias, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(solicitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(licencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(salir))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ControlArchivos ca = new ControlArchivos();
//modificar el archivo ya existen, con el nuevo estado adquirido
        try {
            ca.ModificarLineaArchivo("src\\Modelo\\EstadoSolicitudes.txt", licencias.getSelectedIndex(), 5, estados.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(VentanaModificarEstado.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Estado modificado con éxito");
       
        
    }//GEN-LAST:event_guardarActionPerformed

    private void solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudActionPerformed
       VentanaInforme vi = new VentanaInforme();
       vi.getSalir().setVisible(false);
       vi.getSalir2().setVisible(true);
       vi.setVisible(true);
    }//GEN-LAST:event_solicitudActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        VentanaP2 vp = new VentanaP2();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed
//asigna los datos al combobox, para que muestre las licencias.
  private void asignarDatos(ArrayList combo) {

        int contador = 0;
        licencias.removeAllItems();
        if (!combo.isEmpty()) {

            for (Object combo1 : combo) {
                licencias.addItem((String) combo1);
                contador++;
                
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> estados;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> licencias;
    private javax.swing.JButton salir;
    private javax.swing.JButton solicitud;
    // End of variables declaration//GEN-END:variables
}
