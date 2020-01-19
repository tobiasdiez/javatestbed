package org.openjfx;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    private static String[] arguments;

    public static void main(String[] args) {
        LOGGER.error("Arguments: " + Arrays.toString(args));
        arguments = args;
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Arguments: " + Arrays.toString(arguments));
        VBox root = new VBox(label);

        Scene scene = new Scene(root);
        stage.setTitle("JavaFX and Gradle");
        stage.setScene(scene);
        stage.show();
    }
}
