package Vistas;

import Controlador.Login_control;
import Dao.DaoReservaciones;
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
                daoDisponibles = new Mesas_dao();
        daoReservaciones=new DaoReservaciones();

        cuadroFechaReservacion.getCalendarButton().setBackground(new Color(29, 53, 87));
    }

    public JCheckBox getAmigos() {
        return amigos;
    }

    public JDateChooser getCuadroFechaReservacion() {
        return cuadroFechaReservacion;
    }

    public void setAmigos(JCheckBox amigos) {
        this.amigos = amigos;
    }

    public JButton getBtn_Reservar() {
        return btn_Reservar;
    }

    public JCheckBox getFamiliar() {
        return familiar;
    }

    public void setFamiliar(JCheckBox familiar) {
        this.familiar = familiar;
    }

    public JDateChooser getFecha() {
        return cuadroFechaReservacion;
    }

    public void setFecha(JDateChooser fecha) {
        this.cuadroFechaReservacion = fecha;
    }

    public JSpinner getHora() {
        return comboBox_Minutos;
    }

    public void setHora(JSpinner hora) {
        this.comboBox_Minutos = hora;
    }

    public JCheckBox getLaboral() {
        return laboral;
    }

    public void setLaboral(JCheckBox laboral) {
        this.laboral = laboral;
    }

    public JTextField getTxt_detalleMotivo() {
        return txt_detalleMotivo;
    }

    public void setTxt_detalleMotivo(JTextField txt_detalleMotivo) {
        this.txt_detalleMotivo = txt_detalleMotivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cuadroFechaReservacion = new com.toedter.calendar.JDateChooser();
        comboBox_Minutos = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBox_Hora = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        laboral = new javax.swing.JCheckBox();
        amigos = new javax.swing.JCheckBox();
        familiar = new javax.swing.JCheckBox();
        txt_detalleMotivo = new javax.swing.JTextField();
        btn_Reservar = new javax.swing.JButton();
        spinner_NumPersonas = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuadroFechaReservacion.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cuadroFechaReservacion.setIcon(new ImageIcon(getClass().getResource("/img/calendar.png")));
        jPanel2.add(cuadroFechaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 40));

        comboBox_Minutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBox_Minutos.setModel(new javax.swing.SpinnerNumberModel());
        comboBox_Minutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(comboBox_Minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 60, 40));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora   ->");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha ->");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        comboBox_Hora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBox_Hora.setModel(new javax.swing.SpinnerNumberModel());
        comboBox_Hora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(comboBox_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 40));

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

        spinner_NumPersonas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spinner_NumPersonas.setModel(new javax.swing.SpinnerNumberModel());
        spinner_NumPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spinner_NumPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, 40));

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
    Mesas_dao daoDisponibles;
    DaoReservaciones daoReservaciones;
    private void btn_ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReservarActionPerformed

        java.util.Date fecha = this.cuadroFechaReservacion.getDate();

        long milis = this.setearTiempo(fecha, 0, 0);//fecha.getTime();
        java.sql.Date sqlfecha = new java.sql.Date(milis);
        int hora, minutos, personas;
        hora = Integer.valueOf(String.valueOf(this.comboBox_Hora.getValue()));
        minutos = Integer.valueOf(String.valueOf(this.comboBox_Minutos.getValue()));
        personas = Integer.valueOf(String.valueOf(this.spinner_NumPersonas.getValue()));
        if (this.daoDisponibles.verificarFecha(sqlfecha) == true && this.daoReservaciones.verificarFechaYaReservada(sqlfecha, Login_control.getUser().getId()) == false) { //Login_control.getUser().getId()
System.out.println("Paso la 1ra condicion");
            if (this.daoDisponibles.getMesasExistentes(sqlfecha) - this.daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {

                Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));

                Reservacion r = new Reservacion(Login_control.getUser().getId(), fecha_ingreso, personas);
                this.daoReservaciones.insertar(r);

            } else {
                JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_ReservarActionPerformed
    private long setearTiempo(java.util.Date fecha, int hora, int minuto) {
        long milis = fecha.getTime();
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        c.set(Calendar.HOUR_OF_DAY, hora);
        c.set(Calendar.MINUTE, minuto);
        c.set(Calendar.SECOND, 0);
        return c.getTimeInMillis();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox amigos;
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JSpinner comboBox_Hora;
    private javax.swing.JSpinner comboBox_Minutos;
    private com.toedter.calendar.JDateChooser cuadroFechaReservacion;
    private javax.swing.JCheckBox familiar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox laboral;
    private javax.swing.JSpinner spinner_NumPersonas;
    private javax.swing.JTextField txt_detalleMotivo;
    // End of variables declaration//GEN-END:variables
}
