package Graphic;
import Logic.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main extends Application implements EventHandler<ActionEvent>{
    static int pqrs=0;
    static int ProductCost=0;
  static  Text text = new Text();
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Manager.getManager().Fill();
        LoadPhotos.getLP().Load();

        text.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        text.setFill(Color.YELLOW);
        text.setStroke(Color.GREEN);
        text.setX(955);
        text.setY(110);
//        ///////////////////////////////////////////////////////////////////////////////////////
       MainView.getMV().setMainStage(primaryStage);
        primaryStage.setResizable(false);
        MainView.getMV().setScene("Welcome.fxml");
//        /////////////////////////////////////////////////////////////////////////////////////////
//        LoadPhotos.getLP().imageView6.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                ImageView imageViews = new ImageView();
//                // Setting image to the image view
//                try {
//                    imageViews.setImage(LoadPhotos.getLP().tiger);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                Tiger tigers =new Tiger(imageViews);
//                Manager.getManager().allWilds.add(tigers);
//                //Setting the image view parameters
//                imageViews.setX(200);
//                imageViews.setY(200);
//                imageViews.setFitWidth(150);
//                imageViews.setFitHeight(150);
//                imageViews.setPreserveRatio(true);
//                imageViews.setPickOnBounds(true);//it i important to click on images
//                MainView.pane.getChildren().add(imageViews);
//AnimalAnimation a=new AnimalAnimation(tigers,imageViews,1);
//                AnimalAnimation.AnimalAn.add(a);
//a.play();
//               // System.out.println( AnimalAnimation.AnimalAn.size());
//
//            }
//        });
//        LoadPhotos.getLP().imageView.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//
//                ImageView imageViews = new ImageView();
//                // Setting image to the image view
//                try {
//                    imageViews.setImage(LoadPhotos.getLP().bear);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                Bear bears=new Bear(imageViews);
//                Manager.getManager().allWilds.add(bears);
//                //Setting the image view parameters
//                imageViews.setX(200);
//                imageViews.setY(200);
//                imageViews.setFitWidth(150);
//                imageViews.setFitHeight(150);
//                imageViews.setPreserveRatio(true);
//                imageViews.setPickOnBounds(true);//it i important to click on images
//                MainView.pane.getChildren().add(imageViews);
//                AnimalAnimation a=new AnimalAnimation(bears,imageViews,1);
//                AnimalAnimation.AnimalAn.add(a);
//                a.play();
//               // System.out.println( AnimalAnimation.AnimalAn.size());
//
//            }
//        });
//        LoadPhotos.getLP().imageView33.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//               if(Manager.getManager().bank.getCoin()>=150){
//                   Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-150);
//                   text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
//                   ImageView imageViews = new ImageView();
//                   // Setting image to the image view
//                   try {
//                       imageViews.setImage(LoadPhotos.getLP().cat);
//                   } catch (FileNotFoundException e) {
//                       e.printStackTrace();
//                   }
//                   Cat cats=new Cat(imageViews);
//                   Manager.getManager().allDefenders.add(cats);
//                   //Setting the image view parameters
//                   imageViews.setX(200);
//                   imageViews.setY(200);
//                   imageViews.setFitWidth(150);
//                   imageViews.setFitHeight(150);
//                   imageViews.setPreserveRatio(true);
//                   imageViews.setPickOnBounds(true);//it i important to click on images
//                   MainView.pane.getChildren().add(imageViews);
//                   AnimalAnimation a=new AnimalAnimation(cats,imageViews,1000);
//                   AnimalAnimation.AnimalAn.add(a);
//                   a.play();
//                   // System.out.println( AnimalAnimation.AnimalAn.size());
//               }
//               else{
//                   //good allert
//               }
//
//            }
//        });
//        LoadPhotos.getLP().imageView31.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                if (Manager.getManager().bank.getCoin() >= 500) {
//                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 500);
//                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
//                    ImageView imageViews = new ImageView();
//                    // Setting image to the image view
//                    try {
//                        imageViews.setImage(LoadPhotos.getLP().sheep);
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    Sheep sheeps=new Sheep(imageViews);
//                    Manager.getManager().allDomestics.add(sheeps);
//                    //Setting the image view parameters
//                    imageViews.setX(200);
//                    imageViews.setY(200);
//                    imageViews.setFitWidth(150);
//                    imageViews.setFitHeight(150);
//                    imageViews.setPreserveRatio(true);
//                    imageViews.setPickOnBounds(true);//it i important to click on images
//                    MainView.pane.getChildren().add(imageViews);
//                    AnimalAnimation a=new AnimalAnimation(sheeps,imageViews,1);
//                    AnimalAnimation.AnimalAn.add(a);
//                    a.play();
//                   // System.out.println( AnimalAnimation.AnimalAn.size());
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView30.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//
//               if(Manager.getManager().bank.getCoin()>=100){
//                   Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-100);
//                   text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
//                   ImageView imageViews = new ImageView();
//                   // Setting image to the image view
//                   try {
//                       imageViews.setImage(LoadPhotos.getLP().dog2);
//                   } catch (FileNotFoundException e) {
//                       e.printStackTrace();
//                   }
//                   Dog dog=new Dog(imageViews);
//                   Manager.getManager().allDefenders.add(dog);
//                   //Setting the image view parameters
//                   imageViews.setX(200);
//                   imageViews.setY(200);
//                   imageViews.setFitWidth(150);
//                   imageViews.setFitHeight(150);
//                   imageViews.setPreserveRatio(true);
//                   imageViews.setPickOnBounds(true);//it i important to click on images
//                   MainView.pane.getChildren().add(imageViews);
//                   AnimalAnimation a=new AnimalAnimation(dog,imageViews,10000);
//                   AnimalAnimation.AnimalAn.add(a);
//                   a.play();
//                   //  System.out.println( AnimalAnimation.AnimalAn.size());
//               }
//else{
//    //good allert
//               }
//            }
//        });
//        LoadPhotos.getLP().imageView18.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                if (Manager.getManager().bank.getCoin() >= 200) {
//                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 200);
//                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
//                    System.out.println(Manager.getManager().bank.getCoin());
//                    ImageView imageViews = new ImageView();
//                    // Setting image to the image view
//                    try {
//                        imageViews.setImage(LoadPhotos.getLP().ostrich);
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    Ostrich ostrichs=new Ostrich(imageViews);
//                    Manager.getManager().allDomestics.add(ostrichs);
//                 //   System.out.println( Manager.getManager().allDomestics.size());
//                    //Setting the image view parameters
//                    imageViews.setX(200);
//                    imageViews.setY(200);
//                    imageViews.setFitWidth(150);
//                    imageViews.setFitHeight(150);
//                    imageViews.setPreserveRatio(true);
//                    imageViews.setPickOnBounds(true);//it i important to click on images
//                    MainView.pane.getChildren().add(imageViews);
//                    AnimalAnimation a=new AnimalAnimation(ostrichs,imageViews,1);
//                    AnimalAnimation.AnimalAn.add(a);
//                    a.play();
//                  //  System.out.println( AnimalAnimation.AnimalAn.size());
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView2.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//
//                ImageView imageViews = new ImageView();
//                // Setting image to the image view
//                try {
//                    imageViews.setImage(LoadPhotos.getLP().lion);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                Lion lions=new Lion(imageViews);
//                Manager.getManager().allWilds.add(lions);
//                //Setting the image view parameters
//                imageViews.setX(200);
//                imageViews.setY(200);
//                imageViews.setFitWidth(150);
//                imageViews.setFitHeight(150);
//                imageViews.setPreserveRatio(true);
//                imageViews.setPickOnBounds(true);//it i important to click on images
//                MainView.pane.getChildren().add(imageViews);
//                AnimalAnimation a=new AnimalAnimation(lions,imageViews,1);
//                AnimalAnimation.AnimalAn.add(a);
//                a.play();
//               // System.out.println( AnimalAnimation.AnimalAn.size());
//
//            }
//        });
//        LoadPhotos.getLP().imageView25.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                if (Manager.getManager().bank.getCoin() >= 100) {
//                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 100);
//                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
//                    System.out.println("bank");
//                    ImageView imageViews = new ImageView();
//                    // Setting image to the image view
//                    try {
//                        imageViews.setImage(LoadPhotos.getLP().chicken);
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    Hen hen=new Hen(imageViews);
//                    Manager.getManager().allDomestics.add(hen);
//                    //Setting the image view parameters
//                    imageViews.setX(200);
//                    imageViews.setY(200);
//                    imageViews.setFitWidth(150);
//                    imageViews.setFitHeight(150);
//                    imageViews.setPreserveRatio(true);
//                    imageViews.setPickOnBounds(true);//it i important to click on images
//                    MainView.pane.getChildren().add(imageViews);
//                    AnimalAnimation a=new AnimalAnimation(hen,imageViews,1);
//                    AnimalAnimation.AnimalAn.add(a);
//                    a.play();
//                  //  System.out.println( AnimalAnimation.AnimalAn.size());
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView10.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("feather")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=250){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-250);
//                        LabratoryAnimation a=new LabratoryAnimation(5);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().cloth);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                Cloth cloth =new Cloth(imageViews);
//                                Manager.getManager().products.add(cloth);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView10.getX()-50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setY( LoadPhotos.getLP().imageView10.getY());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(50);
//                                imageViews.setFitHeight(50);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                ProductAnimation b=new ProductAnimation(cloth,imageViews,5,1);
//                                ProductAnimation.ProductAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView11.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//               boolean a=Manager.getManager().CheckWell1();
//               if(a){
//                LabratoryAnimation q= new LabratoryAnimation(1);
//                q.play();
//                q.setOnFinished(new EventHandler<ActionEvent>() {
//                    @Override
//                    public void handle(ActionEvent event) {
//                        Manager.getManager().Well1();
//                    }
//                });
//               }
//              else{
//                   //show a good allert
//                   System.out.println("well is not empty");
//                   //TODO
//               }
//            }
//        });
//        LoadPhotos.getLP().imageView12.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                ImageView imageViews = new ImageView();
//                try {
//                    imageViews.setImage(LoadPhotos.getLP().truck);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    imageViews.setX(LoadPhotos.getLP().imageView12.getX());
//                    imageViews.setY(LoadPhotos.getLP().imageView12.getY());
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//
//                imageViews.setFitWidth(200);
//                imageViews.setFitHeight(200);
//                imageViews.setPreserveRatio(true);
//                imageViews.setPickOnBounds(true);//it i important to click on images
//                MainView.pane.getChildren().add(imageViews);
//                TruckAnimation truck=new TruckAnimation(imageViews);
//                truck.play();
//truck.setOnFinished(new EventHandler<ActionEvent>() {
//    @Override
//    public void handle(ActionEvent event) {
//        Manager.getManager().bank.setCoin( Manager.getManager().bank.getCoin() +ProductCost);
//    }
//});
//
//            }
//        });
//        LoadPhotos.getLP().imageView15.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("cloth")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=400){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
//                        LabratoryAnimation a=new LabratoryAnimation(6);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().shirt);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                Shirt shirt =new Shirt(imageViews);
//                                Manager.getManager().products.add(shirt);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView15.getX()-50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setY( LoadPhotos.getLP().imageView15.getY());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(50);
//                                imageViews.setFitHeight(50);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                ProductAnimation b=new ProductAnimation(shirt,imageViews,5,1);
//                                ProductAnimation.ProductAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView20.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("milk")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=400){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
//                        LabratoryAnimation a=new LabratoryAnimation(6);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().packagedMilk);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                PackagedMilk packagedMilk =new PackagedMilk(imageViews);
//                                Manager.getManager().products.add(packagedMilk);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView20.getX()-50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setY( LoadPhotos.getLP().imageView20.getY());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(50);
//                                imageViews.setFitHeight(50);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                ProductAnimation b=new ProductAnimation(packagedMilk,imageViews,5,1);
//                                ProductAnimation.ProductAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView23.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("packagemilk")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=550){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-550);
//                        LabratoryAnimation a=new LabratoryAnimation(6);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().iceCream);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                IceCream iceCream =new IceCream(imageViews);
//                                Manager.getManager().products.add(iceCream);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView23.getX());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView23.getY()+50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(50);
//                                imageViews.setFitHeight(50);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                ProductAnimation b=new ProductAnimation(iceCream,imageViews,5,1);
//                                ProductAnimation.ProductAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView27.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//              boolean s=true;
//              for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                  if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("egg")){
//                      s=true;
//                      Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                      break;
//                  }
//              }
//             if(s){
//                 System.out.println("hi");
//                if(Manager.getManager().bank.getCoin()>=150){
//                    System.out.println("hello");
//                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-150);
//                    LabratoryAnimation a=new LabratoryAnimation(1);
//                    a.play();
//                    a.setOnFinished(new EventHandler<ActionEvent>() {
//
//                        @Override
//                        public void handle(ActionEvent event) {
//                            System.out.println("salam");
//                            ImageView imageViews = new ImageView();
//                            try {
//                                imageViews.setImage(LoadPhotos.getLP().flour);
//                            } catch (FileNotFoundException e) {
//                                e.printStackTrace();
//                            }
//                            Flour flour =new Flour(imageViews);
//                            Manager.getManager().products.add(flour);
//                            try {
//                                imageViews.setX( LoadPhotos.getLP().imageView27.getX()+400);
//                            } catch (FileNotFoundException e) {
//                                e.printStackTrace();
//                            }
//                            try {
//                                imageViews.setY( LoadPhotos.getLP().imageView27.getY());
//                            } catch (FileNotFoundException e) {
//                                e.printStackTrace();
//                            }
//                            imageViews.setFitWidth(50);
//                            imageViews.setFitHeight(50);
//                            imageViews.setPreserveRatio(true);
//                            imageViews.setPickOnBounds(true);//it i important to click on images
//                            MainView.pane.getChildren().add(imageViews);
//                            ProductAnimation b=new ProductAnimation(flour,imageViews,5,1);
//                            ProductAnimation.ProductAn.add(b);
//                            b.play();
//                        }
//                    });
//                }
//             }
//             else{
//                 System.out.println("there is no egg:(");
//             }
//            }
//        });
//        LoadPhotos.getLP().imageView36.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("flour")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=250){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-250);
//                        LabratoryAnimation a=new LabratoryAnimation(5);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().bread);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                Bread bread =new Bread(imageViews);
//                                Manager.getManager().products.add(bread);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView36.getX()+50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setY( LoadPhotos.getLP().imageView36.getY());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(50);
//                                imageViews.setFitHeight(50);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                ProductAnimation b=new ProductAnimation(bread,imageViews,5,1);
//                                ProductAnimation.ProductAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView22.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                boolean s=false;
//                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
//                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("egg")){
//                        s=true;
//                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
//                        break;
//                    }
//                }
//                if(s){
//                    if(Manager.getManager().bank.getCoin()>=400){
//                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
//                        LabratoryAnimation a=new LabratoryAnimation(6);
//                        a.play();
//                        a.setOnFinished(new EventHandler<ActionEvent>() {
//                            @Override
//                            public void handle(ActionEvent event) {
//                                ImageView imageViews = new ImageView();
//                                try {
//                                    imageViews.setImage(LoadPhotos.getLP().chicken);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                Hen hen =new Hen(imageViews);
//                                Manager.getManager().allDomestics.add(hen);
//                                try {
//                                    imageViews.setX( LoadPhotos.getLP().imageView22.getX()-50);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                try {
//                                    imageViews.setY( LoadPhotos.getLP().imageView22.getY());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                imageViews.setFitWidth(100);
//                                imageViews.setFitHeight(100);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                                AnimalAnimation b=new AnimalAnimation(hen,imageViews,5);
//                                AnimalAnimation.AnimalAn.add(b);
//                                b.play();
//                            }
//                        });
//                    }
//                }
//                else{
//                    // a good allert
//                    //TODO
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView38.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                Pause(true);
//
//
//                try {
//                    MainView.getMV().setScene("WareHouse.fxml");
//                    Scene scene =new Scene(MainView.pane);
//                    MainView.getMV().getMainStage().setScene(scene);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        LoadPhotos.getLP().imageView21.setOnMouseClicked(new EventHandler() {
//            @Override
//            public void handle(Event event) {
//
//
//            }
//        });
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView8);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView37);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView38);
//       MainView.pane.getChildren().add(text);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView2);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView6);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView10);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView11);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView12);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView15);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView18);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView20);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView21);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView22);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView23);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView25);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView27);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView30);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView31);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView33);
//        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView36);
        /////////////////////////////////////////////
        Scene scene =new Scene(MainView.pane);
//        MainView.pane.setOnMouseClicked(e -> {
//int t=0;
//for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
//    if(AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("bear")||AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("tiger")||AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("lion")){
//        if(AnimalAnimation.AnimalAn.get(i).imageview.getBoundsInParent().intersects(e.getX(),e.getY(),1,1)){
//            t=1;
//            ImageView imageViews = new ImageView();
//
//            try {
//
//                imageViews.setImage(LoadPhotos.getLP().cage);
//
//            } catch (FileNotFoundException w) {
//                w.printStackTrace();
//            }
//            imageViews.setVisible(false);
//            CageAnimation m=new CageAnimation(AnimalAnimation.AnimalAn.get(i),imageViews,AnimalAnimation.AnimalAn.get(i).getAnimal());
//            int w=0;
//            int h=0;
//            if(AnimalAnimation.AnimalAn.get(i).getTeded()==0){
//
//
//                imageViews.setX(AnimalAnimation.AnimalAn.get(i).imageview.getX());
//                imageViews.setY(AnimalAnimation.AnimalAn.get(i).imageview.getY());
//                imageViews.setFitWidth(150);
//                imageViews.setFitHeight(150);
//                imageViews.setPreserveRatio(true);
//                imageViews.setPickOnBounds(true);//it i important to click on images
//                imageViews.setVisible(true);
//                MainView.pane.getChildren().add(imageViews);
//
//                m.play();
//
//
//                AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
//            }
//             else if(AnimalAnimation.AnimalAn.get(i).getTeded()>0&&AnimalAnimation.AnimalAn.get(i).getTeded()<3){
//                AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
//            }
//             else if(AnimalAnimation.AnimalAn.get(i).getTeded()==3||AnimalAnimation.AnimalAn.get(i).getTeded()==4){
//                 if(AnimalAnimation.AnimalAn.get(i).getTeded()==3){
//                     AnimalAnimation.AnimalAn.get(i).pause();
//                     AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
//                 }
//               else if(AnimalAnimation.AnimalAn.get(i).getTeded()==4){
//                    AnimalAnimation.AnimalAn.get(i).getImageview().setVisible(false);
//                    AnimalAnimation.AnimalAn.remove( AnimalAnimation.AnimalAn.get(i));
//                    //move to warehouse
//                     //TODO
//                }
//            }
//
//        }
//
//
//        }
//    }
//
//               if(t==0){
//                   for(int i=0;i<ProductAnimation.ProductAn.size();i++){
//                       if(ProductAnimation.ProductAn.get(i).imageview.getBoundsInParent().intersects(e.getX(),e.getY(),1,1)){
//                           boolean s= Manager.getManager().AddToWareHouse(ProductAnimation.ProductAn.get(i).product);
//
//                           t=1;
//                           if(s){
//                               System.out.println(Manager.getManager().wareHouse.products.size()+" warehouse");
//                               ProductAnimation.ProductAn.get(i).imageview.setVisible(false);
//                               ProductAnimation.ProductAn.get(i).pause();
//                               ProductAnimation.ProductAn.remove( ProductAnimation.ProductAn.get(i));
//                               Alert a = new Alert(Alert.AlertType.INFORMATION);
//                               a.setContentText("the product has been reached to the warehouse");
//                               a.show();
//                           }
//                       }
//                   }
//               }
//                if(t==0){
//                    if(e.getX()<900&&e.getX()>200&&e.getY()>250){
//                        ImageView imageViews = new ImageView();
//                        try {
//                            if(Manager.getManager().well.getCapacity()>0){
//                                Manager.getManager().well.setCapacity(Manager.getManager().well.getCapacity()-1);
//                                imageViews.setImage(LoadPhotos.getLP().grass);
//                                Grass grasss=new Grass(imageViews,(int)Math.floor(e.getX())-75,(int)Math.floor(e.getY())-55,1);
//                                Manager.getManager().grasses.add(grasss);
//                                System.out.println(Manager.getManager().grasses.size()+"grass");
//                                imageViews.setX((int)Math.floor(e.getX())-75);
//                                imageViews.setY((int)Math.floor(e.getY())-55);
//                                imageViews.setFitWidth(150);
//                                imageViews.setFitHeight(150);
//                                imageViews.setPreserveRatio(true);
//                                imageViews.setPickOnBounds(true);//it i important to click on images
//                                MainView.pane.getChildren().add(imageViews);
//                            }
//                            else{
//                                System.out.println("well is empty");
//                            }  //play a good sound
//                            //TODO
//                        } catch (FileNotFoundException w) {
//                            w.printStackTrace();
//                        }
//
//                    }
//                }
//
//        } ); //for get the location of mouseclick
        MainView.getMV().getMainStage().setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {


    }
  static  public void Pause(boolean s){
        if(s){
            if(AnimalAnimation.AnimalAn.size()>0){
                for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
                AnimalAnimation.AnimalAn.get(i).pause();
            }}
            if(ProductAnimation.ProductAn.size()>0){
                for(int i=0;i<ProductAnimation.ProductAn.size();i++){
                AnimalAnimation.AnimalAn.get(i).pause();
            }}



        }
        if(!s){
            if(AnimalAnimation.AnimalAn.size()>0){
                for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
                    AnimalAnimation.AnimalAn.get(i).play();
                }
            }
                if(ProductAnimation.ProductAn.size()>0){
                    for(int i=0;i<ProductAnimation.ProductAn.size();i++){
                        AnimalAnimation.AnimalAn.get(i).play();
                    }
                }
        }

    }
}
