
package comptec;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    ConexionBD conex = new ConexionBD();
    Connection conect = conex.conexion();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void validarAcceso() {
        try {
            CallableStatement call = conect.prepareCall("call login_validar(?,?,?)");
            call.setString(1, txtUser.getText());
            call.setString(2, String.valueOf(txtPass.getPassword()));
            call.registerOutParameter(3, java.sql.Types.VARCHAR);
            call.execute();
           
            //Si es admin...
            if ("Admin".equals(call.getString(3))) {
                Equipos equip = new Equipos();
                equip.setVisible(true);
                this.dispose();
            
            //Si es jefe...
            } else if ("Jefe".equals(call.getString(3))) {
                Deptos dept = new Deptos();
                dept.setVisible(true);
                this.dispose();
            } 
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUSer = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUSer.setFont(new java.awt.Font("Poppins", 3, 24)); // NOI18N
        labelUSer.setText("Usuario:");
        getContentPane().add(labelUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        txtUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 260, 40));

        labelPass.setFont(new java.awt.Font("Poppins", 3, 24)); // NOI18N
        labelPass.setText("Contraseña:");
        getContentPane().add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        txtPass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 260, 40));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iniciar.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 200, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/login.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 618));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        validarAcceso();
    }//GEN-LAST:event_btnLoginActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUSer;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
