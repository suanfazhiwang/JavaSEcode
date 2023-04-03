package demo6;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
  * User: 22260
 * Date: 2023-04-03
 * Time: 10:34
 *
 * 空接口  也表示为 标记接口：作用就是表示当前对象是可以被克隆的
 * Object是所有类的父类
 * 深拷贝和浅拷贝的区别  浅拷贝完成后  改变拷贝的对象会同时改变被拷贝的对象  深拷贝完成后  改变拷贝的对象不会改变被拷贝的对象
 * 深浅拷贝和方法没有关系  和代码的书写方式有关系
 *
 * 1.可以对自定义类型进行拷贝
 *
 */
class Money implements Cloneable{
    public double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable{
    public String name;
    public Money m = new Money();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 只是克隆了Student对象
        Student student = (Student) super.clone();
        //克隆了Student对象里面的Money对象
        student.m = (Money) this.m.clone();
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    //hashCode这个方法对于我们现在来说是用不上的 hashMap的时候才用得上
    //先理解为  算一个对象的位置
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "zhangsan";
        student2.name = "zhangsan";

        //我们希望把这两个对象放在同一个位置去
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());


        System.out.println(student1.equals(student2));

    }
    public static void main2(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student();


        Student student2 = (Student) student1.clone();
        System.out.println(student1.m.money);
        System.out.println(student2.m.money);
        student2.m.money = 99;
        System.out.println(student1.m.money);
        System.out.println(student2.m.money);
    }

    public static void main1(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student();
        Student student3 = (Student) student1.clone();
        student1.name = "zhangsan";
        Student student2 = (Student) student1.clone();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
