package com.example.proyecto_ffinal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private RadioButton compradorRadioButton;

    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordTextFieldSignUp;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField usernameTextFieldSingUp;

    @FXML
    private RadioButton vendedorRadioButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        compradorRadioButton.setToggleGroup(toggleGroup);
        vendedorRadioButton.setToggleGroup(toggleGroup);

        compradorRadioButton.setSelected(true);

        signUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String toggleName = ((RadioButton)toggleGroup.getSelectedToggle()).getText();

                if(!usernameTextFieldSingUp.getText().trim().isEmpty() && !passwordTextFieldSignUp.getText().trim().isEmpty()){
                    if(toggleName.equals("Comprador")){
                        RegistrarComprador.registrarComprador(event,usernameTextFieldSingUp.getText(),passwordTextFieldSignUp.getText(),toggleName);
                    }else{
                        RegistroVendedor.registrarVendedor(event,usernameTextFieldSingUp.getText(),passwordTextFieldSignUp.getText(),toggleName);
                    }
                }else{
                    System.out.println("Información incompleta!");
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Por favor complete toda la información");
                    alert.show();
                }
            }
        });

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CambierEscena.cambiarEscenario(event,"hello-view.fxml","Inicia sesión!",null,null);
            }
        });

    }
}
