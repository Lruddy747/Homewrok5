module com.example.homework5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.homework5 to javafx.fxml;
    exports com.example.homework5;
}