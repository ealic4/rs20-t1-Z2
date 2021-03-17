package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;




public class Controller {
    public Label helloWorld;
    public GridPane pozadina;

    public void funkcija(ActionEvent actionEvent){

        helloWorld.setText("Hello World!");

        helloWorld.setStyle("-fx-font-family:Arial");
        helloWorld.setStyle("-fx-font-style:italic;");
        helloWorld.setStyle("-fx-font-weight:bold;");
        helloWorld.setStyle("-fx-font-size:32");

        pozadina.setStyle("-fx-background-color:red");

    }
}