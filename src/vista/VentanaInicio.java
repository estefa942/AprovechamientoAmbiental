
package vista;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("APROVECHAMIENTO AMBIENTAL UMWELT");
    }

    public JPasswordField getContraseña() {
        return contraseña;
    }

    public JRadioButton getEmpleado() {
        return empleado;
    }

    public JButton getIngresar() {
        return ingresar;
    }

    public JTextField getUsuari() {
        return usuari;
    }

    public JRadioButton getUsuario() {
        return usuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoU = new javax.swing.ButtonGroup();
        empleado = new javax.swing.JRadioButton();
        usuario = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tipoU.add(empleado);
        empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setText("Empleado");
        empleado.setOpaque(false);

        tipoU.add(usuario);
        usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setOpaque(false);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APROVECHAMIENTO AMBIENTAL UMWELT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(usuari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(empleado))
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(usuario))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(fondo)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(usuari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(empleado))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(usuario))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(ingresar))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2))
            .addComponent(fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
      
    }//GEN-LAST:event_ingresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JRadioButton empleado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup tipoU;
    private javax.swing.JTextField usuari;
    private javax.swing.JRadioButton usuario;
    // End of variables declaration//GEN-END:variables
}
