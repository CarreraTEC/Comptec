
package comptec;

public class Reportes extends javax.swing.JFrame {

    public Reportes() {
        initComponents();
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
        estadoTxt = new javax.swing.JTextField();
        discoTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        proceTxt = new javax.swing.JTextField();
        limpBtn = new javax.swing.JButton();
        modifBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        iddeptoLab = new javax.swing.JLabel();
        iddeptoTxt = new javax.swing.JTextField();
        añadirBtn = new javax.swing.JButton();
        todoBtn = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
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
        reporteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reporteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 68, 68));

        idLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLab.setForeground(new java.awt.Color(255, 255, 255));
        idLab.setText("ID EQUIPO");
        getContentPane().add(idLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, -1));

        inventLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventLab.setForeground(new java.awt.Color(255, 255, 255));
        inventLab.setText("ID DEPTO.");
        getContentPane().add(inventLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        getContentPane().add(inventTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, -1));

        serieLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serieLab.setForeground(new java.awt.Color(255, 255, 255));
        serieLab.setText("NO. SERIE");
        getContentPane().add(serieLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        getContentPane().add(serieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));

        modeloLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modeloLab.setForeground(new java.awt.Color(255, 255, 255));
        modeloLab.setText("NO. INVENTARIO");
        getContentPane().add(modeloLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        getContentPane().add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        proceLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proceLab.setForeground(new java.awt.Color(255, 255, 255));
        proceLab.setText("MODELO");
        getContentPane().add(proceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        ramLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ramLab.setForeground(new java.awt.Color(255, 255, 255));
        ramLab.setText("PROCESADOR");
        getContentPane().add(ramLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        discoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discoLab.setForeground(new java.awt.Color(255, 255, 255));
        discoLab.setText("MEMORIA RAM");
        getContentPane().add(discoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        estadoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estadoLab.setForeground(new java.awt.Color(255, 255, 255));
        estadoLab.setText("DISCO DURO");
        getContentPane().add(estadoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));
        getContentPane().add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 150, -1));
        getContentPane().add(discoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 150, -1));
        getContentPane().add(ramTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 150, -1));
        getContentPane().add(proceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 150, -1));

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
        getContentPane().add(limpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 110, 50));

        modifBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modif32.png"))); // NOI18N
        modifBtn.setBorderPainted(false);
        modifBtn.setContentAreaFilled(false);
        modifBtn.setFocusPainted(false);
        getContentPane().add(modifBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 218, 30, 30));

        borrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete32.png"))); // NOI18N
        borrarBtn.setBorderPainted(false);
        borrarBtn.setContentAreaFilled(false);
        borrarBtn.setFocusPainted(false);
        getContentPane().add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 218, 40, 32));

        iddeptoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iddeptoLab.setForeground(new java.awt.Color(255, 255, 255));
        iddeptoLab.setText("ESTADO");
        getContentPane().add(iddeptoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));
        getContentPane().add(iddeptoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 150, -1));

        añadirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add32.png"))); // NOI18N
        añadirBtn.setBorderPainted(false);
        añadirBtn.setContentAreaFilled(false);
        añadirBtn.setFocusPainted(false);
        getContentPane().add(añadirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 218, 30, 30));

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
        getContentPane().add(todoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 130, 50));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 40, 100, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search32.png"))); // NOI18N
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

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
        jScrollPane1.setViewportView(tablaContenidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 690, 290));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ESTADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 282, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUENO", "REGULAR", "FUERA DE SERVICIO" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, -1));

        jButton1.setText("GENERAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

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

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/reportbg.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoBtnActionPerformed
        Equipos equip = new Equipos();
        equip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_equipoBtnActionPerformed

    private void deptoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoBtnActionPerformed
        Deptos deptos = new Deptos();
        deptos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deptoBtnActionPerformed

    private void jefeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeBtnActionPerformed
        JefesDepto jefes = new JefesDepto();
        jefes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jefeBtnActionPerformed

    private void reporteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBtnActionPerformed
        
    }//GEN-LAST:event_reporteBtnActionPerformed

    private void limpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpBtnActionPerformed

    private void todoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_todoBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton añadirBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JLabel discoLab;
    private javax.swing.JTextField discoTxt;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JLabel estadoLab;
    private javax.swing.JTextField estadoTxt;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel iddeptoLab;
    private javax.swing.JTextField iddeptoTxt;
    private javax.swing.JLabel inventLab;
    private javax.swing.JTextField inventTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton limpBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel modeloLab;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JButton modifBtn;
    private javax.swing.JLabel proceLab;
    private javax.swing.JTextField proceTxt;
    private javax.swing.JLabel ramLab;
    private javax.swing.JTextField ramTxt;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JLabel search;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel serieLab;
    private javax.swing.JTextField serieTxt;
    private javax.swing.JTable tablaContenidos;
    private javax.swing.JButton todoBtn;
    // End of variables declaration//GEN-END:variables
}
