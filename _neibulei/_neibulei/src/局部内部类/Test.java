package 局部内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-12
 * Time: 9:45
 * 局部内部类只能在该方法内部使用  其他位置不能用
 * 说实话用的是真的少
 *
 */

class OuterClass{
    public void func(){
        class InnerClass{
            public int a = 1;
            public void test(){
                System.out.println("ssssss");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.test();

    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.func();
    }
}
