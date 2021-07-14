package Graphic;

import Logic.Manager;
import Logic.Product;
import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class ProductAnimation extends Transition {
    static ArrayList<ProductAnimation> ProductAn=new ArrayList<>();
    Product product;
    ImageView imageview;
    public ProductAnimation(Product product, ImageView imageview,int t,int w) {
        this.imageview=imageview;
        this.product = product;
        this.setCycleDuration(Duration.millis(100000*t));
        this.setCycleCount(w);
    }
    @Override
    protected void interpolate(double frac) {
if(frac==1) {
    this.imageview.setVisible(false);
    Manager.getManager().products.remove(this.product);
     System.out.println(Manager.getManager().products.size()+" deleting");
    ProductAn.remove(this);
}
    }
}
