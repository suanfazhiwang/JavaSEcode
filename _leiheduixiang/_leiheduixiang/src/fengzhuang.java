import java.util.Arrays;
import java.util.Date;
//以上就是导入包的过程   但是也有简写版本   import java.util.*


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-22
 * Time: 17:56
 *
 * 面向对象的3打特性   封装  继承   多态
 * 什么是封装  封装有什么意义
 * 把类的实现细节进行隐藏   对外只提供一些交互的接口
 * 封装：将数据和操作数据的方法进行有机结合，隐藏对象的属性和实现细节，仅对外公开接口来和对象进行 交互
 *
 * 访问修饰限定符   也就是对于权限的说明
 * 1.private  被修饰之后 只能在当前类当中才能使用
 * 2.默认权限
 * 3.protected
 * 4.public
 *
 */
class Student{
    private String num;
    public String name;
    public int age;

}

public class fengzhuang {


    public static void main(String[] args) {
        Student student = new Student();
        student.name = "zhangsan";
        //student.num  发现这个num是不能用的  就是因为权限问题

        //在这里的Date 和 Array都需要导入各自所需要的包
        //import java.util.Arrays;
        //import java.util.Date;
        Date date = new Date();
        int[] array = {1,2,3,4,5};
        Arrays.sort(array);

    }
}
