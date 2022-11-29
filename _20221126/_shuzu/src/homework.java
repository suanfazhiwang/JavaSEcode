import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2022-11-29
 * Time: 14:51
 *
 * Arrays.binarySearch(array,3)   二分查找
 *
 *  用于计算时间
 *  long start = System.currentTimeMillis();
 *  long end = System.currentTimeMillis();
 *  System.out.println(end - start);
 *
 */
public class homework {
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    public static int findMoreNum(int[] array) {
        int count = 0;
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] == tmp){
                count++;
            } else {
                count--;
            }
            if (count == 0){
                tmp = array[i];
                count++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] array = {6,5,5};
        System.out.println(findMoreNum(array));
    }





    //给定 一个整数数组  nums和一个 整数目标值target  请你在数组中找出和为目标值的那两个整数  并返回数组下标
    public static int[] findTarget(int[] array,int target){
        int[] ret = {-1,-1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if(array[i] + array[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static int findNum(int[] array){
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }

    public static void main2(String[] args) {
        int[] array = {1,10,3,4,5};
        int[] array2 = {10,10,3,3,6,6,5};
        System.out.println(Arrays.toString(findTarget(array,13)));
        System.out.println(findNum(array2));
    }


    public static void buling(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int a = 0;
            for (int j = 0; j < array.length-i-1; j++) {
                int tem = j;
                if (array[tem] >= array[tem+1]){
                    int key = array[tem];
                    array[tem] = array[tem + 1];
                    array[tem+1] = key;
                    a+=1;
                }
            }
            if (a == 0){
                break;
            }
        }
    }
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int mid = (left+right) / 2;
            if(array[mid] < key){
                left = mid + 1;
            } else if (array[mid]>key) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;

    }
    public static void func(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            while (left<right && array[left] % 2 != 0){
                left++;
            }
            while (left<right && array[right] % 2 == 0){
                right--;

            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
    public static void main1(String[] args) {
        int[] array = {2,3,6,9,5,4,2,4,8,7,5,3};
//        func(array);
//        System.out.println(Arrays.toString(array));
        long start = System.currentTimeMillis();

        buling(array);
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(array));
        System.out.println(end - start);
//        Arrays.sort(array);
//        System.out.println(binarySearch(array,3));
//        System.out.println(Arrays.binarySearch(array,3));
    }
}
