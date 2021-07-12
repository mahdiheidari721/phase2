package Logic;

import javafx.scene.image.ImageView;

public class Cloth extends Product{
    static final String nameOfProduct = "Cloth";
    static final int timeOfCorrupting = 5;
    static final int Price = 50 ;
    static final int SizeInWareHouse = 2 ;
    static final int Time = 5 ;
    public Cloth(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public Cloth(ImageView imageView) {
        super();
        this.imageview=imageView;
    }
}
