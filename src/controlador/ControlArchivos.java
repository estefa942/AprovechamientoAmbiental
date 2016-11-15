/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author ACER
 */
public class ControlArchivos {
    //Método para obtener los datos de un archivo
     public static LinkedList obtenerDatos(String archivo, int num) {
        String cadena1;
        String cadena2;
        int contador;
        LinkedList datos = new LinkedList();

        try {

            FileInputStream fstream = new FileInputStream(archivo);
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));

            while ((cadena1 = buffer.readLine()) != null) {

                contador = 1;
                StringTokenizer st = new StringTokenizer(cadena1);
                while (st.hasMoreTokens() && contador <= num) {
                    cadena2 = st.nextToken("|");
                    if (contador == num) {
                        datos.add(cadena2);
                    }
                    contador++;

                }

            }

        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return datos;
    }
    //Método para modificar un dato específico del archivo.
     public void ModificarLineaArchivo(String archivo, int linea, int dato, String data) throws IOException {

       try {
            String cadena1;
            String cadena2;
            String cadena3="";
            int contadorl = 0;
            int contadord = 1;
            LinkedList<String> paraGuardar = new LinkedList(); // Almacenamos todas las lineas que no son las que queremos borrar, para despues volverlas a guardar
            
            FileInputStream fstream = new FileInputStream(archivo);
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            while ((cadena1 = buffer.readLine()) != null) {
                if (contadorl == linea) {
                    StringTokenizer st = new StringTokenizer(cadena1);
                    while (st.hasMoreTokens() && contadord <= dato) {
                        cadena2 = st.nextToken("|");
                        if (contadord == dato) {
                            cadena3= cadena3+ "|" +data;
                        } else {
                            cadena3= cadena3+ "|" + cadena2;
                        }
                        contadord++;

                    }
                    paraGuardar.add(cadena3 );
                } else {
                    paraGuardar.add(cadena1);
                }
                contadorl++;

            }
            

            buffer.close();// Cerramos el archivo para lectura

            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i <= paraGuardar.size()+1; i++) {
                writer.write(paraGuardar.poll());
                writer.newLine();
            }

            
            writer.flush();
            writer.close();

        } catch (IOException ex) {
            
        }
        
    }
     //Método para leer los datos del archivo
      
    public ArrayList leerDatos(String archivo) {
        String cadena1; // Guardar lineas
        String cadena2 = null; // Guarda palabra
        String cadena3 = "";
        ArrayList<String> cadena4 = new ArrayList(); // Guarda la linea sin particiones/tokens

        try {

            FileInputStream fstream = new FileInputStream(archivo);
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            int contador=0;

            while ((cadena1 = buffer.readLine()) != null) {
                
                

                StringTokenizer st = new StringTokenizer(cadena1);
                cadena3="";
                while (st.hasMoreTokens()) {
                    cadena2 = st.nextToken(" | ");
                    cadena3 = cadena3 + cadena2 + " ";
                    
                }
                cadena4.add(contador, cadena3);
                contador++;
                
            }

        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return cadena4;
        
    }
    //Método para calcular el total para arqueo de caja
     public long totalArqueo(String archivo) {
        String cadena1; // Guardar lineas
        String cadena2 = null; // Guarda palabra
        long cadena3 = 0;

        try {

            FileInputStream fstream = new FileInputStream(archivo);
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            int contador = 0;

            while ((cadena1 = buffer.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(cadena1);
                
                while (st.hasMoreTokens()) {
                    cadena2 = st.nextToken("|");

                }
                cadena3 = cadena3 +Long.parseLong(cadena2);
                contador++;

            }

        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return cadena3;

    }
         //Para saber cuàntas personas fueron atentidas --Tomado de Angélica Arroyave
      public int lineasArchivo(String archivo) {
        int linea = 0;
        try {
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream(archivo);
            try ( 
                    DataInputStream entrada = new DataInputStream(fstream)) {
                
                BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                String strLinea;
                // Leer el archivo linea por linea
                while ((strLinea = buffer.readLine()) != null) {
                    // Imprimimos la línea por pantalla
                    linea++;
                    if (strLinea.isEmpty()) {
                        System.out.println("La línea esta vacia");
                    }
                }
                // Cerramos el archivo
            }
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return linea;
    }
    
}



