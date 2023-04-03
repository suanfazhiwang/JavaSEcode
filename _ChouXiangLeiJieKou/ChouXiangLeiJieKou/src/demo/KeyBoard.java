package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 13:39
 */
public class KeyBoard implements IUSB{
    public void openDevice() {
        System.out.println("打开键盘服务");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘服务");

    }
    public void inPut(){
        System.out.println("敲击键盘！");
    }
}
