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
    ////////////////////////////////////////////////////////////////////////
public  ImageView imageView = new ImageView();
    public  ImageView imageView1 = new ImageView();
    public  ImageView imageView2 = new ImageView();
    public  ImageView imageView3 = new ImageView();
    public  ImageView imageView4 = new ImageView();
    public  ImageView imageView5 = new ImageView();
    public  ImageView imageView6 = new ImageView();
    public  ImageView imageView7 = new ImageView();
    public  ImageView imageView8 = new ImageView();
    public  ImageView imageView9 = new ImageView();
    public  ImageView imageView10 = new ImageView();
    public  ImageView imageView11 = new ImageView();
    public  ImageView imageView12 = new ImageView();
    public  ImageView imageView13 = new ImageView();
    public  ImageView imageView14 = new ImageView();
    public  ImageView imageView15 = new ImageView();
    public  ImageView imageView16 = new ImageView();
    public  ImageView imageView17 = new ImageView();
    public  ImageView imageView18 = new ImageView();
    public  ImageView imageView19 = new ImageView();
    public  ImageView imageView20 = new ImageView();
    public  ImageView imageView21 = new ImageView();
    public  ImageView imageView22 = new ImageView();
    public  ImageView imageView23 = new ImageView();
    public  ImageView imageView24 = new ImageView();
    public  ImageView imageView25 = new ImageView();
    public  ImageView imageView26 = new ImageView();
    public  ImageView imageView27 = new ImageView();
    public  ImageView imageView28 = new ImageView();
    public  ImageView imageView29 = new ImageView();
    public  ImageView imageView30 = new ImageView();
    public  ImageView imageView31 = new ImageView();
    public  ImageView imageView32 = new ImageView();
    public  ImageView imageView33 = new ImageView();
    public  ImageView imageView34 = new ImageView();
    public  ImageView imageView35 = new ImageView();
    public  ImageView imageView36 = new ImageView();
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
        imageView29.setImage(egg1);
        imageView29.setX(400);
        imageView29.setY(400);
        imageView29.setFitWidth(50);
        imageView29.setFitHeight(50);
        imageView29.setPreserveRatio(true);
        imageView29.setVisible(true);
        imageView29.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView10.setImage(weavingfactory);
        imageView10.setX(1043);
        imageView10.setY(333);
        imageView10.setFitWidth(150);
        imageView10.setFitHeight(150);
        imageView10.setPreserveRatio(true);
        imageView10.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView11.setImage(waterwell);
        imageView11.setX(1043);
        imageView11.setY(195);
        imageView11.setFitWidth(150);
        imageView11.setFitHeight(150);
        imageView11.setPreserveRatio(true);
        imageView11.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView12.setImage(truck);
        imageView12.setX(4);
        imageView12.setY(620);
        imageView12.setFitWidth(200);
        imageView12.setFitHeight(200);
        imageView12.setPreserveRatio(true);
        imageView12.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView15.setImage(shirtstor);
        imageView15.setX(1043);
        imageView15.setY(473);
        imageView15.setFitWidth(150);
        imageView15.setFitHeight(150);
        imageView15.setPreserveRatio(true);
        imageView15.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView18.setImage(ostrichitem);
        imageView18.setX(397);
        imageView18.setY(10);
        imageView18.setFitWidth(100);
        imageView18.setFitHeight(100);
        imageView18.setPreserveRatio(true);
        imageView18.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView20.setImage(milkfactory);
        imageView20.setX(1043);
        imageView20.setY(590);
        imageView20.setFitWidth(200);
        imageView20.setFitHeight(150);
        imageView20.setPreserveRatio(true);
        imageView20.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView21.setImage(menu);
        imageView21.setX(1044);
        imageView21.setY(710);
        imageView21.setFitWidth(80);
        imageView21.setFitHeight(80);
        imageView21.setPreserveRatio(true);
        imageView21.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView22.setImage(incubator);
        imageView22.setX(1069);
        imageView22.setY(100);
        imageView22.setFitWidth(150);
        imageView22.setFitHeight(92);
        imageView22.setPreserveRatio(true);
        imageView22.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView23.setImage(IceCreamShop);
        imageView23.setX(4);
        imageView23.setY(490);
        imageView23.setFitWidth(200);
        imageView23.setFitHeight(200);
        imageView23.setPreserveRatio(true);
        imageView23.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView25.setImage(henitem);
        imageView25.setX(296);
        imageView25.setY(3);
        imageView25.setFitWidth(100);
        imageView25.setFitHeight(100);
        imageView25.setPreserveRatio(true);
        imageView25.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView27.setImage(flourfactory);
        imageView27.setX(0);
        imageView27.setY(308);
        imageView27.setFitWidth(175);
        imageView27.setFitHeight(175);
        imageView27.setPreserveRatio(true);
        imageView27.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView30.setImage(dogitem);
        imageView30.setX(4);
        imageView30.setY(3);
        imageView30.setFitWidth(100);
        imageView30.setFitHeight(74);
        imageView30.setPreserveRatio(true);
        imageView30.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView31.setImage(cowitem);
        imageView31.setX(196);
        imageView31.setY(10);
        imageView31.setFitWidth(100);
        imageView31.setFitHeight(100);
        imageView31.setPreserveRatio(true);
        imageView31.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView33.setImage(catitem);
        imageView33.setX(104);
        imageView33.setY(3);
        imageView33.setFitWidth(100);
        imageView33.setFitHeight(100);
        imageView33.setPreserveRatio(true);
        imageView33.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView36.setImage(bakery);
        imageView36.setX(14);
        imageView36.setY(146);
        imageView36.setFitWidth(150);
        imageView36.setFitHeight(150);
        imageView36.setPreserveRatio(true);
        imageView36.setPickOnBounds(true);//it i important to click on images
        //////////////////////////////////////////////
        imageView8.setImage(background);
        imageView8.setX(0);
        imageView8.setY(0);
        imageView8.setFitWidth(1200);
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
        imageView6.setX(764);
        imageView6.setY(14);
        imageView6.setFitWidth(100);
        imageView6.setFitHeight(100);
        imageView6.setPreserveRatio(true);
        imageView6.setPickOnBounds(true);//it i important to click on images
        ///////////////////////////////////////////
        imageView.setImage(bear);
        imageView.setX(633);
        imageView.setY(14);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);
        imageView.setPickOnBounds(true);//it i important to click on images
//////////////////////////////////////////////////////////////////////////////////
        imageView7.setImage(chicken);
        imageView7.setX(296);
        imageView7.setY(3);
        imageView7.setFitWidth(100);
        imageView7.setFitHeight(100);
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
        imageView2.setX(508);
        imageView2.setY(31);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);
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
