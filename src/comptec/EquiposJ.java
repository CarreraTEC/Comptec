package comptec;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EquiposJ extends javax.swing.JFrame {

    //Establecer la conexión con la BD
    ConexionBD conex = new ConexionBD();
    Connection conect = conex.conexion();
    //Recuperamos el idDepto del usuario logueado
    Login acceso = new Login();
    int idDepto = acceso.idDepto;
    
    public EquiposJ() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Agregar items al ComboBox
        estadoCmb.addItem("Bueno");
        estadoCmb.addItem("Regular");
        estadoCmb.addItem("Defectuoso");
        estadoCmb.setSelectedItem(null);
        mostrarEquipos();
    }

    public void mostrarEquipos() {
        //Definir encabezados de la tabla
        String[] titulos = {"Id", "No.Invent", "No.Serie", "Modelo", "Procesador", "RAM", "DiscoDuro",
            "Estado", "IdDepto"};
        //Definir los registros
        String[] registros = new String[9];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call mostrar_equipos(?)");
            call.setInt(1, idDepto);
            ResultSet rs = call.executeQuery();

            //Se llena la tabla con los registros
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("noInvent");
                registros[2] = rs.getString("noSerie");
                registros[3] = rs.getString("modelo");
                registros[4] = rs.getString("procesador");
                registros[5] = rs.getString("ram");
                registros[6] = rs.getString("discoDuro");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("idDepto");

                model.addRow(registros);
            }
            tablaContenidos.setModel(model);
            //Definir ancho de las columnas
            int[] anchos = {5, 30, 30, 100, 90, 20, 40, 40, 20};
            for (int i = 0; i < tablaContenidos.getColumnCount(); i++) {
                tablaContenidos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            //Hacer campos de la tabla, no editables
            tablaContenidos.setDefaultEditor(Object.class, null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay equipos");

        }
    }

    public void buscarEquipo() {
        //Definir encabezados de la tabla
        String[] titulos = {"Id", "No.Invent", "No.Serie", "Modelo", "Procesador", "RAM", "DiscoDuro",
            "Estado", "IdDepto"};
        //Definir los registros
        String[] registros = new String[9];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call buscar_equipo(?,?)");
            //Se ingresan los parametros del procedimiento *EN ORDEN*
            call.setString(1, searchTxt.getText());
            call.registerOutParameter(2, java.sql.Types.VARCHAR);
            ResultSet rs = call.executeQuery();

            //Se llena la tabla
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("noInvent");
                registros[2] = rs.getString("noSerie");
                registros[3] = rs.getString("modelo");
                registros[4] = rs.getString("procesador");
                registros[5] = rs.getString("ram");
                registros[6] = rs.getString("discoDuro");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("idDepto");

                model.addRow(registros);
            }
            tablaContenidos.setModel(model);
            //Definir ancho de las columnas
            int[] anchos = {5, 30, 30, 100, 90, 20, 40, 40, 20};
            for (int i = 0; i < tablaContenidos.getColumnCount(); i++) {
                tablaContenidos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            //Hacer campos de la tabla, no editables
            tablaContenidos.setDefaultEditor(Object.class, null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el Id del equipo");

        }
    }
    
    public void añadir() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call añadir_equipo(?,?,?,?,?,?,?,?,?,?)");
            //Se ingresan los parametros *EN ORDEN*
            call.setString(1, idTxt.getText());
            call.setString(2, inventTxt.getText());
            call.setString(3, serieTxt.getText());
            call.setString(4, modeloTxt.getText());
            call.setString(5, proceTxt.getText());
            call.setString(6, ramTxt.getText());
            call.setString(7, discoTxt.getText());
            call.setString(8, (String) estadoCmb.getSelectedItem());
            call.setString(9, iddeptoTxt.getText());
            call.registerOutParameter(10, java.sql.Types.VARCHAR);
            call.execute();
            JOptionPane.showMessageDialog(null, call.getString(10));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void modificar() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call modificar_equipo(?,?,?,?,?,?,?,?,?,?)");
            //Se ingresan los parametros *EN ORDEN*
            call.setString(1, idTxt.getText());
            call.setString(2, inventTxt.getText());
            call.setString(3, serieTxt.getText());
            call.setString(4, modeloTxt.getText());
            call.setString(5, proceTxt.getText());
            call.setString(6, ramTxt.getText());
            call.setString(7, discoTxt.getText());
            call.setString(8, (String) estadoCmb.getSelectedItem());
            call.setString(9, iddeptoTxt.getText());
            call.registerOutParameter(10, java.sql.Types.VARCHAR);
            call.execute();
            JOptionPane.showMessageDialog(null, call.getString(10));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void eliminar() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call eliminar_equipo(?,?)");
            call.setString(1, idTxt.getText());
            call.registerOutParameter(2, java.sql.Types.VARCHAR);
            call.execute();
            JOptionPane.showMessageDialog(null, call.getString(2));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

    }

    public void limpiar() {
        idTxt.setText(null);
        inventTxt.setText(null);
        serieTxt.setText(null);
        modeloTxt.setText(null);
        proceTxt.setText(null);
        ramTxt.setText(null);
        discoTxt.setText(null);
        estadoCmb.setSelectedItem(null);
        iddeptoTxt.setText(null);
        searchTxt.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verDeptosBtn = new javax.swing.JButton();
        equipoBtn = new javax.swing.JButton();
        deptoBtn = new javax.swing.JButton();
        jefeBtn = new javax.swing.JButton();
        reporteBtn = new javax.swing.JButton();
        idLab = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        inventLab = new javax.swing.JLabel();
        inventTxt = new javax.swing.JTextField();
        serieLab = new javax.swing.JLabel();
        serieTxt = new javax.swing.JTextField();
        modeloLab = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        proceLab = new javax.swing.JLabel();
        ramLab = new javax.swing.JLabel();
        discoLab = new javax.swing.JLabel();
        estadoLab = new javax.swing.JLabel();
        discoTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        proceTxt = new javax.swing.JTextField();
        iddeptoLab = new javax.swing.JLabel();
        iddeptoTxt = new javax.swing.JTextField();
        logoutBtn = new javax.swing.JButton();
        estadoCmb = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        todoBtn = new javax.swing.JButton();
        seperador = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        limpBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verDeptosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/searchDept.png"))); // NOI18N
        verDeptosBtn.setContentAreaFilled(false);
        verDeptosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDeptosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(verDeptosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 183, 30, 20));

        equipoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqNorm.png"))); // NOI18N
        equipoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqRoll.png"))); // NOI18N
        getContentPane().add(equipoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 68, 68));

        deptoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/depNorm.png"))); // NOI18N
        deptoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/depRoll.png"))); // NOI18N
        deptoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deptoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 68, 68));

        jefeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jefeNorm.png"))); // NOI18N
        jefeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jefeRoll.png"))); // NOI18N
        jefeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jefeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jefeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 68, 68));

        reporteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repoNorm.png"))); // NOI18N
        reporteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repoRoll.png"))); // NOI18N
        reporteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reporteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 68, 68));

        idLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLab.setForeground(new java.awt.Color(255, 255, 255));
        idLab.setText("ID");
        getContentPane().add(idLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 94, -1, -1));

        idTxt.setEditable(false);
        idTxt.setBackground(new java.awt.Color(207, 231, 255));
        idTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 200, -1));

        inventLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventLab.setForeground(new java.awt.Color(255, 255, 255));
        inventLab.setText("NO. INVENTARIO");
        getContentPane().add(inventLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 124, -1, -1));

        inventTxt.setEditable(false);
        inventTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(inventTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, -1));

        serieLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serieLab.setForeground(new java.awt.Color(255, 255, 255));
        serieLab.setText("NO. SERIE");
        getContentPane().add(serieLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 154, -1, -1));

        serieTxt.setEditable(false);
        serieTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(serieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, -1));

        modeloLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modeloLab.setForeground(new java.awt.Color(255, 255, 255));
        modeloLab.setText("MODELO");
        getContentPane().add(modeloLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 184, -1, -1));

        modeloTxt.setEditable(false);
        modeloTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 200, -1));

        proceLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proceLab.setForeground(new java.awt.Color(255, 255, 255));
        proceLab.setText("PROCESADOR");
        getContentPane().add(proceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 214, -1, -1));

        ramLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ramLab.setForeground(new java.awt.Color(255, 255, 255));
        ramLab.setText("MEMORIA RAM");
        getContentPane().add(ramLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 94, -1, -1));

        discoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discoLab.setForeground(new java.awt.Color(255, 255, 255));
        discoLab.setText("DISCO DURO");
        getContentPane().add(discoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 124, -1, -1));

        estadoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estadoLab.setForeground(new java.awt.Color(255, 255, 255));
        estadoLab.setText("ESTADO");
        getContentPane().add(estadoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 154, -1, -1));

        discoTxt.setEditable(false);
        discoTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(discoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 200, -1));

        ramTxt.setEditable(false);
        ramTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(ramTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 200, -1));

        proceTxt.setEditable(false);
        proceTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(proceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 200, -1));

        iddeptoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iddeptoLab.setForeground(new java.awt.Color(255, 255, 255));
        iddeptoLab.setText("ID DEPTO.");
        getContentPane().add(iddeptoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 184, -1, -1));

        iddeptoTxt.setEditable(false);
        iddeptoTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(iddeptoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 200, -1));

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoutNorm.png"))); // NOI18N
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoutRoll.png"))); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 68, 68));

        estadoCmb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(estadoCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 200, -1));

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search32.png"))); // NOI18N
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search32_r.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 40, 30));

        todoBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        todoBtn.setForeground(new java.awt.Color(255, 255, 255));
        todoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrar32.png"))); // NOI18N
        todoBtn.setText("MOSTRAR TODO");
        todoBtn.setBorderPainted(false);
        todoBtn.setContentAreaFilled(false);
        todoBtn.setFocusPainted(false);
        todoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        todoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrar32_r.png"))); // NOI18N
        todoBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        todoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(todoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 130, 50));

        seperador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        seperador.setForeground(new java.awt.Color(255, 255, 255));
        seperador.setText("_____________");
        getContentPane().add(seperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 110, -1));

        searchTxt.setBackground(new java.awt.Color(1, 76, 168));
        searchTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTxt.setText("Id del equipo");
        searchTxt.setBorder(null);
        searchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTxtMouseClicked(evt);
            }
        });
        getContentPane().add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 27, 100, -1));

        limpBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        limpBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limp32.png"))); // NOI18N
        limpBtn.setText("LIMPIAR");
        limpBtn.setBorderPainted(false);
        limpBtn.setContentAreaFilled(false);
        limpBtn.setFocusPainted(false);
        limpBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limp32_r.png"))); // NOI18N
        limpBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(limpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 110, 50));

        tablaContenidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaContenidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaContenidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContenidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContenidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 800, 320));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/equipos.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

        setBounds(0, 0, 926, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void deptoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoBtnActionPerformed
        DeptosJ depto = new DeptosJ();
        depto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deptoBtnActionPerformed

    private void jefeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeBtnActionPerformed
        JefesDeptoJ jefes = new JefesDeptoJ();
        jefes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jefeBtnActionPerformed

    private void reporteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBtnActionPerformed
        ReportesJ report = new ReportesJ();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reporteBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void tablaContenidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContenidosMouseClicked
        //Código para mandar la información del renglon seleccionado
        int filaSeleccionada = tablaContenidos.rowAtPoint(evt.getPoint());
        idTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 0).toString());
        inventTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 1).toString());
        serieTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 2).toString());
        modeloTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 3).toString());
        proceTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 4).toString());
        ramTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 5).toString());
        discoTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 6).toString());
        estadoCmb.setSelectedItem(tablaContenidos.getValueAt(filaSeleccionada, 7).toString());
        iddeptoTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 8).toString());

    }//GEN-LAST:event_tablaContenidosMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if (searchTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el Id del equipo");
        } else {
            buscarEquipo();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void todoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoBtnActionPerformed
        mostrarEquipos();
    }//GEN-LAST:event_todoBtnActionPerformed

    private void searchTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtMouseClicked
        searchTxt.setText(null);
    }//GEN-LAST:event_searchTxtMouseClicked

    private void limpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpBtnActionPerformed
        limpiar();
    }//GEN-LAST:event_limpBtnActionPerformed

    private void verDeptosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDeptosBtnActionPerformed
        //Definir encabezados de la tabla
        String[] titulos = {"Id", "Nombre", "Correo", "Teléfono"};
        //Definir los registros
        String[] registros = new String[4];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call mostrar_departamentos");
            ResultSet rs = call.executeQuery();

            //Se llena la tabla con los registros
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("correo");
                registros[3] = rs.getString("telefono");

                model.addRow(registros);
            }
            tablaContenidos.setModel(model);
            //Definir ancho de las columnas
            int[] anchos = {10, 200, 100, 50};
            for (int i = 0; i < tablaContenidos.getColumnCount(); i++) {
                tablaContenidos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            //Hacer campos de la tabla, no editables
            tablaContenidos.setDefaultEditor(Object.class, null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay departamentos");

        }
    }//GEN-LAST:event_verDeptosBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EquiposJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquiposJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquiposJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquiposJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquiposJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JLabel discoLab;
    private javax.swing.JTextField discoTxt;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JComboBox<String> estadoCmb;
    private javax.swing.JLabel estadoLab;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel iddeptoLab;
    private javax.swing.JTextField iddeptoTxt;
    private javax.swing.JLabel inventLab;
    private javax.swing.JTextField inventTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton limpBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel modeloLab;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JLabel proceLab;
    private javax.swing.JTextField proceTxt;
    private javax.swing.JLabel ramLab;
    private javax.swing.JTextField ramTxt;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel seperador;
    private javax.swing.JLabel serieLab;
    private javax.swing.JTextField serieTxt;
    private javax.swing.JTable tablaContenidos;
    private javax.swing.JButton todoBtn;
    private javax.swing.JButton verDeptosBtn;
    // End of variables declaration//GEN-END:variables
}
