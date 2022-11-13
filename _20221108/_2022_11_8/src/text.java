import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-08
 * Time: 10:38
 */
public class text {
    public static void main(String[] args) {
        double count = 0;
        for (int i = 1; i < 101; i++) {
            if (i%2 == 0) {
                count -= 1.0 / i;
            }
            else {
                count += 1.0 / i;
            }
        }
        System.out.println(count);

    }
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0){
                break;
            }
            if (i == n/2-1){
                System.out.println("是素数");
            }
        }
    }
    public static void main7(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if ((i % 100 != 0) && (i % 4 == 0)){
                System.out.println(i + "是闰年");
            } else if (i % 400 == 0) {
                System.out.println(i + "是闰年");


            }
        }
    }
    public static void main6(String[] args) {
        for (int i = 0; i < 101; i++) {
            if(i % 10 == 9){
                System.out.println(i);
            } else if (i / 10 == 9) {
                System.out.println(i);

            }

        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 1; i-=2) {
            System.out.println("偶数" + ((n >> i) & 1));
        }
        System.out.println();
        for (int i = 30; i >= 0; i-=2) {
            System.out.println("奇数" + ((n >> i) & 1));
        }

    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            if ( ((n >>> i) & 1) != 0 ){
//                count++;
//            }
//            if (n == 0){
//                break;
//            }
//
//        }   常规

        //发现一个数与与一下自身减一就会少一个1
        while (n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int tmp = i;
            while(tmp != 0){
                count++;
                tmp = tmp/10;
            }
            tmp = i;
            int sum = 0;

            while (tmp != 0){
                sum += Math.pow(tmp % 10,count);
                tmp /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = scanner.nextInt();
        int c = a % b;
        while(c != 0){
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    //求素数
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i =2;
//        for (int j = 1; j <= n; j++) {
//            int i = 2;

            //这里是java开根号的操作
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {

                    break;
                }
            }
            if (i > Math.sqrt(n)){
                System.out.println(n + "是素数!");
//            }
        }
    }
}
