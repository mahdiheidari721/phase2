package Graphic;

import Logic.Animal;
import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class CageAnimation extends Transition {
    ImageView imageView;
    Animal animal;
    AnimalAnimation animation;
    public CageAnimation( AnimalAnimation animation,ImageView imageView,Animal animal) {
       this.imageView=imageView;
       this.animal = animal;
       this.animation=animation;
        this.setCycleDuration(Duration.millis(4000));
        this.setCycleCount(1);
    }
    @Override
    protected void interpolate(double frac) {
        if(frac==1) {this.imageView.setVisible(false);
            this.pause();
            this.animation.play();
this.animation.setTeded(0);
        }
        this.imageView.setX(this.animal.getImageview().getX());
        this.imageView.setY(this.animal.getImageview().getY());
    }
}
