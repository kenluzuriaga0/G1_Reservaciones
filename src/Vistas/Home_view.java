package Vistas;

import Controlador.Login_control;
import Vistas_clases.MotionPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author yitsu
 */
public class Home_view extends javax.swing.JFrame {

    ConsultarMenu_view panel1 = new ConsultarMenu_view();
    Reserva_view panel2 = new Reserva_view();
    CardLayout vista;

    public Home_view() {
        initComponents();
        this.setLocationRelativeTo(null);

        vista = (CardLayout) contenedor_main.getLayout();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_grupo = new javax.swing.ButtonGroup();
        jPanel1 = new MotionPanel(this);
        btn_cerrar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_reservaView = new javax.swing.JToggleButton();
        btn_resenaView = new javax.swing.JToggleButton();
        btn_consultaView = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_perfil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        contenedor_main = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 549, Short.MAX_VALUE)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));

        btn_reservaView.setBackground(new java.awt.Color(112, 193, 179));
        boton_grupo.add(btn_reservaView);
        btn_reservaView.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reservaView.setForeground(new java.awt.Color(0, 0, 0));
        btn_reservaView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reserve.png"))); // NOI18N
        btn_reservaView.setText("Reserva Tu Mesa ¡YA! ");
        btn_reservaView.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_reservaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservaViewActionPerformed(evt);
            }
        });

        btn_resenaView.setBackground(new java.awt.Color(112, 193, 179));
        boton_grupo.add(btn_resenaView);
        btn_resenaView.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btn_resenaView.setForeground(new java.awt.Color(0, 0, 0));
        btn_resenaView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reseña.png"))); // NOI18N
        btn_resenaView.setText("Reseñas");
        btn_resenaView.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btn_consultaView.setBackground(new java.awt.Color(112, 193, 179));
        boton_grupo.add(btn_consultaView);
        btn_consultaView.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btn_consultaView.setForeground(new java.awt.Color(0, 0, 0));
        btn_consultaView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/meun.png"))); // NOI18N
        btn_consultaView.setText("Consultar Menu");
        btn_consultaView.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_consultaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaViewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Reservaciones de Mesas");

        lbl_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kluzuriaga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lbl_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btn_consultaView)
                .addGap(84, 84, 84)
                .addComponent(btn_reservaView, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_resenaView, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_consultaView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(btn_resenaView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reservaView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 160));

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 80, 440));

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
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(lbl_logout)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 90, -1));

        contenedor_main.setLayout(new java.awt.CardLayout());

        fondo.setBackground(new java.awt.Color(171, 171, 171));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animation_food TRANS.png"))); // NOI18N
        fondo.setText("Consulta nuestro Menú Aqui");
        fondo.setOpaque(true);
        contenedor_main.add(fondo, "card2");

        getContentPane().add(contenedor_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 820, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_consultaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaViewActionPerformed
        contenedor_main.add(panel1,"menu");
        vista.show(contenedor_main, "menu");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_consultaViewActionPerformed

    private void btn_reservaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservaViewActionPerformed
        contenedor_main.add(panel2,"reserva");
        vista.show(contenedor_main, "reserva");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();


    }//GEN-LAST:event_btn_reservaViewActionPerformed

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

    public JLabel getLbl_perfil() {
        return lbl_perfil;
    }

    public void setLbl_perfil(JLabel lbl_perfil) {
        this.lbl_perfil = lbl_perfil;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JToggleButton btn_consultaView;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JToggleButton btn_resenaView;
    private javax.swing.JToggleButton btn_reservaView;
    private javax.swing.JPanel contenedor_main;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_perfil;
    // End of variables declaration//GEN-END:variables
}
