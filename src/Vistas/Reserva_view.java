package Vistas;

import java.awt.Color;
import javax.swing.ImageIcon;


/**
 *
 * @author kenlu
 */
public class Reserva_view extends javax.swing.JPanel {

    /**
     * Creates new form Reserva_view
     */
    public Reserva_view() {

        initComponents();

        fecha.getCalendarButton().setBackground(new Color(29, 53, 87));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fecha = new com.toedter.calendar.JDateChooser();
        hora = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        txt_detalleMotivo = new javax.swing.JTextField();
        cmb_tipo = new javax.swing.JComboBox<>();
        btn_Reservar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fecha.setIcon(new ImageIcon(getClass().getResource("/img/calendar.png")));
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 40));

        hora.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        hora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR_OF_DAY));
        hora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hora.setEditor(new javax.swing.JSpinner.DateEditor(hora, "HH:mm"));
        jPanel2.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 40));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora   ->");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha ->");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 310, 130));

        jLabel1.setBackground(new java.awt.Color(29, 53, 87));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Llene los campos para realizar la reserva de mesa");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 40));

        jLabel3.setBackground(new java.awt.Color(29, 53, 87));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Detalle motivo Ej (Cumpleaños, Aniversario, etc)");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 320, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Laboral");

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Amigos");

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Familiar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jCheckBox3)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        txt_detalleMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txt_detalleMotivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_detalleMotivo.setForeground(new java.awt.Color(153, 153, 153));
        txt_detalleMotivo.setText("Motivo");
        add(txt_detalleMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 400, 30));

        cmb_tipo.setBackground(new java.awt.Color(29, 53, 87));
        cmb_tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_tipo.setForeground(new java.awt.Color(255, 255, 255));
        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña 4 Per", "Grande   8  Per", " " }));
        add(cmb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 30));

        btn_Reservar.setBackground(new java.awt.Color(46, 253, 217));
        btn_Reservar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Reservar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Reservar.setText("<html>Confirmar Reservacion</html>");
        btn_Reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reservar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(btn_Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 130, 60));

        jLabel2.setBackground(new java.awt.Color(29, 53, 87));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motivo");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 20));

        fondo.setBackground(new java.awt.Color(171, 171, 171));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animation_food TRANS.png"))); // NOI18N
        fondo.setText("Consulta nuestro Menú Aqui");
        fondo.setOpaque(true);
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JComboBox<String> cmb_tipo;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JSpinner hora;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txt_detalleMotivo;
    // End of variables declaration//GEN-END:variables
}
