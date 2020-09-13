package Controlador;


import Vistas.*;
import java.awt.event.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



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
    
    private void recuperarContrasena(){
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587"); //ese puerto usa gmail
        props.setProperty("mail.smtp.auth", "true"); 
        
        Session session = Session.getDefaultInstance(props);
        
        String correoRemitente = "kenluzuriaga0@gmail.com";
        String passwordRemitente = "11agosto";
        String correoReceptor = "keylaluzuriaga@gmail.com";
        String asunto = "Correito de pruebinski";
        String mensaje = "NO se que poner aqui ekis de";
        
        MimeMessage message = new MimeMessage(session);
        try {     
        
            message.setFrom(new InternetAddress(correoRemitente));
            
            //opciones de envio
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            //message.addRecipient(Message.RecipientType.CC, new InternetAddress(correoReceptor));// para copia
            //message.addRecipient(Message.RecipientType.BCC, new InternetAddress(correoReceptor));// para copia OCULTA
            message.setText(mensaje);
            message.setSubject(asunto);
            
            Transport trans = session.getTransport("smtp");
            trans.connect(correoRemitente,passwordRemitente);
            trans.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            trans.close();
        
        } catch (AddressException ex) {
            
            System.out.println("Fallo de correo mi loco  "+ex.getMessage());
            
            
        } catch (MessagingException ex) {
            System.out.println("Fallo de correo mi loco  "+ex.getMessage());
        }
        
        
        
        
        
        
        
    }

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
            } else if(fuente == forgot.getBtn_restablecer()){
                
                //metodo
            }

        }

    }

    
}
