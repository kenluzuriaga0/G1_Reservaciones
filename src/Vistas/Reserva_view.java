package Vistas;

import Controlador.Login_control;
import Dao.Reservaciones_dao;
import Dao.Mesas_dao;
import Modelo.Reservacion;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

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
//        daoDisponibles = new Mesas_dao();
//        daoReservaciones = new Reservaciones_dao();

        cuadroFechaReservacion.getCalendarButton().setBackground(new Color(29, 53, 87));
    }

    public JCheckBox getAmigos() {
        return amigos;
    }

    public JButton getBtn_Reservar() {
        return btn_Reservar;
    }

    public JComboBox<String> getCmb_NumPersonas() {
        return cmb_NumPersonas;
    }

    public JDateChooser getCuadroFechaReservacion() {
        return cuadroFechaReservacion;
    }

    public JCheckBox getFamiliar() {
        return familiar;
    }

    public JCheckBox getLaboral() {
        return laboral;
    }

    public JSpinner getSpn_hora() {
        return spn_hora;
    }

    public JSpinner getSpn_minuto() {
        return spn_minuto;
    }

    public JTextField getTxt_detalleMotivo() {
        return txt_detalleMotivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cuadroFechaReservacion = new com.toedter.calendar.JDateChooser();
        spn_minuto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spn_hora = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        laboral = new javax.swing.JCheckBox();
        amigos = new javax.swing.JCheckBox();
        familiar = new javax.swing.JCheckBox();
        txt_detalleMotivo = new javax.swing.JTextField();
        btn_Reservar = new javax.swing.JButton();
        cmb_NumPersonas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuadroFechaReservacion.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cuadroFechaReservacion.setIcon(new ImageIcon(getClass().getResource("/img/calendar.png")));
        jPanel2.add(cuadroFechaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 40));

        spn_minuto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spn_minuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spn_minuto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spn_minuto.setEditor(new javax.swing.JSpinner.NumberEditor(spn_minuto, "00"));
        jPanel2.add(spn_minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 60, 40));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora   ->");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha ->");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        spn_hora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spn_hora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        spn_hora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spn_hora.setEditor(new javax.swing.JSpinner.NumberEditor(spn_hora, "00"));
        jPanel2.add(spn_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("hr   :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 80, 30, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("min");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, -1));

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

        laboral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        laboral.setForeground(new java.awt.Color(0, 0, 0));
        laboral.setText("Laboral");

        amigos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amigos.setForeground(new java.awt.Color(0, 0, 0));
        amigos.setText("Amigos");

        familiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        familiar.setForeground(new java.awt.Color(0, 0, 0));
        familiar.setText("Familiar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(laboral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(amigos)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(familiar)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amigos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(familiar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        txt_detalleMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txt_detalleMotivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_detalleMotivo.setForeground(new java.awt.Color(153, 153, 153));
        txt_detalleMotivo.setText("Motivo");
        add(txt_detalleMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 400, 30));

        btn_Reservar.setBackground(new java.awt.Color(46, 253, 217));
        btn_Reservar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Reservar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Reservar.setText("<html>Confirmar Reservacion</html>");
        btn_Reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reservar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReservarActionPerformed(evt);
            }
        });
        add(btn_Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 130, 60));

        cmb_NumPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Personas", "3 Personas", "4 Personas", "5 Personas", "6 Personas", "7 Personas", "8 Personas" }));
        add(cmb_NumPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel2.setBackground(new java.awt.Color(29, 53, 87));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Participantes");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 20));

        jLabel9.setBackground(new java.awt.Color(29, 53, 87));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Motivo");
        jLabel9.setOpaque(true);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 20));

        fondo.setBackground(new java.awt.Color(171, 171, 171));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animation_food TRANS.png"))); // NOI18N
        fondo.setText("Consulta nuestro Menú Aqui");
        fondo.setOpaque(true);
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));
    }// </editor-fold>//GEN-END:initComponents
    Mesas_dao daoDisponibles;
    Reservaciones_dao daoReservaciones;
    private void btn_ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReservarActionPerformed

//        java.util.Date fecha = this.cuadroFechaReservacion.getDate();
//
//        long milis = this.setearTiempo(fecha, 0, 0);//fecha.getTime();
//        java.sql.Date sqlfecha = new java.sql.Date(milis);
//        int hora, minutos, personas;
//        hora = Integer.valueOf(String.valueOf(this.spn_hora.getValue()));
//        minutos = Integer.valueOf(String.valueOf(this.spn_minuto.getValue()));
//        personas = Integer.valueOf(String.valueOf(this.cmb_NumPersonas.getSelectedItem()).substring(0, 1));
//        if (this.daoDisponibles.verificarFecha(sqlfecha) == true && this.daoReservaciones.verificarFechaYaReservada(sqlfecha, Login_control.getUser().getId()) == false) { //Login_control.getUser().getId()
//            if (this.daoDisponibles.getMesasExistentes(sqlfecha) - this.daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {
//
//                Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));
//
//                Reservacion r = new Reservacion(Login_control.getUser().getId(), fecha_ingreso, personas);
//                this.daoReservaciones.insertar(r);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
//        }


    }//GEN-LAST:event_btn_ReservarActionPerformed
//    private long setearTiempo(java.util.Date fecha, int hora, int minuto) {
//        long milis = fecha.getTime();
//        Calendar c = Calendar.getInstance();
//        c.setTime(fecha);
//        c.set(Calendar.HOUR_OF_DAY, hora);
//        c.set(Calendar.MINUTE, minuto);
//        c.set(Calendar.SECOND, 0);
//        return c.getTimeInMillis();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox amigos;
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JComboBox<String> cmb_NumPersonas;
    private com.toedter.calendar.JDateChooser cuadroFechaReservacion;
    private javax.swing.JCheckBox familiar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox laboral;
    private javax.swing.JSpinner spn_hora;
    private javax.swing.JSpinner spn_minuto;
    private javax.swing.JTextField txt_detalleMotivo;
    // End of variables declaration//GEN-END:variables
}
