package Logic;

import javafx.scene.image.ImageView;

public class Tiger extends WildAnimal {
    static int ord=0;
    public Tiger() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="tiger" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
        this.Price=500;
    }
    public Tiger(ImageView imageView) {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="tiger" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
        this.Price=500;
        this.imageview=imageView;
    }
}
