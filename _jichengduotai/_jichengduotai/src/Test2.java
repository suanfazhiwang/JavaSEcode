/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-27
 * Time: 11:12
 *
 * 如果访问的成员变量子类中有，优先访问自己的成员变量。
 * 如果访问的成员变量子类中无，则访问父类继承下来的，如果父类也没有定义，则编译报错。
 * 如果访问的成员变量与父类中成员变量同名，则优先访问自己的。
 * 成员变量访问遵循就近原则，自己有优先自己的，如果没有则向父类中找
 * 如果一定要访问 父类的c  使用关键词super  super.c
 * super暂且理解为父类的引用   正确的理解维  super只是一个关键字 最大的作用就是在写代码和读代码的时候提供更好的可读性
 * super  用法   只能在非静态方法中使用 不能再static方法中使用   只能指代直接的父类
 * 1. super。data在子类中访问父类的成员变量
 * 2. super。func在子类中访问父类的成员方法
 * 3. super 在子类构造方法内调用父类的构造方法时  一定放在第一行  super和this在调用构造方法时不能同时出现
 * 通过子类对象访问父类与子类中不同名方法时，优先在子类中找，找到则访问，否则在父类中找，找到则访问，否则编译报错。
 * 通过派生类对象访问父类与子类同名方法时，如果父类和子类同名方法的参数列表不同(重载)，根据调用方法适传递的参数选择合适的方法访问，如果没有则报错；
 * 父类子类中的方法也可以进行重载   先看是否是重载  是重载先进行重载使用  再说先子类后父类的问题
 * 当父类和子类都 没有写任何构造方法的时候   编译器会自己提供一些
 * 父类：public Animal（）{
 *
 * }
 *子类：public Dog（）{
 *     super（）；
 *}
 * 子类对象中成员是有两部分组成的，基类继承下来的以及子类新增加的部分 。父子父子肯定是先有父再有子，所以在构造子类对象时候 ，先要调用基类的构造方法，将从基类继承下来的成员构造完整然后再调用子类自己的构造方法，将子类自己新增加的成员初始化完整 。
 *
 *
 *
 */
class Base {
    public int a;
    public int b;
    public int c = 199;
    public void methodBase(){
        System.out.println("Base");
    }
    public void func2(int a){
        System.out.println("Base");
    }
}

class Derived extends Base {
    public int c = 9;

    public void func(){
        //子类有  就拿子类了  子类没有  就拿父类的
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);//如果父类和子类有同名的成员变量   优先访问   子类自己的
        System.out.println(super.c);//super的应用
    }
    public void methodBase(){
        System.out.println("Derived");
    }
    public void methodDerived(){
        System.out.println("Derived");
    }
    public void func1(){
        methodBase();
        methodDerived();
        super.methodBase();
    }
    public void func2(){
        System.out.println("Derived");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived.a);
        derived.func();
        System.out.println(derived);
        derived.methodDerived();
        derived.methodBase();

        derived.func1();
        derived.func2(1);
        derived.func2();
    }

}
