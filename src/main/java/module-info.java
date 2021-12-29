module com.example.quanlyxe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.quanlyxe to javafx.fxml;
    exports com.example.quanlyxe;
}