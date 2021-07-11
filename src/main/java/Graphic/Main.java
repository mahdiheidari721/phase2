package Graphic;
import Logic.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main extends Application implements EventHandler<ActionEvent>{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Manager.getManager().Fill();
        LoadPhotos.getLP().Load();

//        ///////////////////////////////////////////////////////////////////////////////////////
       MainView.getMV().setMainStage(primaryStage);
        primaryStage.setResizable(false);
        MainView.getMV().setScene("Start.fxml");
//        /////////////////////////////////////////////////////////////////////////////////////////
//click in images
        LoadPhotos.getLP().imageView6.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                ImageView imageViews = new ImageView();
                // Setting image to the image view
                try {
                    imageViews.setImage(LoadPhotos.getLP().tiger);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Tiger tigers =new Tiger(imageViews);
                Manager.getManager().allWilds.add(tigers);
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
        LoadPhotos.getLP().imageView.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                ImageView imageViews = new ImageView();
                // Setting image to the image view
                try {
                    imageViews.setImage(LoadPhotos.getLP().bear);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Bear bears=new Bear(imageViews);
                Manager.getManager().allWilds.add(bears);
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
        LoadPhotos.getLP().imageView4.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                ImageView imageViews = new ImageView();
                // Setting image to the image view
                try {
                    imageViews.setImage(LoadPhotos.getLP().cat);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Cat cats=new Cat(imageViews);
                Manager.getManager().allDefenders.add(cats);
                //Setting the image view parameters
                imageViews.setX(200);
                imageViews.setY(200);
                imageViews.setFitWidth(150);
                imageViews.setFitHeight(150);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                AnimalAnimation a=new AnimalAnimation(cats,imageViews,1);
                AnimalAnimation.AnimalAn.add(a);
                a.play();
                System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
//click in images
        LoadPhotos.getLP().imageView1.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                ImageView imageViews = new ImageView();
                // Setting image to the image view
                try {
                    imageViews.setImage(LoadPhotos.getLP().dog2);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Dog dog=new Dog(imageViews);
                Manager.getManager().allDefenders.add(dog);
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
        LoadPhotos.getLP().imageView5.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 500) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 500);
                    System.out.println("bank");
                    ImageView imageViews = new ImageView();
                    // Setting image to the image view
                    try {
                        imageViews.setImage(LoadPhotos.getLP().sheep);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    Sheep sheeps=new Sheep(imageViews);
                    Manager.getManager().allDomestics.add(sheeps);
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
            }
        });
        LoadPhotos.getLP().imageView3.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 200) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 200);
                    System.out.println("bank");
                    ImageView imageViews = new ImageView();
                    // Setting image to the image view
                    try {
                        imageViews.setImage(LoadPhotos.getLP().ostrich);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    Ostrich ostrichs=new Ostrich(imageViews);
                    Manager.getManager().allDomestics.add(ostrichs);
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
            }
        });
        LoadPhotos.getLP().imageView2.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                ImageView imageViews = new ImageView();
                // Setting image to the image view
                try {
                    imageViews.setImage(LoadPhotos.getLP().lion);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Lion lions=new Lion(imageViews);
                Manager.getManager().allWilds.add(lions);
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
        LoadPhotos.getLP().imageView7.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 100) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 100);
                    System.out.println("bank");
                    ImageView imageViews = new ImageView();
                    // Setting image to the image view
                    try {
                        imageViews.setImage(LoadPhotos.getLP().chicken);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    Hen hen=new Hen(imageViews);
                    Manager.getManager().allDomestics.add(hen);
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
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView8);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView1);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView2);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView3);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView4);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView5);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView6);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView7);
        /////////////////////////////////////////////
        Scene scene =new Scene(MainView.pane);
        MainView.pane.setOnMouseClicked(e -> {
         if(e.getX()>200&&e.getY()>250){
             ImageView imageViews = new ImageView();
             try {
                 imageViews.setImage(LoadPhotos.getLP().grass);
             } catch (FileNotFoundException w) {
                 w.printStackTrace();
             }
             Grass grasss=new Grass(imageViews,(int)Math.floor(e.getX()),(int)Math.floor(e.getY()),1);
             Manager.getManager().grasses.add(grasss);
             imageViews.setX((int)Math.floor(e.getX()));
             imageViews.setY((int)Math.floor(e.getY()));
             imageViews.setFitWidth(150);
             imageViews.setFitHeight(150);
             imageViews.setPreserveRatio(true);
             imageViews.setPickOnBounds(true);//it i important to click on images
             MainView.pane.getChildren().add(imageViews);
         }
        } ); //for get the location of mouseclick
        MainView.getMV().getMainStage().setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {


    }
}
