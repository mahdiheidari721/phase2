package Graphic;

import Logic.Labratory;
import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class LabratoryAnimation extends Transition {
    Labratory labratory;
    ImageView imageview;
    public LabratoryAnimation( int t) {
//        this.imageview=imageview;
//        this.labratory = labratory;
        this.setCycleDuration(Duration.millis(1000*t));
        this.setCycleCount(1);
    }

    @Override
    protected void interpolate(double frac) {

    }
}
