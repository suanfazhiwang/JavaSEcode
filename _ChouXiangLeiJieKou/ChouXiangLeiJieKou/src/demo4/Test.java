package demo4;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 9:48
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if (this.age > o.age){
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        }else {
//            return 0;
//        }
        return this.age - o.age;
    }


}

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",13,55);
        students[1] = new Student("lisi",16,60);
        students[2] = new Student("wangwu",14,59);
//        System.out.println(students[0].compareTo(students[1]));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }
}
