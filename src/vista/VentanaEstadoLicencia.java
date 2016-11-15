
package vista;

import controlador.ControlArchivos;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


public class VentanaEstadoLicencia extends javax.swing.JFrame {
private ControlArchivos ca;
//Creación de lista ligadas para guardas los datos del archivo de estado.
private LinkedList nombres;
private LinkedList identificacion;
private LinkedList proyectos;
private LinkedList sector;
private LinkedList estados;
private LinkedList nuevoEstado;

    public VentanaEstadoLicencia() {
         setLocationRelativeTo(null);
         ca= new ControlArchivos(); 
          initComponents();
     
        setTitle("ESTADO ACTUALIZADO DE LAS LICENCIAS SOLICITADAS");
        
         initComponents();
        //Llevar datos a la lista
       nombres= ca.obtenerDatos("src//modelo//EstadoSolicitudes.txt",1);
       identificacion= ca.obtenerDatos("src//modelo//EstadoSolicitudes.txt", 2);
       proyectos= ca.obtenerDatos("src//modelo//EstadoSolicitudes.txt", 3);
       sector = ca.obtenerDatos("src//modelo//EstadoSolicitudes.txt", 4);
       estados = ca.obtenerDatos("src//modelo//EstadoSolicitudes.txt", 5);
     //Llenar tabla con los datos del archivo
   while(!nombres.isEmpty()){
      
          DefaultTableModel model = (DefaultTableModel) mostrar.getModel();
                    model.addRow(new Object[]{nombres.poll(),identificacion.poll(),proyectos.poll(),sector.poll(),estados.poll()});
               
   }    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTable();
        regresar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO ACTUALIZADO DE LAS LICENCIAS SOLICITADAS");

        jLabel2.setText("Por favor busque su nombre, y verifique en que estado se encuentra su licencia.");

        mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Proyecto", "Sector", "Estado"
            }
        ));
        jScrollPane3.setViewportView(mostrar);

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        regresar.setText("Regresar");
        regresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        regresar.setOpaque(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(regresar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       VentanaP vp = new VentanaP();
       vp.setVisible(true);
       dispose();
    }//GEN-LAST:event_regresarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable mostrar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
