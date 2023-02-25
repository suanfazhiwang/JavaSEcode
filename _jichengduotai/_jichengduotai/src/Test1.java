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
 */

//父类  基类   超类
class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
}

//发现一下这俩个类 有很多共同的方法  共同的属性   继承见上面
//子类  派生类
class Dog extends Animal{
    public void wangwang(){
        System.out.println(this.name + "正在汪汪叫");
    }
}
class Cat extends Animal{
    public void miaomiao(){
        System.out.println(this.name + "正在喵喵叫");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "帅哥";
        dog.eat();

        Cat cat = new Cat();
        cat.name = "小咪";
        cat.eat();

    }

}
