package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Controller ctrl = new Controller();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        // Stage är containern som kan innehålla scener
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Painter");
        // en scen skapas av fxml-filer

        primaryStage.setScene(new Scene(root, 1600, 1080));

        // Det är själva scenen som är det synliga (viewen)
        primaryStage.show();

        //GraphicsContext gc = ;
    }



}
