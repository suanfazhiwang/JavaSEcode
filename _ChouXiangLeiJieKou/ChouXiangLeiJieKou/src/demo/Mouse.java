package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 13:39
 */
public class Mouse implements IUSB{
        @Override
        public void openDevice() {
            System.out.println("打开鼠标服务");
        }

        @Override
        public void closeDevice() {
            System.out.println("关闭鼠标服务");

        }
        public void click(){
            System.out.println("点击鼠标！");
        }

}
