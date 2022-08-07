import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-08-05
 * Time: 16:59
 * 可读性高  良好的编程习惯
 * 1. 注释   2. 命名规则的遵守   3.
 */
import java.util.Scanner;
public class test {
    public static void main1(String[] args) {
        //选择结构  if(布尔表达式)
        int score = 0;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 70 && score < 80) {
            System.out.println("中等");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("错误数据");
        }


        int a = 10;

        //以下相当于C语言中的scanf   实际工作中很少使用
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println(year + "是闰年");
            }
        } else if (year % 400 == 0) {
            System.out.println(year + "是闰年");

        }

    }

    public static void main3(String[] args) {
        int scont = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 9) {
                scont++;
            } else if (i / 10 == 9) {
                scont++;
            }
        }
        System.out.println(scont);

    }

    public static void main4(String[] args) {
//        char, byte, short, int, Character, Byte, Short, Integer, String, or an enum   只有这些才能做switch的参数
/*        多个case后的常量值不可以重复
        switch的括号内只能是以下类型的表达式：
        基本类型：byte、char、short、int，注意不能是long类型
        引用类型：String常量串、枚举类型
        break 不要遗漏, 否则会失去 "多分支选择" 的效果
        switch 不能表达复杂的条件
        switch 虽然支持嵌套, 但是很丑，一般不推荐
        */
        int a = 2;
        switch (a) {
            case 1:
                System.out.println(111);
                break;
            case 2:
                System.out.println(222);
                break;
            default:
                System.out.println("无");
                break;
        }
    }

    public static void main5(String[] args) {
        int i = 1;//循环变量的初始条件
        while (i <= 10)//循环的判断条件   布尔表达式
        {
            System.out.println(i);
            i++;//循环的步进
        }
    }

    public static void main6(String[] args) {
        int i = 0;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum2 += i;
            } else {
                sum1 += i;
            }
            sum += i;
            i++;
        }

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

    }

    public static void main7(String[] args) {
        int i = 1;
        int ret = 1;
        int count = 0;
        while (i <= 5) {
            ret *= i;
            count += ret;
            i++;
        }
        System.out.println(count);
        System.out.println(ret);
    }

    public static void main8(String[] args) {
        int a = 10;
        while (a >= 0) {
            if (a == 9) {
                break;//结束所有循环
            }
            a--;
        }
    }

    public static void main9(String[] args) {
        int a = 10;
        while (a >= 0) {
            if (a == 9) {
                continue;//结束本趟循环
            }
            a--;
        }
    }

    public static void main10(String[] args) {
        int i = 1;
        for (i = 0; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            } else if (i % 5 != 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main11(String[] args) {
        int ret = 1;
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            ret *= i;
            count += ret;
        }
        System.out.println(count);
        System.out.println(ret);
    }

    public static void main12(String[] args) {
        System.out.println(10);//输出并且换行
        System.out.print("不换行");//输出但是不换行
        System.out.printf("%s", "这是格式化输出   很像C语言printf");
    }

    public static void main13(String[] args) {
        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("输入你的年龄");
        int age = scan.nextInt();
        System.out.println("年龄" + age);
        scan.nextLine();//因为nextline会读取一整行的东西所以这里在加一个用来读取上次输入时的空格
        System.out.println("请输入你的姓名");
        String name = scan.nextLine();
        System.out.println("姓名" + name);
        //但是如果上一个读取就是nextline的话就不需要那行代码
        System.out.println("你家在哪");
        String home = scan.nextLine();
        System.out.println("你家在" + home);

        scan.close();//用完记得关闭

    }

    public static void main14(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt())//循环输入int   输入一次处理一次    ctrl+d结束循环
        {
            System.out.println("输入你的年龄");
            int age = scan.nextInt();
            System.out.println("年龄" + age);
        }
        while (scan.hasNextLine())//循环输入字符串
        {
            System.out.println("请输入你的姓名");
            String name = scan.nextLine();
            System.out.println("姓名" + name);
        }
        //在cmd命令行窗口，结束的时候使用  ctrl+z   idea上是ctrl+d

    }

    public static void main15(String[] args) {
        //java中如何生成一个简单的随机数
        Random random = new Random();//根据时间生成随机数
        //  Random random = new Random(132);//根据132生成随机数   发现生成的随机数都是一样的
        int n = random.nextInt(100);   //生成大于等于0小于100的整数
        int i = random.nextInt(50) + 50;//大于等于50小于100

        //Math.random();  学习这个如何让胜场随机数
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);   //生成大于等于0小于101的整数
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt())//循环输入int   输入一次处理一次    ctrl+d结束循环
        {
            System.out.println("输入你猜的数字");
            int num = scan.nextInt();
            if (num > n) {
                System.out.println("你猜大了");
            } else if (num < n) {
                System.out.println("你猜小了");
            } else {
                System.out.println("你猜对了");
                break;
            }


        }
    }
}



