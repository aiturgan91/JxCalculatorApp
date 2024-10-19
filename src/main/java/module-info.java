module com.example.fxcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.fxcalculator to javafx.fxml;
    exports com.example.fxcalculator;
}