package Graphic;
import Logic.*;
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
        Manager.getManager().Fill();
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
        InputStream stream8 = new FileInputStream("D:\\images\\background.jpg");
        Image background = new Image(stream8);
        InputStream stream9 = new FileInputStream("D:\\images\\grass.jpg");
        Image grass = new Image(stream9);
//        ///////////////////////////////////////////////////////////////////////////
//        //Creating the image view
        ImageView imageView9 = new ImageView();
        // Setting image to the image view
        imageView9.setImage(grass);
        //Setting the image view parameters
        imageView9.setX(0);
        imageView9.setY(0);
        imageView9.setFitWidth(10);
        imageView9.setFitHeight(10);
        imageView9.setPreserveRatio(true);
        imageView9.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView8 = new ImageView();
        // Setting image to the image view
        imageView8.setImage(background);
        //Setting the image view parameters
        imageView8.setX(0);
        imageView8.setY(0);
        imageView8.setFitWidth(1900);
        imageView8.setFitHeight(750);
        imageView8.setPreserveRatio(true);
        imageView8.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView6 = new ImageView();
       // Setting image to the image view
        imageView6.setImage(tiger);
        //Setting the image view parameters
        imageView6.setX(10);
        imageView6.setY(10);
        imageView6.setFitWidth(50);
        imageView6.setFitHeight(50);
        imageView6.setPreserveRatio(true);
        imageView6.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView = new ImageView();
        // Setting image to the image view
        imageView.setImage(bear);
        //Setting the image view parameters
        imageView.setX(10);
        imageView.setY(550);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        imageView.setPreserveRatio(true);
        imageView.setPickOnBounds(true);//it i important to click on images
//////////////////////////////////////////////////////////////////////////////////
        ImageView imageView7 = new ImageView();
        // Setting image to the image view
        imageView7.setImage(chicken);
        //Setting the image view parameters
        imageView7.setX(10);
        imageView7.setY(100);
        imageView7.setFitWidth(50);
        imageView7.setFitHeight(50);
        imageView7.setPreserveRatio(true);
        imageView7.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView1 = new ImageView();
        // Setting image to the image view
        imageView1.setImage(dog2);
        //Setting the image view parameters
        imageView1.setX(400);
        imageView1.setY(150);
        imageView1.setFitWidth(50);
        imageView1.setFitHeight(50);
        imageView1.setPreserveRatio(true);
        imageView1.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView2 = new ImageView();
        // Setting image to the image view
        imageView2.setImage(lion);
        //Setting the image view parameters
        imageView2.setX(10);
        imageView2.setY(200);
        imageView2.setFitWidth(50);
        imageView2.setFitHeight(50);
        imageView2.setPreserveRatio(true);
        imageView2.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView3 = new ImageView();
        // Setting image to the image view
        imageView3.setImage(ostrich);
        //Setting the image view parameters
        imageView3.setX(10);
        imageView3.setY(250);
        imageView3.setFitWidth(50);
        imageView3.setFitHeight(50);
        imageView3.setPreserveRatio(true);
        imageView3.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView4 = new ImageView();
        // Setting image to the image view
        imageView4.setImage(ox);
        //Setting the image view parameters
        imageView4.setX(10);
        imageView4.setY(300);
        imageView4.setFitWidth(50);
        imageView4.setFitHeight(50);
        imageView4.setPreserveRatio(true);
        imageView4.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        ImageView imageView5 = new ImageView();
        // Setting image to the image view
        imageView5.setImage(sheep);
        //Setting the image view parameters
        imageView5.setX(10);
        imageView5.setY(350);
        imageView5.setFitWidth(50);
        imageView5.setFitHeight(50);
        imageView5.setPreserveRatio(true);
        imageView5.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////
       MainView.getMV().setMainStage(primaryStage);
        primaryStage.setResizable(false);
        MainView.getMV().setScene("Start.fxml");
//        /////////////////////////////////////////////////////////////////////////////////////////
//click in images
        imageView6.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
Tiger tigers =new Tiger();
                Manager.getManager().allWilds.add(tigers);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(tiger);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
AnimalAnimation a=new AnimalAnimation(tigers,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
//click in images
        imageView.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                Bear bears=new Bear();
                Manager.getManager().allWilds.add(bears);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(bear);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(bears,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
//click in images
        imageView1.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
               Dog dog=new Dog();
                Manager.getManager().allDefenders.add(dog);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(dog2);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(dog,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
//click in images
        imageView5.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                Sheep sheeps=new Sheep();
                Manager.getManager().allDomestics.add(sheeps);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(sheep);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(sheeps,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
        imageView3.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
               Ostrich ostrichs=new Ostrich();
                Manager.getManager().allDomestics.add(ostrichs);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(ostrich);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(ostrichs,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());
            }
        });
        imageView2.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
              Lion lions=new Lion();
              Manager.getManager().allWilds.add(lions);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(lion);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(lions,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
        imageView7.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
  Hen hen=new Hen();
                Manager.getManager().allDomestics.add(hen);
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                imageViews.setImage(chicken);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(hen,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
//        Hen hen=new Hen();
//        ImageView imageViews = new ImageView();
//        // Setting image to the image view
//        imageViews.setImage(chicken);
//        //Setting the image view parameters
//        imageViews.setX(200);
//        imageViews.setY(200);
//        imageViews.setFitWidth(150);
//        imageViews.setFitHeight(150);
//        imageViews.setPreserveRatio(true);
//        imageViews.setPickOnBounds(true);//it i important to click on images
//        MainView.pane.getChildren().add(imageViews);
//        AnimalAnimation a=new AnimalAnimation(hen,imageViews,1);
//        AnimalAnimation.AnimalAn.add(a);
//        a.play();
//for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
//    AnimalAnimation.AnimalAn.get(i).imageview.setOnMouseClicked(new EventHandler() {
//        @Override
//        public void handle(Event event) {
//            Hen hen=new Hen();
//            ImageView imageViews = new ImageView();
//            // Setting image to the image view
//            imageViews.setImage(chicken);
//            //Setting the image view parameters
//            imageViews.setX(200);
//            imageViews.setY(200);
//            imageViews.setFitWidth(150);
//            imageViews.setFitHeight(150);
//            imageViews.setPreserveRatio(true);
//            imageViews.setPickOnBounds(true);//it i important to click on images
//            MainView.pane.getChildren().add(imageViews);
//            AnimalAnimation a=new AnimalAnimation(hen,imageViews,1);
//            AnimalAnimation.AnimalAn.add(a);
//            a.play();
//        }
//    });
//}
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////
        MainView.pane.getChildren().add(imageView8);
        MainView.pane.getChildren().add(imageView);
        MainView.pane.getChildren().add(imageView1);
        MainView.pane.getChildren().add(imageView2);
        MainView.pane.getChildren().add(imageView3);
        MainView.pane.getChildren().add(imageView4);
        MainView.pane.getChildren().add(imageView5);
        MainView.pane.getChildren().add(imageView6);
        MainView.pane.getChildren().add(imageView7);
        /////////////////////////////////////////////
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {


    }
}
