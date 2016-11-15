/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlVentanaInicio;
import javax.swing.ImageIcon;
import vista.VentanaInicio;

public class ZonasDisponibles extends javax.swing.JFrame {

    /**
     * Creates new form ZonasDisponibles
     */
    public ZonasDisponibles() {
        initComponents();
        pack();
        setTitle("ZONAS DISPONIBLES PARA SOLICITAR LICENCIA");
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaZonas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRios = new javax.swing.JTable();
        imagen = new javax.swing.JLabel();
        cApapo = new javax.swing.JButton();
        vApapo = new javax.swing.JButton();
        gGuavia = new javax.swing.JButton();
        mGuavia = new javax.swing.JButton();
        atrato = new javax.swing.JButton();
        california = new javax.swing.JButton();
        araracuara = new javax.swing.JButton();
        pacoa = new javax.swing.JButton();
        guacamayas = new javax.swing.JButton();
        yarumales = new javax.swing.JButton();
        carrillo = new javax.swing.JButton();
        pacurita = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ZONAS DISPONIBLES PARA GENERAR LICENCIA AMBIENTAL");

        tablaZonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amazónica", "Caquetá", "Milán", "California", "65%", "40%"},
                {"Amazónica", "Caquetá", "Solano", "Araracuara", "30%", "50%"},
                {"Amazónica", "Vaupés", "Pacoa", "Pacoa", "65%", "60%"},
                {"Orinoquía", "Guaviare", "Mapiripan", "Guacamayas", "50%", "20%"},
                {"Orinoquía", "Guaviare", "San José del Guaviare", "Yarumales", "70%", "35%"},
                {"Pacífica", "Chocó", "Bojayá", "Carrillo", "60%", "60%"},
                {"Pacífica", "Chocó", "Quibdó", "Pacurita", "55%", "45%"}
            },
            new String [] {
                "Región", "Departamento", "Municipio", "Vereda o Corregimiento", "% Disponible Forestal", "% Disponible Mineral"
            }
        ));
        tablaZonas.setRowHeight(22);
        jScrollPane1.setViewportView(tablaZonas);

        jLabel2.setText("Estas son las zonas disponibles para los proyectos Forestales y Minerales.");

        jLabel3.setText("Estos son los ríos disponibles para los proyectos hídricos.");

        tablaRios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amazónica", "Caquetá", "Río Apaporis", "70%"},
                {"Amazónica", "Vaupés", "Río Apaporis", "65%"},
                {"Orinoquía", "Guaviare", "Río Guaviare", "50%"},
                {"Orinoquía", "Meta", "Río Guaviare", "48%"},
                {"Pacífica", "Chocó", "Río Atrato", "70%"}
            },
            new String [] {
                "Región", "Departamento", "Río", "% Disponible"
            }
        ));
        tablaRios.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tablaRios.setRowHeight(22);
        tablaRios.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tablaRios);

        cApapo.setBackground(new java.awt.Color(255, 255, 255));
        cApapo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        cApapo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cApapoActionPerformed(evt);
            }
        });

        vApapo.setBackground(new java.awt.Color(255, 255, 255));
        vApapo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        vApapo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vApapoActionPerformed(evt);
            }
        });

        gGuavia.setBackground(new java.awt.Color(255, 255, 255));
        gGuavia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        gGuavia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gGuaviaActionPerformed(evt);
            }
        });

        mGuavia.setBackground(new java.awt.Color(255, 255, 255));
        mGuavia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        mGuavia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGuaviaActionPerformed(evt);
            }
        });

        atrato.setBackground(new java.awt.Color(255, 255, 255));
        atrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        atrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atratoActionPerformed(evt);
            }
        });

        california.setBackground(new java.awt.Color(255, 255, 255));
        california.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        california.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                californiaActionPerformed(evt);
            }
        });

        araracuara.setBackground(new java.awt.Color(255, 255, 255));
        araracuara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        araracuara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araracuaraActionPerformed(evt);
            }
        });

        pacoa.setBackground(new java.awt.Color(255, 255, 255));
        pacoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        pacoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacoaActionPerformed(evt);
            }
        });

        guacamayas.setBackground(new java.awt.Color(255, 255, 255));
        guacamayas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        guacamayas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guacamayasActionPerformed(evt);
            }
        });

        yarumales.setBackground(new java.awt.Color(255, 255, 255));
        yarumales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        yarumales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yarumalesActionPerformed(evt);
            }
        });

        carrillo.setBackground(new java.awt.Color(255, 255, 255));
        carrillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        carrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrilloActionPerformed(evt);
            }
        });

        pacurita.setBackground(new java.awt.Color(255, 255, 255));
        pacurita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        pacurita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacuritaActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        salir.setText("Salir");
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(california, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(araracuara, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pacoa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guacamayas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yarumales, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pacurita, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vApapo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mGuavia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gGuavia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(atrato, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cApapo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(392, 392, 392))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cApapo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vApapo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gGuavia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mGuavia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(atrato, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(california, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araracuara, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(pacoa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guacamayas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(yarumales, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pacurita, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(36, 36, 36)
                .addComponent(salir)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cApapoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cApapoActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\apaporisc.jpg"));


    }//GEN-LAST:event_cApapoActionPerformed

    private void vApapoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vApapoActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\apaporisv.jpg"));


    }//GEN-LAST:event_vApapoActionPerformed

    private void gGuaviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gGuaviaActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\guaviare.jpg"));
    }//GEN-LAST:event_gGuaviaActionPerformed

    private void mGuaviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGuaviaActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\mguaviare.jpg"));
    }//GEN-LAST:event_mGuaviaActionPerformed

    private void atratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atratoActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\atrato.jpg"));
    }//GEN-LAST:event_atratoActionPerformed

    private void californiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_californiaActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\california.jpg"));
    }//GEN-LAST:event_californiaActionPerformed

    private void araracuaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araracuaraActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\araracuara.jpg"));
    }//GEN-LAST:event_araracuaraActionPerformed

    private void pacoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacoaActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\pacoa.jpg"));
    }//GEN-LAST:event_pacoaActionPerformed

    private void guacamayasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guacamayasActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\guacamayas.jpg"));
    }//GEN-LAST:event_guacamayasActionPerformed

    private void yarumalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yarumalesActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\yarumales.jpg"));
    }//GEN-LAST:event_yarumalesActionPerformed

    private void carrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrilloActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\carrillo.jpg"));
    }//GEN-LAST:event_carrilloActionPerformed

    private void pacuritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacuritaActionPerformed
        imagen.setIcon(new ImageIcon("src\\recursos\\pacurita.jpg"));
    }//GEN-LAST:event_pacuritaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        VentanaP2 vp2 = new VentanaP2();
        VentanaP vp = new VentanaP();
        
        if(vp2.isActive()){
        
        vp2.setVisible(true);
        dispose();
        }else{
        
        vp.setVisible(true);
        dispose();}
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton araracuara;
    private javax.swing.JButton atrato;
    private javax.swing.JButton cApapo;
    private javax.swing.JButton california;
    private javax.swing.JButton carrillo;
    private javax.swing.JButton gGuavia;
    private javax.swing.JButton guacamayas;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mGuavia;
    private javax.swing.JButton pacoa;
    private javax.swing.JButton pacurita;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaRios;
    private javax.swing.JTable tablaZonas;
    private javax.swing.JButton vApapo;
    private javax.swing.JButton yarumales;
    // End of variables declaration//GEN-END:variables
}
