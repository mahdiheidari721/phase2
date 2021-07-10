package Logic;

import javafx.scene.image.ImageView;

public class DefenderAnimal extends Animal{
    public DefenderAnimal() {
    }

    public DefenderAnimal(ImageView imageview) {
        super(imageview);
    }
}
//در این کلاس حیوانات دفاع کننده را جای می دهیم
//و با توجه به هر فیلد و متود لازم آنها را override می کنیم
// و فعلا 2 کلاس گربه و سگ از این کلاس ارث بری می کنند و جرو این دسته خواهد بود
