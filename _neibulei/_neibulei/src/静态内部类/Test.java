package 静态内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-11
 * Time: 19:39
 *
 * 如何实例化静态内部类的对象？
 * 不能直接进行实例化
 *        Outerclass.Inerclass inerclass = new Outerclass.Inerclass();
 * 静态内部类不依赖于对象存在  所以不能引用外部类中的非静态的变量方法
 * 静态内部类中  不能直接访问外部类的静态成员
 *
 *
 */
//外部类
class Outerclass{
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;
    //静态内部类
    static class Inerclass{
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;
        public void func(){
            System.out.println("static->Inerclass func()");
//            System.out.println(data1);
//            System.out.println(data2);
            Outerclass outerclass = new Outerclass();
            System.out.println(outerclass.data1);
            System.out.println(outerclass.data2);
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
        System.out.println(inerclass.data5);//外部类  可以访问静态内部类当中的所有成员  哪怕是private
        System.out.println(Inerclass.data6);

    }

}

public class Test {
    public static void main(String[] args) {
        Outerclass.Inerclass inerclass = new Outerclass.Inerclass();
        inerclass.func();
    }

}
