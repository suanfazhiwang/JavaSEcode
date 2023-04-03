package JieKou;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 10:47
 *
 * 什么是接口
 * 电脑的usb接口  type接口  插座
 * 接口就是公共行为规范   只要符合规范标准就可以通用
 * 在Java中接口可以看作多个类的公共规范 是一种引用数据类型
 * 1. 使用关键字interface定义接口
 * 2. 接口不能被实例化
 * 3. 接口当中的成员默认是public static final的
 * 4. 接口当中的方法默认是public abstract 的
 * 5. 接口当中的方法不能有具体的实现，但是从jdk8开始 可以写一个default方法  可以写具体的实现  在方法的最前面
 * 6. 接口当中不能有构造方法
 * 7. 接口需要被类实现  需要使用关键字implements
 * 8. 接口中可以有static修饰的方法
 * 9. 接口虽然不是类  但是在接口编译完成后字节码文件的后缀格式也是。class
 * 10. 如果类中没有实现接口中所有的抽象方法  则类必须设置为抽象类
 * 、
 * 抽象类是对一个事物在抽象
 * 接口是对一个行为或者规范在设定标准
 *
 *
 *
 *
 */
interface IShape{
    void draw();
    default void func(){
        System.out.println("default");
    }
    public static void staticFunc(){
        System.out.println("static 修饰的方法" );
    }
}
class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("矩形");
    }

    @Override
    public void func() {
        System.out.println("重写这个方法");
    }
}
class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("❀❀");
    }
}


public class Test {
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
    public static void main(String[] args) {
        IShape iShape = new Rect();//向上转型
        IShape iShape2 = new Flower();//向上转型

        drawMap(iShape);
        drawMap(iShape2);
        IShape.staticFunc();
    }
}
