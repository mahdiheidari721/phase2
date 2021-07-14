package Logic;

import javafx.scene.image.ImageView;

public class IceCream extends Product{
    static final String nameOfProduct = "IceCream";
    static final int timeOfCorrupting = 6;
    static final int Price = 120 ;
    static final int SizeInWareHouse = 4 ;
    static final int Time = 7 ;
    public IceCream(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
    public IceCream(ImageView imageview) {
        super("IceCream");
        this.imageview=imageview;
    }
}
