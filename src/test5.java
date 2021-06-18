import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/9 7:57 下午
 */
public class test5 {
    public int[] quickSort(int[] nums, int low, int high){
        if (low < high){
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
        return nums;
    }

    public int partition(int[] nums, int low, int high){
        int i = low;
        int j = high;
        int pivot = nums[i];
        while (i < j){
            while (i < j) {
                if (nums[j] >= pivot) {
                    j--;
                }else {
                    nums[i] = nums[j];
                    break;
                }
            }

            while (i < j){
                if (nums[i] <= pivot){
                    i++;
                }else {
                    nums[j] = nums[i];
                    break;
                }
            }
        }
        nums[i] = pivot;
        return i;
    }

    @Test
    public void test(){
        int[] array = {5, 9, 1, 9, 5, 3, 7, 6, 1, 32, 23, 42, 1, 57, 2, 6, 4, 67};
        int[] sortedArray = quickSort(array, 0, array.length - 1);
        for (int i : sortedArray){
            System.out.print(i + " ");
        }
    }
}
