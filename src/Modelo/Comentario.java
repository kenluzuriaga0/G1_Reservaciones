/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angela
 */
public class Comentario {
    private String nombre_usuario;
    private String comentario;
    private int id_usuario;
    private Timestamp fecha_publicacion;
    private String tiempo_publicacion;

    //CONSTRUCTOR GET
    public Comentario(String nombre_usuario, String comentario, int id_usuario, Timestamp fecha_publicacion) {
        this.nombre_usuario = nombre_usuario;
        this.comentario = comentario;
        this.id_usuario=id_usuario;
        this.tiempo_publicacion=this.calcularTiempoPublicacion(fecha_publicacion);
    }
    
    //CONSTRUCTOR SET
    public Comentario( int id_usuario, String comentario, Timestamp fecha_publicacion) {
        this.comentario = comentario;
        this.id_usuario=id_usuario;
        this.fecha_publicacion=fecha_publicacion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public Timestamp getFecha_publicacion() {
        return fecha_publicacion;
    }

    public String getTiempo_publicacion() {
        return tiempo_publicacion;
    }
 
    private String calcularTiempoPublicacion(Timestamp fecha_publicacion){
        Date fecha_actual=new Date();
        long mfechap=fecha_publicacion.getTime();
        long mfechaa=fecha_actual.getTime();
        long milisegundos=mfechaa-mfechap;
        long minutos=milisegundos/60000;
        long horas= minutos/60;
        long dias=horas/24;
        /*System.out.println(minutos);
        System.out.println(horas);
        System.out.println(dias);*/
        if(minutos<60 && minutos>=0){
            if(minutos==1){
                return String.valueOf(minutos)+" Minuto";
            }else{
                return String.valueOf(minutos)+" Minutos";
            }
          
        }else if(horas>0 && horas<24){
            if(horas==1){
                 return String.valueOf(horas)+" Hora";
            }else{
                return String.valueOf(horas)+" Horas";
            }
            
        }else if(dias>0){
             if(dias==1){
                return String.valueOf(dias)+" Dia";
            }else{
                return String.valueOf(dias)+" Dias";
            }
           
        }
                 
        return String.valueOf(minutos);
    }
    
    public String formatearFechaPublicacion(){
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateformat.format(fecha_publicacion); 
    }
    
    
    
}
