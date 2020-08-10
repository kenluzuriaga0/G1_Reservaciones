
package Vistas;

import Controlador.Login_control;
import Vistas.MotionPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ForgotPassword extends javax.swing.JFrame {
   
    /**
     * Creates new form Login_view
     */
    public ForgotPassword() {
        initComponents();
        setLocationRelativeTo(null);

        
//        txt_campoPassword.setEchoChar((char)0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        motionPanel = new MotionPanel(this);
        jLabel2 = new javax.swing.JLabel();
        btn_info = new javax.swing.JLabel();
        btn_backToLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_campoEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_restablecer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motionPanel.setBackground(new java.awt.Color(148, 176, 218));
        motionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Restablecer Contraseña");
        motionPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        motionPanel.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        btn_backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btn_backToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(motionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 88));

        jPanel2.setBackground(new java.awt.Color(227, 226, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_campoEmail.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_campoEmail.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoEmail.setText("Email");
        txt_campoEmail.setBorder(null);
        jPanel2.add(txt_campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 210, 20));

        btn_restablecer.setBackground(new java.awt.Color(148, 176, 218));
        btn_restablecer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_restablecer.setForeground(new java.awt.Color(0, 0, 0));
        btn_restablecer.setText("Restablecer Contraseña");
        jPanel2.add(btn_restablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 50));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Developed by Freylolo y su gente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 0, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese su correo electronico");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" para restablecer su contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 380, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 60, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 3.png"))); // NOI18N
        jLabel4.setText("ss");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login_view().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_backToLogin;
    private javax.swing.JLabel btn_info;
    private javax.swing.JButton btn_restablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel motionPanel;
    private javax.swing.JTextField txt_campoEmail;
    // End of variables declaration//GEN-END:variables

    public JLabel getBtn_backToLogin() {
        return btn_backToLogin;
    }

    public JLabel getBtn_info() {
        return btn_info;
    }

    public JButton getBtn_restablecer() {
        return btn_restablecer;
    }

    public void setTxt_campoEmail(JTextField txt_campoEmail) {
        this.txt_campoEmail = txt_campoEmail;
    }

    public JTextField getTxt_campoEmail() {
        return txt_campoEmail;
    }

 














}
