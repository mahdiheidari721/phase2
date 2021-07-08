package Graphic;
import Logic.Egg;
import Logic.Manager;
import com.sun.javafx.fxml.builder.JavaFXSceneBuilder;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Main extends Application implements EventHandler<ActionEvent>{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //  creating the image object
        InputStream stream = new FileInputStream("D:\\images\\bear.png");
        Image bear = new Image(stream);
        InputStream stream7 = new FileInputStream("D:\\images\\chicken.png");
        Image chicken = new Image(stream7);
        InputStream stream1 = new FileInputStream("D:\\images\\dog2.png");
        Image dog2 = new Image(stream1);
        InputStream stream2 = new FileInputStream("D:\\images\\lion.png");
        Image lion = new Image(stream2);
        InputStream stream3 = new FileInputStream("D:\\images\\ostrich.png");
        Image ostrich = new Image(stream3);
        InputStream stream4 = new FileInputStream("D:\\images\\ox.png");
        Image ox = new Image(stream4);
        InputStream stream5 = new FileInputStream("D:\\images\\sheep.png");
        Image sheep = new Image(stream5);
        InputStream stream6 = new FileInputStream("D:\\images\\tiger.png");
        Image tiger = new Image(stream6);
//        ///////////////////////////////////////////////////////////////////////////
//        //Creating the image view
        ImageView imageView = new ImageView();
       // Setting image to the image view
        imageView.setImage(tiger);
        //Setting the image view parameters
        imageView.setX(10);
        imageView.setY(10);
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);
        imageView.setPickOnBounds(true);//it i important to click on images


        









//        ///////////////////////////////////////////////////////////////////////////////////////
       MainView.getMV().setMainStage(primaryStage);
//        /////////////////////////////////////////////////////////////////////////////////////////

//






        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        primaryStage.setResizable(false);
        MainView.getMV().setScene("Start.fxml");
        MainView.pane.getChildren().add(imageView);
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {


    }
}
