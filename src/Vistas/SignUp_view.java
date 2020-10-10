package Vistas;

import zComponentes.MotionPanel;
import zComponentes.PlaceHolder;
import java.awt.Desktop;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp_view extends javax.swing.JFrame {

    /**
     * Creates new form Login_view
     */
    public SignUp_view() {
        initComponents();
        setLocationRelativeTo(null);
        //PLACEHOLDER EN INPUTS
        txt_nombres.addFocusListener(new PlaceHolder_SignUp());
        txt_apellidos.addFocusListener(new PlaceHolder_SignUp());
        txt_email.addFocusListener(new PlaceHolder_SignUp());
        txt_password.addFocusListener(new PlaceHolder_SignUp());
        txt_passwordConfirm.addFocusListener(new PlaceHolder_SignUp());
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
        btn_registrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        radio_f = new javax.swing.JRadioButton();
        radio_m = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_passwordConfirm = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
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
        btn_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        btn_backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btn_backToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        getContentPane().add(motionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 88));

        jPanel2.setBackground(new java.awt.Color(227, 226, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 210, 20));

        btn_registrar.setBackground(new java.awt.Color(148, 176, 218));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registrarse");
        jPanel2.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 280, 160, 50));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Developed by Freylolo y su gente");
        jLabel7.setToolTipText("minspam_00 ");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txt_email.setBackground(new java.awt.Color(227, 226, 226));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setText("Email");
        txt_email.setBorder(null);
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 130, 20));

        radio_f.setBackground(new java.awt.Color(227, 226, 226));
        buttonGroup1.add(radio_f);
        radio_f.setForeground(new java.awt.Color(0, 0, 0));
        radio_f.setText("Femenino");
        jPanel2.add(radio_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        radio_m.setBackground(new java.awt.Color(227, 226, 226));
        buttonGroup1.add(radio_m);
        radio_m.setForeground(new java.awt.Color(0, 0, 0));
        radio_m.setText("Masculino");
        jPanel2.add(radio_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 20));

        txt_nombres.setBackground(new java.awt.Color(227, 226, 226));
        txt_nombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombres.setText("Nombres");
        txt_nombres.setBorder(null);
        jPanel2.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 30));

        txt_apellidos.setBackground(new java.awt.Color(227, 226, 226));
        txt_apellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellidos.setText("Apellidos");
        txt_apellidos.setBorder(null);
        jPanel2.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 30));

        txt_password.setBackground(new java.awt.Color(227, 226, 226));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(102, 102, 102));
        txt_password.setText("Contraseña");
        txt_password.setBorder(null);
        txt_password.setEchoChar((char)0);
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 30));

        txt_passwordConfirm.setBackground(new java.awt.Color(227, 226, 226));
        txt_passwordConfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_passwordConfirm.setForeground(new java.awt.Color(102, 102, 102));
        txt_passwordConfirm.setText("Repetir Contraseña");
        txt_passwordConfirm.setBorder(null);
        txt_passwordConfirm.setEchoChar((char)0);
        jPanel2.add(txt_passwordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 222, 160, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 0, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 380, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 60, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 3.png"))); // NOI18N
        jLabel4.setText("ss");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("https://www.instagram.com/minspam_00/"));
                }
            }
        } catch (Exception ex) {
            System.out.println("Fallo Hipervinculo");
        }


    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_backToLogin;
    private javax.swing.JLabel btn_info;
    private javax.swing.JButton btn_registrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel motionPanel;
    private javax.swing.JRadioButton radio_f;
    private javax.swing.JRadioButton radio_m;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordConfirm;
    // End of variables declaration//GEN-END:variables

    private class PlaceHolder_SignUp implements FocusListener {

        Object foco;

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == txt_nombres) {

                PlaceHolder.quitar_PlaceHolder("Nombres", txt_nombres);

            } else if (foco == txt_apellidos) {

                PlaceHolder.quitar_PlaceHolder("Apellidos", txt_apellidos);
            } else if (foco == txt_email) {

                PlaceHolder.quitar_PlaceHolder("Email", txt_email);
            } else if (foco == txt_password) {

                PlaceHolder.quitar_PlaceHolder("Contraseña", txt_password);
            } else if (foco == txt_passwordConfirm) {

                PlaceHolder.quitar_PlaceHolder("Repetir Contraseña", txt_passwordConfirm);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == txt_nombres) {

                PlaceHolder.poner_PlaceHolder("Nombres", txt_nombres);

            } else if (foco == txt_apellidos) {

                PlaceHolder.poner_PlaceHolder("Apellidos", txt_apellidos);
            } else if (foco == txt_email) {

                PlaceHolder.poner_PlaceHolder("Email", txt_email);
            } else if (foco == txt_password) {

                PlaceHolder.poner_PlaceHolder("Contraseña", txt_password);
            } else if (foco == txt_passwordConfirm) {

                PlaceHolder.poner_PlaceHolder("Repetir Contraseña", txt_passwordConfirm);
            }

        }
    }

    public JLabel getBtn_backToLogin() {
        return btn_backToLogin;
    }

    public JLabel getBtn_info() {
        return btn_info;
    }

    public JButton getBtn_ingresar() {
        return btn_registrar;
    }

    public JTextField getTxt_apellidos() {
        return txt_apellidos;
    }

    public void setTxt_apellidos(JTextField txt_apellidos) {
        this.txt_apellidos = txt_apellidos;
    }

    public JTextField getTxt_email() {
        return txt_email;
    }

    public void setTxt_email(JTextField txt_email) {
        this.txt_email = txt_email;
    }

    public JTextField getTxt_nombres() {
        return txt_nombres;
    }

    public void setTxt_nombres(JTextField txt_nombres) {
        this.txt_nombres = txt_nombres;
    }

    public JPasswordField getTxt_password() {
        return txt_password;
    }

    public void setTxt_password(JPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    public JPasswordField getTxt_passwordConfirm() {
        return txt_passwordConfirm;
    }

    public void setTxt_passwordConfirm(JPasswordField txt_passwordConfirm) {
        this.txt_passwordConfirm = txt_passwordConfirm;
    }

    public JRadioButton getRadio_f() {
        return radio_f;
    }

    public void setRadio_f(JRadioButton radio_f) {
        this.radio_f = radio_f;
    }

    public JRadioButton getRadio_m() {
        return radio_m;
    }

    public void setRadio_m(JRadioButton radio_m) {
        this.radio_m = radio_m;
    }

}
