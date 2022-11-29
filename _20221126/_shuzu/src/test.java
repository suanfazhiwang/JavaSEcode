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
 * Arrays.copyOf(array,array.length);   拷贝数组
 * Arrays.copyOf(array,array.length*2);   扩容！！！
 * System.arraycopy(array,0,array4,0,array.length);   底层拷贝方法
 * Arrays.copyOfRange(array,1,3);   拷贝范围左闭右开
 * Arrays.equals(array1,array2)   数组相等
 * Arrays.fill(array3,-1);   赋值填充
 * Arrays.fill(array3,1,3,-1);   范围赋值
 *
 *
 *
 * 数组是引用类型
 *
 * 内存的划分（JVM）：Java虚拟机栈   本地方法栈   堆   程序计数器   方法区
 * 引用类型的内存在堆上  开一块内存
 * 同时  array作为局部变量存在栈上   存的是对象的地址    叫做引用变量或者引用
 * array这个引用指向了一个对象
 * 两个引用同时指向一个对象  通过任何一个引用修改这个对象的值，另一个引用去访问的时候，也是被改变的
 *
 * 总结：当数组作为参数进行传递的时候，其实还是按值传递，只不过测试的值是一个地址！！  会出现两种情况
 * 1.形参修改指向：array = new int[10];   只会影响到形参的指向
 * 2.形参修改指向参数的值：array[0] = 9;  此时才会影响到实参
 * 局部变量  当方法结束后 栈上的内存就会被回收掉
 *
 * native  是本地方法  特点：底层是由C++实现的
 *
 *
 */
public class test {
    public static int find(int[] array,int val){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static void main14(String[] args) {
        int[] array1 = {5,2,4,3,1};
        int ret = find(array1,2);
        System.out.println(ret);
    }
    public static void main13(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = array1.clone();  //也是一种克隆
        //克隆的意思就是 产生一个副本
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
    public static void main12(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,31,4,5};
        System.out.println(Arrays.equals(array1,array2));

        int[] array3 = new int[10];
        Arrays.fill(array3,-1);
        System.out.println(Arrays.toString(array3));
        Arrays.fill(array3,1,3,-1);
        System.out.println(Arrays.toString(array3));



    }
    public static void main11(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(ret));
    }
    public static void main10(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 =Arrays.copyOf(array,array.length);
        int[] array3 = Arrays.copyOf(array,array.length*2);//扩容！！！
        int[] array4 = new int[array.length];
        int[] array5 = new int[array.length];
        System.arraycopy(array,0,array4,0,array.length);
        System.arraycopy(array,1,array5,0,array.length-1);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        array2[0] = 199;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));

    }
    public static void main9(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        array2[0] = 199;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static String myToString(int[] array){
        if (array == null){
            return null;
        }
        String ret = "[";

        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1 ){
                ret += ", ";
            }
        }
        ret = ret + "]";
        return ret;
    }

    public static void main8(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(array));

        System.out.println(myToString(array));
        System.out.println(myToString(null));
    }

    public static int[] grow(int[] array){
        int[] tmpArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = 2*array[i];
        }
        return tmpArray;
    }

    public static int[] func10(){
        int[] tmpArr = {10,11,12};
        return tmpArr;
    }

    public static void main7(String[] args) {
        int[] array = func10();
        System.out.println(Arrays.toString(array));
        int[] ret = grow(array);

        System.out.println(Arrays.toString(ret));



    }

    public static void func1(int[] array){
        array = new int[]{15,16,17};//给形参的引用赋了新值  不会 影响实参
        //知识改变了形参的指向  并没有改变实参的指向
        //new   就使引用指向一个新的地址   和以前的地址无关
        //相当于在堆里有创建了一块空间   用来存储新的东西
    }

    public static void func2(int[] array){
        array[0] = 999;
        //因为此时传递的是引用  通过引用修改了原来的值
    }

    public static void main6(String[] args) {
        int[] array1 = {1,2,3,4};
        func1(array1);
        System.out.println(Arrays.toString(array1));//1 2 3 4

        func2(array1);
        System.out.println(Arrays.toString(array1));//999 2 3 4
//      这个感觉好像是   都是传址

    }
    public static void main5(String[] args) {
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

        int[] array2 = array1;//代表array2这个引用指向了array1这个引用所指向的对象
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
