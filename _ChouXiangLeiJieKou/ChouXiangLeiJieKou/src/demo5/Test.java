package demo5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 10:13
 *
 *
 *
 * 比较灵活的比较器
 */
class Student1{
    public String name;
    public int age;
    public int score;

    public Student1(String name, int age, int score) {
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
}
class AgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.age - o2.age;
    }
}

class ScoreComparator implements Comparator<Student1>{


    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.score - o2.score;
    }
}

class NameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student1[] students = new Student1[3];
        students[0] = new Student1("zhangsan",13,55);
        students[1] = new Student1("lisi",16,20);
        students[2] = new Student1("wangwu",14,59);

        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();

//        System.out.println(students[0].compareTo(students[1]));
        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students,scoreComparator);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
    }
}
