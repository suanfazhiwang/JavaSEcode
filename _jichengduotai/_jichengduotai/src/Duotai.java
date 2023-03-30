/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-29
 * Time: 11:06
 *
 * 注意：
 * 挡在父类的构造方法当中  去调用父类和子类重写的方法的时候  此时会调用子类的
 */

class Shape{

    public void draw(){
        System.out.println("话图形");
    }
    public void papa(){
        System.out.println("papa");
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

public class Duotai {
    public static void drawMap(Shape shape){
        shape.draw();
        if (shape instanceof Rect){
            ((Rect) shape).wangwang();
        }
        shape.papa();
    }

    public static void main2(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        Shape[] shapes = {rect,cycle,rect,flower,flower};
        for (Shape shape: shapes) {
            shape.draw();
        }

    }
    public static void main1(String[] args) {
        Rect rect = new Rect();

        Cycle cycle = new Cycle();

        drawMap(rect);
        drawMap(cycle);
        drawMap(new Flower());


    }

    public static void main(String[] args) {
        D d = new D();
    }




}
class B{
    public B(){
        func();
    }
    public void func(){
        System.out.println("B:func");
    }

}
class D extends B{
    int a = 1;
    @Override
    public void func() {
        System.out.println("D:func");
        System.out.println(a);
    }
}

