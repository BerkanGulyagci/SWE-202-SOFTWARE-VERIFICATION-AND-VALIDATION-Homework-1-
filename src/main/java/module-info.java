module com.example.swe202assignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.swe202assignment to javafx.fxml;
    exports com.example.swe202assignment;
}