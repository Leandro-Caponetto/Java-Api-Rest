module com.proyect.persona.admicerver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.proyect.persona.admicerver to javafx.fxml;
    exports com.proyect.persona.admicerver;
}