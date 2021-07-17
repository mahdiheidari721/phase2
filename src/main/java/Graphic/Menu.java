package Graphic;
        import Logic.*;
        import javafx.event.ActionEvent;
        import javafx.event.Event;
        import javafx.event.EventHandler;
        import javafx.fxml.FXML;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.image.ImageView;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.media.Media;
        import javafx.scene.media.MediaPlayer;
        import javafx.scene.media.MediaView;
        import javafx.scene.paint.Color;
        import javafx.scene.text.Font;
        import javafx.scene.text.FontWeight;
        import javafx.scene.text.Text;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.IOException;

public class Menu {
static int b=0;
static int a1=0;
    static int a2=0;
    static int a3=0;
    static int a4=0;
    static int a5=0;
    static int a6=0;
    static int a7=0;
    @FXML
    private Label play;

    @FXML
    private Label setting;

    @FXML
    private Label Level;

    @FXML
    private Label exit;

    @FXML
    void Levelpressed(MouseEvent event) throws IOException {
        MainView.getMV().setScene("Level.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    @FXML
    void exitpressed(MouseEvent event) throws Exception {
        DataBase.write();
        MainView.getMV().setScene("Bye.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    @FXML
    void playpressed(MouseEvent event) throws IOException {
        Main.Pause(false);
        MainView.getMV().setScene("Start.fxml");
        //////////////////////////////////////////
        Manager.getManager().Fill();
        LoadPhotos.getLP().Load();
        Text text = new Text();
        text.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        text.setFill(Color.YELLOW);
        text.setStroke(Color.GREEN);
        text.setX(955);
        text.setY(110);
Button b1=new Button();
        Button b2=new Button();
        Button b3=new Button();
        Button b4=new Button();
        Button b5=new Button();
        Button b6=new Button();
        Button b7=new Button();
        b1.setText("Build");
        b2.setText("Build");
        b3.setText("Build");
        b4.setText("Build");
        b5.setText("Build");
        b6.setText("Build");
        b7.setText("Build");
        b1.setLayoutX(993);
        b1.setLayoutY(333);
        b2.setLayoutX(993);
        b2.setLayoutY(590);
        b3.setLayoutX(950);
        b3.setLayoutY(100);
        b4.setLayoutX(204);
        b4.setLayoutY(490);
        b5.setLayoutX(175);
        b5.setLayoutY(308);
        b6.setLayoutX(160);
        b6.setLayoutY(146);
        b7.setLayoutX(950);
        b7.setLayoutY(473);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a1<3) a1++;
                if(a1==1) b1.setText("level1");
                if(a1==2) b1.setText("level2");
                if(a1==3) b1.setText("level3");
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a2<3) a2++;
                if(a2==1) b2.setText("level1");
                if(a2==2) b2.setText("level2");
                if(a2==3) b2.setText("level3");
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a3<3) a3++;
                if(a3==1) b3.setText("level1");
                if(a3==2) b3.setText("level2");
                if(a3==3) b3.setText("level3");
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a4<3) a4++;
                if(a4==1) b4.setText("level1");
                if(a4==2) b4.setText("level2");
                if(a4==3) b4.setText("level3");
            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a5<1) a5++;
                if(a5==1) b5.setText("level1");
                if(a5==2) b5.setText("level2");
                if(a5==3) b5.setText("level3");
            }
        });
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a6<3) a6++;
                if(a6==1) b6.setText("level1");
                if(a6==2) b6.setText("level2");
                if(a6==3) b6.setText("level3");
            }
        });
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(a7<3) a7++;
                if(a7==1) b7.setText("level1");
                if(a7==2) b7.setText("level2");
                if(a7==3) b7.setText("level3");
            }
        });
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
                String path = "D:\\images\\roar.wav";
                Media media = new Media(new File(path).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setAutoPlay(true);
                mediaPlayer.setVolume(1);
                mediaPlayer.setCycleCount(1);
                MediaView mediaView = new MediaView(mediaPlayer);
                MainView.pane.getChildren().add(mediaView);
                // System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
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
                String path = "D:\\images\\roar.wav";
                Media media = new Media(new File(path).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setAutoPlay(true);
                mediaPlayer.setVolume(1);
                mediaPlayer.setCycleCount(1);
                MediaView mediaView = new MediaView(mediaPlayer);
                MainView.pane.getChildren().add(mediaView);
                // System.out.println( AnimalAnimation.AnimalAn.size());

            }
        });
        LoadPhotos.getLP().imageView33.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if(Manager.getManager().bank.getCoin()>=150){
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-150);
                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
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
                    AnimalAnimation a=new AnimalAnimation(cats,imageViews,1000);
                    AnimalAnimation.AnimalAn.add(a);
                    a.play();
                    String path2 = "D:\\images\\monkey.wav";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                    // System.out.println( AnimalAnimation.AnimalAn.size());
                }
                else{
                    String path2 = "D:\\images\\warn.wav";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                }

            }
        });
        LoadPhotos.getLP().imageView31.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 500) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 500);
                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
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
                    String path2 = "D:\\images\\cow.mp3";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                    // System.out.println( AnimalAnimation.AnimalAn.size());
                }
                else{
                    String path3 = "D:\\images\\warn.wav";
                    Media media3 = new Media(new File(path3).toURI().toString());
                    MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
                    mediaPlayer3.setAutoPlay(true);
                    mediaPlayer3.setVolume(1);
                    mediaPlayer3.setCycleCount(1);
                    MediaView mediaView3 = new MediaView(mediaPlayer3);
                    MainView.pane.getChildren().add(mediaView3);
                }
            }
        });
        LoadPhotos.getLP().imageView30.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                if(Manager.getManager().bank.getCoin()>=100){
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-100);
                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
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
                    AnimalAnimation a=new AnimalAnimation(dog,imageViews,10000);
                    AnimalAnimation.AnimalAn.add(a);
                    a.play();
                    String path2 = "D:\\images\\dog.mp3";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                    //  System.out.println( AnimalAnimation.AnimalAn.size());
                }
                else{
                    String path4 = "D:\\images\\warn.wav";
                    Media media4= new Media(new File(path4).toURI().toString());
                    MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
                    mediaPlayer4.setAutoPlay(true);
                    mediaPlayer4.setVolume(1);
                    mediaPlayer4.setCycleCount(1);
                    MediaView mediaView4 = new MediaView(mediaPlayer4);
                    MainView.pane.getChildren().add(mediaView4);
                }
            }
        });
        LoadPhotos.getLP().imageView18.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 200) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 200);
                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
                    System.out.println(Manager.getManager().bank.getCoin());
                    ImageView imageViews = new ImageView();
                    // Setting image to the image view
                    try {
                        imageViews.setImage(LoadPhotos.getLP().ostrich);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    Ostrich ostrichs=new Ostrich(imageViews);
                    Manager.getManager().allDomestics.add(ostrichs);
                    //   System.out.println( Manager.getManager().allDomestics.size());
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
                    String path2 = "D:\\images\\ostrich.mp3";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                    //  System.out.println( AnimalAnimation.AnimalAn.size());
                }
                else{
                    String path5 = "D:\\images\\warn.wav";
                    Media media5= new Media(new File(path5).toURI().toString());
                    MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
                    mediaPlayer5.setAutoPlay(true);
                    mediaPlayer5.setVolume(1);
                    mediaPlayer5.setCycleCount(1);
                    MediaView mediaView5 = new MediaView(mediaPlayer5);
                    MainView.pane.getChildren().add(mediaView5);
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
                // System.out.println( AnimalAnimation.AnimalAn.size());
                String path = "D:\\images\\roar.wav";
                Media media = new Media(new File(path).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setAutoPlay(true);
                mediaPlayer.setVolume(1);
                mediaPlayer.setCycleCount(1);
                MediaView mediaView = new MediaView(mediaPlayer);
                MainView.pane.getChildren().add(mediaView);
            }
        });
        LoadPhotos.getLP().imageView25.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                if (Manager.getManager().bank.getCoin() >= 100) {
                    Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin() - 100);
                    text.setText(String.valueOf(Manager.getManager().bank.getCoin()));
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
                    String path2 = "D:\\images\\hen.mp3";
                    Media media2 = new Media(new File(path2).toURI().toString());
                    MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                    mediaPlayer2.setAutoPlay(true);
                    mediaPlayer2.setVolume(1);
                    mediaPlayer2.setCycleCount(1);
                    MediaView mediaView2 = new MediaView(mediaPlayer2);
                    MainView.pane.getChildren().add(mediaView2);
                    //  System.out.println( AnimalAnimation.AnimalAn.size());
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView10.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("feather")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=250){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-250);
                        LabratoryAnimation a=new LabratoryAnimation(5-a1);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().cloth);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Cloth cloth =new Cloth(imageViews);
                                Manager.getManager().products.add(cloth);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView10.getX()-50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView10.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(cloth,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{

                        String path6 = "D:\\images\\warn.wav";
                        Media media6= new Media(new File(path6).toURI().toString());
                        MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                        mediaPlayer6.setAutoPlay(true);
                        mediaPlayer6.setVolume(1);
                        mediaPlayer6.setCycleCount(1);
                        MediaView mediaView6 = new MediaView(mediaPlayer6);
                        MainView.pane.getChildren().add(mediaView6);

                }
            }
        });
        LoadPhotos.getLP().imageView11.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean a=Manager.getManager().CheckWell1();
                if(a){
                    LabratoryAnimation q= new LabratoryAnimation(1);
                    q.play();
                    String path6 = "D:\\images\\waterWell.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                    q.setOnFinished(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            Manager.getManager().Well1();
                        }
                    });
                }
                else{

                        String path6 = "D:\\images\\warn.wav";
                        Media media6= new Media(new File(path6).toURI().toString());
                        MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                        mediaPlayer6.setAutoPlay(true);
                        mediaPlayer6.setVolume(1);
                        mediaPlayer6.setCycleCount(1);
                        MediaView mediaView6 = new MediaView(mediaPlayer6);
                        MainView.pane.getChildren().add(mediaView6);

                    System.out.println("well is not empty");
                    //TODO
                }
            }
        });
        LoadPhotos.getLP().imageView12.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                ImageView imageViews = new ImageView();
                try {
                    imageViews.setImage(LoadPhotos.getLP().truck);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    imageViews.setX(LoadPhotos.getLP().imageView12.getX());
                    imageViews.setY(LoadPhotos.getLP().imageView12.getY());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                imageViews.setFitWidth(200);
                imageViews.setFitHeight(200);
                imageViews.setPreserveRatio(true);
                imageViews.setPickOnBounds(true);//it i important to click on images
                MainView.pane.getChildren().add(imageViews);
                TruckAnimation truck=new TruckAnimation(imageViews);
                truck.play();
                String path2 = "D:\\images\\car1.mp3";
                Media media2 = new Media(new File(path2).toURI().toString());
                MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                mediaPlayer2.setAutoPlay(true);
                mediaPlayer2.setVolume(1);
                mediaPlayer2.setCycleCount(1);
                MediaView mediaView2 = new MediaView(mediaPlayer2);
                MainView.pane.getChildren().add(mediaView2);
                String path = "D:\\images\\car2.mp3";
                Media media = new Media(new File(path).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setAutoPlay(true);
                mediaPlayer.setVolume(1);
                mediaPlayer.setCycleCount(1);
                MediaView mediaView = new MediaView(mediaPlayer);
                MainView.pane.getChildren().add(mediaView);
                truck.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Manager.getManager().bank.setCoin( Manager.getManager().bank.getCoin() +Main.ProductCost);
                        Main.text.setText( String.valueOf(Manager.getManager().bank.getCoin()));
                    }
                });

            }
        });
        LoadPhotos.getLP().imageView15.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("cloth")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=400){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
                        LabratoryAnimation a=new LabratoryAnimation(6-a7);
                        a.play();
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().shirt);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Shirt shirt =new Shirt(imageViews);
                                Manager.getManager().products.add(shirt);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView15.getX()-50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView15.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(shirt,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView20.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("milk")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=400){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
                        LabratoryAnimation a=new LabratoryAnimation(6-a2);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().packagedMilk);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                PackagedMilk packagedMilk =new PackagedMilk(imageViews);
                                Manager.getManager().products.add(packagedMilk);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView20.getX()-50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView20.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(packagedMilk,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView23.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("packagemilk")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=550){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-550);
                        LabratoryAnimation a=new LabratoryAnimation(6-a4);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().iceCream);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                IceCream iceCream =new IceCream(imageViews);
                                Manager.getManager().products.add(iceCream);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView23.getX());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView23.getY()+50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(iceCream,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView27.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("egg")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    System.out.println("hi");
                    if(Manager.getManager().bank.getCoin()>=150){
                        System.out.println("hello");
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-150);
                        LabratoryAnimation a=new LabratoryAnimation(2-a5);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                System.out.println("salam");
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().flour);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Flour flour =new Flour(imageViews);
                                Manager.getManager().products.add(flour);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView27.getX()+400);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView27.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(flour,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView36.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("flour")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=250){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-250);
                        LabratoryAnimation a=new LabratoryAnimation(5-a6);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().bread);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Bread bread =new Bread(imageViews);
                                Manager.getManager().products.add(bread);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView36.getX()+50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView36.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(50);
                                imageViews.setFitHeight(50);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                ProductAnimation b=new ProductAnimation(bread,imageViews,5,1);
                                ProductAnimation.ProductAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView22.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                boolean s=false;
                for(int i=0;i<Manager.getManager().wareHouse.products.size();i++){
                    if(Manager.getManager().wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase("egg")){
                        s=true;
                        Manager.getManager().wareHouse.products.remove(Manager.getManager().wareHouse.products.get(i));
                        break;
                    }
                }
                if(s){
                    if(Manager.getManager().bank.getCoin()>=400){
                        Manager.getManager().bank.setCoin(Manager.getManager().bank.getCoin()-400);
                        LabratoryAnimation a=new LabratoryAnimation(6-a3);
                        a.play();
                        String path2 = "D:\\images\\labratory.mp3";
                        Media media2 = new Media(new File(path2).toURI().toString());
                        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
                        mediaPlayer2.setAutoPlay(true);
                        mediaPlayer2.setVolume(1);
                        mediaPlayer2.setCycleCount(1);
                        MediaView mediaView2 = new MediaView(mediaPlayer2);
                        MainView.pane.getChildren().add(mediaView2);
                        a.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ImageView imageViews = new ImageView();
                                try {
                                    imageViews.setImage(LoadPhotos.getLP().chicken);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Hen hen =new Hen(imageViews);
                                Manager.getManager().allDomestics.add(hen);
                                try {
                                    imageViews.setX( LoadPhotos.getLP().imageView22.getX()-50);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    imageViews.setY( LoadPhotos.getLP().imageView22.getY());
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                imageViews.setFitWidth(100);
                                imageViews.setFitHeight(100);
                                imageViews.setPreserveRatio(true);
                                imageViews.setPickOnBounds(true);//it i important to click on images
                                MainView.pane.getChildren().add(imageViews);
                                AnimalAnimation b=new AnimalAnimation(hen,imageViews,5);
                                AnimalAnimation.AnimalAn.add(b);
                                b.play();
                            }
                        });
                    }
                }
                else{
                    String path6 = "D:\\images\\warn.wav";
                    Media media6= new Media(new File(path6).toURI().toString());
                    MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
                    mediaPlayer6.setAutoPlay(true);
                    mediaPlayer6.setVolume(1);
                    mediaPlayer6.setCycleCount(1);
                    MediaView mediaView6 = new MediaView(mediaPlayer6);
                    MainView.pane.getChildren().add(mediaView6);
                }
            }
        });
        LoadPhotos.getLP().imageView38.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {
                Main.Pause(true);


                try {
                    MainView.getMV().setScene("WareHouse.fxml");
                    Scene scene =new Scene(MainView.pane);
                    MainView.getMV().getMainStage().setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        LoadPhotos.getLP().imageView21.setOnMouseClicked(new EventHandler() {
            @Override
            public void handle(Event event) {

                if(b%2==0) Main.Pause(true);
                if(b%2==1) Main.Pause(true);
                b++;
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView8);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView37);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView38);
        MainView.pane.getChildren().add(text);
        MainView.pane.getChildren().add(b1);
        MainView.pane.getChildren().add(b2);
        MainView.pane.getChildren().add(b3);
        MainView.pane.getChildren().add(b4);
        MainView.pane.getChildren().add(b5);
        MainView.pane.getChildren().add(b6);
        MainView.pane.getChildren().add(b7);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView2);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView6);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView10);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView11);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView12);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView15);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView18);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView20);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView21);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView22);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView23);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView25);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView27);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView30);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView31);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView33);
        MainView.pane.getChildren().add(LoadPhotos.getLP().imageView36);
        Main.mediaPlayer.stop();
        String path = "D:\\images\\Africa.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setVolume(1);
        mediaPlayer.setCycleCount(-1);
        MediaView mediaView = new MediaView(mediaPlayer);
        MainView.pane.getChildren().add(mediaView);
        if(AnimalAnimation.AnimalAn.size()>0){
            for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
                MainView.pane.getChildren().add(AnimalAnimation.AnimalAn.get(i).imageview);
            }
        }
        if(ProductAnimation.ProductAn.size()>0){
            for(int i=0;i<ProductAnimation.ProductAn.size();i++){
                MainView.pane.getChildren().add(ProductAnimation.ProductAn.get(i).imageview);
            }
        }
        if(Manager.getManager().grasses.size()>0){
            for(int i=0;i<Manager.getManager().grasses.size();i++){
                MainView.pane.getChildren().add(Manager.getManager().grasses.get(i).getImageView());
            }}
        /////////////////////////////////////////////

        MainView.pane.setOnMouseClicked(e -> {
            int t=0;
            for(int i=0;i<AnimalAnimation.AnimalAn.size();i++){
                if(AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("bear")||AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("tiger")||AnimalAnimation.AnimalAn.get(i).animal.getNameOfAnimal().equalsIgnoreCase("lion")){
                    if(AnimalAnimation.AnimalAn.get(i).imageview.getBoundsInParent().intersects(e.getX(),e.getY(),1,1)){
                        t=1;
                        ImageView imageViews = new ImageView();

                        try {

                            imageViews.setImage(LoadPhotos.getLP().cage);

                        } catch (FileNotFoundException w) {
                            w.printStackTrace();
                        }
                        imageViews.setVisible(false);
                        CageAnimation m=new CageAnimation(AnimalAnimation.AnimalAn.get(i),imageViews,AnimalAnimation.AnimalAn.get(i).getAnimal());
                        int w=0;
                        int h=0;
                        if(AnimalAnimation.AnimalAn.get(i).getTeded()==0){


                            imageViews.setX(AnimalAnimation.AnimalAn.get(i).imageview.getX());
                            imageViews.setY(AnimalAnimation.AnimalAn.get(i).imageview.getY());
                            imageViews.setFitWidth(150);
                            imageViews.setFitHeight(150);
                            imageViews.setPreserveRatio(true);
                            imageViews.setPickOnBounds(true);//it i important to click on images
                            imageViews.setVisible(true);
                            MainView.pane.getChildren().add(imageViews);

                            m.play();


                            AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
                        }
                        else if(AnimalAnimation.AnimalAn.get(i).getTeded()>0&&AnimalAnimation.AnimalAn.get(i).getTeded()<3){
                            AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
                        }
                        else if(AnimalAnimation.AnimalAn.get(i).getTeded()==3||AnimalAnimation.AnimalAn.get(i).getTeded()==4){
                            if(AnimalAnimation.AnimalAn.get(i).getTeded()==3){
                                AnimalAnimation.AnimalAn.get(i).pause();
                                AnimalAnimation.AnimalAn.get(i).setTeded(AnimalAnimation.AnimalAn.get(i).getTeded()+1);
                            }
                            else if(AnimalAnimation.AnimalAn.get(i).getTeded()==4){
                                AnimalAnimation.AnimalAn.get(i).getImageview().setVisible(false);
                                AnimalAnimation.AnimalAn.remove( AnimalAnimation.AnimalAn.get(i));
                                //move to warehouse
                                //TODO
                            }
                        }

                    }


                }
            }

            if(t==0){
                for(int i=0;i<ProductAnimation.ProductAn.size();i++){
                    if(ProductAnimation.ProductAn.get(i).imageview.getBoundsInParent().intersects(e.getX(),e.getY(),1,1)){
                        boolean s= Manager.getManager().AddToWareHouse(ProductAnimation.ProductAn.get(i).product);

                        t=1;
                        if(s){
                            System.out.println(Manager.getManager().wareHouse.products.size()+" warehouse");
                            ProductAnimation.ProductAn.get(i).imageview.setVisible(false);
                            ProductAnimation.ProductAn.get(i).pause();
                            ProductAnimation.ProductAn.remove( ProductAnimation.ProductAn.get(i));
                            Alert a = new Alert(Alert.AlertType.INFORMATION);
                            a.setContentText("the product has been reached to the warehouse");
                            a.show();
                        }
                    }
                }
            }
            if(t==0){
                if(e.getX()<900&&e.getX()>200&&e.getY()>250){
                    ImageView imageViews = new ImageView();
                    try {
                        if(Manager.getManager().well.getCapacity()>0){
                            Manager.getManager().well.setCapacity(Manager.getManager().well.getCapacity()-1);
                            imageViews.setImage(LoadPhotos.getLP().grass);
                            Grass grasss=new Grass(imageViews,(int)Math.floor(e.getX())-75,(int)Math.floor(e.getY())-55,1);
                            Manager.getManager().grasses.add(grasss);
                            System.out.println(Manager.getManager().grasses.size()+"grass");
                            imageViews.setX((int)Math.floor(e.getX())-75);
                            imageViews.setY((int)Math.floor(e.getY())-55);
                            imageViews.setFitWidth(150);
                            imageViews.setFitHeight(150);
                            imageViews.setPreserveRatio(true);
                            imageViews.setPickOnBounds(true);//it i important to click on images
                            MainView.pane.getChildren().add(imageViews);
                        }
                        else{
                            String path1 = "D:\\images\\warn.wav";
                            Media media1 = new Media(new File(path1).toURI().toString());
                            MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
                            mediaPlayer1.setAutoPlay(true);
                            mediaPlayer1.setVolume(1);
                            mediaPlayer1.setCycleCount(1);
                            MediaView mediaView1 = new MediaView(mediaPlayer1);
                            MainView.pane.getChildren().add(mediaView1);
                        }  //play a good sound
                        //TODO
                    } catch (FileNotFoundException w) {
                        w.printStackTrace();
                    }

                }
            }

        } ); //for get the location of mouseclick
        //////////////////////////////////////////

        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    @FXML
    void settingPressed(MouseEvent event) {

    }

}