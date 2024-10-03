package com.example.homework5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane pane = new GridPane();

        //InputStream stream = new FileInputStream("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag1.gif");

        ImageView imageView = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag1.gif"));
        ImageView imageView2 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag2.gif"));
        ImageView imageView3 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag6.gif"));
        ImageView imageView4 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag7.gif"));


        pane.add(imageView, 0, 0);
        pane.add(imageView2, 0, 1);
        pane.add(imageView3, 1, 0);
        pane.add(imageView4, 1, 1);


        Scene scene = new Scene(pane, 500, 500);

        imageView.setFitWidth(pane.getWidth()/2);
        imageView.setFitHeight(pane.getHeight()/2);

        imageView2.setFitWidth(pane.getWidth()/2);
        imageView2.setFitHeight(pane.getHeight()/2);

        imageView3.setFitWidth(pane.getWidth()/2);
        imageView3.setFitHeight(pane.getHeight()/2);

        imageView4.setFitWidth(pane.getWidth()/2);
        imageView4.setFitHeight(pane.getHeight()/2);

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}