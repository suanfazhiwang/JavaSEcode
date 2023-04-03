package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 13:42
 */
public class Computer {
    public void open(){
        System.out.println("打开电脑");

    }
    public void close(){
        System.out.println("关机");
    }
    //所有usb设备是不是在电脑上都可以使用呢

    //站在这个角度  我不关心usb这个引用 引用了哪个对象  只要你实现了这个接口的规范就可以
    //这时多态  帮你省略了代码  同时还融入了设计的思想  你的代码忽然变得高大上
    public void useDevice(IUSB usb) {
        usb.openDevice();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.inPut();
        }
        usb.closeDevice();
    }
    
}
