
package Vistas;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Register_view extends javax.swing.JFrame {

    /**
     * Creates new form Login_view
     */
    public Register_view() {
        initComponents();
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        motionPanel = new MotionPanel(this);
        jLabel2 = new javax.swing.JLabel();
        btn_info = new javax.swing.JLabel();
        btn_backToLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_ingresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_passwordConfirm = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motionPanel.setBackground(new java.awt.Color(148, 176, 218));
        motionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registrarse");
        motionPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 60));

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        motionPanel.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        btn_backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btn_backToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(motionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 88));

        jPanel2.setBackground(new java.awt.Color(227, 226, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 210, 20));

        btn_ingresar.setBackground(new java.awt.Color(148, 176, 218));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("Registrarse");
        jPanel2.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 280, 160, 50));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Developed by Freylolo y su gente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jTextField3.setBackground(new java.awt.Color(227, 226, 226));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("Email");
        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 130, 20));

        jRadioButton1.setBackground(new java.awt.Color(227, 226, 226));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Femenino");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(227, 226, 226));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Masculino");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 20));

        jTextField7.setBackground(new java.awt.Color(227, 226, 226));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.setText("Nombres");
        jTextField7.setBorder(null);
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        jTextField8.setBackground(new java.awt.Color(227, 226, 226));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(102, 102, 102));
        jTextField8.setText("Apellidos");
        jTextField8.setBorder(null);
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 30));

        txt_password.setBackground(new java.awt.Color(227, 226, 226));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_password.setForeground(new java.awt.Color(102, 102, 102));
        txt_password.setText("xxxxxx");
        txt_password.setBorder(null);
        txt_password.setEchoChar((char)0);
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 30));

        txt_passwordConfirm.setBackground(new java.awt.Color(227, 226, 226));
        txt_passwordConfirm.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_passwordConfirm.setForeground(new java.awt.Color(102, 102, 102));
        txt_passwordConfirm.setText("xxxxxx");
        txt_passwordConfirm.setBorder(null);
        jPanel2.add(txt_passwordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 222, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 380, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 60, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 3.png"))); // NOI18N
        jLabel4.setText("ss");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// 
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
//            java.util.logging.Logger.getLogger(Register_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Register_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Register_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Register_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Register_view().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_backToLogin;
    private javax.swing.JLabel btn_info;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel motionPanel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordConfirm;
    // End of variables declaration//GEN-END:variables


    public JLabel getBtn_backToLogin() {
        return btn_backToLogin;
    }

    public void setBtn_backToLogin(JLabel btn_backToLogin) {
        this.btn_backToLogin = btn_backToLogin;
    }

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

    

















}
