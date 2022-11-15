package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import java.io.IOException;

public class RegistrarComprador {

    public static void registrarComprador(ActionEvent event, String usuario, String password, String tipoUsuario){

        if(BuscarComprador.buscarComprador(usuario)){
            System.out.println("El usuario ya existe!");
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Usuario ya existente");
            alert.show();
        }else {
            Comprador compradorRegistrar=new Comprador();
            Output output;

            output=new Output();

            compradorRegistrar.setNombreUsuario(usuario);
            compradorRegistrar.setClave(password);
            compradorRegistrar.setTipoUsuario(tipoUsuario);
            compradorRegistrar.setIdUsuario(1);

            try {
                output.abrir("compradores.ser");
                output.escribirComprador(compradorRegistrar);
                output.cerrar();
            } catch (IOException e) {
                e.printStackTrace();
            }

            CambierEscena.cambiarEscenario(event,"logged-in.fxml","Bienvenido a REBORN!",usuario,tipoUsuario);
        }

    }

}
