import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 15:40
 */
public class Main extends Object{
    public static String login1(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
    //返回值向上转型
    public static User login2(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的身份:1->管理员   0->普通用户");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return new AdminUser(name);

            case 0:
                return new NormalUser(name);
            default:
                System.out.println("输入有误请重新输入");
                return login2(name);


        }

    }
    public static void main(String[] args) {
        User user = login2(login1());
        BookList bookList = new BookList();
        while(true) {
            int choice = user.menu();

            //根据choice和user来确定我到底调用哪个对象的哪个操作
            user.doWork(choice, bookList);
        }
    }
}
