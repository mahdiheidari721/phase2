package Logic;

import javafx.scene.image.ImageView;

public class Bread extends Product{
    static final String nameOfProduct = "Bread";
    static final int timeOfCorrupting = 6;
    static final int Price = 80 ;
    static final int SizeInWareHouse = 4 ;
    static final int Time = 5 ;
    public Bread(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public Bread(ImageView imageView) {
        super("Bread");
        this.imageview=imageView;
    }
}
