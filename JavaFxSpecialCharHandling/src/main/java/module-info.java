module com.example.specialCharcater {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.specialCharacter to javafx.fxml;
    exports com.example.specialCharacter;
}