package com.example.demo2;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        VBox raiz = new VBox();
        raiz.setSpacing(10);


        Button btnAceptar = new Button("Aceptar");

        Button btnCancelar = new Button("Cancelar");

        btnAceptar.setMaxHeight(Double.MAX_VALUE);
        btnCancelar.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(btnAceptar, Priority.ALWAYS);
        VBox.setVgrow(btnCancelar, Priority.ALWAYS);

        HBox contenedorHor = new HBox();

        Text texto = new Text("Hola");
        Text texto2 = new Text("Bien");
        contenedorHor.getChildren().add(texto);
        contenedorHor.getChildren().add(texto2);
        raiz.getChildren().addAll(btnAceptar,btnCancelar, contenedorHor);


        Scene scene = new Scene(raiz, 320, 240);
        stage.setTitle("Hello! JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}