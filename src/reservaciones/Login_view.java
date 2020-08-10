
package reservaciones;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Login_view extends javax.swing.JFrame {

    /**
     * Creates new form Login_view
     */
    public Login_view() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_registrarView = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_info = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_olvidarContra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(148, 176, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrarView.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_registrarView.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrarView.setText("Registrarse");
        jPanel1.add(btn_registrarView, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inicio de sesion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        jPanel1.add(btn_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 88));

        jPanel2.setBackground(new java.awt.Color(227, 226, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(227, 226, 226));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Usuario");
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, 20));

        jTextField2.setBackground(new java.awt.Color(227, 226, 226));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("Contraseña");
        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 380, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 60, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_food 3.png"))); // NOI18N
        jLabel4.setText("ss");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
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
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_view().setVisible(true);
            }
        });
    }

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
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















}
