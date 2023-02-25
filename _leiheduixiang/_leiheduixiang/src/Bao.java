/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-02-24
 * Time: 11:42
 */

class Stu{
    private int age;
    private String name;

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }


    //以下代码可以在private的情况下对类里的数据进行修改
    public void setName (String name){
        this.name = name;
    }
    //可以通过右键然后generate 然后 geter and sette得到

    public void show (){
        System.out.println(this.age + this.name);
    }



}
public class Bao {
    public static void main(String[] args) {
        Stu stu = new Stu(19,"zhangsan");
        stu.show();

        stu.setName("lisi");
        stu.show();
    }


}
