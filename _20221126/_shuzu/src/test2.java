import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-29
 * Time: 14:51
 */
public class test2 {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
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
