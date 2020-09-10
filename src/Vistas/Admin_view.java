package Vistas;

import Vistas_clases.MotionPanel;
import java.awt.CardLayout;
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        contenedor_main = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 80));

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, 530));

        jPanel4.setBackground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 50, 530));

        contenedor_main.setBackground(new java.awt.Color(227, 226, 226));
        contenedor_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 118, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 45, 77, 40));

        jButton1.setText("Definir Dia");
        contenedor_main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 417, 201, 49));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 139, 118, -1));

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

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 118, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dia Fin");
        contenedor_main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 22, 55, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Hora Fin");
        contenedor_main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 77, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_main.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 118, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        contenedor_main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 77, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Numero Mesas Libres");
        contenedor_main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 201, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contenedor_main.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 76, 23));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Numero Mesas Disponibles");
        contenedor_main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 231, 204, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("## Mesas Libres");
        contenedor_main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 140, -1));
        contenedor_main.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, 890, 10));
        contenedor_main.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 890, 10));
        contenedor_main.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 890, 10));

        getContentPane().add(contenedor_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 890, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel contenedor_main;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
