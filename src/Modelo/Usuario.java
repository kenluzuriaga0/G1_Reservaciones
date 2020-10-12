package Modelo;

/**
 *
 * @author kenlu
 */
public class Usuario {
    
    private int id;
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String email;
    private char estado;
    private char sexo;
    private int id_rol;

    public Usuario(){
        
    }
    public Usuario(int id, String username, String password, String nombre, String apellido, String email, char estado, char sexo, int id_rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
        this.sexo = sexo;
        this.id_rol = id_rol;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id= " + id + ", username= " + username + ", password= " + password + ", nombre= " + nombre + ", apellido= " 
                + apellido + ", email=" + email + ", estado= " + estado + ", sexo= " + sexo + ", id_rol= " + id_rol + '}';
    }
    
    
    
}
