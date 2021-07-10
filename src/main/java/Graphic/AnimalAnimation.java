package Graphic;

import Logic.Animal;
import Logic.Manager;
import Logic.Product;
import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class AnimalAnimation extends Transition {
     static ArrayList<AnimalAnimation> AnimalAn=new ArrayList<>();
    Animal animal;
    ImageView imageview;
    public AnimalAnimation(Animal animal, ImageView imageview,int t) {
this.imageview=imageview;
        this.animal = animal;
        this.setCycleDuration(Duration.millis(200000*t));
        this.setCycleCount(-1);
    }

    @Override
    protected void interpolate(double frac) {
    //  if(frac>0.5)this.imageview.setVisible(false);
//        AnimalAn.remove(this);
//        Manager.getManager().allDomestics.remove(this.animal);
        Manager.getManager().RemoveDeadAnimals(this.imageview,this.animal,frac);
boolean s=Manager.getManager().Walk1(this.animal,frac);
int a=Manager.getManager().Intersection(this.imageview,this.animal,frac);
if(s) this.imageview.setVisible(false);
        this.imageview.setX(this.animal.getX_position());
        this.imageview.setY(this.animal.getY_position());
    }
}
