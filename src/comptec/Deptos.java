package comptec;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Deptos extends javax.swing.JFrame {

    //Establecer la conexión con la BD
    ConexionBD conex = new ConexionBD();
    Connection conect = conex.conexion();

    public Deptos() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDeptos();
    }

    public void mostrarDeptos() {
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

    }

    public void buscarDepto() {
        //Definir encabezados de la tabla
        String[] titulos = {"Id", "Nombre", "Correo", "Teléfono"};
        //Definir los registros
        String[] registros = new String[4];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call buscar_departamento(?,?)");
            //Se ingresan los parametros del procedimiento *EN ORDEN*
            call.setString(1, searchTxt.getText());
            call.registerOutParameter(2, java.sql.Types.VARCHAR);
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
            JOptionPane.showMessageDialog(null, "Ingrese el Id del departamento");

        }
    }
    
    public void añadir() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call añadir_departamento(?,?,?,?,?)");
            //Se ingresan los parametros *EN ORDEN*
            call.setString(1, idTxt.getText());
            call.setString(2, nombreTxt.getText());
            call.setString(3, correoTxt.getText());
            call.setString(4, telefonoTxt.getText());
            call.registerOutParameter(5, java.sql.Types.VARCHAR);
            call.execute();
            JOptionPane.showMessageDialog(null, call.getString(5));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void modificar() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call modificar_departamento(?,?,?,?,?)");
            //Se ingresan los parametros *EN ORDEN*
            call.setString(1, idTxt.getText());
            call.setString(2, nombreTxt.getText());
            call.setString(3, correoTxt.getText());
            call.setString(4, telefonoTxt.getText());
            call.registerOutParameter(5, java.sql.Types.VARCHAR);
            call.execute();
            JOptionPane.showMessageDialog(null, call.getString(5));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void eliminar() {

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call eliminar_departamento(?,?)");
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
        nombreTxt.setText(null);
        correoTxt.setText(null);
        telefonoTxt.setText(null);
        searchTxt.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTxt = new javax.swing.JTextField();
        correoTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        telefonoLab = new javax.swing.JLabel();
        correoLab = new javax.swing.JLabel();
        idLab = new javax.swing.JLabel();
        nombreLab = new javax.swing.JLabel();
        borrarBtn = new javax.swing.JButton();
        modifBtn = new javax.swing.JButton();
        añadirBtn = new javax.swing.JButton();
        jefeBtn = new javax.swing.JButton();
        deptoBtn = new javax.swing.JButton();
        reporteBtn = new javax.swing.JButton();
        equipoBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        seperador = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        todoBtn = new javax.swing.JButton();
        limpBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));
        getContentPane().add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, -1));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, -1));
        getContentPane().add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 180, -1));

        telefonoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telefonoLab.setForeground(new java.awt.Color(255, 255, 255));
        telefonoLab.setText("TELEFONO");
        getContentPane().add(telefonoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        correoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correoLab.setForeground(new java.awt.Color(255, 255, 255));
        correoLab.setText("CORREO");
        getContentPane().add(correoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        idLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLab.setForeground(new java.awt.Color(255, 255, 255));
        idLab.setText("ID");
        getContentPane().add(idLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 20, -1));

        nombreLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreLab.setForeground(new java.awt.Color(255, 255, 255));
        nombreLab.setText("NOMBRE");
        getContentPane().add(nombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        borrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete32.png"))); // NOI18N
        borrarBtn.setBorderPainted(false);
        borrarBtn.setContentAreaFilled(false);
        borrarBtn.setFocusPainted(false);
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        modifBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modif32.png"))); // NOI18N
        modifBtn.setBorderPainted(false);
        modifBtn.setContentAreaFilled(false);
        modifBtn.setFocusPainted(false);
        modifBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifBtnActionPerformed(evt);
            }
        });
        getContentPane().add(modifBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        añadirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add32.png"))); // NOI18N
        añadirBtn.setBorderPainted(false);
        añadirBtn.setContentAreaFilled(false);
        añadirBtn.setFocusPainted(false);
        añadirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(añadirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jefeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jefeNorm.png"))); // NOI18N
        jefeBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jefeNorm.png"))); // NOI18N
        jefeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jefeRoll.png"))); // NOI18N
        jefeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jefeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jefeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 68, 68));

        deptoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/depNorm.png"))); // NOI18N
        deptoBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/depNorm.png"))); // NOI18N
        deptoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/depRoll.png"))); // NOI18N
        deptoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deptoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 68, 68));

        reporteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repoNorm.png"))); // NOI18N
        reporteBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repoNorm.png"))); // NOI18N
        reporteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repoRoll.png"))); // NOI18N
        reporteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reporteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 68, 68));

        equipoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqNorm.png"))); // NOI18N
        equipoBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqNorm.png"))); // NOI18N
        equipoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqRoll.png"))); // NOI18N
        equipoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(equipoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 68, 68));

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

        seperador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        seperador.setForeground(new java.awt.Color(255, 255, 255));
        seperador.setText("_____________");
        getContentPane().add(seperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 25, 110, -1));

        searchTxt.setBackground(new java.awt.Color(1, 76, 168));
        searchTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTxt.setText("Id del depto.");
        searchTxt.setBorder(null);
        searchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTxtMouseClicked(evt);
            }
        });
        getContentPane().add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 22, 100, -1));

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search32.png"))); // NOI18N
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 15, 40, 30));

        todoBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        todoBtn.setForeground(new java.awt.Color(255, 255, 255));
        todoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrar32.png"))); // NOI18N
        todoBtn.setText("MOSTRAR TODO");
        todoBtn.setBorderPainted(false);
        todoBtn.setContentAreaFilled(false);
        todoBtn.setFocusPainted(false);
        todoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        todoBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        todoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(todoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 130, 50));

        limpBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        limpBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limp32.png"))); // NOI18N
        limpBtn.setText("LIMPIAR");
        limpBtn.setBorderPainted(false);
        limpBtn.setContentAreaFilled(false);
        limpBtn.setFocusPainted(false);
        limpBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(limpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 110, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 680, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/deptosbg.png"))); // NOI18N
        jLabel1.setText("TELEFONO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void equipoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoBtnActionPerformed
        Equipos equip = new Equipos();
        equip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_equipoBtnActionPerformed

    private void deptoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoBtnActionPerformed

    }//GEN-LAST:event_deptoBtnActionPerformed

    private void jefeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeBtnActionPerformed
        JefesDepto jefes = new JefesDepto();
        jefes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jefeBtnActionPerformed

    private void reporteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBtnActionPerformed
        Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reporteBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void añadirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBtnActionPerformed
        if (idTxt.getText().isEmpty() || nombreTxt.getText().isEmpty() || correoTxt.getText().isEmpty()
                || telefonoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            añadir();
            mostrarDeptos();
        }
    }//GEN-LAST:event_añadirBtnActionPerformed

    private void modifBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifBtnActionPerformed
        if (idTxt.getText().isEmpty() || nombreTxt.getText().isEmpty() || correoTxt.getText().isEmpty()
                || telefonoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            modificar();
            mostrarDeptos();
        }
    }//GEN-LAST:event_modifBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        if (idTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el Id del departamento");
        } else {
            añadir();
            mostrarDeptos();
        }
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void tablaContenidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContenidosMouseClicked
        //Código para mandar la información del renglon seleccionado
        int filaSeleccionada = tablaContenidos.rowAtPoint(evt.getPoint());
        idTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 0).toString());
        nombreTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 1).toString());
        correoTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 2).toString());
        telefonoTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 3).toString());
    }//GEN-LAST:event_tablaContenidosMouseClicked

    private void searchTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtMouseClicked
        searchTxt.setText(null);
    }//GEN-LAST:event_searchTxtMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if (searchTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el Id del departamento");
        } else {
            buscarDepto();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void todoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoBtnActionPerformed
        mostrarDeptos();
    }//GEN-LAST:event_todoBtnActionPerformed

    private void limpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpBtnActionPerformed
        limpiar();
    }//GEN-LAST:event_limpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Deptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deptos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JLabel correoLab;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton limpBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton modifBtn;
    private javax.swing.JLabel nombreLab;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel seperador;
    private javax.swing.JTable tablaContenidos;
    private javax.swing.JLabel telefonoLab;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JButton todoBtn;
    // End of variables declaration//GEN-END:variables
}
