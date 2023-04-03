package JieKou;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 15:01
 *
 * 接口的拓展  也叫接口的继承
 *
 * 一个类可以继承一个类
 * 一个类可以继承一个抽象类
 * 一个类可以继承一个普通类或者抽象类 同时实现多个接口
 *
 * 接口可以通过extends  拓展多个接口的功能
 */

interface A{
    void run();
}
interface B{
    void swim();
}
//代表C这个接口不仅仅具备func这个功能  还具备了A和B接口的功能
interface C extends A,B{
    void func();
}

class Cc implements C{
    @Override
    public void func() {

    }


    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}

public class Test2 {
}
