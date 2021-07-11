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
    InputStream stream = new FileInputStream("D:\\images\\yoozpalang.gif");
    Image bear = new Image(stream);

InputStream stream7 = new FileInputStream("D:\\images\\hen.gif");
    Image chicken = new Image(stream7);
    InputStream stream1 = new FileInputStream("D:\\images\\dof.gif");
    Image dog2 = new Image(stream1);
    InputStream stream2 = new FileInputStream("D:\\images\\lion.gif");
    Image lion = new Image(stream2);
    InputStream stream3 = new FileInputStream("D:\\images\\Ostrich.gif");
    Image ostrich = new Image(stream3);
    InputStream stream4 = new FileInputStream("D:\\images\\meimoon.gif");
    Image cat = new Image(stream4);
    InputStream stream5 = new FileInputStream("D:\\images\\cow.gif");
    Image sheep = new Image(stream5);
    InputStream stream6 = new FileInputStream("D:\\images\\tiger.gif");
    Image tiger = new Image(stream6);
    InputStream stream9 = new FileInputStream("D:\\images\\grass.png");
    Image grass = new Image(stream9);

    InputStream stream10 = new FileInputStream("D:\\images\\weavingfactory.png");
    Image weavingfactory = new Image(stream10);
    InputStream stream11 = new FileInputStream("D:\\images\\waterwell.png");
    Image waterwell = new Image(stream11);
    InputStream stream12 = new FileInputStream("D:\\images\\truck.png");
    Image truck = new Image(stream12);
    InputStream stream13 = new FileInputStream("D:\\images\\shirt.png");
    Image shirt = new Image(stream13);
    InputStream stream15 = new FileInputStream("D:\\images\\shirtstor.png");
    Image shirtstor = new Image(stream15);
    InputStream stream17 = new FileInputStream("D:\\images\\packagedMilk.png");
    Image packagedMilk = new Image(stream17);
    InputStream stream18 = new FileInputStream("D:\\images\\ostrichitem.png");
    Image ostrichitem = new Image(stream18);
     InputStream stream19 = new FileInputStream("D:\\images\\milk2.png");
    Image milk2 = new Image(stream19);
    InputStream stream20 = new FileInputStream("D:\\images\\milkfactory.png");
    Image milkfactory = new Image(stream20);
    InputStream stream21 = new FileInputStream("D:\\images\\menu.png");
    Image menu = new Image(stream21);
    InputStream stream22 = new FileInputStream("D:\\images\\incubator.png");
    Image incubator = new Image(stream22);
    InputStream stream23 = new FileInputStream("D:\\images\\IceCreamShop.png");
    Image IceCreamShop = new Image(stream23);
    InputStream stream24 = new FileInputStream("D:\\images\\iceCream.png");
    Image iceCream = new Image(stream24);
    InputStream stream25 = new FileInputStream("D:\\images\\henitem.png");
    Image henitem = new Image(stream25);
    InputStream stream26 = new FileInputStream("D:\\images\\flour.png");
    Image flour = new Image(stream26);
    InputStream stream27 = new FileInputStream("D:\\images\\flourfactory.png");
    Image flourfactory = new Image(stream27);
    InputStream stream28 = new FileInputStream("D:\\images\\feather.png");
    Image feather = new Image(stream28);
    InputStream stream29 = new FileInputStream("D:\\images\\egg1.png");
    Image egg1 = new Image(stream29);
    InputStream stream30 = new FileInputStream("D:\\images\\dogitem.png");
    Image dogitem = new Image(stream30);
    InputStream stream31 = new FileInputStream("D:\\images\\cowitem.png");
    Image cowitem = new Image(stream31);
    InputStream stream32 = new FileInputStream("D:\\images\\cloth.png");
    Image cloth = new Image(stream32);
    InputStream stream33 = new FileInputStream("D:\\images\\catitem.png");
    Image catitem = new Image(stream33);
    InputStream stream34 = new FileInputStream("D:\\images\\cage.png");
    Image cage = new Image(stream34);
    InputStream stream35 = new FileInputStream("D:\\images\\bread.png");
    Image bread = new Image(stream35);
    InputStream stream36 = new FileInputStream("D:\\images\\bakery.png");
    Image bakery = new Image(stream36);
//    InputStream stream37 = new FileInputStream("D:\\images\\grass.png");
//    Image grass = new Image(stream9);
//    InputStream stream38 = new FileInputStream("D:\\images\\grass.png");
//    Image grass = new Image(stream9);
//    InputStream stream39 = new FileInputStream("D:\\images\\grass.png");
//    Image grass = new Image(stream9);
//    InputStream stream40 = new FileInputStream("D:\\images\\grass.png");
//    Image grass = new Image(stream9);
//    InputStream stream41 = new FileInputStream("D:\\images\\grass.png");
//    Image grass = new Image(stream9);
    ////////////////////////////////////////////////////////////////////////
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
    ////////////////////////////////////////////////////////////////////////
    private static LoadPhotos LP;
    public static Pane pane;


    private LoadPhotos() throws FileNotFoundException {

    }

    public static LoadPhotos getLP() throws FileNotFoundException {
        if(LP == null) LP = new LoadPhotos();
        return LP;
    }
    public void Load() throws FileNotFoundException {
        imageView8.setImage(background);
        imageView8.setX(0);
        imageView8.setY(0);
        imageView8.setFitWidth(1500);
        imageView8.setFitHeight(800);
        imageView8.setPreserveRatio(true);
        imageView8.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView9.setImage(grass);
        imageView9.setX(0);
        imageView9.setY(0);
        imageView9.setFitWidth(10);
        imageView9.setFitHeight(10);
        imageView9.setPreserveRatio(true);
        imageView9.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView6.setImage(tiger);
        imageView6.setX(10);
        imageView6.setY(10);
        imageView6.setFitWidth(50);
        imageView6.setFitHeight(50);
        imageView6.setPreserveRatio(true);
        imageView6.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView.setImage(bear);
        imageView.setX(10);
        imageView.setY(550);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        imageView.setPreserveRatio(true);
        imageView.setPickOnBounds(true);//it i important to click on images
//////////////////////////////////////////////////////////////////////////////////
        imageView7.setImage(chicken);
        imageView7.setX(10);
        imageView7.setY(100);
        imageView7.setFitWidth(50);
        imageView7.setFitHeight(50);
        imageView7.setPreserveRatio(true);
        imageView7.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView1.setImage(dog2);
        imageView1.setX(0);
        imageView1.setY(150);
        imageView1.setFitWidth(50);
        imageView1.setFitHeight(50);
        imageView1.setPreserveRatio(true);
        imageView1.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView2.setImage(lion);
        imageView2.setX(10);
        imageView2.setY(200);
        imageView2.setFitWidth(50);
        imageView2.setFitHeight(50);
        imageView2.setPreserveRatio(true);
        imageView2.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView3.setImage(ostrich);
        imageView3.setX(10);
        imageView3.setY(250);
        imageView3.setFitWidth(50);
        imageView3.setFitHeight(50);
        imageView3.setPreserveRatio(true);
        imageView3.setPickOnBounds(true);//it i important to click on images
       /////////////////////////////////
        imageView4.setImage(cat);
        imageView4.setX(10);
        imageView4.setY(300);
        imageView4.setFitWidth(50);
        imageView4.setFitHeight(50);
        imageView4.setPreserveRatio(true);
        imageView4.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView5.setImage(sheep);
        imageView5.setX(10);
        imageView5.setY(350);
        imageView5.setFitWidth(50);
        imageView5.setFitHeight(50);
        imageView5.setPreserveRatio(true);
        imageView5.setPickOnBounds(true);//it i important to click on images
    }
}
