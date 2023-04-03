package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 14:24
 *
 * java是单继承  只能继承一个类   不能进行多继承
 * 但是可以先继承  在实现接口
 * 撇开了类型
 *
 * 继承是is a的语义  但是接口表达的含义是具有xxx特性
 *
 */
abstract class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }

}

interface IRun{
    void run();
}

interface ISwim{
    void swim();
}

interface IFly{
    void fly();
}

class Dog extends Animal implements IRun{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "狗跑");
    }
}
class Fish extends Animal implements ISwim{
    public Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + "🐟游泳");
    }
}
class Bird extends Animal implements IFly,IRun,ISwim{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + "正在鸟飞");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在鸟游泳");
    }

    @Override
    public void run() {
        System.out.println(name + "正在鸟跑");
    }
}
class Robet implements IRun{
    @Override
    public void run() {
        System.out.println("机器人正在跑");
    }
}

public class Test {
    public static void walk(IRun run){
        run.run();
    }
    public static void swim(ISwim swim){
        swim.swim();
    }
    public static void main(String[] args) {
        walk(new Dog("liqi"));
        walk(new Bird("菲菲"));
        swim(new Fish("赖皮🐟"));
        walk(new Robet());


    }
}
