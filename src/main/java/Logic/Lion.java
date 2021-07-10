package Logic;

import javafx.scene.image.ImageView;

public class Lion extends WildAnimal {
    static int ord;
    public Lion() {
        super();
        this.nameOfAnimal="lion" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
        this.Price=300;
    }
    public Lion(ImageView imageView) {
        super();
        this.nameOfAnimal="lion" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
        this.Price=300;
        this.imageview=imageView;
    }
}
