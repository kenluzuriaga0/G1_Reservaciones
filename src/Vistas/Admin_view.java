package Vistas;

import Controlador.Login_control;
import Vistas_clases.MotionPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author kenlu
 */
public class Admin_view extends javax.swing.JFrame {

    ConsultarMenu_view panel1 = new ConsultarMenu_view();
    Reserva_view panel2 = new Reserva_view();

    public Admin_view() {
        initComponents();
        this.setLocationRelativeTo(null);

  

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_grupo = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new MotionPanel(this);
        btn_cerrar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_reportes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        contenedor_main = new javax.swing.JPanel();
        txt_diaFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_definirDia = new javax.swing.JButton();
        txt_horaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_diaInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_horaFin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spn_mesasDisp = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        lbl_mesasFree = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 102, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1500, 1200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(148, 176, 218));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_1.png"))); // NOI18N
        btn_cerrar.setText("jLabel4");
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });

        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        btn_minimizar.setText("jLabel4");
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sistema Reservaciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE)
                .addComponent(btn_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion");

        lbl_reportes.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lbl_reportes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reportes.setText("Reportes");
        lbl_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(lbl_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1050, 80));

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, 590));

        jPanel4.setBackground(new java.awt.Color(29, 53, 87));

        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        lbl_logout.setText("jLabel6");
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_logoutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(lbl_logout)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 50, 590));

        contenedor_main.setBackground(new java.awt.Color(227, 226, 226));
        contenedor_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_diaFin.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(txt_diaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 118, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 45, 77, 40));

        btn_definirDia.setBackground(new java.awt.Color(102, 102, 102));
        btn_definirDia.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        btn_definirDia.setForeground(new java.awt.Color(0, 0, 0));
        btn_definirDia.setText("Definir Dia");
        contenedor_main.add(btn_definirDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 417, 201, 49));

        txt_horaInicio.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(txt_horaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 139, 118, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 121, 77, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dia Inicio");
        contenedor_main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 22, 76, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hora Inicio");
        contenedor_main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 107, 77, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 77, 40));

        txt_diaInicio.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(txt_diaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 118, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dia Fin");
        contenedor_main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 22, 55, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Hora Fin");
        contenedor_main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 77, -1));

        txt_horaFin.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(txt_horaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 118, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 77, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Numero Mesas Libres");
        contenedor_main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 201, -1));

        spn_mesasDisp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contenedor_main.add(spn_mesasDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 76, 23));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Numero Mesas Disponibles");
        contenedor_main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 231, 204, -1));

        lbl_mesasFree.setBackground(new java.awt.Color(0, 0, 0));
        lbl_mesasFree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_mesasFree.setForeground(new java.awt.Color(51, 51, 51));
        lbl_mesasFree.setText("## Mesas Libres");
        contenedor_main.add(lbl_mesasFree, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 140, -1));
        contenedor_main.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, 890, 10));
        contenedor_main.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 890, 10));
        contenedor_main.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 890, 10));

        getContentPane().add(contenedor_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 950, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void lbl_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMousePressed

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesion?", "Confirmacion", JOptionPane.YES_OPTION);
        if (opcion == 0) {
            this.dispose();
            Login_view login = new Login_view();
            Login_control login_con = new Login_control(login);

            login.setVisible(true);
        } else {
            System.out.println("el num 1");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_logoutMousePressed

    public JButton getBtn_definirDia() {
        return btn_definirDia;
    }

    public void setBtn_definirDia(JButton btn_definirDia) {
        this.btn_definirDia = btn_definirDia;
    }

    public JLabel getLbl_mesasFree() {
        return lbl_mesasFree;
    }

    public void setLbl_mesasFree(JLabel lbl_mesasFree) {
        this.lbl_mesasFree = lbl_mesasFree;
    }

    public JLabel getLbl_reportes() {
        return lbl_reportes;
    }

    public void setLbl_reportes(JLabel lbl_reportes) {
        this.lbl_reportes = lbl_reportes;
    }

    public JSpinner getSpn_mesasDisp() {
        return spn_mesasDisp;
    }

    public void setSpn_mesasDisp(JSpinner spn_mesasDisp) {
        this.spn_mesasDisp = spn_mesasDisp;
    }

    public JTextField getTxt_diaFin() {
        return txt_diaFin;
    }

    public void setTxt_diaFin(JTextField txt_diaFin) {
        this.txt_diaFin = txt_diaFin;
    }

    public JTextField getTxt_diaInicio() {
        return txt_diaInicio;
    }

    public void setTxt_diaInicio(JTextField txt_diaInicio) {
        this.txt_diaInicio = txt_diaInicio;
    }

    public JTextField getTxt_horaFin() {
        return txt_horaFin;
    }

    public void setTxt_horaFin(JTextField txt_horaFin) {
        this.txt_horaFin = txt_horaFin;
    }

    public JTextField getTxt_horaInicio() {
        return txt_horaInicio;
    }

    public void setTxt_horaInicio(JTextField txt_horaInicio) {
        this.txt_horaInicio = txt_horaInicio;
    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JButton btn_definirDia;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel contenedor_main;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_mesasFree;
    private javax.swing.JLabel lbl_reportes;
    private javax.swing.JSpinner spn_mesasDisp;
    private javax.swing.JTextField txt_diaFin;
    private javax.swing.JTextField txt_diaInicio;
    private javax.swing.JTextField txt_horaFin;
    private javax.swing.JTextField txt_horaInicio;
    // End of variables declaration//GEN-END:variables
}
