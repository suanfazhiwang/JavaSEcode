import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-27
 * Time: 15:19
 * 在Java中一般通过  new关键字  实例化对象
 * Java当中的数组其实就是一个对象   Java中一切皆对象
 * 数组的定义与使用
 * 数组的使命 是用来存储一组相同数据类型的数据的
 * 怎么存？存哪里？怎么取？   下标 索引从零来时
 *
 * Arrays.sort   数组排序
 * Arrays.toString   遍历数组  将数组转化为字符串的形式
 *
 * 数组是引用类型
 *
 * 内存的划分（JVM）：Java虚拟机栈   本地方法栈   堆   程序计数器   方法区
 * 引用类型的内存在堆上  开一块内存
 * 同时  array作为局部变量存在栈上   存的是对象的地址    叫做引用变量或者引用
 * array这个引用指向了一个对象
 * 两个引用同时指向一个对象  通过任何一个引用修改这个对象的值，另一个引用去访问的时候，也是被改变的
 *
 */
public class test {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {11,22,33,44};

        array1 = array2;//两个引用同时指向一个对象
        array1[0] = 1888;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
    public static void main4(String[] args) {
        int[] array1 = {1,2,3,4};
        array1[0] = 99;

        int[] array2 = array1;
        array2[0] = 100;

        System.out.println(Arrays.toString(array1));//100 2 3 4
        System.out.println(Arrays.toString(array2));//100 2 3 4

    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(array[0]);

        array[0] = 99;
        System.out.println(array[0]);
        System.out.println(array[1]);
//        System.out.println(array[6]);//越界了报错   数组下标越界异常

        System.out.println(array.length);//数组名.length就可以自动求出长度
        //通过下标来访问
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //第二种遍历数组的方式
        for (int x: array) {
            System.out.println(x);
        }

        //对数组排序
        Arrays.sort(array);

        //第三种遍历数组的方式
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }



    public static void main2(String[] args) {
        boolean[] array = new boolean[10];//初始化为false
        System.out.println("====");
        System.out.println("====");
        //因为数组是引用类型所以需要new   字符串也是引用类型
        String str = new String("hello");
        String str2 = "hello";//简写


    }



    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};//Java中定义数组方括号里 不能有数字     int[]就是一个数据类型

        int[] array2 = new int[]{1,2,3,4,5,6};//理论 上来说和上面是一样的   上面是简写形式

        int[] array3 = new int[10];//只是分配了内存   还没初始化

        int[] array4;
        array4 = new int[]{1,2,3};//这样初始化不可以省略new int


    }
}
