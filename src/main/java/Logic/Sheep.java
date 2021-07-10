package Logic;

import javafx.scene.image.ImageView;

public class Sheep extends DomesticAnimal{
    static int ord;
    public Sheep() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="sheep" ;
        this.SizeInWareHouse =1;
        this.Producttime=5;
        this.Price=400;
    }
    public Sheep(ImageView imageView) {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="sheep" ;
        this.SizeInWareHouse =1;
        this.Producttime=5;
        this.Price=400;
        this.imageview=imageView;
    }
}
