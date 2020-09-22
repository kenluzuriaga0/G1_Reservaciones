package Vistas;

import Controlador.Login_control;
import Controlador.Reservaciones;
import Vistas_clases.MotionPanel;
import com.toedter.calendar.JDateChooser;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author kenlu
 */
public class Reporte_view extends javax.swing.JFrame {

    ConsultarMenu_view panel1 = new ConsultarMenu_view();
    Reserva_view panel2 = new Reserva_view();

    public Reporte_view() {
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
        lbl_administracion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        contenedor_main = new javax.swing.JPanel();
        btn_consultarMesas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_consultas = new javax.swing.JTable();
        txt_desde = new com.toedter.calendar.JDateChooser();
        txt_hasta = new com.toedter.calendar.JDateChooser();

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
        jLabel1.setText("Reportes");

        lbl_administracion.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lbl_administracion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_administracion.setText("Administracion");
        lbl_administracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
                .addComponent(lbl_administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(lbl_logout)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 50, 530));

        contenedor_main.setBackground(new java.awt.Color(227, 226, 226));

        btn_consultarMesas.setBackground(new java.awt.Color(102, 102, 102));
        btn_consultarMesas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_consultarMesas.setText("Consultar Reservaciones");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Desde");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hasta");

        tabla_consultas.setBackground(new java.awt.Color(204, 204, 204));
        tabla_consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num", "Cliente", "Fecha", "Hora", "Estado", "Participantes", "Motivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_consultas);
        if (tabla_consultas.getColumnModel().getColumnCount() > 0) {
            tabla_consultas.getColumnModel().getColumn(0).setResizable(false);
            tabla_consultas.getColumnModel().getColumn(6).setResizable(false);
        }

        txt_desde.setBackground(new java.awt.Color(255, 255, 255));
        txt_desde.setForeground(new java.awt.Color(0, 0, 0));
        txt_desde.setDateFormatString("dd-MMM-yyyy");
        txt_desde.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txt_desde.setIcon(new ImageIcon(getClass().getResource("/img/calendar2.jpg"))
        );
        txt_desde.setOpaque(false);

        txt_hasta.setBackground(new java.awt.Color(255, 255, 255));
        txt_hasta.setForeground(new java.awt.Color(0, 0, 0));
        txt_hasta.setDateFormatString("dd-MMM-yyyy");
        txt_hasta.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txt_hasta.setIcon(new ImageIcon(getClass().getResource("/img/calendar2.jpg"))
        );
        txt_hasta.setOpaque(false);

        javax.swing.GroupLayout contenedor_mainLayout = new javax.swing.GroupLayout(contenedor_main);
        contenedor_main.setLayout(contenedor_mainLayout);
        contenedor_mainLayout.setHorizontalGroup(
            contenedor_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(contenedor_mainLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_consultarMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedor_mainLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(contenedor_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(contenedor_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
        );
        contenedor_mainLayout.setVerticalGroup(
            contenedor_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_mainLayout.createSequentialGroup()
                .addGroup(contenedor_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_mainLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(contenedor_mainLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btn_consultarMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(contenedor_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 890, 520));

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
            String[] args = null;
            Reservaciones.main(args);


        } else {
            System.out.println("el num 1");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_logoutMousePressed

    public JButton getBtn_consultarMesas() {
        return btn_consultarMesas;
    }

    public void setBtn_consultarMesas(JButton btn_consultarMesas) {
        this.btn_consultarMesas = btn_consultarMesas;
    }

    public JLabel getLbl_administracion() {
        return lbl_administracion;
    }

    public void setLbl_administracion(JLabel lbl_administracion) {
        this.lbl_administracion = lbl_administracion;
    }

    public JTable getTabla_consultas() {
        return tabla_consultas;
    }

    public void setTabla_consultas(JTable tabla_consultas) {
        this.tabla_consultas = tabla_consultas;
    }

    public JDateChooser getTxt_desde() {
        return txt_desde;
    }

    public void setTxt_desde(JDateChooser txt_desde) {
        this.txt_desde = txt_desde;
    }

    public JDateChooser getTxt_hasta() {
        return txt_hasta;
    }

    public void setTxt_hasta(JDateChooser txt_hasta) {
        this.txt_hasta = txt_hasta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JButton btn_consultarMesas;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel contenedor_main;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_administracion;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JTable tabla_consultas;
    private com.toedter.calendar.JDateChooser txt_desde;
    private com.toedter.calendar.JDateChooser txt_hasta;
    // End of variables declaration//GEN-END:variables
}
