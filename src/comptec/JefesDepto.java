
package comptec;

public class JefesDepto extends javax.swing.JFrame {

    public JefesDepto() {
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
        nombreLab = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        correoLab = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        telefLab = new javax.swing.JLabel();
        telefTxt = new javax.swing.JTextField();
        tuserLab = new javax.swing.JLabel();
        userLab = new javax.swing.JLabel();
        passLab = new javax.swing.JLabel();
        iddeptoLab = new javax.swing.JLabel();
        iddeptoTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JTextField();
        userTxt = new javax.swing.JTextField();
        tuserTxt = new javax.swing.JTextField();
        limpBtn = new javax.swing.JButton();
        modifBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        añadirBtn = new javax.swing.JButton();
        todoBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
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
        idLab.setText("ID");
        getContentPane().add(idLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, -1));

        nombreLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreLab.setForeground(new java.awt.Color(255, 255, 255));
        nombreLab.setText("NOMBRE");
        getContentPane().add(nombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, -1));

        correoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correoLab.setForeground(new java.awt.Color(255, 255, 255));
        correoLab.setText("CORREO");
        getContentPane().add(correoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        getContentPane().add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));

        telefLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telefLab.setForeground(new java.awt.Color(255, 255, 255));
        telefLab.setText("TELÉFONO");
        getContentPane().add(telefLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        getContentPane().add(telefTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        tuserLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tuserLab.setForeground(new java.awt.Color(255, 255, 255));
        tuserLab.setText("TIPO USUARIO");
        getContentPane().add(tuserLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        userLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userLab.setForeground(new java.awt.Color(255, 255, 255));
        userLab.setText("USUARIO");
        getContentPane().add(userLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        passLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passLab.setForeground(new java.awt.Color(255, 255, 255));
        passLab.setText("CONTRASEÑA");
        getContentPane().add(passLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        iddeptoLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iddeptoLab.setForeground(new java.awt.Color(255, 255, 255));
        iddeptoLab.setText("ID DEPTO.");
        getContentPane().add(iddeptoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));
        getContentPane().add(iddeptoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 150, -1));
        getContentPane().add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 150, -1));
        getContentPane().add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 150, -1));
        getContentPane().add(tuserTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 150, -1));

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
        getContentPane().add(modifBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 30, 30));

        borrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete32.png"))); // NOI18N
        borrarBtn.setBorderPainted(false);
        borrarBtn.setContentAreaFilled(false);
        borrarBtn.setFocusPainted(false);
        getContentPane().add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 40, 32));

        añadirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add32.png"))); // NOI18N
        añadirBtn.setBorderPainted(false);
        añadirBtn.setContentAreaFilled(false);
        añadirBtn.setFocusPainted(false);
        getContentPane().add(añadirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 30, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 690, 320));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/jefesbg.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoBtnActionPerformed
        Equipos equip = new Equipos();
        equip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_equipoBtnActionPerformed

    private void deptoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoBtnActionPerformed
        Deptos depto = new Deptos();
        depto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deptoBtnActionPerformed

    private void jefeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jefeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jefeBtnActionPerformed

    private void reporteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBtnActionPerformed
        Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(JefesDepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JefesDepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JefesDepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JefesDepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JefesDepto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton añadirBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JLabel correoLab;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel iddeptoLab;
    private javax.swing.JTextField iddeptoTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton limpBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton modifBtn;
    private javax.swing.JLabel nombreLab;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel passLab;
    private javax.swing.JTextField passTxt;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JLabel search;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tablaContenidos;
    private javax.swing.JLabel telefLab;
    private javax.swing.JTextField telefTxt;
    private javax.swing.JButton todoBtn;
    private javax.swing.JLabel tuserLab;
    private javax.swing.JTextField tuserTxt;
    private javax.swing.JLabel userLab;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
