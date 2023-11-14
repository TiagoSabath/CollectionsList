module com.example.collectionslist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.collectionslist to javafx.fxml;
    exports com.example.collectionslist;
}