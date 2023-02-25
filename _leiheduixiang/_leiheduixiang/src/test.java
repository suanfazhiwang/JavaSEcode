/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-30
 * Time: 12:12
 *
 * 类和对象
 * 需要慢慢的逐步地理解
 * 面向对象是解决问题的一直思想，主要依靠对象之间的交互完成一件事情
 * 如何拿到一个对象 ？  要拿到对象我们必须先有类
 * 什么是类 ？如何定义类？
 * 语法：
 * class 类名{
 *     属性
 *     行为
 * }
 * 说明：
 * 1. 一般一个Java文件 只写一个类
 * 2. 类名注意采用大驼峰定义
 * 3. 成员前写法统一为public
 * 4. 此处写的方法不带static关键字
 *
 * 注意事项：
 * 1. 一般一个文件当中只定义一个类
 * 2. main方法所在的类一般要使用public修饰(注意：Eclipse默认会在public修饰的类中找main方法)
 * 3. public修饰的类必须要和文件名相同  一个Java文件只能有一个public类
 * 4. 不要轻易去修改public修饰的类的名称，如果要修改，通过开发工具修改(给同学演示)。
 *
 * 实例化  由类到对象的过程
 * 定义了一个类，就相当于在计算机中定义了一种新的类型，与int，double类似，只不过int和double是java语言自
 * 带的内置类型，而类是用户自定义了一个新的类型，比如上述的：PetDog类和Student类。它们都是类(一种新定
 * 义的类型)有了这些自定义的类型之后，就可以使用这些类来定义实例(或者称为对象)。
 *
 * 用类类型创建对象的过程，称为类的实例化，在java中采用new关键字，配合类名来实例化对象。
 * 一个类可以实例化多个对象   通过关键字new      使用 . 来访问对象中的属性和方法
 *
 * 1. 类只是一个模型一样的东西，用来对一个实体进行描述，限定了类有哪些成员.
 * 2. 类是一种自定义的类型，可以用来定义变量.
 * 3. 一个类可以实例化出多个对象，实例化出的对象 占用实际的物理空间，存储类成员变量
 * 4. 做个比方。类实例化出对象就像现实中使用建筑设计图建造出房子，类就像是设计图，只设计出需要什么东西，但是并没有实体的建筑存在，同样类也只是一个设计，实例化出的对象才能实际存储数据，占用物理空间
 *
 * this引用
 *
 *
 * 什么是构造方法？
 * 构造方法非常特殊  这个方法没有返回值  方法名和类名是一样的
 *
 *面向对象的3打特性   封装  继承   多态
 *
 *
 */

class Person{
    public String name;// null

    public int age;

    public Person(){

    }

    public void eat(){
        System.out.println("吃饭！");

    }
    public void Sleep(){
        System.out.println(name + "睡觉！");
    }
    public void Show(){
        System.out.println("姓名" + name + "年龄" + age);
    }
}
class WashMachine {
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double lenght; // 长
    public double weidth; // 宽
    public double height; // 高
    public String color; // 颜色

    public void WashClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }

    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }

    public void SetTime(){ // 定时
        System.out.println("定时功能");
    }

}

public class test {
    public static void main(String[] args) {

        Person person1 = new Person();//这里是实例化对象   此时会调用对象的构造方法
    }
    public static void main3(String[] args) {
        //1. 当一个引用赋值为null的时候  代表这个引用不指向任何对象！！！
        //2. 引用能不能指向引用？   不能
        //3. 一个引用能不能同时指向多个对象？   不能


        //代表person1不指向任何对象
        Person person1 = null;
        Person person2 = new Person();
        person1.age = 11;//这样会空指针异常
        //这个代表person1这个引用指向了person2这个引用指向的对象
        person1 = person2;//person1现在里面存的person2指向对象的地址


        Person person3 = new Person();
        person3 = new Person();
        person3 = new Person();
        person3 = new Person();
        person3 = new Person();
        person3 = new Person();//这不叫一个引用指向多个对象  而是赋值  也就是只有最后一个语句有效
        //类比以下
        int a = 0;
        a = 11;
        a = 14;
        a = 19;




    }
    public static void main2(String[] args) {
        Person penson1 = new Person();
        //属性/成员变量   成员变量：在类体的变量部分中定义的变量   编译器会给默认值
        //如果是引用类型   默认null      int float 默认 0
        //Boolean   默认  false     char 默认 '\u0000'
        penson1.age = 11;
        penson1.name = "zhangsan";
        penson1.Sleep();

        System.out.println(penson1.age);
        System.out.println(penson1.name);
        penson1.Show();

        Person penson2 = new Person();
        penson2.age = 15;
        penson2.name = "lisi";
        penson2.Sleep();

        System.out.println(penson2.age);
        System.out.println(penson2.name);
        penson2.Show();



    }
    public static void main1(String[] args) {
        //通过关键字 new 实例化一个Washmachine对象
        WashMachine a = new WashMachine();

    }
}
