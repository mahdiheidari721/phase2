package Logic;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dog extends DefenderAnimal{
    static int ord=0;
    public Dog() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="dog" ;
        this.SizeInWareHouse =2;
        this.Producttime=0;
        this.Price=100;
    }
    public Dog(ImageView imageview) {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="dog" ;
        this.SizeInWareHouse =2;
        this.Producttime=0;
        this.Price=100;
        this.imageview=imageview;
    }
}
