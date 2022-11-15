package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CambierEscena {

    public static void cambiarEscenario(ActionEvent event, String fxmlFile, String titulo, String usuario, String tipoUsuario){

        Parent root = null;

        if(usuario != null && tipoUsuario != null){
            try{
                FXMLLoader loader = new FXMLLoader(CambierEscena.class.getResource(fxmlFile));
                root=loader.load();
                LoggedInController loggedInController = loader.getController();
                loggedInController.inicializarInformaciónUsuario(usuario,tipoUsuario);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else{
            try {
                root=FXMLLoader.load(CambierEscena.class.getResource(fxmlFile));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(titulo);
        stage.setScene(new Scene(root, 6000, 400));
        stage.show();
    }
}
