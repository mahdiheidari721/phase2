package Logic;

import javafx.scene.image.ImageView;

public class WildAnimal extends Animal {
    public WildAnimal(ImageView imageview) {
        super(imageview);
    }

    public WildAnimal() {
    }
}
// این کلاس مخصوس حیوانات وحشی می باشد
//و کلاس هایی مانند شیر و خرس از این کلاس ارث بری می کند
// و متود های ان را برای خودش بیاده سازی می کند.