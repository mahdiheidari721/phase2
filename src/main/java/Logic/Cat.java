package Logic;

import javafx.scene.image.ImageView;

public class Cat extends DefenderAnimal{
    static int ord=0;
    public Cat() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="cat" ;
        this.SizeInWareHouse =2;
        this.Producttime=0;
        this.Price=150;
    }
    public Cat(ImageView imageView) {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="cat" ;
        this.SizeInWareHouse =2;
        this.Producttime=0;
        this.Price=150;
        this.imageview=imageView;
    }
}
