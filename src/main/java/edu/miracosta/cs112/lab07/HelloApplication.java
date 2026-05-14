package edu.miracosta.cs112.lab07;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {

    /*** GUI COMPONENTS ***/
    private Button button;
    int count = 0;

    private Label message;

    /*** OTHER VARIABLES ***/


    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args);
    }

    /*** OVERRIDDEN Application METHODS ***/
    @Override
    public void start(Stage primaryStage) {

        // SETUP COMPONENTS
        message = new Label("Hi, User!");

        button = new Button("Click me");
        button.setOnAction(this);

        // ADD COMPONENTS
        VBox layout = new VBox();

        layout.getChildren().add(message);
        layout.getChildren().add(button);

        // SETUP SCENE
        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);

        // Change to your actual group number and name
        primaryStage.setTitle("Group 1 - Klareese");

        primaryStage.show();
    }

    /*** OVERRIDDEN EventHandler METHODS ***/
    @Override
    public void handle(ActionEvent actionEvent) {

        if(actionEvent.getSource() == button) {

            count++;

            message.setText("Hi #" + count + ", User!");

            System.out.println("count = "+ count);
            System.out.println("Hello CS112!");
        }
    }
}
