package 非静态内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-11
 * Time: 21:16
 *
 * 在实例内部类中不能定义静态的成员变量
 * 在非静态内部类中包含外部类的this的‘
 * 静态内部类使用的比较多
 *
 */
class Outerclass {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    //静态内部类
    class Inerclass {
        public int data1 = 1111;
        public int data4 = 4;
        private int data5 = 5;
        //首先在非静态内部类中不能定义一个静态的成员变量
//        public static int data6 = 6;
        //但是可以定义一个final常量  因为常量实在程序编译的时候  就能确定的
        public static final int data6 = 6;

        public void func() {
            System.out.println("static->Inerclass func()");
//            System.out.println(data1);
//            System.out.println(data2);
            Outerclass outerclass = new Outerclass();
            System.out.println(outerclass.data1);
            System.out.println(data1);
            System.out.println(outerclass.data2);
            System.out.println(this.data1);
            System.out.println(Outerclass.this.data1);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);

        }

    }
    public void test(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
//        System.out.println(data4);
//        System.out.println(data5);
//        System.out.println(data6);
        Inerclass inerclass = new Inerclass();
        System.out.println(inerclass.data4);
        System.out.println(inerclass.data5);
        System.out.println(Inerclass.data6);
    }
}

public class test {
    public static void main(String[] args) {
        //实例内部类有点麻烦  他需要外部类的对象
        //但是外部类不需要

        Outerclass outerclass = new Outerclass();
        Outerclass.Inerclass inerclass = outerclass.new Inerclass();
        inerclass.func();
        outerclass.test();
    }

}
