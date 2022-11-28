module com.example.interface1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interface1 to javafx.fxml;
    exports com.example.interface1;
}