module com.forinda {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.forinda to javafx.fxml;
    exports com.forinda;
}
