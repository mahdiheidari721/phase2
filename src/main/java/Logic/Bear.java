package Logic;

import javafx.scene.image.ImageView;

public class Bear extends WildAnimal{
    static int ord=0;
    public Bear() {

        super();
        this.sort=ord;
        ord++;
       this.nameOfAnimal="Bear" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
       this.Price=400;
    }
    public Bear(ImageView imageView) {

        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="Bear" ;
        this.SizeInWareHouse =15;
        this.Producttime=0;
        this.Price=400;
        this.imageview=imageView;
    }
}
