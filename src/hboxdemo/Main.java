package hboxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    private HBox root;
    private Button button;
    private Label label;
    @Override
    public void start(Stage primaryStage) throws Exception{
        button = new Button(); //Create a new button
        button.setText("Click Me"); //Set the text of the button
        label = new Label("This is Label"); //Create a label with text specified
        root = new HBox(); //Create a HBox using No-arg constructor
        root.getChildren().addAll(button, label);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
