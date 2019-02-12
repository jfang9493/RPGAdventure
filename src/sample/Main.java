package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        boolean endGame = false;
        boolean start = true;
        launch(args);
        while(start)
        {
            int currentMap = 0;
            HighScores.CSVUtilities();

        }

    }
    public void generateMap()
    {
        BufferedImage img = null;
        try
        {
            img  = ImageIO.read(new File("startingroom.png"));
        }
        catch (IOException e)
        {
        }
    }
}
