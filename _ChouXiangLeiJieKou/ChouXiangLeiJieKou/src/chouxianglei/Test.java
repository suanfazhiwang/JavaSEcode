package chouxianglei;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-30
 * Time: 10:23
 * 上一节   重写的返回类型可以不一样但是必须 父类返回父类  子类返回子类   协变类型
 *
 * 抽象类
 * 1. 抽象类使用abstract修饰类
 * 2. 抽象类不能被实例化
 * 3. 此时在抽象类中可以有抽象方法  或者非抽象方法
 * 4. 什么是抽象方法  一个方法呗abstract修饰 没有具体的实现 只要包含抽象方法 这个类必须是抽象方法
 * 5. 抽象类生来就是被继承的   当一个普通类继承了抽象类必须重写冲向类当中的抽象方法
 * 6. 抽象类存在的最大意义就是被继承
 * 7. 抽象方法不能被private final static修饰  所以一定要满足重写的规则
 * 8. 当一个子类没有重写抽象的父类的方法  可以把当前子类变成abstract修饰
 * 9. 当他再次被继承的时候  就一定要重写
 * 10. 抽象类当中不一定包含抽象方法
 *
 *
 *
 * 和普通类有什么区别
 * 1. 抽象类不能实例化  普通类可以
 * 2. 抽象类当中可以包含非抽象方法  和抽象方法  但是普通类只能包含非抽象方法
 *
 */
abstract class Shape{
    //可以没有具体的实现  但是必须加上abstract
    public abstract void draw();

    public Shape() {
        //抽象方法也可以有构造方法
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
    public void wangwang(){
        System.out.println("wangwang");
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画圆型");
    }

}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("花一朵花");
    }
}
public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Cycle());
        drawMap(new Flower());

        //实例化引用了一个子类对象
        Shape shape = new Rect();

    }
}
