module com.example.demodatastructure {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demodatastructure to javafx.fxml;
    exports com.example.demodatastructure;
}