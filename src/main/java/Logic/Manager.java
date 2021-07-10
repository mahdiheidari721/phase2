package Logic;

import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public ArrayList<DomesticAnimal> Domestics = new ArrayList<>();
    public ArrayList<WildAnimal> Wilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> Defenders = new ArrayList<>();
    public ArrayList<DomesticAnimal> allDomestics = new ArrayList<>();
    public ArrayList<WildAnimal> allWilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> allDefenders = new ArrayList<>();
    public ArrayList<Cage> cages = new ArrayList<>();
    Bank bank = new Bank(100000000);
    ArrayList<Grass> grasses = new ArrayList<>();
    ArrayList<String> Logger = new ArrayList<>();
    public ArrayList<Labratory> labratories = new ArrayList<>();
    //fill this list by labratories;
    public ArrayList<Product> products = new ArrayList<>();
    WareHouse wareHouse = new WareHouse();
    int Grass[][] = new int[6][6];
    public ArrayList<HameKare> CurrentCages = new ArrayList<>();
    int CurrentLevel = 0;
    static int turn = 1;
    Truck truck = new Truck();
    WaterWell well = new WaterWell();
    Level level = new Level(CurrentLevel);
    private static Manager MANAGER;

    private Manager() {
    }

    public static Manager getManager() {
        if (MANAGER == null) MANAGER = new Manager();
        return MANAGER;
    }

    public void Fill() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Grass[i][j] = 0;
            }
        }
        Grass[3][3] = 10;
        Grass grass = new Grass(100, 200, 10);
        Grass grass2 = new Grass(100, 200, 10);
        Grass grass3 = new Grass(100, 200, 10);
        Grass grass4 = new Grass(100, 200, 10);
        Grass grass5 = new Grass(100, 200, 10);
        Grass grass6 = new Grass(100, 200, 10);
        grasses.add(grass);
        grasses.add(grass2);
        grasses.add(grass3);
        grasses.add(grass4);
        grasses.add(grass5);
        grasses.add(grass6);
        Ostrich ostrich = new Ostrich();
        Sheep sheep = new Sheep();
        Hen hen = new Hen();
        Domestics.add(ostrich);
        Domestics.add(hen);
        Domestics.add(sheep);
        Dog dog = new Dog();
        Cat cat = new Cat();
        Tiger tiger1 = new Tiger();
        Lion lion1 = new Lion();
        Bear bear1 = new Bear();
        Defenders.add(cat);
        Defenders.add(dog);
        Wilds.add(tiger1);
        Wilds.add(lion1);
        Wilds.add(bear1);
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the grass has been filled by 0");


        //fill this list by labratories:
        labratories.add(new Bakery());
        labratories.add(new FlourFactory());
        labratories.add(new IceCreamShop());
        labratories.add(new MilkPackagingFactory());
        labratories.add(new Tailoring());
        labratories.add(new WeavingFactory());
        try {
            File myObj = new File("LevelTasks.txt");
            Scanner myReader = new Scanner(myObj);
            String data = "";
            int q = CurrentLevel + 1;
            int t = 0;
            while (myReader.hasNextLine() && !(data = myReader.nextLine()).equalsIgnoreCase("Level" + " " + q)) {
                if (data.equalsIgnoreCase("Level" + " " + CurrentLevel) || t == 1) {
                    t = 1;
                }
                if (data.equalsIgnoreCase("Level" + " " + CurrentLevel)) continue;
                if (t == 1) {
                    String[] split = data.split("\\s");
                    if (split[0].equalsIgnoreCase("coin")) bank.setCoin(Integer.parseInt(split[1]));
                    else if (split[0].equalsIgnoreCase("tiger") || split[0].equalsIgnoreCase("lion") || split[0].equalsIgnoreCase("bear")) {
                        level.RandomWildAnimal.put(split[0], Integer.parseInt(split[1]));
                    } else {
                        level.Tasks.put(split[0], Integer.parseInt(split[1]));
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void AddWildAnimal(int n) {
        for (String i : level.RandomWildAnimal.keySet()) {
            if (level.RandomWildAnimal.get(i) == n) {
                if (i.equalsIgnoreCase("tiger")) {
                    Tiger tiger = new Tiger();
                    allWilds.add(tiger);
                }
                if (i.equalsIgnoreCase("lion")) {
                    Lion lion = new Lion();
                    allWilds.add(lion);
                }
                if (i.equalsIgnoreCase("bear")) {
                    Bear bear = new Bear();
                    allWilds.add(bear);
                }
            }
        }
    }

    public void BuyAnimal(String name) {
        int t = 1;
        for (int i = 0; i < Domestics.size(); i++) {
            if (Domestics.get(i).getNameOfAnimal().equalsIgnoreCase(name)) {
                if (bank.getCoin() >= Domestics.get(i).getPrice()) {
                    t = 1;
                    bank.setCoin(bank.getCoin() - Domestics.get(i).getPrice());
                    System.out.println("bank");
                }
            }
        }
        for (int i = 0; i < Defenders.size(); i++) {
            if (Defenders.get(i).getNameOfAnimal().equalsIgnoreCase(name)) {
                if (bank.getCoin() >= Defenders.get(i).getPrice()) {
                    t = 1;
                    bank.setCoin(bank.getCoin() - Defenders.get(i).getPrice());
                }
            }
        }
        if (name.equalsIgnoreCase("lion")) {
            Lion lion = new Lion();
            lion.setX_position(1);
            allWilds.add(lion);
        }
        if (t == 1) {
            if (name.equalsIgnoreCase("hen")) {
                Hen hen = new Hen();
                allDomestics.add(hen);
                t = 0;
                System.out.println("hen");
            } else if (name.equalsIgnoreCase("sheep")) {
                System.out.println("sheep");
                Sheep sheep = new Sheep();
                allDomestics.add(sheep);

                t = 0;
            } else if (name.equalsIgnoreCase("ostrich")) {
                Ostrich ostrich = new Ostrich();
                allDomestics.add(ostrich);
                System.out.println("ostrich");
                t = 0;
            } else if (name.equalsIgnoreCase("dog")) {
                Dog dog = new Dog();
                allDefenders.add(dog);
                t = 0;
            } else if (name.equalsIgnoreCase("cat")) {
                Cat cat = new Cat();
                allDefenders.add(cat);
                t = 0;
            }
            LocalDateTime w = LocalDateTime.now();
            Logger.add(w.toString() + "  " + "the animal has been bought");
        }
    }

    public void Well() {
        if (well.getCapacity() == 0) {
            well.setCapacity(5);
        } else System.out.println("the water well is already not empty");
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the well has been filled");
    }

    public void Plant(int x, int y) {
        if (well.getCapacity() > 0) {
            Grass[x][y] += 1;
            well.setCapacity(well.getCapacity() - 1);
        } else System.out.println("the water well is empty");
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the grass has been planted");
    }

    public void Workshop(String name) {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).getName().equalsIgnoreCase(name)) {
                if (labratories.get(i).IsBuyed) {
                    String primaryProduct = "";
                    if (name.equalsIgnoreCase("FlourFactory"))
                        primaryProduct = "Egg";
                    else if (name.equalsIgnoreCase("WeavingFactory"))
                        primaryProduct = "Feather";
                    else if (name.equalsIgnoreCase("MilkPackagingFactory"))
                        primaryProduct = "Milk";
                    else if (name.equalsIgnoreCase("Bakery"))
                        primaryProduct = "Flour";
                    else if (name.equalsIgnoreCase("Tailoring"))
                        primaryProduct = "Cloth";
                    else if (name.equalsIgnoreCase("IceCreamShop"))
                        primaryProduct = "PackagedMilk";
                    boolean IsFoundPrimaryProduct = false;
                    for (int j = 0; j < wareHouse.products.size(); j++) {
                        if (primaryProduct.equals("Egg")) {
                            if (wareHouse.products.get(j) instanceof Egg) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        } else if (primaryProduct.equals("Feather")) {
                            if (wareHouse.products.get(j) instanceof Feather) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        } else if (primaryProduct.equals("Milk")) {
                            if (wareHouse.products.get(j) instanceof Milk) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        } else if (primaryProduct.equals("Flour")) {
                            if (wareHouse.products.get(j) instanceof Flour) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        } else if (primaryProduct.equals("Cloth")) {
                            if (wareHouse.products.get(j) instanceof Cloth) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        } else if (primaryProduct.equals("PackagedMilk")) {
                            if (wareHouse.products.get(j) instanceof PackagedMilk) {
                                wareHouse.products.remove(j);
                                IsFoundPrimaryProduct = true;
                                break;
                            }
                        }
                    }
                    if (!IsFoundPrimaryProduct)
                        System.out.println("We have no " + primaryProduct + " in ware house to provide");
                    else
                        labratories.get(i).Active = true;
                }
            }
            LocalDateTime w = LocalDateTime.now();
            Logger.add(w.toString() + "  " + "the workshop has been actived");
        }
    }

    public void BuildWorkShop(String name) {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).getName().equalsIgnoreCase(name)) {
                if (bank.getCoin() >= labratories.get(i).getPrice()) {
                    labratories.get(i).IsBuyed = true;
                    bank.setCoin(bank.getCoin() - labratories.get(i).getPrice());
                    LocalDateTime w = LocalDateTime.now();
                    Logger.add(w.toString() + "  " + "the workshop has been built");
                }
            }
        }

    }

    public void PickUp(int x, int y) {

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getX_position() == x && products.get(i).getY_position() == y) {
                if (AddToWareHouse(products.get(i))) {
                    products.remove(i);
                    i--;
                    LocalDateTime w = LocalDateTime.now();
                    Logger.add(w.toString() + "  " + "the good has been picked up");
                }
            }
        }

    }

    public void TruckLoad(String name) {
        if (!truck.Active) {
            for (int i = 0; i < wareHouse.products.size(); i++) {
                if (wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase(name)) {
                    if (truck.getAvailableCapacity() >= wareHouse.products.get(i).getSizeInWarehouse()) {
                        truck.setAvailableCapacity(truck.getAvailableCapacity() - wareHouse.products.get(i).getSizeInWarehouse());
                        truck.allgood.add(name);
                        truck.setMoney(truck.getMoney() + wareHouse.products.get(i).getPrice());
                        wareHouse.products.remove(i);
                        LocalDateTime w = LocalDateTime.now();
                        Logger.add(w.toString() + "  " + "the truck has been loaded");
                        i--;
                        break;
                    }
                }
            }
            for (int i = 0; i < wareHouse.animals.size(); i++) {
                if (wareHouse.animals.get(i).getNameOfAnimal().equalsIgnoreCase(name)) {
                    if (truck.getAvailableCapacity() >= wareHouse.animals.get(i).getSizeInWareHouse()) {
                        truck.setAvailableCapacity(truck.getAvailableCapacity() - wareHouse.animals.get(i).getSizeInWareHouse());
                        truck.allgood.add(name);
                        truck.setMoney(truck.getMoney() + wareHouse.animals.get(i).getPrice());
                        wareHouse.animals.remove(i);
                        i--;
                        LocalDateTime w = LocalDateTime.now();
                        Logger.add(w.toString() + "  " + "the truck has been loaded");
                        break;
                    }
                }
            }
        }

    }

    public void TruckUnload(String name) {
        if (!truck.Active) {
            for (int i = 0; i < truck.allgood.size(); i++) {
                if (truck.allgood.get(i).equalsIgnoreCase(name)) {
                    //TODO
                    //generate the good to the warehouselist
                    Hen hen = new Hen();
                    wareHouse.animals.add(hen);
                    truck.allgood.remove(i);
                    LocalDateTime w = LocalDateTime.now();
                    Logger.add(w.toString() + "  " + "the truck has been unloaded:)");
                    break;
                }
            }
        }

    }

    public void TruckGo() {
        truck.Active = true;
        truck.setEndedTime(turn + 10);
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "truck has gone");
    }

    public void ProductProcessing() {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).isActive()) {
                labratories.get(i).setCurrentTime(labratories.get(i).getCurrentTime() - 1);
                if (labratories.get(i).getCurrentTime() == 0) {
                    labratories.get(i).setActive(false);
                    if (labratories.get(i) instanceof FlourFactory && wareHouse.getAllCapacity() < 31 - Egg.SizeInWareHouse) {
                        products.add(new Flour(Flour.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else if (labratories.get(i) instanceof WeavingFactory && wareHouse.getAllCapacity() < 31 - Cloth.SizeInWareHouse) {
                        products.add(new Cloth(Cloth.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else if (labratories.get(i) instanceof MilkPackagingFactory && wareHouse.getAllCapacity() < 31 - PackagedMilk.SizeInWareHouse) {
                        products.add(new PackagedMilk(PackagedMilk.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else if (labratories.get(i) instanceof Bakery && wareHouse.getAllCapacity() < 31 - Bread.SizeInWareHouse) {
                        products.add(new Bread(Bread.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else if (labratories.get(i) instanceof Tailoring && wareHouse.getAllCapacity() < 31 - Shirt.SizeInWareHouse) {
                        products.add(new Shirt(Shirt.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else if (labratories.get(i) instanceof IceCreamShop && wareHouse.getAllCapacity() < 31 - IceCream.SizeInWareHouse) {
                        products.add(new IceCream(IceCream.timeOfCorrupting, labratories.get(i).getX_Position(),
                                labratories.get(i).getY_Position(), false));
                    } else System.out.println("We have not enough storage in ware house");
                    labratories.get(i).setCurrentTime(labratories.get(i).getTime());
                }
            }
        }
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the product is generating");
    }

    public void RemoveDeadAnimals() {
        for (int i = 0; i < allDomestics.size(); i++) {
            allDomestics.get(i).setCurrentTime(allDomestics.get(i).getCurrentTime() - 1);
            if (allDomestics.get(i).getCurrentTime() == 0) {
                allDomestics.remove(i);
                i--;
            }
        }
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the dead animal has been removed");
    }

    public void RemoveCorruptProducts() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setCurrentTime(products.get(i).getCurrentTime() - 1);
            if (products.get(i).getCurrentTime() == 0)
                products.remove(i);
            i--;
            LocalDateTime w = LocalDateTime.now();
            Logger.add(w.toString() + "  " + "the dead product has been removed");
        }

    }

    public void ProducingProduct() {

        for (int i = 0; i < allDomestics.size(); i++) {
            allDomestics.get(i).setProductcurrenttime(allDomestics.get(i).getProductcurrenttime() - 1);


            if (allDomestics.get(i).getProductcurrenttime() <= 0) {
                if (allDomestics.get(i).getNameOfAnimal().equalsIgnoreCase("Hen")) {
                    products.add(new Egg(Egg.Time, allDomestics.get(i).X_position,
                            allDomestics.get(i).Y_position, false));
                    allDomestics.get(i).setProductcurrenttime(Egg.Time);
                    System.out.println("your egg is ready");
                } else if (allDomestics.get(i).getNameOfAnimal().equalsIgnoreCase("Ostrich")) {
                    products.add(new Feather(Feather.Time, allDomestics.get(i).X_position,
                            allDomestics.get(i).Y_position, false));
                    allDomestics.get(i).setProductcurrenttime(Feather.Time);
                    System.out.println("your feather is ready");
                } else if (allDomestics.get(i).getNameOfAnimal().equalsIgnoreCase("Sheep")) {
                    products.add(new Milk(Milk.Time, allDomestics.get(i).X_position,
                            allDomestics.get(i).Y_position, false));
                    allDomestics.get(i).setProductcurrenttime(Milk.Time);
                    System.out.println("your milk is ready");
                }
            }

        }

        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the product from animal has been produced");
    }

    public void Eating() {
        for (int i = 0; i < allDomestics.size(); i++) {
            if (allDomestics.get(i).isLive && allDomestics.get(i).getCurrentTime() <= 5) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (Grass[k][j] > 0) {
                            if (j == allDomestics.get(i).getY_position() &&
                                    k == allDomestics.get(i).getX_position()) {
                                allDomestics.get(i).setCurrentTime(allDomestics.get(i).getTime());
                                Grass[j][k]--;
                                LocalDateTime w = LocalDateTime.now();
                                Logger.add(w.toString() + "  " + "the animal has eaten grass");
                            }
                        }
                    }
                }
            }
        }

    }

    public boolean AddToWareHouse(Product product) {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "request to add to warehouse");
        if (wareHouse.AvailableCapacity >= product.SizeInWarehouse) {
            wareHouse.products.add(product);
            return true;
        }
        return false;
    }

    public boolean AddToWareHouse(Animal animal) {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "request to add to warehouse");
        if (wareHouse.AvailableCapacity >= animal.SizeInWareHouse) {
            wareHouse.animals.add(animal);
            return true;
        }
        return false;
    }

    public void Cage(int x, int y) {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the cage has been put");
        int a = 0;

        for (int i = 0; i < cages.size(); i++) {
            if (cages.get(i).getX() == x && cages.get(i).getY() == y) {
                a = 1;
                cages.get(i).setContiniusly(true);
                System.out.println(1);
            }
        }
        if (a == 0) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(j).getX_position() == x && allWilds.get(j).getY_position() == y) {
                    Cage cage = new Cage(allWilds.get(j).getX_position(), allWilds.get(j).getY_position(), allWilds.get(j));
                    cages.add(cage);
                    System.out.println("cage");
                }
            }
        }
    }

    public void Cage() {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "the cage is working");
        for (int i = 0; i < cages.size(); i++) {
            if (cages.get(i).getCurrrenttime() != 0) {
                int a = 0;
//                for (int j = 0; j < CurrentCages.size(); j++) {
////                    if (cages.get(i).getX() == CurrentCages.get(j).getX() && cages.get(i).getY() == CurrentCages.get(j).getY()) {
////                        cages.get(i).setCurrrenttime(cages.get(i).getCurrrenttime() - 1);
////                        a = 1;
////                    }
//
//                }
                if (cages.get(i).Continiusly) {
                    a = 1;
                    cages.get(i).setCurrrenttime(cages.get(i).getCurrrenttime() - 1);
                    cages.get(i).setContiniusly(false);
                    System.out.println("goal");
                }
                if (a == 0) {
                    cages.get(i).setCurrrenttime(cages.get(i).getCurrrenttime() + 1);
                }
            } else {
                if (cages.get(i).getCurrentcagetime() != 0) {
                    boolean s = AddToWareHouse(cages.get(i).getWildanimal());
                    if (s) {

                        allWilds.remove(cages.get(i).getWildanimal());
                        cages.remove(i);
                        System.out.println("super");
                    }
                    if (!s) {
                        cages.get(i).setCurrentcagetime(cages.get(i).getCurrentcagetime() - 1);
                    }
                } else {

                    //remove the cage and let the wild animal go
                    cages.remove(cages.get(i));
                    i--;
                }
            }
        }
    }

    public void Walk() {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "walking");
        for (int i = 0; i < allWilds.size(); i++) {
            if (allWilds.get(i).getCurrentTime() > 0 && allWilds.get(i).getX_position() < 6) {
                if (allWilds.get(i).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    allWilds.get(i).setPX_position(allWilds.get(i).getX_position() + 1);
                    allWilds.get(i).setX_position(allWilds.get(i).getX_position() + 2);
                } else {
                    allWilds.get(i).setPX_position(allWilds.get(i).getX_position());
                    allWilds.get(i).setX_position(allWilds.get(i).getX_position() + 1);
                }
            } else {

                allWilds.remove(i);
                i--;
            }
        }
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("cat")) {
                int r = 0, x = 0, y = 0;
                for (int j = 0; j < products.size(); j++) {
                    if (products.get(j).getNameOfProduct().equalsIgnoreCase("egg") || products.get(j).getNameOfProduct().equalsIgnoreCase("milk") || products.get(j).getNameOfProduct().equalsIgnoreCase("feather")) {
                        if (r <= Math.abs(products.get(j).getX_position() + products.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position())) {
                            r = Math.abs(products.get(j).getX_position() + products.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position());
                            x = products.get(j).getX_position();
                            y = products.get(j).getY_position();
                        }
                    }
                }
                if (x == allDefenders.get(i).getX_position()) {
                    if (y >= allDefenders.get(i).getY_position())
                        allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                    else allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
                } else if (y == allDefenders.get(i).getY_position()) {
                    if (x >= allDefenders.get(i).getX_position())
                        allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() + 1);
                    else allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() - 1);
                } else if (y >= allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                else if (y < allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
            }
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("dog")) {
                int r = 0, x = 0, y = 0;
                for (int j = 0; j < allWilds.size(); j++) {
                    if (r <= Math.abs(allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position())) {
                        r = Math.abs(allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position());
                        x = allWilds.get(j).getX_position();
                        y = allWilds.get(j).getY_position();
                    }
                }
                if (x == allDefenders.get(i).getX_position()) {
                    if (y >= allDefenders.get(i).getY_position())
                        allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                    else allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
                } else if (y == allDefenders.get(i).getY_position()) {
                    if (x >= allDefenders.get(i).getX_position())
                        allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() + 1);
                    else allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() - 1);
                } else if (y >= allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                else if (y < allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
            }
        }
        for (int i = 0; i < allDomestics.size(); i++) {
            int r = 0, x = 0, y = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (Grass[j][k] > 0) {
                        if (r <= Math.abs(k + j - allDomestics.get(i).getX_position() - allDomestics.get(i).getX_position())) {
                            r = Math.abs(k + j - allDomestics.get(i).getX_position() - allDomestics.get(i).getX_position());
                            x = k;
                            y = j;
                        }
                    }
                }
            }
            if (x == allDomestics.get(i).getX_position()) {
                if (y >= allDomestics.get(i).getY_position())
                    allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() + 1);
                else allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() - 1);
            } else if (y == allDomestics.get(i).getY_position()) {
                if (x >= allDomestics.get(i).getX_position())
                    allDomestics.get(i).setX_position(allDomestics.get(i).getX_position() + 1);
                else allDomestics.get(i).setX_position(allDomestics.get(i).getX_position() - 1);
            } else if (y >= allDomestics.get(i).getY_position())
                allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() + 1);
            else if (y < allDomestics.get(i).getY_position())
                allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() - 1);
        }
        for (int i = 0; i < cages.size(); i++) {
            cages.get(i).setX(cages.get(i).getWildanimal().getX_position());
            cages.get(i).setY(cages.get(i).getWildanimal().getY_position());
        }
    }

    public void Intersection() {
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "intersect");
        for (int i = 0; i < allDomestics.size(); i++) {
            if (allDomestics.get(i).getCurrentTime() <= 5) {
                if (Grass[allDomestics.get(i).getX_position()][allDomestics.get(i).getY_position()] > 0) {
                    Grass[allDomestics.get(i).getX_position()][allDomestics.get(i).getY_position()]--;
                    allDomestics.get(i).setCurrentTime(10);
                    System.out.println(00000000);
                }
            }
        }
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("cat")) {
                for (int j = 0; j < products.size(); j++) {
                    if (allDefenders.get(i).getX_position() == products.get(j).getX_position() && allDefenders.get(i).getY_position() == products.get(j).getY_position()) {
                        boolean s = AddToWareHouse(products.get(j));
                        if (s) {
                            products.remove(j);
                            j--;
                            System.out.println(00000000);
                        }
                    }
                }
            }
        }
        ArrayList<DefenderAnimal> sagzapas = new ArrayList<>();
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("dog")) {
                for (int j = 0; j < allWilds.size(); j++) {
                    if (allWilds.get(j).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                        if (allDefenders.get(i).getX_position() == allWilds.get(j).getX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getY_position()) {
                            allWilds.remove(j);
                            j--;
                            System.out.println(00000000);
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        } else if (allWilds.get(j).getX_position() > allWilds.get(j).getPX_position()) {
                            if (allWilds.get(j).getPX_position() <= allDefenders.get(i).getX_position() && allWilds.get(j).getPX_position() <= allDefenders.get(i).getPX_position() && allWilds.get(j).getX_position() >= allDefenders.get(i).getX_position() && allWilds.get(j).getX_position() >= allDefenders.get(i).getPX_position()) {
                                allWilds.remove(j);
                                j--;
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        } else if (allWilds.get(j).getX_position() < allWilds.get(j).getPX_position()) {
                            if (allWilds.get(j).getX_position() <= allDefenders.get(i).getX_position() && allWilds.get(j).getX_position() <= allDefenders.get(i).getPX_position() && allWilds.get(j).getPX_position() >= allDefenders.get(i).getX_position() && allWilds.get(j).getPX_position() >= allDefenders.get(i).getPX_position()) {
                                allWilds.remove(j);
                                j--;
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }

                        } else if (allWilds.get(j).getY_position() > allWilds.get(j).getPY_position()) {
                            if (allWilds.get(j).getPY_position() <= allDefenders.get(i).getY_position() && allWilds.get(j).getPY_position() <= allDefenders.get(i).getPY_position() && allWilds.get(j).getY_position() >= allDefenders.get(i).getY_position() && allWilds.get(j).getY_position() >= allDefenders.get(i).getPY_position()) {
                                allWilds.remove(j);
                                j--;
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        } else if (allWilds.get(j).getY_position() < allWilds.get(j).getPY_position()) {
                            if (allWilds.get(j).getY_position() <= allDefenders.get(i).getY_position() && allWilds.get(j).getY_position() <= allDefenders.get(i).getPY_position() && allWilds.get(j).getPY_position() >= allDefenders.get(i).getY_position() && allWilds.get(j).getPY_position() >= allDefenders.get(i).getPY_position()) {
                                allWilds.remove(j);
                                j--;
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        }
                    } else {
                        if (allDefenders.get(i).getX_position() == allWilds.get(j).getX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getY_position()) {
                            allWilds.remove(j);
                            j--;
                            System.out.println(00000000);
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        } else if (allDefenders.get(i).getX_position() == allWilds.get(j).getPX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                            allWilds.remove(j);
                            j--;
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        }
                    }
                }
            }
        }

        //deleting the list of sagzapas from alldefenders
        // the idea by sagzapas is not valuable
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("dog")) {
                for (int j = 0; j < sagzapas.size(); j++) {
                    if (allDefenders.get(i).getSort() == sagzapas.get(j).getSort()) {
                        allDefenders.remove(i);
                        i--;
                    }
                }
            }
        }
        sagzapas.clear();
        for (int i = 0; i < allDomestics.size(); i++) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(j).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    if (allDomestics.get(i).getX_position() == allWilds.get(j).getX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        allDomestics.remove(i);
                        i--;
                    } else if (allWilds.get(i).getX_position() > allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getPX_position() <= allDomestics.get(i).getX_position() && allWilds.get(i).getPX_position() <= allDomestics.get(i).getPX_position() && allWilds.get(i).getX_position() >= allDomestics.get(i).getX_position() && allWilds.get(i).getX_position() >= allDomestics.get(i).getPX_position()) {
                            allDomestics.remove(i);
                            i--;

                        }
                    } else if (allWilds.get(i).getX_position() < allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getX_position() <= allDomestics.get(i).getX_position() && allWilds.get(i).getX_position() <= allDomestics.get(i).getPX_position() && allWilds.get(i).getPX_position() >= allDomestics.get(i).getX_position() && allWilds.get(i).getPX_position() >= allDomestics.get(i).getPX_position()) {
                            allDomestics.remove(i);
                            i--;
                        }

                    } else if (allWilds.get(i).getY_position() > allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getPY_position() <= allDomestics.get(i).getY_position() && allWilds.get(i).getPY_position() <= allDomestics.get(i).getPY_position() && allWilds.get(i).getY_position() >= allDomestics.get(i).getY_position() && allWilds.get(i).getY_position() >= allDomestics.get(i).getPY_position()) {
                            allDomestics.remove(i);
                            i--;
                        }
                    } else if (allWilds.get(i).getY_position() < allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getY_position() <= allDomestics.get(i).getY_position() && allWilds.get(i).getY_position() <= allDomestics.get(i).getPY_position() && allWilds.get(i).getPY_position() >= allDomestics.get(i).getY_position() && allWilds.get(i).getPY_position() >= allDomestics.get(i).getPY_position()) {
                            allDomestics.remove(i);
                            i--;
                        }
                    }
                } else {
                    if (allDomestics.get(i).getX_position() == allWilds.get(j).getX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        allDomestics.remove(i);
                        i--;
                    } else if (allDomestics.get(i).getX_position() == allWilds.get(j).getPX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                        allDomestics.remove(i);
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(j).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    if (products.get(i).getX_position() == allWilds.get(j).getX_position() && products.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        products.remove(i);
                        i--;
                    } else if (allWilds.get(j).getX_position() > allWilds.get(j).getPX_position()) {
                        if (allWilds.get(j).getPX_position() <= products.get(i).getX_position() && allWilds.get(j).getPX_position() <= products.get(i).getPX_position() && allWilds.get(j).getX_position() >= products.get(i).getX_position() && allWilds.get(j).getX_position() >= products.get(i).getPX_position()) {
                            products.remove(i);
                            i--;

                        }
                    } else if (allWilds.get(j).getX_position() < allWilds.get(j).getPX_position()) {
                        if (allWilds.get(j).getX_position() <= products.get(i).getX_position() && allWilds.get(j).getX_position() <= products.get(i).getPX_position() && allWilds.get(j).getPX_position() >= products.get(i).getX_position() && allWilds.get(j).getPX_position() >= products.get(i).getPX_position()) {
                            products.remove(i);
                            i--;
                        }

                    } else if (allWilds.get(j).getY_position() > allWilds.get(i).getPY_position()) {
                        if (allWilds.get(j).getPY_position() <= products.get(i).getY_position() && allWilds.get(j).getPY_position() <= products.get(i).getPY_position() && allWilds.get(j).getY_position() >= products.get(i).getY_position() && allWilds.get(j).getY_position() >= products.get(i).getPY_position()) {
                            products.remove(i);
                            i--;
                        }
                    } else if (allWilds.get(j).getY_position() < allWilds.get(i).getPY_position()) {
                        if (allWilds.get(j).getY_position() <= products.get(i).getY_position() && allWilds.get(j).getY_position() <= products.get(i).getPY_position() && allWilds.get(j).getPY_position() >= products.get(i).getY_position() && allWilds.get(j).getPY_position() >= products.get(i).getPY_position()) {
                            products.remove(i);
                            i--;
                        }
                    }
                } else {
                    if (products.get(i).getX_position() == allWilds.get(j).getX_position() && products.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        products.remove(i);
                        i--;
                    } else if (products.get(i).getX_position() == allWilds.get(j).getPX_position() && products.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                        products.remove(i);
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i < allWilds.size(); i++) {
            if (allWilds.get(i).getY_position() < 6 && allWilds.get(i).getX_position() < 6) {
                Grass[allWilds.get(i).getY_position()][allWilds.get(i).getX_position()] = 0;
            }
        }
        for (int i = 0; i < allWilds.size(); i++) {
            for (int j = 0; j < allDefenders.size(); j++) {
                if (allDefenders.get(j).getNameOfAnimal().equalsIgnoreCase("cat")) {
                    if (allWilds.get(i).getY_position() == allDefenders.get(j).getY_position() && allWilds.get(i).getX_position() == allDefenders.get(j).getX_position()) {
                        allDefenders.remove(j);
                    }
                }
            }

        }
    }

    public void Inquiary() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Grass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < allDomestics.size(); i++) {
            System.out.println(allDomestics.get(i).nameOfAnimal + " " + allDomestics.get(i).getSort() + " " + allDomestics.get(i).getX_position() + " " + allDomestics.get(i).getY_position() + " " + allDomestics.get(i).getCurrentTime());
        }
        for (int i = 0; i < allWilds.size(); i++) {
            System.out.println(allWilds.get(i).nameOfAnimal + " " + allWilds.get(i).getSort() + " " + allWilds.get(i).getX_position() + " " + allWilds.get(i).getY_position());
        }
        for (int i = 0; i < allDefenders.size(); i++) {
            System.out.println(allDefenders.get(i).nameOfAnimal + " " + allDefenders.get(i).getSort() + " " + allDefenders.get(i).getX_position() + " " + allDefenders.get(i).getY_position());
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getNameOfProduct() + " " + products.get(i).getX_position() + " " + products.get(i).getY_position());
        }
        for (int i = 0; i < wareHouse.products.size(); i++) {
            System.out.println(wareHouse.products.get(i).getNameOfProduct() + " " +
                    wareHouse.products.get(i).getX_position() + " " + wareHouse.products.get(i).getY_position());
        }
        for (int i = 0; i < cages.size(); i++) {
            System.out.println(cages.get(i).getX() + "  " + cages.get(i).getX() + "  " + cages.get(i).getWildanimal().getNameOfAnimal());
        }
        int f = 0;
        for (String i : level.Tasks.keySet()) {
            int t = 0;
            for (int j = 0; j < products.size(); j++) {
                if (i.equalsIgnoreCase(products.get(j).getNameOfProduct())) {
                    t++;
                }
                System.out.println(i + " " + t + "/" + level.Tasks.get(i));
                if (t == level.Tasks.get(i)) f++;
            }
        }
        if (f == level.Tasks.size()) System.out.println("YOU HAVE WON");

    }

    public void Turn(int n) {
        for (int j = 0; j < n; j++) {
            Eating();
            RemoveCorruptProducts();
            RemoveDeadAnimals();
            ProductProcessing();
            ProducingProduct();
            Walk();
            Cage();
            Intersection();
            if (truck.Active) {
                if (turn == truck.EndedTime) {
                    truck.Active = false;
                    bank.setCoin(bank.getCoin() + truck.getMoney());
                }
            }


            //checking cage
            //TODO
            //ranoom walk and hadafman
            //TODO
            //tabee ghaza khordan
            //TODO
            //tabee kam kardan az jan heivanat  va mahsoolatbar asas zaman
            //TODO
            //tabee niaz be ghaza peida kardan heivanat bar asas joooneshoon
            //TODO
            //Tabe toolid mahsoul tavasot heivanat
            //TODO
            //Tabe barkhrd vahshi ba mahsool va ahli  vahsi ba sag  , gorbe ba mahsool
            //TODO
            AddWildAnimal(turn);
            turn++;
        }
        for (int i = 0; i < Logger.size(); i++) {
            System.out.println(Logger.get(i));
        }
    }

    public void readLoggerFile() {
        try {
            File myObj = new File("Logger.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Logger.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeLoggerFile() {
        try {
            FileWriter myWriter = new FileWriter("Logger.txt");
            for (int i = 0; i < Logger.size(); i++) {
                myWriter.write(Logger.get(i) + "\r\n");
            }


            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean Walk1(Animal animal, double t) {

        if (animal.getNameOfAnimal().equalsIgnoreCase("bear") || animal.getNameOfAnimal().equalsIgnoreCase("lion") || animal.getNameOfAnimal().equalsIgnoreCase("tiger")) {
            if (t < 1 && animal.getX_position() < 1350 && animal.getY_position() < 600) {
                if (animal.getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    animal.setX_position(animal.getX_position() + 2);
                    animal.setY_position(animal.getY_position() + 2);
                } else {
                    animal.setX_position(animal.getX_position() + 1);
                    animal.setY_position(animal.getY_position() + 1);
                }
            } else {

                allWilds.remove(animal);
                return true;
            }
        }


        if (animal.getNameOfAnimal().equalsIgnoreCase("cat")) {
            int r = 0, x = 0, y = 0;
            for (int j = 0; j < products.size(); j++) {
                if (products.get(j).getNameOfProduct().equalsIgnoreCase("egg") || products.get(j).getNameOfProduct().equalsIgnoreCase("milk") || products.get(j).getNameOfProduct().equalsIgnoreCase("feather")) {
                    if (r <= Math.abs(products.get(j).getX_position() + products.get(j).getY_position() - animal.getX_position() - animal.getX_position())) {
                        r = Math.abs(products.get(j).getX_position() + products.get(j).getY_position() - animal.getX_position() - animal.getX_position());
                        x = products.get(j).getX_position();
                        y = products.get(j).getY_position();
                    }
                }
            }
            if (x == animal.getX_position()) {
                if (y >= animal.getY_position())
                    animal.setY_position(animal.getY_position() + 1);
                else animal.setY_position(animal.getY_position() - 1);
            } else if (y == animal.getY_position()) {
                if (x >= animal.getX_position())
                    animal.setX_position(animal.getX_position() + 1);
                else animal.setX_position(animal.getX_position() - 1);
            } else if (y >= animal.getY_position())
                animal.setY_position(animal.getY_position() + 1);
            else if (y < animal.getY_position())
                animal.setY_position(animal.getY_position() - 1);
        }
        if (animal.getNameOfAnimal().equalsIgnoreCase("dog")) {
            int r = 0, x = 0, y = 0;
            for (int j = 0; j < allWilds.size(); j++) {
                if (r <= Math.abs(allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - animal.getX_position() - animal.getX_position())) {
                    r = Math.abs(allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - animal.getX_position() - animal.getX_position());
                    x = allWilds.get(j).getX_position();
                    y = allWilds.get(j).getY_position();
                }
            }
            if (x == animal.getX_position()) {
                if (y >= animal.getY_position())
                    animal.setY_position(animal.getY_position() + 1);
                else animal.setY_position(animal.getY_position() - 1);
            } else if (y == animal.getY_position()) {
                if (x >= animal.getX_position())
                    animal.setX_position(animal.getX_position() + 1);
                else animal.setX_position(animal.getX_position() - 1);
            } else if (y >= animal.getY_position())
                animal.setY_position(animal.getY_position() + 1);
            else if (y < animal.getY_position())
                animal.setY_position(animal.getY_position() - 1);
        }

        if (animal.getNameOfAnimal().equalsIgnoreCase("sheep") || animal.getNameOfAnimal().equalsIgnoreCase("hen") || animal.getNameOfAnimal().equalsIgnoreCase("ostrich")) {
            int r = 0, x = 0, y = 0;
            for (int i = 0; i < grasses.size(); i++) {
                if (grasses.get(i).MaxPower > 0) {
                    if (r <= Math.abs(grasses.get(i).X_position + grasses.get(i).Y_position - animal.getX_position() - animal.getX_position())) {
                        r = Math.abs(grasses.get(i).X_position + grasses.get(i).Y_position - animal.getX_position() - animal.getX_position());
                        x = grasses.get(i).X_position;
                        y = grasses.get(i).Y_position;
                    }
                }
            }


            if (x == animal.getX_position()) {
                if (y >= animal.getY_position())
                    animal.setY_position(animal.getY_position() + 1);
                else animal.setY_position(animal.getY_position() - 1);
            } else if (y == animal.getY_position()) {
                if (x >= animal.getX_position())
                    animal.setX_position(animal.getX_position() + 1);
                else animal.setX_position(animal.getX_position() - 1);
            } else if (y >= animal.getY_position())
                animal.setY_position(animal.getY_position() + 1);
            else if (y < animal.getY_position())
                animal.setY_position(animal.getY_position() - 1);
        }


        for (int i = 0; i < cages.size(); i++) {
            cages.get(i).setX(cages.get(i).getWildanimal().getX_position());
            cages.get(i).setY(cages.get(i).getWildanimal().getY_position());
        }
        return false;
    }

    public int Intersection(ImageView image, Animal animal, double t) {
        //0-> nothing
        //1-> a.play
        //2-> allert  the cat has picken up sth
        LocalDateTime w = LocalDateTime.now();
        Logger.add(w.toString() + "  " + "intersect");
        if (animal.getNameOfAnimal().equalsIgnoreCase("sheep") || animal.getNameOfAnimal().equalsIgnoreCase("ostrich") || animal.getNameOfAnimal().equalsIgnoreCase("hen")) {
            if (t > 0.5) {
                for (int i = 0; i < grasses.size(); i++) {
                    if (image.getBoundsInParent().intersects((double) grasses.get(i).getX_position(), (double) grasses.get(i).getY_position(), 50, 50)) {
                        grasses.get(i).setMaxPower(grasses.get(i).getMaxPower() - 1);
                        return 1;

                    }
                }
            }
        }


        if (animal.getNameOfAnimal().equalsIgnoreCase("cat")) {
            for (int j = 0; j < products.size(); j++) {
                if (image.getBoundsInParent().intersects(products.get(j).getX_position(), products.get(j).getY_position(), 20, 20)) {
                    boolean s = AddToWareHouse(products.get(j));
                    if (s) {
                        products.remove(j);
                        j--;
                        System.out.println(00000000);
                        //return approprate allert
                        return 2;
                    }
                }
            }
        }
        if (animal.getNameOfAnimal().equalsIgnoreCase("bear") || animal.getNameOfAnimal().equalsIgnoreCase("tiger") || animal.getNameOfAnimal().equalsIgnoreCase("lion")) {
            for (int i = 0; i < allDomestics.size(); i++) {
                if (image.getBoundsInParent().intersects(allDomestics.get(i).X_position, allDomestics.get(i).Y_position, 50, 50)) {
                    allDomestics.get(i).getImageview().setVisible(false);
                    allDomestics.remove(allDomestics.get(i));
                    i--;
                }
            }
            for (int i = 0; i < products.size(); i++) {
                if (image.getBoundsInParent().intersects(products.get(i).X_position, products.get(i).Y_position, 20, 20)) {
                    products.remove(products.get(i));
                    i--;
                    //make the image of product invisible
                }
            }
            for (int i = 0; i < grasses.size(); i++) {
                if (image.getBoundsInParent().intersects(grasses.get(i).X_position, grasses.get(i).Y_position, 20, 20)) {
                    grasses.remove(grasses.get(i));
                    i--;
                    //make the image of grass invisible
                }
            }
            for (int i = 0; i < allDefenders.size(); i++) {
                if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("cat")) {
                    if (image.getBoundsInParent().intersects(allDefenders.get(i).X_position, allDefenders.get(i).Y_position, 50, 50)) {
                        allDefenders.get(i).getImageview().setVisible(false);
                        allDefenders.remove(allDefenders.get(i));
                        i--;
                        //make the image of cat invisible
                    }
                }
            }
        }
////////////////
        //check who should be die

        ///////////////////
        if (animal.getNameOfAnimal().equalsIgnoreCase("dog")) {
            for (int i = 0; i < allWilds.size(); i++) {

                if (image.getBoundsInParent().intersects(allWilds.get(i).X_position, allWilds.get(i).Y_position, 50, 50)) {
                    allWilds.get(i).getImageview().setVisible(false);
                    allWilds.remove(allWilds.get(i));
                    i--;
                    //make the image of dog and wild invisible
                    for(int j=0;j<allDefenders.size();j++){
                        if(allDefenders.get(j).getNameOfAnimal().equalsIgnoreCase("dog")){
                            if(allDefenders.get(j).getX_position()==animal.getX_position()&&allDefenders.get(j).getY_position()==animal.getY_position()){
                              allDefenders.get(j).getImageview().setVisible(false);
                              allDefenders.remove(allDefenders.get(j));
                              j--;
                              break;
                            }
                        }
                    }

                }

            }
        }
return 0;
    }
}
