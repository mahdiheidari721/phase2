package Logic;

import javafx.scene.image.ImageView;

public class Feather extends Product{
    static final String nameOfProduct = "Feather";
    static final int timeOfCorrupting = 4;
    static final int Price = 20;
    static final int SizeInWareHouse = 1  ;
    static final int Time = 3 ;

    public Feather(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public Feather(ImageView imageView) {
        super("Feather");
        this.imageview=imageView;
    }
}
