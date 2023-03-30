import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-25
 * Time: 11:06
 *
 * 继承最大的意义就是 对代码可以进行复用
 * Dog is a Animal
 * extends继承关键字
 * 1. 子类会将父类中的成员变量或者成员方法继承到子类中了
 * 2. 子类继承父类之后，必须要新添加自己特有的成员，体现出与基类的不同，否则就没有必要继承了
 *
 * private修饰的变量  被继承了但是不能访问
 *
 * 如果不想让这个类继续呗继承   那就在前面加关键字   final
 * final class Animal
 * 如果你用final修饰一个变量  那他就不可以被修改 变成了一个常量  在这中情况下  变量名大写
 * 如果是成员变量定义为final  语法规定必须同时给定一个初始值！
 *
 */

//父类  基类   超类
class Animal{
    public String name;
    public int age;

    //发现如果父类中有自己定义的构造函数   程序报错
    //在继承关系上 当我们在构造子类的时候 一定先帮助父类进行构造
    //怎么帮助？   调用构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("带有两个参数的构造方法");
    }

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
}

//发现一下这俩个类 有很多共同的方法  共同的属性   继承见上面
//子类  派生类
class Dog extends Animal{
    int ear;
    //但是如果在子类里也进行构造方法  并且把父类先构造出来  就不会报错


    public Dog(String name, int age, int ear) {
        super(name, age);//显示的调用父类的构造方法 帮助父类的成员进行初始化
        this.ear = ear;
    }

    public void wangwang(){
        System.out.println(this.name + "正在汪汪叫");
    }
}


class Cat extends Animal{
    int size;

    public Cat(String name, int age, int size) {
        super(name, age);
        this.size = size;
    }

    public void miaomiao(){
        System.out.println(this.name + "正在喵喵叫");
    }
}
public class Test1 {
    public static void main(String[] args) {
        final int A = 10;//此时  这个a就变成了常量

        System.out.println(A);
        final int[] Array = {1,2,3};
        //array = new int[10];
        //上面代码错误   多雾的原因是  array中存 的值实际上是一个地址  对应堆上的地址  如果new 就会吧这个地址改变  所以不能new
        //换句话说  array这个引用指向的对象是不能改变的
        //但是  array这个引用指向的对象的内容是可以改变的
        Array[0] = 10;
    }
    public static void main1(String[] args) {
        Dog dog = new Dog("liqi",12,12);
        dog.name = "帅哥";
        dog.eat();

        Cat cat = new Cat("meili",12,12);
        cat.name = "小咪";
        cat.eat();

    }

}
