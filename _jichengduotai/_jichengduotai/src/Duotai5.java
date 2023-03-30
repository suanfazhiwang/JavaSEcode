/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-23
 * Time: 20:10
 *
 * 继承：对共性的抽取  从而达到对代码的复用  是is-a的关系
 *
 *     //对于这个Animal来说  他不知道将来引用那个对象  但是我们能确定的是  Animal引用的对象不一样  那么eat表现的形式就不一样
 *     //多态：当父类引用引用的对象不一样的时候  表现出的行为是不一样的！！！
 * 多态的概念，通俗来说就是有多种形态  具体点就是完成某个行为当不同的对象去完成时会产生不同的状态
 * 多态的实现方法
 * 1. 必须在继承体系下
 * 2. 子类必须要对父类中方法进行重写
 * 3. 通过父类的引用调用重写的方法
 *
 * 理论上来说  等号两边的数据类型必须一致  否则赋值会出错  父类引用指向的子类对象
 * 当发生向上转型之后  此时通过父类的引用  只能访问父类自己的成员  不能访问到子类特有的成员
 * 三种向上转型方法
 * 1. 直接赋值
 * 2. 方法传参
 * 3. 方法的返回值
 *
 * 重写需要满足三个条件
 * 1. 方法名称相同
 * 2. 参数列表相同
 * 3. 返回值相同
 *
 * 重写需要注意的点：
 * 1. private修饰的方法不能重写
 * 2. static修饰的方法不能重写   如果有static  就属于本类的静态方法   就和重写不发生关系了
 * 3. 子类的访问修饰限定权限  要大于等于父类的权限  private 默认  proteced  public
 * 4. 被final修饰的方法  是不能被重写的  此时这个方法  被称为密封方法
 *
 * super只是一个关键字 不代编父类的引用  只是在书写上一目了然  能够知道这就是父类的
 *
 * 动态绑定：运行的时候  帮我们调用了重写的   发生多态的基础
 * 1. 向上转型
 * 2. 重写
 * 3. 通过父类引用调用这个父类和子类重写的方法！
 * 通过查看编译完成的字节码文件可以得知  编译的时候确实是和我们猜测一样  调用父类的eat（）  但是运行的时候就会变成重写的eat
 * 这个过程就是动态绑定
 * 可以理解为   在编译的时候不知道调用哪个方法  但是在运行的时候就知道调用哪个方法了
 *
 *
 * 有没有静态绑定  重载
 * 编译的时候  就已经知道调用哪个方法了
 *
 */

class Animal2 {
    public String name;
    public int age;

    public void eat(){
        System.out.println(name + "正在吃饭");

    }
    public void drink(){
        System.out.println(name + "正在喝水");
    }
}
class Dog2 extends Animal2{
    public void wangwang(){

        System.out.println(name + "正在汪汪叫");
    }
    //这个东西叫做重写的注解  这个注解的意思是当前这个方法  是被重写的  如果下面这个方法不构成重写  就会报错
    //可以直接右键创建   不一定要自己写


    @Override
    public void eat() {


        System.out.println(name + "正在吃狗粮");

    }
}
class Bird extends Animal2{
    public String wing;

    public void fly(){

        System.out.println(name + "正在飞");
    }
    public void eat(){

        System.out.println(name + "正在吃鸟粮");
    }
}
public class Duotai5 {
    public static void main(String[] args) {
        //向下转型
        //向下转型非常不安全
        Animal2 animal2 = new Dog2();
        if(animal2 instanceof Dog2) {
            Dog2 dog2 = (Dog2) animal2;
            dog2.name = "liqi";
            dog2.wangwang();
        }
        System.out.println("-----------------------");

        Animal2 animal21 = new Dog2();
        //可以理解为  animal21这个引用是不是引用了Bird对象
        if(animal21 instanceof Bird) {
            Bird bird = (Bird) animal21;
            bird.fly();
        }

    }

    //对于这个Animal来说  他不知道将来引用那个对象  但是我们能确定的是  Animal引用的对象不一样  那么eat表现的形式就不一样
    //多态：当父类引用引用的对象不一样的时候  表现出的行为是不一样的！！！

    public static void funcction(Animal2 animal1){
        animal1.eat();
    }


    public static void main5(String[] args) {
        Animal2 animal1 = new Dog2();
        animal1.name = "liqi";
        funcction(animal1);
        animal1.drink();

        Animal2 animal2 = new Bird();
        animal2.name = "小鸟";
        funcction(animal2);
    }

    public static void main4(String[] args) {
        Animal2 animal1 = new Dog2();
        animal1.name = "liqi";
        animal1.eat();
    }
    public static void func(Animal2 animal2){

    }
    public static Animal2 func2(){
        return new Dog2();
    }
    public static void main3(String[] args) {
        Dog2 dog2 = new Dog2();
        func(dog2);
    }
    public static void main2(String[] args) {
        Animal2 animal1 = new Dog2();
        animal1.name = "liqi";
        animal1.eat();
//        animal1.wangwang();   这样是不行的  因为向上转型之后  只能调用父类原有的方法
    }
    public static void main1(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.name = "liqi";
        dog2.eat();
        dog2.wangwang();

        Animal2 animal2 = dog2;//理论上来说  等号两边的数据类型必须一致  否则赋值会出错  但是如果是父子类关系就不一定了

    }
}
