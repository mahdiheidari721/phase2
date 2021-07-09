package Graphic;

import Logic.Animal;
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
        this.setCycleDuration(Duration.millis(100000*t));
        this.setCycleCount(-1);
    }

    @Override
    protected void interpolate(double frac) {
        this.imageview.setX(this.imageview.getX()+1);
        this.imageview.setY(this.imageview.getY()+1);
    }
}
