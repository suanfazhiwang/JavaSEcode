/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-24
 * Time: 12:09
 *
 *
 * 成员变量：
 * 1. 静态成员变量或者类变量或者类成员
 * 2. 非静态成员变量或者普通成员变量
 *
 * 静态变量属性
 * 1. 不属于某个具体的对象，是类的属性，所有对象共享的，不存储在某个对象的空间中
 * 2. 既可以通过对象访问，也可以通过类名访问，但一般更推荐使用类名访问
 * 3. 类变量存储在方法区当中
 * 4. 生命周期伴随类的一生(即：随类的加载而创建，随类的卸载而销毁）
 * 5. 静态变量不依赖于对象而存在
 *
 * static修饰的成员变量，称为静态成员变量，静态成员变量最大的特性：不属于某个具体的对象，是所有对象所共享的。
 * 静态的成员变量不属于对象所以不要通过对象的引用来访问 直接可以通过类名就可以访问
 *
 * 成员方法
 * 1. 静态成员方法或类方法
 * 2. 非静态成员该方法
 * 在静态方法内部 不能调用非静态的成员方法  因为非静态方法有this参数 在静态方法中调用时候无法传递this引用
 * 在静态方法内部  不能够直接使用非静态的数据成员
 * 只要是非静态的数据成员  都需要通过对象的引用才能调用
 * 普通方法内部是可以使用静态的成员方法的
 * 建议 获取静态的成员变量或者设置静态的成员变量此时的方法最好是静态的  否则如果是非静态的还得实例化对象
 *
 * 对于静态成员的初始化  有几种方法
 * 1. 直接赋值
 * 2. 默认初始化
 * 3. 可以通过提供get和set方法来进行初始化
 * 4. 也可以通过构造方法中进行赋值  但是不建议这样写
 * 5. 通过代码块进行赋值
 *
 * 代码块
 * 1. 普通代码块（一般指定义在方法内部的代码块） 这块代码的执行不需要条件  更多的是区分代码的作用域 不推荐使用
 * 2. 构造快或非静态代码块或实例代码块  如果都是非静态的  那么看定义的顺序 谁在后最后就是那个之  作用过程理解为代码运行时他会出现在构造方法的最前面
 * 3. 静态块  初始化静态的数据成员 提前准备一些数据   先执行静态代码块   在执行非静态代码块  在执行构造方法  只要这个类被加载都会被执行   静态代码块只执行一次
 * 4. 同步代码块
 *
 */
class Students{
    public String name;
    public int age;

    //方法区  属性  classroom
    public static String classroom = "java";
    public Students(){

    }


    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("带有两个参数的构造方法");
    }

    //以下是  非静态代码块
    {
        name = "caocao";
        a = 10;
        System.out.println("非静态代码块"); //这里会被直接打印 先执行实例代码块
    }

    //以下是 静态代码块
    static {
        System.out.println("静态代码块  初始化静态的数据成员 提前准备一些数据");
    }
    public int a = 100;
    public void doClass(){
        System.out.println(this.name + "上课");
    }
    public static void func(){
        System.out.println("func()");
    }

    //对于你想输出一个对象的引用值的时候  如果自己没有写一个toString方法  就会调用 objec这个类的方法 如果自己写了就用自己的
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a=" + a +
                '}';
    }
}


public class Test2 {
    public static void main(String[] args) {
        Students students = new Students("zhangsan",17);
        System.out.println(students.name);//会打印zhangsan
        Students students1 = new Students();
        System.out.println(students1.name);//会打印caocao
        System.out.println(students1.a);//发现当把a初始化放在后面时 就会打印后面的a
        System.out.println(students1);


    }
    public static void main3(String[] args) {
        Students students = new Students("zhangsan",17);
        students.func();//这样写有警告
        Students.func();//这样写没有警告
        func2();//可以直接调用
        //但是func1需要这样
        Test2 test2 = new Test2();
        test2.func1();
        //这样可以看出static的作用


    }

    //同时  为什么方法中要有static
    public void func1(){
        System.out.println("func1");
    }
    public static void func2(){
        System.out.println("func2");

    }

    public static void main2(String[] args) {
        Students students = null;
        System.out.println(Students.classroom);
        System.out.println(students.classroom);//这样都可以打印  
    }
    public static void main1(String[] args) {
        Students students1 = new Students("zhangsana",19);
        Students students2 = new Students("zhangsan2",111);
        Students students3 = new Students("zhangsan3",123);
        System.out.println(students1.classroom);//虽然不会报错但是有问题
        System.out.println(Students.classroom);//通过类名去访问才是正确的


    }
}
