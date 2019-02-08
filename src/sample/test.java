package sample;

import Characters.Player;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class test extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The RPG Game");

        StackPane sp = new StackPane();
        Image img = new Image("MapFiles/starting room.png");
        ImageView imgView = new ImageView(img);
        sp.getChildren().add(imgView);

        Player player = new Player(100,100,50,50,1,400,400,new ArrayList<>());

        //Adding HBox to the scene
        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
