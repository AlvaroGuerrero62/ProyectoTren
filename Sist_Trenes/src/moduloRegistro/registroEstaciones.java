/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moduloRegistro;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class registroEstaciones extends javax.swing.JFrame {

    
    /**
     * Creates new form menuReserva
     */
    public registroEstaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelFondo = new javax.swing.JPanel();
        jPnlNavBar = new javax.swing.JPanel();
        jlblTituloRegistroTrenes = new javax.swing.JLabel();
        jbtnMenuDesplegable = new javax.swing.JButton();
        jPnlInfoRegRecorridos = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDatosTren = new javax.swing.JTable();
        jlblUbicacion = new javax.swing.JLabel();
        jlblHSalida = new javax.swing.JLabel();
        jbtnGuardarDatosTren = new javax.swing.JButton();
        jbtnModificarDatosTren = new javax.swing.JButton();
        jbtnEliminarDatosTren = new javax.swing.JButton();
        jbtnLimpiarTren = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtxtHSalida = new javax.swing.JTextPane();
        jlblHEntrada = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtxtHEntrada = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtxtUbicacion = new javax.swing.JTextPane();
        jlblIDEstacion = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtxtIDEstacion = new javax.swing.JTextPane();
        jPnlMenuRecorrido = new javax.swing.JPanel();
        jBtnHome = new javax.swing.JButton();
        jBtnReportes = new javax.swing.JButton();
        jBtnReservarEspacio = new javax.swing.JButton();
        jBtnConsulta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBtnRegRecorrido = new javax.swing.JButton();
        jBtnRegFuncionario = new javax.swing.JButton();
        jBtnRecorrido = new javax.swing.JButton();
        jBtnRegTrenes = new javax.swing.JButton();
        jBtnRegEstaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanelFondo.setLayout(new java.awt.GridBagLayout());

        jPnlNavBar.setBackground(new java.awt.Color(0, 102, 204));
        jPnlNavBar.setToolTipText("");
        jPnlNavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTituloRegistroTrenes.setBackground(new java.awt.Color(0, 0, 0));
        jlblTituloRegistroTrenes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTituloRegistroTrenes.setForeground(new java.awt.Color(0, 0, 0));
        jlblTituloRegistroTrenes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlNavBar.add(jlblTituloRegistroTrenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 240, 20));

        jbtnMenuDesplegable.setBackground(new java.awt.Color(255, 255, 255));
        jbtnMenuDesplegable.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMenuDesplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/List_26px.png"))); // NOI18N
        jbtnMenuDesplegable.setToolTipText("Menú Registro");
        jbtnMenuDesplegable.setFocusable(false);
        jbtnMenuDesplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuDesplegableActionPerformed(evt);
            }
        });
        jPnlNavBar.add(jbtnMenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 343;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(7, 8, 3, 5);
        jPanelFondo.add(jPnlNavBar, gridBagConstraints);

        jPnlInfoRegRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        jPnlInfoRegRecorridos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDatosTren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID de Estación", "Ubicación", "Horario de Salida", "Horario de Entrada"
            }
        ));
        jScrollPane5.setViewportView(jTableDatosTren);

        jPanelOpciones.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 220));

        jPnlInfoRegRecorridos.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 800, 220));

        jlblUbicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUbicacion.setForeground(new java.awt.Color(0, 0, 0));
        jlblUbicacion.setText("Ubicación:");
        jPnlInfoRegRecorridos.add(jlblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 29));

        jlblHSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHSalida.setForeground(new java.awt.Color(0, 0, 0));
        jlblHSalida.setText("Horario de Salida:");
        jPnlInfoRegRecorridos.add(jlblHSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 130, 20));

        jbtnGuardarDatosTren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save Archive_26px.png"))); // NOI18N
        jbtnGuardarDatosTren.setText("Guardar");
        jbtnGuardarDatosTren.setFocusable(false);
        jbtnGuardarDatosTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarDatosTrenActionPerformed(evt);
            }
        });
        jPnlInfoRegRecorridos.add(jbtnGuardarDatosTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, -1));

        jbtnModificarDatosTren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit File_26px.png"))); // NOI18N
        jbtnModificarDatosTren.setText("Modificar");
        jbtnModificarDatosTren.setFocusable(false);
        jbtnModificarDatosTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarDatosTrenActionPerformed(evt);
            }
        });
        jPnlInfoRegRecorridos.add(jbtnModificarDatosTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 130, -1));

        jbtnEliminarDatosTren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trash_26px.png"))); // NOI18N
        jbtnEliminarDatosTren.setText("Eliminar");
        jbtnEliminarDatosTren.setFocusable(false);
        jbtnEliminarDatosTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarDatosTrenActionPerformed(evt);
            }
        });
        jPnlInfoRegRecorridos.add(jbtnEliminarDatosTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 120, -1));

        jbtnLimpiarTren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disposal_26px.png"))); // NOI18N
        jbtnLimpiarTren.setToolTipText("Limpiar información");
        jPnlInfoRegRecorridos.add(jbtnLimpiarTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 40, -1));

        jScrollPane6.setViewportView(jtxtHSalida);

        jPnlInfoRegRecorridos.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 250, -1));

        jlblHEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHEntrada.setForeground(new java.awt.Color(0, 0, 0));
        jlblHEntrada.setText("Horario de Entrada:");
        jPnlInfoRegRecorridos.add(jlblHEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        jScrollPane7.setViewportView(jtxtHEntrada);

        jPnlInfoRegRecorridos.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 250, -1));

        jScrollPane8.setViewportView(jtxtUbicacion);

        jPnlInfoRegRecorridos.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 250, -1));

        jlblIDEstacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblIDEstacion.setForeground(new java.awt.Color(0, 0, 0));
        jlblIDEstacion.setText("ID de Estación:");
        jPnlInfoRegRecorridos.add(jlblIDEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 29));

        jScrollPane9.setViewportView(jtxtIDEstacion);

        jPnlInfoRegRecorridos.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 250, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.weightx = 1.9;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(75, 18, 19, 0);
        jPanelFondo.add(jPnlInfoRegRecorridos, gridBagConstraints);

        jBtnHome.setBackground(new java.awt.Color(204, 204, 204));
        jBtnHome.setForeground(new java.awt.Color(91, 91, 91));
        jBtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dog House_26px.png"))); // NOI18N
        jBtnHome.setText("INICIO");
        jBtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnHome.setFocusable(false);
        jBtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHomeActionPerformed(evt);
            }
        });

        jBtnReportes.setBackground(new java.awt.Color(204, 204, 204));
        jBtnReportes.setForeground(new java.awt.Color(91, 91, 91));
        jBtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/System Report_26px.png"))); // NOI18N
        jBtnReportes.setText("REPORTES");
        jBtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReportes.setFocusable(false);

        jBtnReservarEspacio.setBackground(new java.awt.Color(204, 204, 204));
        jBtnReservarEspacio.setForeground(new java.awt.Color(91, 91, 91));
        jBtnReservarEspacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Train Ticket_26px.png"))); // NOI18N
        jBtnReservarEspacio.setText("Reserva Espacio");
        jBtnReservarEspacio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReservarEspacio.setFocusable(false);
        jBtnReservarEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReservarEspacioActionPerformed(evt);
            }
        });

        jBtnConsulta.setBackground(new java.awt.Color(204, 204, 204));
        jBtnConsulta.setForeground(new java.awt.Color(91, 91, 91));
        jBtnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Questions_26px.png"))); // NOI18N
        jBtnConsulta.setText("CONSULTAS");
        jBtnConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnConsulta.setFocusable(false);
        jBtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaActionPerformed(evt);
            }
        });

        jBtnRegRecorrido.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegRecorrido.setForeground(new java.awt.Color(91, 91, 91));
        jBtnRegRecorrido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tracks_26px.png"))); // NOI18N
        jBtnRegRecorrido.setText("Registrar Recorrido");
        jBtnRegRecorrido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegRecorrido.setFocusable(false);
        jBtnRegRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegRecorridoActionPerformed(evt);
            }
        });

        jBtnRegFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegFuncionario.setForeground(new java.awt.Color(91, 91, 91));
        jBtnRegFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Collaborator Male_26px.png"))); // NOI18N
        jBtnRegFuncionario.setText("Registro de Maquinistas");
        jBtnRegFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegFuncionario.setFocusable(false);
        jBtnRegFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegFuncionarioActionPerformed(evt);
            }
        });

        jBtnRecorrido.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRecorrido.setForeground(new java.awt.Color(91, 91, 91));
        jBtnRecorrido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Place_Marker_26px_1.png"))); // NOI18N
        jBtnRecorrido.setText("RECORRIDOS");
        jBtnRecorrido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRecorrido.setFocusable(false);
        jBtnRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecorridoActionPerformed(evt);
            }
        });

        jBtnRegTrenes.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegTrenes.setForeground(new java.awt.Color(91, 91, 91));
        jBtnRegTrenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Train_26px.png"))); // NOI18N
        jBtnRegTrenes.setText("Registrar Trenes");
        jBtnRegTrenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegTrenes.setFocusable(false);
        jBtnRegTrenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegTrenesActionPerformed(evt);
            }
        });

        jBtnRegEstaciones.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegEstaciones.setForeground(new java.awt.Color(91, 91, 91));
        jBtnRegEstaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Railway Station_26px.png"))); // NOI18N
        jBtnRegEstaciones.setText("Registrar Estaciones");
        jBtnRegEstaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegEstaciones.setFocusable(false);
        jBtnRegEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegEstacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlMenuRecorridoLayout = new javax.swing.GroupLayout(jPnlMenuRecorrido);
        jPnlMenuRecorrido.setLayout(jPnlMenuRecorridoLayout);
        jPnlMenuRecorridoLayout.setHorizontalGroup(
            jPnlMenuRecorridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnReservarEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jBtnRegRecorrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnRegFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnRecorrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnRegTrenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnRegEstaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPnlMenuRecorridoLayout.setVerticalGroup(
            jPnlMenuRecorridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlMenuRecorridoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnReservarEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jBtnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRegFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnRegTrenes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnRegRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnRegEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 5);
        jPanelFondo.add(jPnlMenuRecorrido, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMenuDesplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuDesplegableActionPerformed
        // TODO add your handling code here:
        int posicion = this.jPnlMenuRecorrido.getX();
        if(posicion > -1)
        {
        Animacion.Animacion.mover_izquierda(0, -210, 2, 2, jPnlMenuRecorrido);
        }
        else
        {
        Animacion.Animacion.mover_derecha(-210, 12, 2, 2, jPnlMenuRecorrido);
        }
    }//GEN-LAST:event_jbtnMenuDesplegableActionPerformed

    private void jBtnReservarEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReservarEspacioActionPerformed
        moduloServicio.menuReserva Reserva = new  moduloServicio.menuReserva();
        Reserva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnReservarEspacioActionPerformed

    private void jBtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaActionPerformed
        moduloServicio.menuConsulta Consulta = new  moduloServicio.menuConsulta();
        Consulta.setVisible(true);
        this.setVisible(false);
        moduloServicio.menuConsulta.jlblTituloConsulta.setText("Consulta Información");
    }//GEN-LAST:event_jBtnConsultaActionPerformed

    private void jBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeActionPerformed
        sist_trenes.IntMenu Inicio = new sist_trenes.IntMenu();
        Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnHomeActionPerformed

    private void jBtnRegRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegRecorridoActionPerformed
            registroRecorridos regRecorridos = new registroRecorridos();
            regRecorridos.setVisible(true);
            this.setVisible(false);
            moduloRegistro.registroRecorridos.jlblTituloRegistroTrenes.setText("Registro de Recorridos");
    }//GEN-LAST:event_jBtnRegRecorridoActionPerformed

    private void jBtnRegFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegFuncionarioActionPerformed
            menuRegistro RegistroFunc = new menuRegistro();
            RegistroFunc.setVisible(true);
            this.setVisible(false);
            moduloRegistro.menuRegistro.jlblTituloRegistro.setText("Registro de Funcionarios");
    }//GEN-LAST:event_jBtnRegFuncionarioActionPerformed

    private void jbtnEliminarDatosTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarDatosTrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarDatosTrenActionPerformed

    private void jbtnModificarDatosTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarDatosTrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarDatosTrenActionPerformed

    private void jbtnGuardarDatosTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarDatosTrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarDatosTrenActionPerformed

    private void jBtnRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecorridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRecorridoActionPerformed

    private void jBtnRegTrenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegTrenesActionPerformed
         registroTrenes Trenes = new registroTrenes();
        Trenes.setVisible(true);
        this.setVisible(false);
        moduloRegistro.registroTrenes.jlblTituloRegistroTrenes.setText("Registro de Trenes");
    }//GEN-LAST:event_jBtnRegTrenesActionPerformed

    private void jBtnRegEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegEstacionesActionPerformed
       this.setVisible(true);
       jlblTituloRegistroTrenes.setText("Registro de Estaciones");
    }//GEN-LAST:event_jBtnRegEstacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroEstaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroEstaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroEstaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroEstaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroEstaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConsulta;
    private javax.swing.JButton jBtnHome;
    private javax.swing.JButton jBtnRecorrido;
    private javax.swing.JButton jBtnRegEstaciones;
    private javax.swing.JButton jBtnRegFuncionario;
    private javax.swing.JButton jBtnRegRecorrido;
    private javax.swing.JButton jBtnRegTrenes;
    private javax.swing.JButton jBtnReportes;
    private javax.swing.JButton jBtnReservarEspacio;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPnlInfoRegRecorridos;
    private javax.swing.JPanel jPnlMenuRecorrido;
    private javax.swing.JPanel jPnlNavBar;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableDatosTren;
    private javax.swing.JButton jbtnEliminarDatosTren;
    private javax.swing.JButton jbtnGuardarDatosTren;
    private javax.swing.JButton jbtnLimpiarTren;
    private javax.swing.JButton jbtnMenuDesplegable;
    private javax.swing.JButton jbtnModificarDatosTren;
    private javax.swing.JLabel jlblHEntrada;
    private javax.swing.JLabel jlblHSalida;
    private javax.swing.JLabel jlblIDEstacion;
    public static javax.swing.JLabel jlblTituloRegistroTrenes;
    private javax.swing.JLabel jlblUbicacion;
    private javax.swing.JTextPane jtxtHEntrada;
    private javax.swing.JTextPane jtxtHSalida;
    private javax.swing.JTextPane jtxtIDEstacion;
    private javax.swing.JTextPane jtxtUbicacion;
    // End of variables declaration//GEN-END:variables
}
