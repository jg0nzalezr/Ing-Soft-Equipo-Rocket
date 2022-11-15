package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;



public class IniciarUsuario {

    public static void iniciarUsuario(ActionEvent event, String usuario, String clave){

        if(!CompararClaveComprador.compararClaveComprador(usuario,clave) || !CompararClaveVendedor.compararClaveVendedor(usuario,clave)){
            System.out.println("Usuario no encontrado!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("La credenciales son incorrectas");
            alert.show();
        }else{
            if(CompararClaveComprador.compararClaveComprador(usuario,clave)){
                CambierEscena.cambiarEscenario(event,"logged-in.fxml","Bienvenido a REBORN!",usuario,"Comprador");
            }
            else {
                CambierEscena.cambiarEscenario(event,"logged-in.fxml","Bienvenido a REBORN!",usuario,"Vendedor");
            }

        }

    }
}
