package Controlador;

import Dao.Usuario_dao;
import Vistas.*;
import java.awt.event.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class ForgotPassword_control {

//Se conecta con:
    private ForgotPassword_view forgot;
    private Login_view login;
    private Login_control login_con;

    public ForgotPassword_control(ForgotPassword_view forgot) {
        this.forgot = forgot;
        initListener();

    }

    private void initListener() {

        //FLUJO DE VENTANAS
        forgot.getBtn_info().addMouseListener(new Flujo_login());
        forgot.getBtn_backToLogin().addMouseListener(new Flujo_login());

        //RECUPERAR CONTRA
        forgot.getBtn_restablecer().addMouseListener(new Flujo_login());

    }

    private void recuperarContrasena() { // [nombres,password,correo]

        String[] datos;
        datos = Usuario_dao.traerContrasena(forgot.getTxt_campoEmail().getText().trim());

        if (!datos.equals(null)) {

            //Envio por correo          
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587"); //587: puerto que usa gmail
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            //Llenar informacion apra el envio
            String correoRemitente = "kenluzuriaga0@gmail.com";
            String passwordRemitente = "11agosto";
            String correoReceptor = forgot.getTxt_campoEmail().getText();
            String asunto = "-Reservaciones- Correo de Recuperacion de Contraseña";
            String mensaje = "Hola " + datos[0] + ", ha solicitado el envio de su contraseña en el SISTEMA DE RESERVACION DE MESAS<br>"
                    + "Username: <b>" + datos[2] + "</b><br>Contraseña: <b>" + datos[1] + "</b><br> Por favor, No Responder a este correo";

            MimeMessage message = new MimeMessage(session);
            try {

                message.setFrom(new InternetAddress(correoRemitente));

                message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                //RecipientType.CC  para copia
                message.setSubject(asunto);
                message.setText(mensaje, "ISO-8859-1", "html"); //tipo de codificacion, Español y HTML

                Transport trans = session.getTransport("smtp");
                trans.connect(correoRemitente, passwordRemitente);
                trans.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                trans.close();

                JOptionPane.showMessageDialog(null, "Correo enviado");

            } catch (AddressException ex) {

                JOptionPane.showMessageDialog(null, "Correo no enviado " + ex.getMessage());

            } catch (MessagingException ex) {
                System.out.println("Fallo de correo mi loco  " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Correo no enviado " + ex.getMessage());
            }
        }

    }

//FLUJO DE BOTONES ********************************************************
    public class Flujo_login extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente == forgot.getBtn_backToLogin()) {  //REGRESAR AL LOGIN
                forgot.dispose();

                login = new Login_view();
                login_con = new Login_control(login);
                login.setVisible(true);

            } else if (fuente == forgot.getBtn_info()) {      //BOTON INFO
                login_con = new Login_control();
                login_con.printInfo();
            } else if (fuente == forgot.getBtn_restablecer()) {
                recuperarContrasena();
                //metodo
            }

        }

    }

}
