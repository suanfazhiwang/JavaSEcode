/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-08-02
 * Time: 9:19
 */
public class test {
    public static void main1(String[] args) {

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5/2.0);
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));

        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1

        System.out.println(10*0.1/3);//0.333333333
        System.out.println(12.5 % 10.5);//2.0
        System.out.println(11 % 10.5);//0.5

//        System.out.println(10/0);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at test.main(test.java:26)   算数异常   因为除0了
        int a = 10;
        double d = 12.5;
//        a=a+d  不行   因为d是double类型没法放到int类型中
        a += d;//不需要进行强制类型转换   如果是a=a+b就需要强制类型转换
        System.out.println(a);//结果是22  所以过程中会有强制类型转换的   相当于a=(int)(a+d)
        //对与++运算符基本和c语言一致但是重要的下面这里
        a = a++;
        System.out.println(a);//值还是a的值不会变
        a = ++a;
        System.out.println(a);//这样的值会加一


    }

    public static void main2(String[] args) {
        int a = 11;
        int b = 12;
        System.out.println(a>b);
        System.out.println(a<b);//得出结果要么是true   要么是false
        //所以if(5<a<10)这样的算式不能运行

    }

    public static void main3(String[] args) {
        //表达式1  &&  表达式2
        int a = 1;
        int b = 2;
        //System.out.println(a && b);  不是布尔表达式
        //1. 两个表达式必须都是表达式
        //2.如果第一个表达式是假，那么久不会执行第二个表达式【短路与】
        System.out.println(a > 5 && a / 0 != 0);//这样会正常运行
    }

    public static void main4(String[] args) {
        //布尔表达式1  ||   布尔表达式2
        //2. 假设第一个为真就不会执行第二个
        int a = 1;
        System.out.println(a < 5 || a / 0 != 0);//也可以正常运行
    }

    public static void main5(String[] args) {
        //按位与&  用途寻找这一位是不是都是1  都是1才是1   有0就是0
        //按位或|  用途寻找这一位是不是都是0   同时 好像求了一个并集  只要这一位是1就是1
        //按位异或^   不一样的进行或  一样的是0  用途找不同  对应位不同就是1对应位相同就是0
        //按位取反   1变0  0变1
    }

    public static void main6(String[] args) {
        //<<左移   *2
        //4 ： 0000 0100<<1 = 0000 1000 : 8
        //>>右移   /2   用符号位补充高位
        //4 ： 0000 0100>>1 = 0000 0010 : 2
        //左移和右移都是在补码的情况下进行的



        //1111 1111 >> 1 = 1111 1111
        System.out.println(-1>>1);
        //-1:1000 0001 原   1111 1110 反   1111 1111 补>>1 : 1111 1111
        //1000 0000  1000 0001 -1
        System.out.println(-2>>1);
        System.out.println(-3>>1);



        //无符号右移 ：>>>

        //1111 1111 >>> 1 = 0111 1111   无符号右移前面补0
        System.out.println(-1>>>1);
    }

    public static void main7(String[] args) {
        //布尔表达式1 ？ 表达式2 ： 表达式3   条件运算符   同c语言
        //表达式不能单独存在


    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + (b - a) >> 1;//想要求平均值但是先算了加号
        //应该是这样的
        int d = a + (a + (b - a) >> 1);
        System.out.println(c);
        System.out.println(d);
        //♥♥♥特殊情况：对于位操作的记得加括号
    }


}
