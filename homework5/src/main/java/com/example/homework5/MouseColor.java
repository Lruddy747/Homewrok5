package com.example.homework5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Cursor.*;
import javafx.scene.*;

import java.io.IOException;



public class MouseColor extends Application {
    @Override
    public void start(Stage stage) {


        Pane pane = new Pane();

        Button mousechange = new Button("Change Color");

        Circle circle = new Circle();

        circle.centerXProperty().bind(pane);


        mousechange.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {


            }
                });
        mousechange.setOnMouseReleased(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                stage.getScene().setCursor(Cursor.DEFAULT);

            }
        });


        pane.getChildren().addAll(mousechange, circle);
        Scene scene = new Scene(pane, 500, 500);

        stage.setScene(scene);
        stage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }

}
