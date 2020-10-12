package XComponentes;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author kenlu
 */
public class EditarPerfil extends javax.swing.JDialog {

    /**
     * Creates new form EditarPerfil
     */
    public EditarPerfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Actualizar Usuario");
        this.setIconImage(I.get("editusuario"));
        this.setLocationRelativeTo(null);
    }

    public JTextField getTxt_apellidosNew() {
        return txt_apellidosNew;
    }

    public void setTxt_apellidosNew(JTextField txt_apellidosNew) {
        this.txt_apellidosNew = txt_apellidosNew;
    }

    public JPasswordField getTxt_campoPassword() {
        return txt_campoPassword;
    }

    public void setTxt_campoPassword(JPasswordField txt_campoPassword) {
        this.txt_campoPassword = txt_campoPassword;
    }

    public JPasswordField getTxt_campoPasswordNew() {
        return txt_campoPasswordNew;
    }

    public void setTxt_campoPasswordNew(JPasswordField txt_campoPasswordNew) {
        this.txt_campoPasswordNew = txt_campoPasswordNew;
    }

    public JTextField getTxt_emailNew() {
        return txt_emailNew;
    }

    public void setTxt_emailNew(JTextField txt_emailNew) {
        this.txt_emailNew = txt_emailNew;
    }

    public JTextField getTxt_nombresNew() {
        return txt_nombresNew;
    }

    public void setTxt_nombresNew(JTextField txt_nombresNew) {
        this.txt_nombresNew = txt_nombresNew;
    }

    public JTextField getTxt_usernameNew() {
        return txt_usernameNew;
    }

    public void setTxt_usernameNew(JTextField txt_usernameNew) {
        this.txt_usernameNew = txt_usernameNew;
    }

    public JButton getBtn_confirmarCambios() {
        return btn_confirmarCambios;
    }

    public JComboBox<String> getCmb_dominio() {
        return cmb_dominio;
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_campoPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_nombresNew = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_apellidosNew = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_usernameNew = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_campoPasswordNew = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_emailNew = new ValidaCorreo();
        jSeparator7 = new javax.swing.JSeparator();
        btn_confirmarCambios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_dominio = new ComboBoxCorreo();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_campoPassword.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoPassword.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoPassword.setText("ingrese contraseña actual");
        txt_campoPassword.setBorder(null);
        txt_campoPassword.setEchoChar((char) 0);
        txt_campoPassword.setOpaque(false);
        jPanel1.add(txt_campoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 338, 181, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 369, 181, 20));

        txt_nombresNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_nombresNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombresNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombresNew.setText("Nombres");
        txt_nombresNew.setBorder(null);
        txt_nombresNew.setOpaque(false);
        jPanel1.add(txt_nombresNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));

        txt_apellidosNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_apellidosNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_apellidosNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellidosNew.setText("Apellidos");
        txt_apellidosNew.setBorder(null);
        txt_apellidosNew.setOpaque(false);
        jPanel1.add(txt_apellidosNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 140, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 130, 8));

        txt_usernameNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_usernameNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_usernameNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_usernameNew.setText("nombre usuario");
        txt_usernameNew.setBorder(null);
        txt_usernameNew.setOpaque(false);
        jPanel1.add(txt_usernameNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        txt_campoPasswordNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoPasswordNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoPasswordNew.setText("nueva contraseña");
        txt_campoPasswordNew.setBorder(null);
        txt_campoPasswordNew.setEchoChar((char) 0);
        txt_campoPasswordNew.setOpaque(false);
        jPanel1.add(txt_campoPasswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 128, 19));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 128, 14));

        txt_emailNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_emailNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emailNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_emailNew.setText("Email");
        txt_emailNew.setBorder(null);
        txt_emailNew.setOpaque(false);
        jPanel1.add(txt_emailNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 15));

        btn_confirmarCambios.setBackground(new java.awt.Color(32, 177, 151));
        btn_confirmarCambios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_confirmarCambios.setForeground(new java.awt.Color(0, 0, 0));
        btn_confirmarCambios.setText("Confirmar Cambios");
        jPanel1.add(btn_confirmarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 181, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 10, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilEdit.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 49, -1, 71));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 0, 5));

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 49, 70, -1));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, 70, -1));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 70, -1));

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 215, 70, -1));

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 94, -1));

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña Actual");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 315, 128, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Actualice los datos que desea");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 18, 293, -1));
        jPanel1.add(cmb_dominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 140, -1));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Obligatorio para actualizar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmarCambios;
    private javax.swing.JComboBox<String> cmb_dominio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_apellidosNew;
    private javax.swing.JPasswordField txt_campoPassword;
    private javax.swing.JPasswordField txt_campoPasswordNew;
    private javax.swing.JTextField txt_emailNew;
    private javax.swing.JTextField txt_nombresNew;
    private javax.swing.JTextField txt_usernameNew;
    // End of variables declaration//GEN-END:variables
}
