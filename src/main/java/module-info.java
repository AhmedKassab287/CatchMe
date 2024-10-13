module org.example.catchmebutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.catchmebutton to javafx.fxml;
    exports org.example.catchmebutton;
}