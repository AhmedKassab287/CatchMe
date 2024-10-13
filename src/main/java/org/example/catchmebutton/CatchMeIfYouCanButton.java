package org.example.catchmebutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Random;

public class CatchMeIfYouCanButton extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Button catchMeButton = new Button("Can you catch me?");
        catchMeButton.getStyleClass().add("button");

        catchMeButton.setLayoutX(200);
        catchMeButton.setLayoutY(150);


        catchMeButton.setOnMouseEntered(event -> {

            Random random = new Random();
            double newX = random.nextDouble() * (root.getWidth() - catchMeButton.getWidth());
            double newY = random.nextDouble() * (root.getHeight() - catchMeButton.getHeight());


            catchMeButton.setLayoutX(newX);
            catchMeButton.setLayoutY(newY);
        });

        root.getChildren().add(catchMeButton);
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/Styles/styles.css")).toExternalForm());

        primaryStage.setTitle("Catch Me If You Can!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
