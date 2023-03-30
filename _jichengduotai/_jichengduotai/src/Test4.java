/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-23
 * Time: 19:53
 */

class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class Test4 {
    public static void swap(MyValue myV1,MyValue myV2){
        int tmp = myV1.getVal();
        myV1.setVal(myV2.getVal());
        myV2.setVal(tmp);
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.setVal(10);

        MyValue myValue2 = new MyValue();
        myValue2.setVal(20);

        swap(myValue1,myValue2);

        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
}
