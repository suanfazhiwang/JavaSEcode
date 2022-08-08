import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-08-07
 * Time: 11:14
 */
public class test {
    public static void main1(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入一个整数：");
        int num = scanner.nextInt();
        int count = 0;

        while (num != 0) {

            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;

        }
        System.out.println("一共有"+count+"个1");*/
        //再写一种
        int n = 6;
        int count = 0;
        while (n != 0){    //数字有几个一就会这样几次   记住吧
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);

    }

    public static void main2(String[] args) {
        double sum = 0.0;
        int flg = 1;
        for (int i = 0; i <= 100; i++) {
            sum = sum + 1.0 / i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {

        for (int i = 1; i < 999999; i++) {
            int num = 0;
            int tmp = i;
            int count = 0;
            int sum = 0;
            while (tmp != 0) {
                tmp = tmp / 10;
                count++;
            }
            tmp = i;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);//求次幂的函数返回值是double
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int a = num-1;

            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= a; j++) {
                    if (i == j || i + j == a){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d",j,i,i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tem = n;
        while (tem != 0){
            System.out.println(tem%10);
            tem /= 10;
        }
    }

    public static void main7(String[] args) {
        int key = 123456;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if (n == key){
                System.out.println("登录成功");
                break;
            } else if (i == 0 || i == 1) {
                System.out.println("密码错误请重新输入");
            }else {
                System.out.println("密码错误退出程序");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     //用户输入的整数

        System.out.print("奇数位:");

        for (int i = 31; i >= 1; i-=2) {
            System.out.print(num>>i&1);  //通过位运算：右移，然后与1，可得到该位的值
        }

        System.out.print("偶数位:");

        for (int i = 30; i >=0 ; i-=2) {
            System.out.print(num>>i&1);
        }

    }
}
































