/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-21
 * Time: 9:08
 *
 *
 * 注意
 * 1.习惯使用this
 * 2. 每个成员方法第一个参数默认是this
 *
 * 1. this的类型：对应类类型引用，即哪个对象调用就是哪个对象的引用类型
 * 2. this只能在"成员方法"中使用
 * 3. 在"成员方法"中，this只能引用当前对象，不能再引用其他对象
 * 4. this是“成员方法”第一个隐藏的参数，编译器会自动传递，在成员方法执行时，编译器会负责将调用成员方法对象的引用传递给该成员方法，this负责来接收
 *
 * this还有另外两种用法
 * 1. this访问构造方法
 * 2. this访问成员方法
 *
 * * 什么是构造方法？
 *  * 构造方法非常特殊  这个方法没有返回值  方法名和类名是一样的
 *
 *  如果你没有写任何的构造方法  此时java会帮我们提供一个默认的不带参数的构造方法！！
 *  如果自己写了  就会调用自己写的
 *  只会被调用一次
 *
 *  重载：方法名相同 参数列表不同  返回值没有影响
 *  一个对象的生成  会分成几步
 *  1.为对象分配内存
 *  2.调用合适的构造方法   所以构造方法中可以使用this引用
 *  3.
 *
 *  new 关键字背后所发生的一些事情：
 *在程序层面只是简单的一条语句，在JVM层面需要做好多事情，下面简单介绍下：
 * 1. 检测对象对应的类是否加载了，如果没有加载则加载
 * 2. 为对象分配内存空间
 * 3. 处理并发安全问题
 * 比如：多个线程同时申请对象，JVM要保证给对象分配的空间不冲突
 * 4. 初始化所分配的空间
 * 即：对象空间被申请好之后，对象中包含的成员已经设置好了初始值
 * 5. 设置对象头信息(关于对象内存模型后面会介绍)
 * 6. 调用构造方法，给对象中各个成员赋值
 *
 *
 */
public class Dateutil {

    public int year;
    public int month;
    public int day;

    public Dateutil(){
        //this调用当前对象的其他构造方法时  必须放到第一行并且只能在构造方法内部才能用
        this(1999,9,9);
        System.out.println("不带参数的构造方法，这个方法如果没有写 java会自动提供");
    }

//    public void setDate(Dateutil this, int year, int month, int day){
//        //如果这样的话  这里看出  局部变量优先使用  这几个year都是形参
//        //所以要学会习惯使用year
//        year = year;
//        month = month;
//        day = day;
//
//
//
//        this.year = year;
//        this.month = month;
//        this.day = day;
//
//
//    }

    public Dateutil(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用了带有三个参数的构造方法");
    }


    public void show(Dateutil this){

        System.out.println("年：" + this.year + "月：" + this.month + "日：" + this.day);
    }

    public static void main(String[] args) {
        Dateutil dateutil = new Dateutil();
        dateutil.show();
    }

    public static void main1(String[] args) {
        Dateutil dateutil = new Dateutil(2022,22,2);
//        dateutil.setDate(2022,11,7);
        dateutil.show();

        Dateutil dateutil2 = new Dateutil();
//        dateutil2.setDate(2022,11,7);
        dateutil2.show();

        Dateutil dateutil3 = new Dateutil();
//        dateutil3.setDate(2022,11,7);
        dateutil3.show();

    }


}
