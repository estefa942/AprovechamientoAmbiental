
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import vista.FormularioS;
import vista.VentanaP;
import modelo.Licencia;

public class ControlFormularioS implements ActionListener {

    private FormularioS fs;
    private Licencia liceDatos;

    public ControlFormularioS(FormularioS fS) {
        this.fs = fS;
        fS.getEnviar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fs.getEnviar() == e.getSource()) {

            Licencia l = new Licencia();

            this.guardarEnArchivo(l);
            VentanaP vp = new VentanaP();
            vp.setVisible(true);

        }

    }
//Obtener los datos del formulario y modificar el bean de la licencia
    public Licencia GuardarInfoSolic(JTextField nombreS, ButtonGroup documentos, JTextField identiS, JTextField telef,
            JTextField correo, JTextField direccion, JTextField representante, JTextField identifR, JTextField nomProyecto,
            ButtonGroup sector, JTextField tipoProyec, JTextField valorEsti, ButtonGroup regiones, JComboBox rios,
            JComboBox departamentos, JComboBox municipios, JComboBox veredas) {

        Licencia l = new Licencia();
        try {
            l.setNombre(nombreS.getText());
            l.setTipoD(validarSeleccionRButton(documentos));
            l.setIdentificacion(identiS.getText());
            l.setTelefono(telef.getText());
            l.setCorreo(correo.getText());
            l.setDireccion(direccion.getText());
            l.setRepresentante(representante.getText());
            l.setIdentiR(identifR.getText());
            l.setNombreP(nomProyecto.getText());
            l.setSector(validarSeleccionRButton(sector));
            l.setTipoProyecto(tipoProyec.getText());
            l.setValor(valorEsti.getText());
            l.setRegion(validarSeleccionRButton(regiones));
            l.setRio(rios.getSelectedItem().toString());
            l.setDepartamento(departamentos.getSelectedItem().toString());
            l.setMunicipio(municipios.getSelectedItem().toString());
            l.setVereda(veredas.getSelectedItem().toString());
          

        } catch (Exception e) {

        }
        return l;

    }
//Guardar informe de las licencias

    public void guardarEnArchivo(Licencia l) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src\\Modelo\\SolicitudesLicencias.txt", true);
            pw = new PrintWriter(fichero);

            pw.println(" -----------------Solicitud de Licencia-------------------");
            pw.println();
            pw.println("DATOS DEL SOLICITANTE");
            pw.println();
            pw.println("Nombre o Razón social: " + l.getNombre());
            pw.print("Tipo de identificacion: " + l.getTipoD() + "   ");
            pw.println("Número: " + l.getIdentificacion());
            pw.println("Teléfono: " + l.getTelefono());
            pw.println("Representante Legal: " + l.getRepresentante());
            pw.println("Número de identificación: " + l.getIdentiR());
            pw.println();
            pw.println("DATOS PROYECTO");
            pw.println();
            pw.println("Nombre del proyecto: " + l.getNombreP());
            pw.println("Sector: " + l.getSector());
            pw.println("Tipo de proyecto, obra o actividad: " + l.getTipoProyecto());
            pw.println("Valor estimado del proyecto: " + l.getValor());
            pw.println();
            pw.println("LOCALIZACIÓN DEL PROYECTO");
            pw.println();
            pw.println("Region: " + l.getRegion());
            if (!l.getSector().equals("Forestal") && !l.getSector().equals("Mineral")) {
                pw.println("Rio:" + l.getRio());
            }
            pw.println("Departamento: " + l.getDepartamento());
            if (!l.getSector().equals("Hidrico")) {
                pw.println("Municipio: " + l.getMunicipio());
                pw.println("Vereda o corregimiento: " + l.getVereda());
            }

            pw.println("");
            pw.close();
            fichero.close();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }

    //Guardar para luego modificar los pagos
    public void guardarPagos(Licencia l) {
        FileWriter fichero = null;
        PrintWriter tk = null;
        try {
            fichero = new FileWriter("src\\Modelo\\PagoLicencias.txt", true);
            tk = new PrintWriter(fichero);
            tk.println(l.getNombre() + "|" + l.getPago());
            tk.close();
            fichero.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Guardar estado de la solicitud

    public void guardarEstado(Licencia l) {
        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("src\\Modelo\\EstadoSolicitudes.txt", true);
            es = new PrintWriter(fichero);
            es.println(l.getNombre() + "|" + l.getIdentificacion() + "|" + l.getNombreP() + "|" + l.getSector() + "|" + l.getEstado());
            es.close();
            fichero.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Tomado de Sebastian Pelaez
    public String validarSeleccionRButton(ButtonGroup btnGroup) {
        String retorno = "";
        for (Enumeration e = btnGroup.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == btnGroup.getSelection()) {
                return b.getText();
            }
        }
        return retorno;
    }
  

}
