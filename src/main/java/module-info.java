module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    requires org.apache.logging.log4j.plugins;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}
