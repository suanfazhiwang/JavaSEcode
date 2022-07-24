/**
 * 积累错误的经验。
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-07-23
 * Time: 10:36
 * 调试过程
 * 1.打断点  只需要鼠标左键点到那一行即可  点击小虫子发现一行变蓝代表代码执行到这里还没有向下执行
 * 2.调试按钮   第一个：一步一步走，遇到函数就跳过
 *            第二个：遇到函数，可以进入函数内部执行
 *            第三个：现在学习过程中和第二个是一样的
 *            第四个：跳出 在函数中直接跳出来  用的不多
 *
 */

public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i = 0; i < 10; i++) {
            System.out.println("abcd");
        }
        int a = 10_0000;
        System.out.println(a);
        System.out.println(a);/*a.sout*/
        /*块注释：ctrl+shift+/*/
        /*取消块注释：同上*/
//        行注释：ctrl+/
//        取消行注释：同上

//        文档注释：/**


    }
}
