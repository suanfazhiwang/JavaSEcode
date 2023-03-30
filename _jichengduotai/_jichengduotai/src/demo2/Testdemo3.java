package demo2;

import demo1.Testdemo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-23
 * Time: 9:30
 */
public class Testdemo3 extends Testdemo1 {
    public void func(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Testdemo3 testdemo3 = new Testdemo3();
        testdemo3.func();

    }
}
