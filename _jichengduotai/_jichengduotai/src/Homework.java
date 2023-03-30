import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-27
 * Time: 10:30
 *
 * static定义的变量不能在方法内部  语法上不支持
 */


class Base21 {

    private int x;
    private int y;

    public Base21(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub extends Base21 {

    private int z;

    public Sub(int x, int y, int z) {
        super(x,y);
        this.z = z;


    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }

}

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }

}
