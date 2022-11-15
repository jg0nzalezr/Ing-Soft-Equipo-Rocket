package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

public class RegistroVendedor {

    public static void registrarVendedor(ActionEvent event, String usuario, String clave, String tipoUsuario){

        if(BuscarVendedor.buscarVendedor(usuario)){
            System.out.println("El usuario ya existe!");
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Usuario ya existente");
            alert.show();
        }else {
            Vendedor vendedorRegistrar=new Vendedor();
            Output output;

            output=new Output();

            vendedorRegistrar.setNombreUsuario(usuario);
            vendedorRegistrar.setClave(clave);
            vendedorRegistrar.setTipoUsuario(tipoUsuario);
            vendedorRegistrar.setIdUsuario(1);

            try {
                output.abrir("vendedores.ser");
                output.escribirVendedor(vendedorRegistrar);
                output.cerrar();
            } catch (IOException e) {
                e.printStackTrace();
            }

            CambierEscena.cambiarEscenario(event,"logged-in.fxml","Bienvenido a REBORN!",usuario,tipoUsuario);
        }

    }
}


