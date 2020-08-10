
package Vistas;

import Controlador.Login_control;
import Vistas.MotionPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login_view extends javax.swing.JFrame {
    Login_control control;
    /**
     * Creates new form Login_view
     */
    public Login_view() {
        initComponents();
        setLocationRelativeTo(null);

        
//        txt_campoPassword.setEchoChar((char)0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        motionPanel = new MotionPanel(this);
        btn_registrarView = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_info = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_campoUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_olvidarContra = new javax.swing.JLabel();
        txt_campoPassword = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motionPanel.setBackground(new java.awt.Color(148, 176, 218));
        motionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrarView.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_registrarView.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrarView.setText("Registrarse");
        btn_registrarView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_registrarView, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inicio de sesion");
        motionPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        motionPanel.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        getContentPane().add(motionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 88));

        jPanel2.setBackground(new java.awt.Color(227, 226, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_campoUser.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoUser.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_campoUser.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoUser.setText("Usuario");
        txt_campoUser.setBorder(null);
        jPanel2.add(txt_campoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, 20));

        btn_ingresar.setBackground(new java.awt.Color(148, 176, 218));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("Ingresar");
        jPanel2.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 50));

        btn_salir.setBackground(new java.awt.Color(255, 217, 172));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 90, 40));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Developed by Freylolo y su gente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btn_olvidarContra.setForeground(new java.awt.Color(0, 0, 0));
        btn_olvidarContra.setText("Olvide mi contraseña");
        jPanel2.add(btn_olvidarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, -1));

        txt_campoPassword.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoPassword.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txt_campoPassword.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoPassword.setText("Contraseña");
        txt_campoPassword.setBorder(null);
        txt_campoPassword.setEchoChar((char) 0);
        jPanel2.add(txt_campoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 0, 10));

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
    private javax.swing.JLabel btn_info;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel btn_olvidarContra;
    private javax.swing.JLabel btn_registrarView;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel motionPanel;
    private javax.swing.JPasswordField txt_campoPassword;
    private javax.swing.JTextField txt_campoUser;
    // End of variables declaration//GEN-END:variables

    public JLabel getBtn_info() {
        return btn_info;
    }

    public void setBtn_info(JLabel btn_info) {
        this.btn_info = btn_info;
    }

    public JButton getBtn_ingresar() {
        return btn_ingresar;
    }

    public void setBtn_ingresar(JButton btn_ingresar) {
        this.btn_ingresar = btn_ingresar;
    }

    public JLabel getBtn_olvidarContra() {
        return btn_olvidarContra;
    }

    public void setBtn_olvidarContra(JLabel btn_olvidarContra) {
        this.btn_olvidarContra = btn_olvidarContra;
    }

    public JLabel getBtn_registrarView() {
        return btn_registrarView;
    }

    public void setBtn_registrarView(JLabel btn_registrarView) {
        this.btn_registrarView = btn_registrarView;
    }

    public JButton getBtn_salir() {
        return btn_salir;
    }

    public void setBtn_salir(JButton btn_salir) {
        this.btn_salir = btn_salir;
    }

    public JPasswordField getTxt_campoPassword() {
        return txt_campoPassword;
    }

    public void setTxt_campoPassword(JPasswordField txt_campoPassword) {
        this.txt_campoPassword = txt_campoPassword;
    }

    public JTextField getTxt_campoUser() {
        return txt_campoUser;
    }

    public void setTxt_campoUser(JTextField txt_campoUser) {
        this.txt_campoUser = txt_campoUser;
    }















}
