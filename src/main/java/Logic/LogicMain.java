package Logic;

public class LogicMain {
    public static void main(String[] args) {
        Manager manager=new Manager();
        InputProcessor input= new InputProcessor(manager);
        input.run();

    }
}
