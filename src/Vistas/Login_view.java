package Vistas;

import Controlador.Login_control;
import XComponentes.MotionPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import XComponentes.PlaceHolder;
import java.awt.Desktop;
import java.awt.font.TextAttribute;
import java.net.URI;
import java.util.Map;

public class Login_view extends javax.swing.JFrame {

    Login_control control;

    public Login_view() {
        initComponents();
        this.setLocationRelativeTo(null);
        initListener();
        txt_campoUser.setText("nvera");
        txt_campoPassword.setText("nvera");
     //  txt_campoUser.setText("admin");
     //  txt_campoPassword.setText("admin1");
        
       

    }

    public void initListener() {

        txt_campoUser.addFocusListener(new PlaceHolder_Login());
        txt_campoPassword.addFocusListener(new PlaceHolder_Login());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        motionPanel = new MotionPanel(this);
        btn_registrarView = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_info = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txt_campoUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_mispam = new javax.swing.JLabel();
        btn_olvidarContra = new javax.swing.JLabel();
        txt_campoPassword = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        btn_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motionPanel.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));
        motionPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        motionPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, 10));

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
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });
        jPanel2.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 50));

        btn_salir.setBackground(new java.awt.Color(255, 217, 172));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 90, 40));

        lbl_mispam.setForeground(new java.awt.Color(0, 0, 0));
        lbl_mispam.setText("Developed by Freylolo y su gente");
        lbl_mispam.setToolTipText("minspam_00");
        lbl_mispam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_mispam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_mispamMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_mispam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btn_olvidarContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_olvidarContra.setForeground(new java.awt.Color(0, 0, 0));
        btn_olvidarContra.setText("Olvide mi contraseña");
        btn_olvidarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_olvidarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_olvidarContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_olvidarContraMouseExited(evt);
            }
        });
        jPanel2.add(btn_olvidarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 30));

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

    //HOVER de boton
    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        btn_ingresar.setBackground(new Color(148, 152, 229));
        btn_ingresar.setBorder(new LineBorder(new Color(148, 152, 229)));
    }//GEN-LAST:event_btn_ingresarMouseEntered
    //HOVER de boton
    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        btn_ingresar.setBackground(new Color(148, 176, 218));
        btn_ingresar.setBorder(new LineBorder(new Color(48, 176, 218)));
    }//GEN-LAST:event_btn_ingresarMouseExited
    //subrayado
    private void btn_olvidarContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_olvidarContraMouseEntered
        Font formato = btn_olvidarContra.getFont();
        Map atributos = formato.getAttributes();  
        
        atributos.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        this.btn_olvidarContra.setFont(formato.deriveFont(atributos));
    }//GEN-LAST:event_btn_olvidarContraMouseEntered

    private void btn_olvidarContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_olvidarContraMouseExited
        
        Font formato = btn_olvidarContra.getFont();  //obtiene la fuente
        Map atributos = formato.getAttributes(); //guarda en un Map todos los atributos del label
        
        atributos.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE); //ambia los atributos
        this.btn_olvidarContra.setFont(formato.deriveFont(atributos));  //setea los atributos 
       
    }//GEN-LAST:event_btn_olvidarContraMouseExited

    private void lbl_mispamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_mispamMouseClicked

        try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://www.instagram.com/minspam_00/"));
                }
            }
        }catch(Exception ex){
            System.out.println("Fallo Hipervinculo");
        }
    }//GEN-LAST:event_lbl_mispamMouseClicked


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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_mispam;
    private javax.swing.JPanel motionPanel;
    private javax.swing.JPasswordField txt_campoPassword;
    private javax.swing.JTextField txt_campoUser;
    // End of variables declaration//GEN-END:variables


//Clase ára poner PLACEHOLDER con Focus-----------------------------
    private class PlaceHolder_Login implements FocusListener {

        Object foco;

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == txt_campoUser) {

                PlaceHolder.quitar_PlaceHolder("Usuario", txt_campoUser);

            } else if (foco == txt_campoPassword) {

                PlaceHolder.quitar_PlaceHolder("Contraseña", txt_campoPassword);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == txt_campoUser) {

                PlaceHolder.poner_PlaceHolder("Usuario", txt_campoUser);

            } else if (foco == txt_campoPassword) {

                PlaceHolder.poner_PlaceHolder("Contraseña", txt_campoPassword);
            }

        }
    }

    
    
    
    
    //METODOS GETTERS & SETTERS -----------------------------------------
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
