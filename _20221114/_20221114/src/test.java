import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-14
 * Time: 10:04
 * java比较字符串的函数   equals（）   见login方法
 */
public class test {

    public static void fib(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }

    }

    public static int max2(int a,int b){
        return (a > b ? a : b);

    }
    public static int max3(int a ,int b ,int c){
        int tmp = max2(a,b);
        return max2(tmp,c);
    }


    public static void login(){
        int count = 3;
        Scanner scanner = new Scanner(System.in);
        while (count !=0){
            System.out.println("请输入你的密码");
            String passWord = scanner.nextLine();
            if(passWord.equals("123456")){
                System.out.println("登陆成功");
                break;
            }else {
                count--;
                System.out.println("你还有" + count + "次机会");
            }
        }
    }

    public static void func2(int n){
        while (n != 0){
            System.out.println(n % 10);
            n = n / 10;
        }
    }

    public static double func(){
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + (1.0 / i) * flg;
            flg = -flg;
        }
        return sum;
    }

    public static void main1(String[] args) {
//        double sum = func();
//        System.out.println(sum);
//        func2(123);
//        login();
//        max3(1,2,3);
        fib(15);
    }
}
