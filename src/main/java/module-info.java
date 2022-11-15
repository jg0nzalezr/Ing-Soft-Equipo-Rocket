module com.example.proyecto_ffinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto_ffinal to javafx.fxml;
    exports com.example.proyecto_ffinal;
}