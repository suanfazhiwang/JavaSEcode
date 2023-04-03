package demo3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-03-31
 * Time: 15:29
 *
 * at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
 *
 * if (((Comparable) a[runHi++]).compareTo(a[lo]) < 0) { // Descending
 *             while (runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) < 0)
 *                 runHi++;
 *             reverseRange(a, lo, runHi);
 *         } else {                              // Ascending
 *             while (runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) >= 0)
 *                 runHi++;
 *         }
 *
 *         return runHi - lo;
 *     }
 * 取到数组的某一个值  把这个值转化为了一个Comparable 接口类型
 *
 *
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
        if (this.age > o.age){
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }else {
            return 0;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",18,99);
        students[0] = new Student("lisi",16,90);
        students[0] = new Student("wangwu",12,95);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
        System.out.println(students[0].compareTo(students[1]));



    }

    public static void main1(String[] args) {//数组排序
        int[] array = {1,4,2,10,5,3,7,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
