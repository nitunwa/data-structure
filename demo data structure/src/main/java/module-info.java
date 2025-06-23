module com.example.demodatastructure {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demodatastructure to javafx.fxml;
    exports com.example.demodatastructure;
    exports com.example.demodatastructure.linkendList;
    opens com.example.demodatastructure.linkendList to javafx.fxml;
}