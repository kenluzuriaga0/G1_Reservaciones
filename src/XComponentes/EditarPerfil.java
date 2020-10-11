package XComponentes;

import javax.swing.JButton;
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
        txt_emailNew = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_confirmarCambios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_campoPassword.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoPassword.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoPassword.setText("ingrese contraseña actual");
        txt_campoPassword.setBorder(null);
        txt_campoPassword.setEchoChar((char) 0);
        txt_campoPassword.setOpaque(false);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txt_nombresNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_nombresNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombresNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombresNew.setText("Nombres");
        txt_nombresNew.setBorder(null);
        txt_nombresNew.setOpaque(false);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        txt_apellidosNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_apellidosNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_apellidosNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellidosNew.setText("Apellidos");
        txt_apellidosNew.setBorder(null);
        txt_apellidosNew.setOpaque(false);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        txt_usernameNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_usernameNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_usernameNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_usernameNew.setText("nombre usuario");
        txt_usernameNew.setBorder(null);
        txt_usernameNew.setOpaque(false);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        txt_campoPasswordNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_campoPasswordNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_campoPasswordNew.setText("nueva contraseña");
        txt_campoPasswordNew.setBorder(null);
        txt_campoPasswordNew.setEchoChar((char) 0);
        txt_campoPasswordNew.setOpaque(false);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        txt_emailNew.setBackground(new java.awt.Color(227, 226, 226));
        txt_emailNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emailNew.setForeground(new java.awt.Color(102, 102, 102));
        txt_emailNew.setText("Email");
        txt_emailNew.setBorder(null);
        txt_emailNew.setOpaque(false);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        btn_confirmarCambios.setBackground(new java.awt.Color(32, 177, 151));
        btn_confirmarCambios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_confirmarCambios.setForeground(new java.awt.Color(0, 0, 0));
        btn_confirmarCambios.setText("Confirmar Cambios");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilEdit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usernameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_campoPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_emailNew, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nombresNew, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txt_apellidosNew, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(btn_confirmarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txt_campoPassword))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_usernameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombresNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidosNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(txt_emailNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_campoPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_confirmarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txt_apellidosNew;
    private javax.swing.JPasswordField txt_campoPassword;
    private javax.swing.JPasswordField txt_campoPasswordNew;
    private javax.swing.JTextField txt_emailNew;
    private javax.swing.JTextField txt_nombresNew;
    private javax.swing.JTextField txt_usernameNew;
    // End of variables declaration//GEN-END:variables
}
