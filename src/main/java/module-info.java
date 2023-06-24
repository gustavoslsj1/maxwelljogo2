module com.icev.maxwelljogo2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.icev.maxwelljogo2 to javafx.fxml;
    exports com.icev.maxwelljogo2;
}
