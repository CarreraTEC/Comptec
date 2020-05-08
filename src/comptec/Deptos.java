
package comptec;

public class Deptos extends javax.swing.JFrame {

    public Deptos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreTxt = new javax.swing.JTextField();
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
        limpBtn = new javax.swing.JButton();
        todoBtn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));
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
        getContentPane().add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        modifBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modif32.png"))); // NOI18N
        modifBtn.setBorderPainted(false);
        modifBtn.setContentAreaFilled(false);
        modifBtn.setFocusPainted(false);
        getContentPane().add(modifBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        añadirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add32.png"))); // NOI18N
        añadirBtn.setBorderPainted(false);
        añadirBtn.setContentAreaFilled(false);
        añadirBtn.setFocusPainted(false);
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

        limpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limp32.png"))); // NOI18N
        limpBtn.setBorderPainted(false);
        limpBtn.setContentAreaFilled(false);
        limpBtn.setFocusPainted(false);
        getContentPane().add(limpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        todoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrar32.png"))); // NOI18N
        todoBtn.setBorderPainted(false);
        todoBtn.setContentAreaFilled(false);
        todoBtn.setFocusPainted(false);
        getContentPane().add(todoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search32.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 40, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("________________");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 130, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MOSTRAR TODO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LIMPIAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JButton añadirBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JLabel correoLab;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton deptoBtn;
    private javax.swing.JButton equipoBtn;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jefeBtn;
    private javax.swing.JButton limpBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton modifBtn;
    private javax.swing.JLabel nombreLab;
    private javax.swing.JButton reporteBtn;
    private javax.swing.JLabel telefonoLab;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JButton todoBtn;
    // End of variables declaration//GEN-END:variables
}
