/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-13
 * Time: 16:15
 * 一个方法从写好到用起来
 * 1. 定义方法决定这个方法，返回值是什么类型？ 方法名称叫啥？ 形参有几个? 什么类型？ 什么顺序？
 * 2. 使用这个方法，调用这个方法。 方法名（）-》看一下有几个参数，都是啥类型？ 都是啥顺序？
 * 3. 方法有返回值吗 ？ 要不要接受？ 拿什么类型接受？ 接受了返回值，我用返回值干什么？
 *
 * 实参和形参按照值传递   传值
 * Java中方法的形参就相当于sum函数中的自变量n，用来接收sum函数在调用时传递的值的。形参的名字可以随意
 * 取，对方法都没有任何影响，形参只是方法在定义时需要借助的一个变量，用来保存方法在调用时传递过来的值。
 * java方法不能传地址  所以无法实现交换a和b  形参的改变不会改变实参   需要用到类和对象
 * 方法重载   在Java中，如果多个方法的名字相同，但是参数列表不同(顺序 个数 类型)，则称该几种方法被重载了。
 * 方法重载与返回值无关   与计算结果无关      一词多义
 */
public class test {
    public static void main(String[] args) {

    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }


    public static void main2(String[] args) {
         int a = 10;
         int b = 20;
        System.out.println(sum(a,b));


        double d1 = 12.4;
        double d2 = 17.8;
        System.out.println(sum(d1,d2));
        System.out.println(sum(1,2,3));
    }
    public static int facNum(int num){
        int sum = 0;
        for (int i = 0; i < num; i++) {

            sum += fac(i);
        }
        return sum;

    }
    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++){
            ret *= i;
        }
        return ret;
    }



    public static boolean isLeapYear(int year){
        if((0 == year % 4 && 0 != year % 100) || 0 == year % 400){
//            System.out.println(year + "年是闰年");
            return true;
        }else {
//            System.out.println(year + "年不是闰年");
            return false;
        }
    }

    public static void main1(String[] args) {
        //传参  类型和个数都要匹配   一一匹配
        //返回值   也要匹配
        boolean flg = isLeapYear(2022);
        System.out.println(flg);
        System.out.println(facNum(5));
    }

}
