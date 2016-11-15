
package vista;

import javax.swing.*;
import controlador.*;
import java.util.ArrayList;
import modelo.Licencia;

public class FormularioS extends javax.swing.JFrame {

  
    private ThreadProgress bar;

    public FormularioS() {
        initComponents();
        pack();
        setTitle("FORMULARIO ÚNICO DE SOLICITUD DE LICENCIA AMBIENTAL");
        setLocationRelativeTo(null);
        estado.setVisible(false);
        pago.setVisible(false);
        bar = new ThreadProgress(this.progreso,comprobando, this);//llamado del hilo para la barra de progreso
        

    }

    public JButton getEnviar() {
        return enviar;
    }

    public JTextField getNombreS() {
        return nombreS;
    }

    public JRadioButton getCcS() {
        return ccS;
    }

    public JTextField getCorreo() {
        return correo;
    }

    public JTextField getIdentiS() {
        return identiS;
    }

    public JTextField getIdentifR() {
        return identifR;
    }

    public JRadioButton getNitS() {
        return nitS;
    }

    public JTextField getRepresentante() {
        return representante;
    }

    public JTextField getDirección() {
        return direccion;
    }

    public JTextField getTelef() {
        return telef;
    }

    public JRadioButton getForestal() {
        return forestal;
    }

    public JRadioButton getHidrico() {
        return hidrico;
    }

    public JRadioButton getMineral() {
        return mineral;
    }

    public JTextField getNomProyecto() {
        return nomProyecto;
    }

    public JTextField getTipoProyec() {
        return tipoProyec;
    }

    public JTextField getValorEsti() {
        return valorEsti;
    }

    public JRadioButton getAmazonia() {
        return amazonia;
    }

    public JComboBox<String> getDepartamentos() {
        return departamentos;
    }

    public JComboBox<String> getMunicipios() {
        return municipios;
    }

    public JRadioButton getOrinoquia() {
        return orinoquia;
    }

    public JRadioButton getPacif() {
        return pacif;
    }

    public JComboBox<String> getRios() {
        return rios;
    }

    public JComboBox<String> getVeredas() {
        return veredas;
    }

  
    public ButtonGroup getDocumentos() {
        return documentos;
    }

    public ButtonGroup getRegiones() {
        return regiones;
    }

    public ButtonGroup getSector() {
        return sector;
    }

    public JTextField getDireccion() {
        return direccion;
    }

    public JTextField getEstado() {
        return estado;
    }

    public JTextField getPago() {
        return pago;
    }

    public Object getProgreso() {
        return progreso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documentos = new javax.swing.ButtonGroup();
        sector = new javax.swing.ButtonGroup();
        regiones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        nombreS = new javax.swing.JTextField();
        tip = new javax.swing.JLabel();
        ccS = new javax.swing.JRadioButton();
        nitS = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        identiS = new javax.swing.JTextField();
        telef = new javax.swing.JTextField();
        te = new javax.swing.JLabel();
        repre = new javax.swing.JLabel();
        representante = new javax.swing.JTextField();
        numr = new javax.swing.JLabel();
        identifR = new javax.swing.JTextField();
        datosp = new javax.swing.JLabel();
        np = new javax.swing.JLabel();
        nomProyecto = new javax.swing.JTextField();
        sect = new javax.swing.JLabel();
        hidrico = new javax.swing.JRadioButton();
        forestal = new javax.swing.JRadioButton();
        mineral = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        tipo = new javax.swing.JLabel();
        tipoProyec = new javax.swing.JTextField();
        cor = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        dire = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        valo = new javax.swing.JLabel();
        valorEsti = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label1 = new java.awt.Label();
        re = new javax.swing.JLabel();
        pacif = new javax.swing.JRadioButton();
        orinoquia = new javax.swing.JRadioButton();
        amazonia = new javax.swing.JRadioButton();
        depa = new javax.swing.JLabel();
        muni = new javax.swing.JLabel();
        vere = new javax.swing.JLabel();
        departamentos = new javax.swing.JComboBox<>();
        municipios = new javax.swing.JComboBox<>();
        veredas = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        rio = new javax.swing.JLabel();
        rios = new javax.swing.JComboBox<>();
        estado = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        progreso = new javax.swing.JProgressBar();
        comprobando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO UNICO DE SOLICITUD DE LICENCIA AMBIENTAL");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1368, 741));

        jLabel2.setBackground(new java.awt.Color(51, 255, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("DATOS DEL SOLICITANTE:");

        nom.setText("Nombre o Razón Social: ");

        nombreS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreSKeyTyped(evt);
            }
        });

        tip.setText("Tipo de identificacion: ");

        documentos.add(ccS);
        ccS.setText("C.C");
        ccS.setOpaque(false);

        documentos.add(nitS);
        nitS.setText("NIT");
        nitS.setOpaque(false);

        jLabel6.setText("Número:");

        identiS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identiSKeyTyped(evt);
            }
        });

        telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefKeyTyped(evt);
            }
        });

        te.setText("Teléfono:");

        repre.setText("Representante Legal:");

        representante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                representanteKeyTyped(evt);
            }
        });

        numr.setText("Número de identificación:");

        identifR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identifRKeyTyped(evt);
            }
        });

        datosp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datosp.setText("DATOS DEL PROYECTO:");

        np.setText("Nombre del proyecto: ");

        nomProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomProyectoKeyTyped(evt);
            }
        });

        sect.setText("Sector: ");

        sector.add(hidrico);
        hidrico.setText("Hidrico");
        hidrico.setOpaque(false);
        hidrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidricoActionPerformed(evt);
            }
        });

        sector.add(forestal);
        forestal.setText("Forestal");
        forestal.setOpaque(false);
        forestal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forestalActionPerformed(evt);
            }
        });

        sector.add(mineral);
        mineral.setText("Mineral");
        mineral.setOpaque(false);
        mineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineralActionPerformed(evt);
            }
        });

        tipo.setText("Tipo de proyecto, obra o actividad:");

        tipoProyec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoProyecKeyTyped(evt);
            }
        });

        cor.setText("Correo electrónico:");

        dire.setText("Dirección de notificación:");

        valo.setText("Valor estimado del proyecto:             $");

        valorEsti.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label1.setText("LOCALIZACIÓN DEL PROYECTO:");

        re.setText("Región:");

        regiones.add(pacif);
        pacif.setText("Pacífica");
        pacif.setOpaque(false);
        pacif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacifActionPerformed(evt);
            }
        });

        regiones.add(orinoquia);
        orinoquia.setText("Orinoquía");
        orinoquia.setOpaque(false);
        orinoquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orinoquiaActionPerformed(evt);
            }
        });

        regiones.add(amazonia);
        amazonia.setText("Amazonía");
        amazonia.setOpaque(false);
        amazonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amazoniaActionPerformed(evt);
            }
        });

        depa.setText("Departamento:");

        muni.setText("Municipio:");

        vere.setText("Vereda o Corregimiento:");

        departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione--" }));
        departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosActionPerformed(evt);
            }
        });

        municipios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione---" }));
        municipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipiosActionPerformed(evt);
            }
        });

        veredas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione---" }));

        rio.setText("Ríos:");

        estado.setText("Recibido");

        pago.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipo)
                        .addGap(18, 18, 18)
                        .addComponent(tipoProyec, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorEsti, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(re)
                            .addComponent(depa)
                            .addComponent(muni)
                            .addComponent(vere))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pacif)
                                .addGap(47, 47, 47)
                                .addComponent(orinoquia)
                                .addGap(40, 40, 40)
                                .addComponent(amazonia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(veredas, javax.swing.GroupLayout.Alignment.LEADING, 0, 138, Short.MAX_VALUE)
                                    .addComponent(municipios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(departamentos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addComponent(rio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rios, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tip)
                            .addComponent(te)
                            .addComponent(repre)
                            .addComponent(dire))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(representante, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(telef, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correo))
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ccS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nitS)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(identiS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom)
                            .addComponent(numr))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(identifR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(datosp)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sect)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hidrico)
                                    .addComponent(np))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(forestal)
                                        .addGap(120, 120, 120)
                                        .addComponent(mineral))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(nomProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(667, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tip)
                    .addComponent(ccS)
                    .addComponent(nitS)
                    .addComponent(identiS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(te)
                    .addComponent(telef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cor)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dire)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repre)
                    .addComponent(representante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numr)
                    .addComponent(identifR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(np)
                    .addComponent(nomProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hidrico)
                    .addComponent(forestal)
                    .addComponent(mineral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo)
                    .addComponent(tipoProyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valo)
                    .addComponent(valorEsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(re)
                    .addComponent(pacif)
                    .addComponent(orinoquia)
                    .addComponent(amazonia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depa)
                    .addComponent(departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rio)
                    .addComponent(rios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muni)
                    .addComponent(municipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vere)
                    .addComponent(veredas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 168, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        enviar.setText("Enviar");
        enviar.setOpaque(false);
        enviar.setSelected(true);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.setOpaque(false);
        cancelar.setSelected(true);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        progreso.setForeground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comprobando, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(enviar)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enviar)
                        .addComponent(cancelar)
                        .addComponent(comprobando))
                    .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Modificación de los combobox de acuerdo a cada departamento y región
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

       bar.iniciar();//Iniciar el hilo para la barra de progreso
        ControlFormularioS guard = new ControlFormularioS(this);
        //Llama un objeto licencia para enviarle los parámetros y crear los tres archivos necesarios.
        Licencia l;

        l = guard.GuardarInfoSolic(nombreS, documentos, identiS, telef, correo, direccion,
                representante, identifR, nomProyecto, sector, tipoProyec, valorEsti, regiones,
                rios, departamentos, municipios, veredas);
       
        guard.guardarEnArchivo(l);
        guard.guardarPagos(l);
        guard.guardarEstado(l);
        


    }//GEN-LAST:event_enviarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        VentanaP vp = new VentanaP();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void municipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipiosActionPerformed
        int txt = municipios.getSelectedIndex();
        int texto = departamentos.getSelectedIndex();
        veredas.removeAllItems();
        veredas.addItem("Seleccione---");
        if (txt == 1 && pacif.isSelected()) {
            veredas.addItem("Pacurita");
        } else if (txt == 2 && pacif.isSelected()) {
            veredas.addItem("Carrillo");
        } else if (txt == 1 && orinoquia.isSelected()) {
            veredas.addItem("Yarumales");
        } else if (txt == 2 && orinoquia.isSelected()) {
            veredas.addItem("Guacamayas");
        } else if (txt == 1 && texto == 1 && amazonia.isSelected()) {
            veredas.addItem("California");
        } else if (txt == 2 && amazonia.isSelected()) {
            veredas.addItem("Araracuara");
        } else if (txt == 1 && amazonia.isSelected()) {
            veredas.addItem("Pacoa");
        }

    }//GEN-LAST:event_municipiosActionPerformed
private void hidricoActionPerformed(java.awt.event.ActionEvent evt) {
        if (hidrico.isSelected()) {
            muni.setVisible(false);
            municipios.setVisible(false);
            vere.setVisible(false);
            veredas.setVisible(false);
            rio.setVisible(true);
            rios.setVisible(true);

        }

    }
    private void departamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosActionPerformed
        int texto = departamentos.getSelectedIndex();
        municipios.removeAllItems();
        municipios.addItem("Seleccione---");

        if (texto == 1 && pacif.isSelected()) {
            municipios.addItem("Quibdó");
            municipios.addItem("Bojayá");
        } else if (texto == 1 && orinoquia.isSelected()) {
            municipios.addItem("San José del Guaviare");
        } else if (texto == 2 && orinoquia.isSelected()) {
            municipios.addItem("Mapiripan");
        } else if (texto == 1 && amazonia.isSelected()) {
            municipios.addItem("Milán");
            municipios.addItem("Solano");
        } else if (texto == 2 && amazonia.isSelected()) {
            municipios.addItem("Pacoa");
        }
        rios.removeAllItems();
        rios.addItem("Seleccione---");
        if (pacif.isSelected() && hidrico.isSelected()) {
            rios.addItem("Río Atrato");
        } else if (orinoquia.isSelected()) {
            rios.addItem("Río Guaviare");
        } else if (amazonia.isSelected()) {
            rios.addItem("Río Apaporis");
        }
    }//GEN-LAST:event_departamentosActionPerformed

    private void amazoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amazoniaActionPerformed
        if (amazonia.isSelected()) {
            departamentos.removeAllItems();
            departamentos.addItem("Seleccione");
            departamentos.addItem("Caquetá");
            departamentos.addItem("Vaupés");

        }
    }//GEN-LAST:event_amazoniaActionPerformed

    private void orinoquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orinoquiaActionPerformed
        if (orinoquia.isSelected()) {
            departamentos.removeAllItems();
            departamentos.addItem("Seleccione");
            departamentos.addItem("Guaviare");
            departamentos.addItem("Meta");

        }
    }//GEN-LAST:event_orinoquiaActionPerformed

    private void pacifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacifActionPerformed
        if (pacif.isSelected()) {
            departamentos.removeAllItems();
            departamentos.addItem("Seleccione");
            departamentos.addItem("Chocó");

        }

    }//GEN-LAST:event_pacifActionPerformed

    private void tipoProyecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoProyecKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tipoProyecKeyTyped

    private void mineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineralActionPerformed
        if (mineral.isSelected()) {
            muni.setVisible(true);
            municipios.setVisible(true);
            vere.setVisible(true);
            veredas.setVisible(true);
            rio.setVisible(false);
            rios.setVisible(false);

        }
    }//GEN-LAST:event_mineralActionPerformed

    private void forestalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forestalActionPerformed
        if (forestal.isSelected()) {
            muni.setVisible(true);
            municipios.setVisible(true);
            vere.setVisible(true);
            veredas.setVisible(true);
            rio.setVisible(false);
            rios.setVisible(false);

        }
    }//GEN-LAST:event_forestalActionPerformed

//GEN-FIRST:event_hidricoActionPerformed
  
//GEN-LAST:event_hidricoActionPerformed

    private void nomProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomProyectoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nomProyectoKeyTyped

    private void identifRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identifRKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_identifRKeyTyped

    private void representanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_representanteKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_representanteKeyTyped

    private void telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_telefKeyTyped

    private void identiSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identiSKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_identiSKeyTyped

//Validaciones para los campos del formulario.
    private void nombreSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreSKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nombreSKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amazonia;
    private javax.swing.JButton cancelar;
    private javax.swing.JRadioButton ccS;
    private javax.swing.JLabel comprobando;
    private javax.swing.JLabel cor;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel datosp;
    private javax.swing.JLabel depa;
    private javax.swing.JComboBox<String> departamentos;
    private javax.swing.JLabel dire;
    private javax.swing.JTextField direccion;
    private javax.swing.ButtonGroup documentos;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField estado;
    private javax.swing.JRadioButton forestal;
    private javax.swing.JRadioButton hidrico;
    private javax.swing.JTextField identiS;
    private javax.swing.JTextField identifR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Label label1;
    private javax.swing.JRadioButton mineral;
    private javax.swing.JLabel muni;
    private javax.swing.JComboBox<String> municipios;
    private javax.swing.JRadioButton nitS;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField nomProyecto;
    private javax.swing.JTextField nombreS;
    private javax.swing.JLabel np;
    private javax.swing.JLabel numr;
    private javax.swing.JRadioButton orinoquia;
    private javax.swing.JRadioButton pacif;
    private javax.swing.JTextField pago;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel re;
    private javax.swing.ButtonGroup regiones;
    private javax.swing.JLabel repre;
    private javax.swing.JTextField representante;
    private javax.swing.JLabel rio;
    private javax.swing.JComboBox<String> rios;
    private javax.swing.JLabel sect;
    private javax.swing.ButtonGroup sector;
    private javax.swing.JLabel te;
    private javax.swing.JTextField telef;
    private javax.swing.JLabel tip;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField tipoProyec;
    private javax.swing.JLabel valo;
    private javax.swing.JTextField valorEsti;
    private javax.swing.JLabel vere;
    private javax.swing.JComboBox<String> veredas;
    // End of variables declaration//GEN-END:variables
}
