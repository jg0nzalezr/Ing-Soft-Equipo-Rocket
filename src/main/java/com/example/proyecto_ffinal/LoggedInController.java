package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {
    @FXML
    private Button logoutButton;

    @FXML
    private Label userTypeLabel;

    @FXML
    private Label welcomeLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CambierEscena.cambiarEscenario(actionEvent,"hello-view.fxml", "Inicia seción!", null, null);
            }
        });
    }

    public void inicializarInformaciónUsuario(String usuario, String tipoUsuario){
        welcomeLabel.setText("Bienvenido "+ usuario +"!");
        userTypeLabel.setText("Tipo de usuario: "+ tipoUsuario);
    }


}
