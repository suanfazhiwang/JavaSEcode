import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-08-05
 * Time: 16:59
 */
import java.util.Scanner;
public class test {
    public static void main1(String[] args) {
        //选择结构  if(布尔表达式)
        int score = 0;
        if(score >= 90){
            System.out.println("优秀");
        }else if(score >= 80 && score < 90){
            System.out.println("良好");
        }else if(score >= 70 && score < 80){
            System.out.println("中等");
        }else if(score >= 60 && score < 70){
            System.out.println("及格");
        }else if(score >= 0 && score < 60){
            System.out.println("不及格");
        }else{
            System.out.println("错误数据");
        }


        int a = 10;

        //以下相当于C语言中的scanf   实际工作中很少使用
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 100 != 0){
            if(year % 4 == 0){
                System.out.println(year+"是闰年");
            }
        }
        else if(year % 400 == 0){
            System.out.println(year+"是闰年");

        }

    }
}
