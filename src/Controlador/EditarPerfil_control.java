package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import XComponentes.EditarPerfil;
import XComponentes.PlaceHolder;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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

    }

    private void setearCampos() {
        edit.getTxt_usernameNew().setText("Cambiar: username");
        edit.getTxt_nombresNew().setText("Cambiar: nombres");
        edit.getTxt_apellidosNew().setText("Cambiar: apellidos");
        edit.getTxt_emailNew().setText("Cambiar: email");
        edit.getTxt_campoPassword().setText("Confirmar Contraseña Actual");
        edit.getTxt_campoPasswordNew().setText("Cambiar: contraseña");
    }

    class PlaceHolders implements FocusListener {

        Object foco;

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == edit.getTxt_usernameNew()) {

                PlaceHolder.quitar_PlaceHolder("Cambiar: username", edit.getTxt_usernameNew());

            } else if (foco == edit.getTxt_nombresNew()) {

                PlaceHolder.quitar_PlaceHolder("Cambiar: nombres", edit.getTxt_nombresNew());

            } else if (foco == edit.getTxt_apellidosNew()) {

                PlaceHolder.quitar_PlaceHolder("Cambiar: apellidos", edit.getTxt_apellidosNew());

            } else if (foco == edit.getTxt_emailNew()) {

                PlaceHolder.quitar_PlaceHolder("Cambiar: email", edit.getTxt_emailNew());

            } else if (foco == edit.getTxt_campoPasswordNew()) {

                PlaceHolder.quitar_PlaceHolder("Cambiar: Contraseña", edit.getTxt_campoPasswordNew());

            } else if (foco == edit.getTxt_campoPassword()) {

                PlaceHolder.quitar_PlaceHolder("Confirmar Contraseña Actual", edit.getTxt_campoPassword());
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == edit.getTxt_usernameNew()) {

                PlaceHolder.poner_PlaceHolder("Cambiar: username", edit.getTxt_usernameNew());

            } else if (foco == edit.getTxt_nombresNew()) {

                PlaceHolder.poner_PlaceHolder("Cambiar: nombres", edit.getTxt_nombresNew());

            } else if (foco == edit.getTxt_apellidosNew()) {

                PlaceHolder.poner_PlaceHolder("Cambiar: apellidos", edit.getTxt_apellidosNew());

            } else if (foco == edit.getTxt_emailNew()) {

                PlaceHolder.poner_PlaceHolder("Cambiar: email", edit.getTxt_emailNew());

            } else if (foco == edit.getTxt_campoPasswordNew()) {

                PlaceHolder.poner_PlaceHolder("Cambiar: Contraseña", edit.getTxt_campoPasswordNew());

            } else if (foco == edit.getTxt_campoPassword()) {

                PlaceHolder.poner_PlaceHolder("Confirmar Contraseña Actual", edit.getTxt_campoPassword());
            }

        }
    }

}
