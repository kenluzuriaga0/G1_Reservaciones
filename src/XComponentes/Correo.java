/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XComponentes;

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

/**
 *
 * @author angela
 */
public class Correo {
    private Properties propiedad;
    private MimeMessage mail;
    private Transport transporte;
    private Session sesion;
    private Notificacion notificacion;
    
    public Correo() {
        notificacion=new Notificacion(null,true);
        propiedad=new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        sesion=Session.getDefaultInstance(propiedad);  
        mail=new MimeMessage(sesion);
        
       
        
    }
    
    public void enviarCorreo(String destinatario, String fecha, String hora){
        String correo_envia="kenluzuriaga0@gmail.com";
        String contrasenia="11agosto";
        String asunto="SU RESERVACIÓN SE REALIZÓ CON EXITO!";
        String mensaje="Su reservación del "+fecha+" a las "+hora+" está realizada con EXITO";
        
        try {
            try {

                mail.setFrom(new InternetAddress(correo_envia));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                mail.setSubject(asunto);
                mail.setText(mensaje);

                transporte = sesion.getTransport("smtp");
                transporte.connect(correo_envia, contrasenia);
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                transporte.close();

            } catch (Exception ex) {
                this.notificacion.cambiarAcorreoInvalido();
                this.notificacion.setVisible(true);
                System.out.println("fallo enviar correo "+ex.getMessage());
            }
        } catch (Exception ex) {
            
        }
       
        
        
    }
    
}
