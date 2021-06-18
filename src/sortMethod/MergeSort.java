package sortMethod;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/25 12:11 下午
 */
public class MergeSort {
    public int[] sort(int[] a){
        if (a.length < 2)
            return a;

        int middle = (int) Math.floor(a.length / 2);
        int[] left = Arrays.copyOfRange(a, 0, middle);
        int[] right = Arrays.copyOfRange(a, middle, a.length);

        int[] res = merge(sort(left), sort(right));
        return res;
    }

    public int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0){
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            }else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0){
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }


    @Test
    public void test(){
        int[] array = {3, 2, 8, 4, 1, 7, 4, 5, 3, 9};
        int[] sorted = sort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
