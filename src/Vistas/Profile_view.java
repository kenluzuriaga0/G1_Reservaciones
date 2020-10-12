package Vistas;

import XComponentes.MotionPanel;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author yitsu
 */
public class Profile_view extends javax.swing.JFrame {

    public Profile_view() {
        initComponents();
        this.setLocationRelativeTo(null);

        txt_fechaFiltro.getCalendarButton().setBackground(new Color(187,187,187));
        
        tabla_historico.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tabla_historico.getTableHeader().setOpaque(false);
        tabla_historico.getTableHeader().setBackground(new Color(29,53,87));
        tabla_historico.getTableHeader().setForeground(new Color(255,255,255));
        tabla_historico.setRowHeight(25);
    }

    public JDateChooser getTxt_fecha() {
        return txt_fechaFiltro;
    }

    public void setTxt_fecha(JDateChooser txt_fecha) {
        this.txt_fechaFiltro = txt_fecha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_grupo = new javax.swing.ButtonGroup();
        jPanel1 = new MotionPanel(this);
        btn_cerrar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        lbl_atras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_resPendientes = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_resHechas = new javax.swing.JLabel();
        lbl_actualizar = new javax.swing.JLabel();
        lbl_actualizarWord = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_historico = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        contenedor_main = new javax.swing.JPanel();
        txt_fechaFiltro = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        lbl_resActual = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_cancelarRes = new javax.swing.JButton();
        btn_borrarFiltro = new javax.swing.JButton();
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
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        lbl_home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_home.setForeground(new java.awt.Color(0, 0, 0));
        lbl_home.setText("Sistema Reservaciones");
        lbl_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        lbl_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 625, Short.MAX_VALUE)
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
                    .addComponent(lbl_home, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lbl_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 50));

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));

        lbl_nombre.setFont(new java.awt.Font("MS UI Gothic", 1, 26)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente");

        lbl_resPendientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_resPendientes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_resPendientes.setText("0");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Reservaciones<br>    Pendientes</html>");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<html>Reservaciones<br>   Hechas</html>");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_resHechas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_resHechas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_resHechas.setText("0");

        lbl_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilEdit.png"))); // NOI18N
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_actualizarWord.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbl_actualizarWord.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizarWord.setText("Actualizar");
        lbl_actualizarWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_actualizarWord, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_actualizar))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_resPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbl_resHechas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resHechas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_actualizarWord)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 990, 160));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 90, -1));

        tabla_historico.setBackground(new java.awt.Color(255, 255, 255));
        tabla_historico.setForeground(new java.awt.Color(0, 0, 0));
        tabla_historico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Fecha", "Dia", "Participantes", "Motivo", "Detalle Motivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_historico.setFocusable(false);
        tabla_historico.setRowHeight(25);
        tabla_historico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_historico.setShowHorizontalLines(true);
        tabla_historico.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_historico);
        if (tabla_historico.getColumnModel().getColumnCount() > 0) {
            tabla_historico.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 820, 220));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, -1));

        contenedor_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fechaFiltro.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        txt_fechaFiltro.setIcon(new ImageIcon(getClass().getResource("/img/calendar.png")));
        contenedor_main.add(txt_fechaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, 40));

        btn_buscar.setBackground(new java.awt.Color(32, 177, 151));
        btn_buscar.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contenedor_main.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, 40));

        lbl_resActual.setBackground(new java.awt.Color(255, 255, 255));
        lbl_resActual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_resActual.setForeground(new java.awt.Color(0, 0, 153));
        lbl_resActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alert.png"))); // NOI18N
        lbl_resActual.setText("00/00/0000 - 00:00");
        lbl_resActual.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_resActual.setOpaque(true);
        contenedor_main.add(lbl_resActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 230, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Reservas Pendientes");
        jLabel8.setOpaque(true);
        contenedor_main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        btn_cancelarRes.setBackground(new java.awt.Color(32, 177, 151));
        btn_cancelarRes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancelarRes.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelarRes.setText("Cancelar Reservacion");
        btn_cancelarRes.setToolTipText("Seleccione 1 posterior a 2 dias de HOY");
        btn_cancelarRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contenedor_main.add(btn_cancelarRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 170, 40));

        btn_borrarFiltro.setBackground(new java.awt.Color(32, 177, 151));
        btn_borrarFiltro.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        btn_borrarFiltro.setForeground(new java.awt.Color(0, 0, 204));
        btn_borrarFiltro.setText("X filtro");
        btn_borrarFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contenedor_main.add(btn_borrarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, -1));

        fondo.setBackground(new java.awt.Color(171, 171, 171));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animation_food TRANS.png"))); // NOI18N
        fondo.setText("Consulta nuestro Menú Aqui");
        fondo.setOpaque(true);
        contenedor_main.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 430));

        getContentPane().add(contenedor_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 820, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    public JLabel getLbl_nombre() {
        return lbl_nombre;
    }

    public JLabel getLbl_resActual() {
        return lbl_resActual;
    }

    public JLabel getLbl_resHechas() {
        return lbl_resHechas;
    }

    public JLabel getLbl_resPendientes() {
        return lbl_resPendientes;
    }


    public JLabel getLbl_home() {
        return lbl_home;
    }

    public JTable getTabla_historico() {
        return tabla_historico;
    }

    public JButton getBtn_cancelarRes() {
        return btn_cancelarRes;
    }

    public JLabel getLbl_actualizar() {
        return lbl_actualizar;
    }

    public JLabel getLbl_actualizarWord() {
        return lbl_actualizarWord;
    }

    public JLabel getLbl_atras() {
        return lbl_atras;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public JButton getBtn_borrarFiltro() {
        return btn_borrarFiltro;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo;
    private javax.swing.JButton btn_borrarFiltro;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelarRes;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel contenedor_main;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JLabel lbl_actualizarWord;
    private javax.swing.JLabel lbl_atras;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_resActual;
    private javax.swing.JLabel lbl_resHechas;
    private javax.swing.JLabel lbl_resPendientes;
    private javax.swing.JTable tabla_historico;
    private com.toedter.calendar.JDateChooser txt_fechaFiltro;
    // End of variables declaration//GEN-END:variables
}
