package Logic;

import javafx.scene.image.ImageView;

public class Flour extends Product{
    static final String nameOfProduct = "Flour";
    static final int timeOfCorrupting = 5 ;
    static final int Price = 40 ;
    static final int SizeInWareHouse = 2 ;
    static final int Time = 4 ;
    public Flour(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public Flour( ImageView imageView) {
        super();
        this.imageview=imageView;
    }
}
