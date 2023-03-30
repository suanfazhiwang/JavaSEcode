/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-20
 * Time: 16:37
 * 先执行父类  在执行子类   先执行静态方法  再执行其他    其中  静态的优先级最高
 * 而且静态的只会执行一次
 *
 * 静态代码块先执行  并且只执行一次   在类加载的阶段执行
 * 当有对象创建时  才会执行实例代码块  实例代码块执行完成后  最后是构造方法执行
 *‘
 * private修饰的成员变量或者成员方法  只能在当前类当中使用  类外不可以使用
 * 什么都不写  默认权限  包访问权限 指的是只能在当前包当中才能够使用
 * public 公开的  意味着  在哪里都可以使用
 * proteced 受保护的
 *
 *
 *
 */
class Animal1{
    static {
        System.out.println("static Animal{}");
    }
    {
        System.out.println("Animal{}");
    }
    public Animal1() {
        System.out.println("Animal()");
    }
}




//发现一下这俩个类 有很多共同的方法  共同的属性   继承见上面
//子类  派生类
class Dog1 extends Animal1 {
    static {
        System.out.println("static Dog{}");
    }
    {
        System.out.println("Dog{}");
    }
    public Dog1() {
        System.out.println("Dog()");
    }
}


public class test3 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        Dog1 dog2 = new Dog1();

    }

}
