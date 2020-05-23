package comptec;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReportesJ extends javax.swing.JFrame {

    //Establecer la conexión con la BD
    ConexionBD conex = new ConexionBD();
    Connection conect = conex.conexion();

    public ReportesJ() {
        initComponents();
        //Agregar items al ComboBox (superior) de atributo estado
        estadoCmb.addItem("Bueno");
        estadoCmb.addItem("Regular");
        estadoCmb.addItem("Defectuoso");
        estadoCmb.setSelectedItem(null);
        //Agregar items al ComboBox (inferior) de selección
        estadoSelectCmb.addItem("Todos");
        estadoSelectCmb.addItem("Bueno");
        estadoSelectCmb.addItem("Regular");
        estadoSelectCmb.addItem("Defectuoso");
        estadoSelectCmb.setSelectedItem("Todos");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipoBtn = new javax.swing.JButton();
        deptoBtn = new javax.swing.JButton();
        jefeBtn = new javax.swing.JButton();
        reporteBtn = new javax.swing.JButton();
        idLab = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        idDeptoLab = new javax.swing.JLabel();
        idDeptoTxt = new javax.swing.JTextField();
        serieLab = new javax.swing.JLabel();
        serieTxt = new javax.swing.JTextField();
        inventLab = new javax.swing.JLabel();
        inventTxt = new javax.swing.JTextField();
        modeloLab = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        proceLab = new javax.swing.JLabel();
        proceTxt = new javax.swing.JTextField();
        ramLab = new javax.swing.JLabel();
        discoDuroLab = new javax.swing.JLabel();
        discoDuroTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        estadoLab = new javax.swing.JLabel();
        estadoCmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        reportBtn = new javax.swing.JButton();
        estadoSelectCmb = new javax.swing.JComboBox<>();
        logoutBtn = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equipoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqNorm.png"))); // NOI18N
        equipoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eqRoll.png"))); // NOI18N
        equipoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoBtnActionPerformed(evt);
            }
        });
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
        getContentPane().add(reporteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 68, 68));

        idLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLab.setForeground(new java.awt.Color(255, 255, 255));
        idLab.setText("ID EQUIPO");
        getContentPane().add(idLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        idTxt.setEditable(false);
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 200, -1));

        idDeptoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idDeptoLab.setForeground(new java.awt.Color(255, 255, 255));
        idDeptoLab.setText("ID DEPTO.");
        getContentPane().add(idDeptoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        idDeptoTxt.setEditable(false);
        getContentPane().add(idDeptoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        serieLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serieLab.setForeground(new java.awt.Color(255, 255, 255));
        serieLab.setText("NO. SERIE");
        getContentPane().add(serieLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        serieTxt.setEditable(false);
        getContentPane().add(serieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        inventLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventLab.setForeground(new java.awt.Color(255, 255, 255));
        inventLab.setText("NO. INVENTARIO");
        getContentPane().add(inventLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        inventTxt.setEditable(false);
        getContentPane().add(inventTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 200, -1));

        modeloLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modeloLab.setForeground(new java.awt.Color(255, 255, 255));
        modeloLab.setText("MODELO");
        getContentPane().add(modeloLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        modeloTxt.setEditable(false);
        getContentPane().add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 200, -1));

        proceLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proceLab.setForeground(new java.awt.Color(255, 255, 255));
        proceLab.setText("PROCESADOR");
        getContentPane().add(proceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        proceTxt.setEditable(false);
        getContentPane().add(proceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 200, -1));

        ramLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ramLab.setForeground(new java.awt.Color(255, 255, 255));
        ramLab.setText("MEMORIA RAM");
        getContentPane().add(ramLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        discoDuroLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discoDuroLab.setForeground(new java.awt.Color(255, 255, 255));
        discoDuroLab.setText("DISCO DURO");
        getContentPane().add(discoDuroLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        discoDuroTxt.setEditable(false);
        getContentPane().add(discoDuroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 200, -1));

        ramTxt.setEditable(false);
        getContentPane().add(ramTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 200, -1));

        estadoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estadoLab.setForeground(new java.awt.Color(255, 255, 255));
        estadoLab.setText("ESTADO");
        getContentPane().add(estadoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        estadoCmb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(estadoCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 200, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 800, 290));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ESTADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        reportBtn.setText("GENERAR");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        estadoSelectCmb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estadoSelectCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoSelectCmbActionPerformed(evt);
            }
        });
        getContentPane().add(estadoSelectCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 140, -1));

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

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/reports.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

        setBounds(0, 0, 926, 657);
    }// </editor-fold>//GEN-END:initComponents

    public void reporteGeneral() {
        //Definir encabezados de la tabla
        String[] titulos = {"IdEquipo", "IdDepto", "No.Invent", "No.Serie", "Modelo", "Procesador", "RAM",
            "DiscoDuro", "Estado"};
        //Definir los registros
        String[] registros = new String[9];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call reporte_gral");
            ResultSet rs = call.executeQuery();

            //Se llena la tabla con los registros
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("idDepto");
                registros[2] = rs.getString("noInvent");
                registros[3] = rs.getString("noSerie");
                registros[4] = rs.getString("modelo");
                registros[5] = rs.getString("procesador");
                registros[6] = rs.getString("ram");
                registros[7] = rs.getString("discoDuro");
                registros[8] = rs.getString("estado");

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

    public void reporteEstado() {
        //Definir encabezados de la tabla
        String[] titulos = {"IdEquipo", "IdDepto", "No.Invent", "No.Serie", "Modelo", "Procesador", "RAM",
            "DiscoDuro", "Estado"};
        //Definir los registros
        String[] registros = new String[9];
        //Añadimos un modelo a la tabla
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            //Llamada al procedimiento almacenado
            CallableStatement call = conect.prepareCall("call reporte_estado(?)");
            call.setString(1, (String) estadoSelectCmb.getSelectedItem());
            ResultSet rs = call.executeQuery();

            //Se llena la tabla con los registros
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("idDepto");
                registros[2] = rs.getString("noInvent");
                registros[3] = rs.getString("noSerie");
                registros[4] = rs.getString("modelo");
                registros[5] = rs.getString("procesador");
                registros[6] = rs.getString("ram");
                registros[7] = rs.getString("discoDuro");
                registros[8] = rs.getString("estado");

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

    public void seleccion() {
        if (estadoSelectCmb.getSelectedItem() == "Todos") {
            reporteGeneral();
        } else if(estadoSelectCmb.getSelectedItem()== "Bueno" | estadoSelectCmb.getSelectedItem()=="Regular" | 
                estadoSelectCmb.getSelectedItem()=="Defectuoso"){
            reporteEstado();
        }
    }
 
    private void equipoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoBtnActionPerformed
        EquiposJ equip = new EquiposJ();
        equip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_equipoBtnActionPerformed

    private void deptoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoBtnActionPerformed
        DeptosJ deptos = new DeptosJ();
        deptos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deptoBtnActionPerformed

    private void jefeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeBtnActionPerformed
        JefesDeptoJ jefes = new JefesDeptoJ();
        jefes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jefeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void estadoSelectCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoSelectCmbActionPerformed
        seleccion();
    }//GEN-LAST:event_estadoSelectCmbActionPerformed

    private void tablaContenidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContenidosMouseClicked
        //Código para mandar la información del renglon seleccionado
        int filaSeleccionada = tablaContenidos.rowAtPoint(evt.getPoint());
        idTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 0).toString());
        idDeptoTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 1).toString());
        serieTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 2).toString());
        inventTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 3).toString());
        modeloTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 4).toString());
        proceTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 5).toString());
        ramTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 6).toString());
        discoDuroTxt.setText(tablaContenidos.getValueAt(filaSeleccionada, 7).toString());
        estadoCmb.setSelectedItem(tablaContenidos.getValueAt(filaSeleccionada, 8).toString());
    }//GEN-LAST:event_tablaContenidosMouseClicked

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        try {
            if (estadoSelectCmb.getSelectedItem() == "Todos") {
                //Informe general
                JasperReport reporte = null;
                String ruta = "src\\Reportes\\ReporteGral.jasper";
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conect);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } else {
                //Informe por categoria
                JasperReport reporte = null;
                String ruta = "src\\Reportes\\ReporteEstado.jasper";

                Map parametro = new HashMap();
                parametro.put("status", "'" + estadoSelectCmb.getSelectedItem().toString() + "'");

                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conect);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
            }
        } catch (JRException ex) {
            Logger.getLogger(ReportesJ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ReportesJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JLabel discoDuroLab;
    private javax.swing.JTextField discoDuroTxt;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JComboBox<String> estadoCmb;
    private javax.swing.JLabel estadoLab;
    private javax.swing.JComboBox<String> estadoSelectCmb;
    private javax.swing.JLabel idDeptoLab;
    private javax.swing.JTextField idDeptoTxt;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel inventLab;
    private javax.swing.JTextField inventTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel modeloLab;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JLabel proceLab;
    private javax.swing.JTextField proceTxt;
    private javax.swing.JLabel ramLab;
    private javax.swing.JTextField ramTxt;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JLabel serieLab;
    private javax.swing.JTextField serieTxt;
    private javax.swing.JTable tablaContenidos;
    // End of variables declaration//GEN-END:variables
}
