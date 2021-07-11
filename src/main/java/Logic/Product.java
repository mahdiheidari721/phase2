package Logic;

import javafx.scene.image.ImageView;

public class Product {
    String nameOfProduct;
    int CurrentTime;
    int X_position;
    int Y_position;
    int PX_position;
    int PY_position;
    boolean Harvested;

    public Product() {

    }

    void ToLive(){};
    int SizeInWarehouse;
    int Price;
ImageView imageview;
    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Product(String nameOfProduct ,int currentTime, int x_position, int y_position, boolean harvested) {
        CurrentTime = currentTime;
        X_position = x_position;
        Y_position = y_position;
        PX_position = x_position;
        PY_position = y_position;
        Harvested = harvested;
        this.nameOfProduct = nameOfProduct;
    }
    public Product(ImageView imageView,String nameOfProduct ,int currentTime, int x_position, int y_position, boolean harvested) {
        CurrentTime = currentTime;
        X_position = x_position;
        Y_position = y_position;
        PX_position = x_position;
        PY_position = y_position;
        Harvested = harvested;
        this.nameOfProduct = nameOfProduct;
        this.imageview=imageView;
    }

    public ImageView getImageview() {
        return imageview;
    }

    public void setImageview(ImageView imageview) {
        this.imageview = imageview;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getSizeInWarehouse() {
        return SizeInWarehouse;
    }

    public void setSizeInWarehouse(int sizeInWarehouse) {
        SizeInWarehouse = sizeInWarehouse;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public void setHarvested(boolean harvested) {
        Harvested = harvested;
    }

    public boolean isHarvested() {
        return Harvested;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public int getX_position() {
        return X_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public int getPX_position() {
        return PX_position;
    }

    public void setPX_position(int PX_position) {
        this.PX_position = PX_position;
    }

    public int getPY_position() {
        return PY_position;
    }

    public void setPY_position(int PY_position) {
        this.PY_position = PY_position;
    }
}
//در این کلاس تمامی محصولاتاعم از پودر ها کیک ها کلوچه ها و
//تمامی محصولاتی که حیوانات تولید  می کنند زیر کلاس این کلاس اند.
//تا بتوان  انها را سازمان دهی کرد و همه اناها را
//به یک چشم نگاه کرد.
