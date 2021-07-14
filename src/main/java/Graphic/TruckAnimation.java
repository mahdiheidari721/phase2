package Graphic;

import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class TruckAnimation extends Transition {
    ImageView imageView;
    boolean s;
    int q;
  public  TruckAnimation( ImageView imageView){
      this.s=s;
      this.imageView=imageView;
      this.q= (int) imageView.getX();
      this.setCycleDuration(Duration.millis(10000));
      this.setCycleCount(1);
      this.setAutoReverse(true);
    }
    @Override
    protected void interpolate(double frac) {
      //int t= (int) Math.floor(20*frac);
        this.imageView.setX(this.q-10*20*frac*(20*frac-20));
       if(frac==1){
           this.pause();
           this.imageView.setVisible(false);
       }
    }
}
