/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-08-08
 * Time: 11:37
 * public static 返回值类型 方法名 （形参列表）
 */
import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Random;
import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int count = 0;
            count = (i%10)*(i%10)*(i%10) + (i/10%10)*(i/10%10)*(i/10%10) + (i / 10 / 10 % 10)*(i / 10 / 10 % 10)*(i / 10 / 10 % 10);
            if (count == i){
                System.out.println(i + "为水仙花数");
            }
            count = 0;

        }
    }
    public static void main7(String[] args) {
        int a = 265;
        int b = 2325;
        for (int i = a; i >0; i--) {
            if (a % i == 0){
                if (b % i == 0){
                    System.out.println(i + "为最大公约数");
                    break;
                }
            }
        }
    }
    public static void main6(String[] args) {
        int a = 0;
        for (int i = 1; i < 101; i++) {

            for (int j = 2; j <= i/2; j++) {

                if (i % j == 0){
                    a += 1;
                }
            }

            if (a == 0) {
                System.out.println(i + "是素数");
            }
            a = 0;
        }
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();//生成随机数
        int randNum = random.nextInt(100);

        while (true){
            System.out.println("请输入你要猜的数字");
            int number = scan.nextInt();
            if(number > randNum){
                System.out.println("你猜大了");
            }else if(number < randNum) {
                System.out.println("你猜小了");
            }else {
                System.out.println("你猜对了 就是" + randNum);
                break;
            }
        }
    }


    public static void main4(String[] args) {
        //循环输入
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int a = scan.nextInt();
            System.out.println("a =" + a);
        }

    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入年龄");
        int n = scan.nextInt();
        System.out.println(n);

        //scan.nextLine();

        System.out.println("请输入姓名");
        String name = scan.nextLine();
        System.out.println(name);
        //此时上面输完之后回车   导致nextline会直接读取回车不会有输入的过程    所以就像c一样需要一个读取回车的步骤  在上面再加一个scan.nextline

    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(name);
        String name1 = scan.next();
        System.out.println(name1);
        //发现在使用next的时候   遇到空格就结束   空格之后的不会被记录  而是直接去下一个next



    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("请输入姓名");
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("请输入年龄");
        int n = scan.nextInt();
        System.out.println(n);
        System.out.println("请输入工资");
        float f = scan.nextFloat();
        System.out.println(f);
        scan.close();





    }
}
