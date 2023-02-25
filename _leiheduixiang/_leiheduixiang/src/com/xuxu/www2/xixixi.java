package com.xuxu.www2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-23
 * Time: 14:27
 */
class Show{
    int b = 12;

}
public class xixixi {
    public static void main(String[] args) {
        int a = 11;
        //这个a的权限叫做包访问权限  也就是说只能在当前包使用   见xixi
        Show show = new Show();
        System.out.println(show.b);
    }
}
