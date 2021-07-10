package Logic;

import javafx.scene.image.ImageView;

public class Shirt extends Product{
    static final String nameOfProduct = "Shirt";
    static final int timeOfCorrupting = 6;
    static final int Price = 100 ;
    static final int SizeInWareHouse = 4 ;
    static final int Time = 6 ;

    public Shirt(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public Shirt(ImageView imageView, int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
        this.imageview=imageView;
    }
}
