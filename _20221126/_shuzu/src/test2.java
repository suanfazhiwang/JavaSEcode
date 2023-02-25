import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-29
 * Time: 14:51
 *
 * 重要   ！！！   二维数组是一个特殊的一维数组
 *
 * 二维数组的三种打印方式
 * 每行的列不同   成为不规则二维数组
 *
 */
public class test2 {
    public static void main(String[] args) {
        int[][] array = new int[2][];//行不能省略   列可以省略
        array[0] = new int[4];
        array[1] = new int[2];
        //这样定义的数组称为不规则数组   每行的列不同
        for (int[] ret:
                array) {
            for (int x:
                    ret) {
                System.out.println(x + " ");
            }
            System.out.println();
        }

//        System.out.println(array[0]);
//        System.out.println(array[1]);

    }

    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(array.length);

        for (int[] ret:
             array) {
            for (int x:
                 ret) {
                System.out.println(x + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));

    }




    public static void reverse(int[] array){//数组倒置
        int left = 0;
        int right = array.length - 1;
        while (left < right){
            int tem  = array[right];
            array[right]  = array[left];
            array[left] = tem;
            left++;
            right--;
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
