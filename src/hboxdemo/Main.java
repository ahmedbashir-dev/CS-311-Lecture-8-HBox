package hboxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    private HBox root;
    private Button button;
    private Button[] btnArray;
    private Label label;
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*button = new Button(); //Create a new button
        button.setText("Click Me"); //Set the text of the button
        label = new Label("This is Label"); //Create a label with text specified*/
        btnArray = new Button[10]; //Create a button type array

        //Creates 10 Buttons
        for (int i = 0; i < btnArray.length ; i++) {
            btnArray[i] = new Button("Button " + (i+1));
//            btnArray[i].setWrapText(true);
        }
        root = new HBox(); //Create a HBox using No-arg constructor
       // root.getChildren().addAll(label, button); //add child nodes in the hbox
        //Adds 10 Buttons to the HBox
        for (int i = 0; i < btnArray.length ; i++) {
           root.getChildren().add(btnArray[i]);
        }
        root.setSpacing(20); //set spacing of HBox
        root.setPadding(new Insets(20));
        Scene scene = new Scene(root,400,200); //Create scene
        primaryStage.setScene(scene); //set the scene on stage
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
