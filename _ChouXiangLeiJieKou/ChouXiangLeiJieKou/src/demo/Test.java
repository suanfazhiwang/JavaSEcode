package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 13:50
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(mouse);
        System.out.println("======================");
        computer.useDevice(keyBoard);
    }
}
