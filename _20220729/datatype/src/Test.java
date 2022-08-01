import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_UDS;
import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-07-29
 * Time: 15:35
 * 字面常量的分类：
 * 1. 字符串常量：由""括起来的，比如“12345”、“hello”、“你好”。
 * 2. 整形常量：程序中直接写的数字(注意没有小数点)，比如：100、1000
 * 3. 浮点数常量：程序中直接写的小数，比如：3.14、0.49
 * 4. 字符常量：由 单引号 括起来的当个字符，比如：‘A’、‘1’
 * 5. 布尔常量：只有两种true和false
 * 6. 空常量：null(后面了讲)
 * 注意：字符串、整形、浮点型、字符型以及布尔型，在Java中都称为数据类型。
 *
 *数据类型
 * 1. 基本数据类型（不管是什么系统都是这些大小）
 * byte  字节类型1    short  短整型2    int  整形4    long  长整型8
 * float  单精度浮点数4    double  双精度浮点数8
 * char  字符类型2
 * boolean  布尔类型没明确规定大小
 * 2. 引用数据类型
 *
 */
public class Test {
    public static void main1(String[] args) {
        int a = 10;
//      int 3a = 100;这是不是对的不能以数字开头   可以下划线开头可以美元开头
        int _______________________ = 10;// 合法但是不合理不要这样做
        System.out.println(_______________________);
    }

    public static void main2(String[] args) {
        System.out.println("hello");
        System.out.print("print不会换行");
        System.out.print("哇塞是真的呢");
        System.out.printf("%d\n",10);//    printf   像c语言一样打印
    }

    public static void mainint(String[] args) {
        int a = 10; // 定义整形变量a，a是变量名也称为标识符，该变量中放置的值为10   java没有无符号的数字
//      最高位存储符号位   0代表正数    1代表负数     -2^31-----2^31 - 1
        System.out.println(a);
        //INteger->把他当作   一个int的plus版本   专业术语：包装类
        System.out.println(Integer.MAX_VALUE);//输出int的最大值
        System.out.println(Integer.MIN_VALUE);//输出int的最小值
//      int c;   如果定义的局部变量没有初始化   使用之前一定要初始化
        a = 100; // a是变量，a中的值是可以修改的，注意：= 在java中表示赋值，即将100交给a，a中保存的值就是100
        System.out.println(a);
// 注意：在一行可以定义多个相同类型的变量
        int a1 = 10, a2 = 20, a3 = 30;
        System.out.println(a1);
        System.out.println(a2);
        //int c = 2147483648;   会报错当赋值的字面值，大于 这个变量能保存的最大值的时候程序会编译报错


    }

    public static void mainlong(String[] args) {
        long a = 10;//8个字节->64个比特位  -2^63-----2^63-1
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);//输出long的最大值
        System.out.println(Long.MIN_VALUE);//输出long的最小值
        long b = 10L;//在这里写个大写的L就很专业
        System.out.println(b);


    }

    public static void Shortmain(String[] args) {
        short sh = 10;//两个字节   -2^15----2^15-1
        System.out.println(sh);
        byte b = 10;//字节类型    -2^7----2^7-1    -128---127
    }

    public static void dfmain(String[] args) {
        double d1 = 12.5;
        System.out.println(d1);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        float f = 12.5f;//float   数据后面加一个f
        int a = 1;
        int b = 2;
        System.out.println(a/b);
        System.out.println(a*1.0/b);
        double c = 1.1;
        double d = 1.1;
        System.out.println(c*d);//这个和浮点数的存储是有关系的
//      double 类型的内存布局遵守 IEEE 754 标准(和C语言一样), 尝试使用有限的内存空间表示可能无限的小数, 势
//必会存在一定的精度误差，因此浮点数是个近似值，并不是精确值。


    }

    public static void charmain(String[] args) {
        char ch = '啊';//两个字节！   0-65535    没有负数
        System.out.println(ch);
    }

    public static void booleanmain(String[] args) {
        boolean b = true;
        System.out.println(b);
    }

    public static void turnmain(String[] args) {
        /**
         * 注意事项：
         * 1. 不同数字类型的变量之间赋值, 表示范围更小的类型能隐式转换成范围较大的类型
         * 2. 如果需要把范围大的类型赋值给范围小的, 需要强制类型转换, 但是可能精度丢失
         * 3. 将一个字面值常量进行赋值的时候, Java 会自动针对数字范围进行检查
         * 4. 强制类型转换不一定能成功，不相干的类型不能互相转换
         */
        int a = 10;
        long b = 100L;
        //a = b;   不能进行直接赋值
        a = (int)b;//强制类型转换   显示类型转换
        b = a;
    }

    public static void upmain(String[] args) {
//        不同类型的数据之间相互运算时，数据类型小的会被提升到数据类型大的。

        int a = 10;
        long b = 20;
        long c = a+b;

        byte a1 = 10;
        byte b1 = 20;
        //byte c1 = a + b;   当你参与运算的数据小于四个字节的时候会进行提升为4个字节的int
        int c1 = a1+b1;
        System.out.println(c1);
    }

    public static void main3(String[] args) {
        String s1 = "hello";//定义字符串   Java字符串不以\0为止
        String s2 = "world";
        System.out.println(s1);
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        //当字符串和整数在一起使用+ 号的时候，就是个拼接的意思
        System.out.println("a:"+a + "b:"+b);
        System.out.println("a:"+a + b);//a:1020没有加起来的原因在于”a:“+a后还是一个字符串类型
        System.out.println(a + b + "aaa");//30aaa   遇到字符串才拼接
        System.out.println(s1+s2);


    }

    public static void main4(String[] args) {
        int a = 10;
        String str = a + "";
        System.out.println(str);
        //借助方法
        String ret = String.valueOf(10);//把整数传化为字符串   String.valurof   可以把别的类型转化为字符串类型

        System.out.println(ret);

    }

    public static void main(String[] args) {
        String str = "1234";
        int a = Integer.parseInt(str);
        System.out.println(a+1);
    }
}
