module com.example.project10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project10 to javafx.fxml;
    exports com.example.project10;
}