import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-14
 * Time: 10:04
 * java比较字符串的函数   equals（）   见login方法
 *
 * 递归  把原问题分解为小问题，小问题的解决方式和大问题的解决方式是一样的
 * 1. 自己调用自己
 * 2. 有一个终止条件（起始条件）
 * 3. 最难的地方就是如何确定这个递归公式！！！
 * 循环写和递归写有什么区别？
 * 递归的好处是：代码少  不好的地方：不好书写
 * 循环的好处是   容易理解
 * 递归浪费的空间比较多
 *
 */
public class test {
    public static int fibnacio(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibnacio(n-1) + fibnacio(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibnacio(1));
        System.out.println(fibnacio(2));
        System.out.println(fibnacio(3));
        System.out.println(fibnacio(40));


    }
    public static int func5(int n){
        if(n<=9){
            return n;
        }
        return n % 10 + func5(n/10);
    }
    public static void func4(int n){
        if(n <= 9){
            System.out.println(n);
            return;
        }
        func4(n/10);
        System.out.println(n % 10);

    }
    public static int fac(int n){
        if (n == 1){
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }

    public static void main2(String[] args) {
//        System.out.println(fac(5));
        func4(1234);
        int i = 1234;

        for (int j = 1; j < 5; j++) {
            for (int k = 3; k >= j; k--) {
                i /= 10;

            }
            System.out.println(i%10);
            i = 1234;
        }



    }
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
        double sum = func();
        System.out.println(sum);
        func2(123);
        login();
        max3(1,2,3);
        fib(15);
    }
}
