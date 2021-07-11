package Logic;

import javafx.scene.image.ImageView;

public class Grass  {
    int X_position;
    int Y_position;
    int MaxPower;
ImageView imageView;
    public Grass(int x_position, int y_position, int maxPower) {
        X_position = x_position;
        Y_position = y_position;
        MaxPower = maxPower;
    }
    public Grass(ImageView imageView,int x_position, int y_position, int maxPower) {
        this.imageView=imageView;
        X_position = x_position;
        Y_position = y_position;
        MaxPower = maxPower;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public void setMaxPower(int maxPower) {
        MaxPower = maxPower;
    }

    public int getX_position() {
        return X_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public int getMaxPower() {
        return MaxPower;
    }


}
