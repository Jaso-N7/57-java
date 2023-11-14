module com.fiftyseven.io.chars {
    requires javafx.controls;
    requires javafx.fxml;
        
    opens com.fiftyseven.io.ui.gui to javafx.fxml;
    exports com.fiftyseven.io.ui.gui;
}
