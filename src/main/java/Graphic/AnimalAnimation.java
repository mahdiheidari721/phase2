package Graphic;

import Logic.*;
import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AnimalAnimation extends Transition {
     static ArrayList<AnimalAnimation> AnimalAn=new ArrayList<>();
    Animal animal;
    ImageView imageview;
    public AnimalAnimation(Animal animal, ImageView imageview,int t) {
this.imageview=imageview;
        this.animal = animal;
        this.setCycleDuration(Duration.millis(2000*t));
        this.setCycleCount(-1);
    }

    @Override
    protected void interpolate(double frac) {
   if(this.animal.getNameOfAnimal().equalsIgnoreCase("sheep")||this.animal.getNameOfAnimal().equalsIgnoreCase("hen")||this.animal.getNameOfAnimal().equalsIgnoreCase("ostrich")){
       if(frac>0.5&&frac<0.51){
          if(this.animal.getNameOfAnimal().equalsIgnoreCase("sheep")){
              ImageView imageViews = new ImageView();
              try {
                  imageViews.setImage(LoadPhotos.getLP().milk2);
              } catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
             Milk milk =new Milk(imageViews);
              Manager.getManager().products.add(milk);
              imageViews.setX(this.animal.getX_position());
              imageViews.setY(this.animal.getY_position());
              imageViews.setFitWidth(50);
              imageViews.setFitHeight(50);
              imageViews.setPreserveRatio(true);
              imageViews.setPickOnBounds(true);//it i important to click on images
              MainView.pane.getChildren().add(imageViews);
              ProductAnimation a=new ProductAnimation(milk,imageViews,5,1);
              ProductAnimation.ProductAn.add(a);
              a.play();
          }
          else if(this.animal.getNameOfAnimal().equalsIgnoreCase("hen")){
              ImageView imageViews = new ImageView();
              try {
                  imageViews.setImage(LoadPhotos.getLP().egg1);
              } catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
              Egg egg =new Egg(imageViews);
              Manager.getManager().products.add(egg);
              imageViews.setX(this.animal.getX_position());
              imageViews.setY(this.animal.getY_position());
              imageViews.setFitWidth(50);
              imageViews.setFitHeight(50);
              imageViews.setPreserveRatio(true);
              imageViews.setPickOnBounds(true);//it i important to click on images
              MainView.pane.getChildren().add(imageViews);
              ProductAnimation a=new ProductAnimation(egg,imageViews,5,1);
              ProductAnimation.ProductAn.add(a);
              a.play();
           }
          else if(this.animal.getNameOfAnimal().equalsIgnoreCase("ostrich")){
              ImageView imageViews = new ImageView();
              try {
                  imageViews.setImage(LoadPhotos.getLP().feather);
              } catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
              Feather feather =new Feather(imageViews);
              Manager.getManager().products.add(feather);
              imageViews.setX(this.animal.getX_position());
              imageViews.setY(this.animal.getY_position());
              imageViews.setFitWidth(50);
              imageViews.setFitHeight(50);
              imageViews.setPreserveRatio(true);
              imageViews.setPickOnBounds(true);//it i important to click on images
              MainView.pane.getChildren().add(imageViews);
              ProductAnimation a=new ProductAnimation(feather,imageViews,5,1);
              ProductAnimation.ProductAn.add(a);
              a.play();
           }
       }
   }
if(frac==1){
    this.imageview.setVisible(false);
    this.pause();
    AnimalAn.remove(this);
}
boolean s=Manager.getManager().Walk1(this.animal,frac);
int a=Manager.getManager().Intersection(this.imageview,this.animal,frac);
        Manager.getManager().RemoveDeadAnimals(this.imageview,this.animal,frac);
if(s) this.imageview.setVisible(false);
        this.imageview.setX(this.animal.getX_position());
        this.imageview.setY(this.animal.getY_position());
    }
}
