/*Programa generador de licencias ambientales
*Date:08/05/2016
*author: Estefany Muriel Cano
 */
package controlador;

import vista.VentanaInicio;

public class Main {
    
    public static void main(String[] args) {
        VentanaInicio vi = new VentanaInicio();
        ControlVentanaInicio cvi = new ControlVentanaInicio(vi);
        cvi.iniciarVista();
        
    }
}
