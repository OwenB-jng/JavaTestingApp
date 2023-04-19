module com.example.realsem3java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.realsem3java to javafx.fxml;
    exports com.example.realsem3java;
}