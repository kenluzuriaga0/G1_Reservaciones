package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import XComponentes.EditarPerfil;
import XComponentes.PlaceHolder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class EditarPerfil_control extends Login_control {

    EditarPerfil edit;

    public EditarPerfil_control(Usuario user, Usuario_dao userDao, EditarPerfil edit) {
        super(user, userDao);
        this.edit = edit;

        setearCampos();
        initListener();

    }

    private void initListener() {

        edit.getTxt_usernameNew().addFocusListener(new PlaceHolders());
        edit.getTxt_nombresNew().addFocusListener(new PlaceHolders());
        edit.getTxt_apellidosNew().addFocusListener(new PlaceHolders());
        edit.getTxt_emailNew().addFocusListener(new PlaceHolders());
        edit.getTxt_campoPassword().addFocusListener(new PlaceHolders());
        edit.getTxt_campoPasswordNew().addFocusListener(new PlaceHolders());

        edit.getBtn_confirmarCambios().addActionListener(new Botoncito());
    }

    private void setearCampos() {
        edit.getTxt_usernameNew().setText(getUser().getUsername().toUpperCase());
        edit.getTxt_nombresNew().setText(getUser().getNombre().toUpperCase());
        edit.getTxt_apellidosNew().setText(getUser().getApellido().toUpperCase());
        edit.getTxt_emailNew().setText(getUser().getEmail());
        edit.getTxt_campoPasswordNew().setText("****");
        edit.getTxt_campoPassword().setText("Confirmar Contraseña Actual");
    }

    private void actualizarUsuario() {
        IDao.IUsuario_dao dao = new Usuario_dao();
        //duplicar atributos del usuario logueado a usuarioEditado
        Usuario userEditado = new Usuario(getUser().getId(), getUser().getUsername(), getUser().getPassword(), getUser().getNombre(),
                getUser().getApellido(), getUser().getEmail(), getUser().getEstado(), getUser().getSexo(), getUser().getId_rol());

        int camposEditados = 0; //contador de campos que llena el cliente
        
        String newUsername = edit.getTxt_usernameNew().getText().trim();
        String newNombre = edit.getTxt_nombresNew().getText().trim();
        String newApellido = edit.getTxt_apellidosNew().getText().trim();
        String newEmail = edit.getTxt_emailNew().getText().trim();
        String newPassword = String.valueOf(edit.getTxt_campoPasswordNew().getPassword());
        String password = String.valueOf(edit.getTxt_campoPassword().getPassword());
        if (getUser().getPassword().equals(password)) {

            if (!newUsername.equalsIgnoreCase(getUser().getUsername())) {
                userEditado.setUsername(newUsername);
                camposEditados++;
            }
            if (!newNombre.equalsIgnoreCase(getUser().getNombre())) {
                userEditado.setNombre(newNombre);
                camposEditados++;
            }
            if (!newApellido.equalsIgnoreCase(getUser().getApellido())) {
                userEditado.setApellido(newApellido);
                camposEditados++;
            }
            if (!(newEmail.equalsIgnoreCase(getUser().getEmail()))) {
                userEditado.setEmail(newEmail);
                camposEditados++;
            }
            if (!newPassword.equalsIgnoreCase(("****"))) {
                userEditado.setPassword(newPassword);
                camposEditados++;
            }
            if (camposEditados > 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "Desea realizar la actualizacion de Datos?\n" + camposEditados + " campos editados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                if (opcion == 0) {

                    if (dao.actualizar(userEditado)) {
                        JOptionPane.showMessageDialog(null, "Actualizacion Exitoso");
                        //setear usuario logueado
                        getUser().setUsername(userEditado.getUsername());
                        getUser().setNombre(userEditado.getNombre());
                        getUser().setApellido(userEditado.getApellido());
                        getUser().setEmail(userEditado.getEmail());
                        getUser().setPassword(userEditado.getPassword());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha escrito ningun campo");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Error en la contraseña, Digite su contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
        edit.dispose();
    }

    //clase interna BOTON ------------
    class Botoncito implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            actualizarUsuario();
        }

    }

    //CLASE INTERNA PARA PLACEHOLDER -------------
    class PlaceHolders implements FocusListener {

        Object foco;

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == edit.getTxt_usernameNew()) {

                PlaceHolder.quitar_PlaceHolder(getUser().getUsername().toUpperCase(), edit.getTxt_usernameNew());

            } else if (foco == edit.getTxt_nombresNew()) {

                PlaceHolder.quitar_PlaceHolder(getUser().getNombre().toUpperCase(), edit.getTxt_nombresNew());

            } else if (foco == edit.getTxt_apellidosNew()) {

                PlaceHolder.quitar_PlaceHolder(getUser().getApellido().toUpperCase(), edit.getTxt_apellidosNew());

            } else if (foco == edit.getTxt_emailNew()) {

                PlaceHolder.quitar_PlaceHolder(getUser().getEmail(), edit.getTxt_emailNew());

            } else if (foco == edit.getTxt_campoPasswordNew()) {

                PlaceHolder.quitar_PlaceHolder("****", edit.getTxt_campoPasswordNew());

            } else if (foco == edit.getTxt_campoPassword()) {

                PlaceHolder.quitar_PlaceHolder("Confirmar Contraseña Actual", edit.getTxt_campoPassword());
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == edit.getTxt_usernameNew()) {

                PlaceHolder.poner_PlaceHolder(getUser().getUsername().toUpperCase(), edit.getTxt_usernameNew());

            } else if (foco == edit.getTxt_nombresNew()) {

                PlaceHolder.poner_PlaceHolder(getUser().getNombre().toUpperCase(), edit.getTxt_nombresNew());

            } else if (foco == edit.getTxt_apellidosNew()) {

                PlaceHolder.poner_PlaceHolder(getUser().getApellido().toUpperCase(), edit.getTxt_apellidosNew());

            } else if (foco == edit.getTxt_emailNew()) {

                PlaceHolder.poner_PlaceHolder(getUser().getEmail(), edit.getTxt_emailNew());

            } else if (foco == edit.getTxt_campoPasswordNew()) {

                PlaceHolder.poner_PlaceHolder("****", edit.getTxt_campoPasswordNew());

            } else if (foco == edit.getTxt_campoPassword()) {

                PlaceHolder.poner_PlaceHolder("Confirmar Contraseña Actual", edit.getTxt_campoPassword());
            }

        }
    }

}
