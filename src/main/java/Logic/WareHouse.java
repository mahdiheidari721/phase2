package Logic;

import java.util.ArrayList;
public class WareHouse {
    int Level;
    static final int Capacity = 200;
    int AllCapacity=200;
    int AvailableCapacity=200;
  public  ArrayList<Product> products = new ArrayList<>();
  public  ArrayList<Animal> animals = new ArrayList<>();

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public static int getCapacity() {
        return Capacity;
    }

    public void setAllCapacity(int allCapacity) {
        AllCapacity = allCapacity;
    }

    public int getAvailableCapacity() {
        return AvailableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        AvailableCapacity = availableCapacity;
    }

    public int getAllCapacity() {
        return AllCapacity;
    }


}
//این کلاس کلاس انبار ما می باشد و شامل یک سری خصوصیات هست
//خصوصیاتی شامل ظرفیت انبار که از ان بیشتر نمی توان در ان گنجاند
//و خب موقعی هم که انبار پر هست یا موتور فروش در مرحله ظی کردن مسیر هست
//اجازه ورود به انبار داده نیم شود
// و بایستی در ان یک سری متود های فروش گنجانده شود
//و لیستی از محصولات و حیوانات
//تا به محض فروختن یا اضافه کردن انها به انبار تغییرات لازمه را در
//انبار اعمال بکنیم.
