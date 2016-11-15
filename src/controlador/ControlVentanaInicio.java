/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import vista.*;

public class ControlVentanaInicio implements ActionListener {

    private VentanaInicio vi;
    private VentanaP vp;

    public ControlVentanaInicio(VentanaInicio vi) {
        this.vi = vi;

        vi.getIngresar().addActionListener(this);
        vi.getUsuario().addActionListener(this);
        vi.getContraseña().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vi.getIngresar() == e.getSource()) {
            //Validar que las contraseñas sean correctas.
            if (vi.getUsuario().isSelected() && vi.getUsuari().getText().equals("usuario") && vi.getContraseña().getText().equals("usuario")) {

                VentanaP vp = new VentanaP();
                vp.setVisible(true);
               
                vi.dispose();

            } else if (vi.getEmpleado().isSelected() && vi.getUsuari().getText().equals("empleado") && vi.getContraseña().getText().equals("empleado")) {

                VentanaP2 vp = new VentanaP2();
                vp.setVisible(true);
                
                vi.dispose();

            } else {
                vi.getIngresar().enable(false);
                showMessageDialog(null, "Usuario o contraseña incorrecto, ¡INTENTELO DE NUEVO!");
            }

        }

    }

    public void iniciarVista() {
        vi.setVisible(true);
        vi.pack();
        vi.setTitle("APROVECHAMIENTO AMBIENTAL UMWELT");
        vi.setLocationRelativeTo(null);
    }

}
