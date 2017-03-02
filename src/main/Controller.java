package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Shape;
import main.shape.uneccecary.MyLine;
import main.shape.uneccecary.MyRectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private HBox ourBox;

    @FXML
    Button r;

    @FXML
    private void tClickedAction(ActionEvent event){
        System.out.println("bajs");
        Shape shape = new MyRectangle().draw();
        ourBox.getChildren().add(shape);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        r.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Shape shape = new MyLine().draw();
                ourBox.getChildren().add(shape);
            }
        });

    }
}
