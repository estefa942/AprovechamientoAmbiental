
package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import vista.FormularioS;
import vista.VentanaP;

//Creación del hilo de la barra de progreso
public class ThreadProgress implements Runnable{
    
   private Thread hilo;
    private JProgressBar pbar;
    private int progress = 0;
    private JLabel label;
    private FormularioS vistaFormulario;
    

    public ThreadProgress(JProgressBar bar, JLabel label, FormularioS vista) {
        pbar = bar;
        this.label = label;
        vistaFormulario=vista;
        
        
    }
    
    public void iniciar(){
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            try {
                pbar.setValue(i);
                Thread.sleep(50);
                label.setText("Comprobando...");
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadProgress.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         label.setVisible(false);
         JOptionPane.showMessageDialog(null,
                    "Se ha recibido con éxito",
                    "", JOptionPane.CLOSED_OPTION);
         vistaFormulario.setVisible(false);
        
         
        
    }


}
