package 匿名内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-12
 * Time: 9:55
 */
interface IA{
    void func();
}
class AA implements IA{
    @Override
    public void func() {
        System.out.println("ssssss");
    }
}


public class Test {
    public static void main(String[] args) {
        //类实现了接口   同时重写了方法
        IA ia = new IA(){
            @Override
            public void func() {
                System.out.println("aaaaaa");
            }
        };
        ia.func();

    }
}
