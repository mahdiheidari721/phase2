package Graphic;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class LoadPhotos {
    InputStream stream8 = new FileInputStream("D:\\images\\background.png");
    Image background = new Image(stream8);
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
    InputStream stream4 = new FileInputStream("D:\\images\\cat2.png");
    Image cat = new Image(stream4);
    InputStream stream5 = new FileInputStream("D:\\images\\sheep.png");
    Image sheep = new Image(stream5);
    InputStream stream6 = new FileInputStream("D:\\images\\tiger.png");
    Image tiger = new Image(stream6);

    InputStream stream9 = new FileInputStream("D:\\images\\grass.png");
    Image grass = new Image(stream9);
  public  ImageView imageView8 = new ImageView();
    public  ImageView imageView1 = new ImageView();
    public  ImageView imageView2 = new ImageView();
    public  ImageView imageView3 = new ImageView();
    public  ImageView imageView4 = new ImageView();
    public  ImageView imageView5 = new ImageView();
    public  ImageView imageView6 = new ImageView();
    public  ImageView imageView7 = new ImageView();
    public  ImageView imageView9 = new ImageView();
    public  ImageView imageView = new ImageView();
    private static LoadPhotos LP;
    public static Pane pane;


    private LoadPhotos() throws FileNotFoundException {

    }

    public static LoadPhotos getLP() throws FileNotFoundException {
        if(LP == null) LP = new LoadPhotos();
        return LP;
    }
    public void Load() throws FileNotFoundException {

        // Setting image to the image view
        imageView8.setImage(background);
        //Setting the image view parameters
        imageView8.setX(100);
        imageView8.setY(0);
        imageView8.setFitWidth(9500);
        imageView8.setFitHeight(850);
        imageView8.setPreserveRatio(true);
        imageView8.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        //  creating the image object
//        InputStream stream = new FileInputStream("D:\\images\\bear.png");
//        Image bear = new Image(stream);
//        InputStream stream7 = new FileInputStream("D:\\images\\chicken.png");
//        Image chicken = new Image(stream7);
//        InputStream stream1 = new FileInputStream("D:\\images\\dog2.png");
//        Image dog2 = new Image(stream1);
//        InputStream stream2 = new FileInputStream("D:\\images\\lion.png");
//        Image lion = new Image(stream2);
//        InputStream stream3 = new FileInputStream("D:\\images\\ostrich.png");
//        Image ostrich = new Image(stream3);
//        InputStream stream4 = new FileInputStream("D:\\images\\cat2.png");
//        Image cat = new Image(stream4);
//        InputStream stream5 = new FileInputStream("D:\\images\\sheep.png");
//        Image sheep = new Image(stream5);
//        InputStream stream6 = new FileInputStream("D:\\images\\tiger.png");
//        Image tiger = new Image(stream6);
//
//        InputStream stream9 = new FileInputStream("D:\\images\\grass.png");
//        Image grass = new Image(stream9);
//        ///////////////////////////////////////////////////////////////////////////
//        //Creating the image view

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

        // Setting image to the image view
        imageView4.setImage(cat);
        //Setting the image view parameters
        imageView4.setX(10);
        imageView4.setY(300);
        imageView4.setFitWidth(50);
        imageView4.setFitHeight(50);
        imageView4.setPreserveRatio(true);
        imageView4.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////

        // Setting image to the image view
        imageView5.setImage(sheep);
        //Setting the image view parameters
        imageView5.setX(10);
        imageView5.setY(350);
        imageView5.setFitWidth(50);
        imageView5.setFitHeight(50);
        imageView5.setPreserveRatio(true);
        imageView5.setPickOnBounds(true);//it i important to click on images
    }
}
