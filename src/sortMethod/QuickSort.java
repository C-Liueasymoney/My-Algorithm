package sortMethod;

import java.util.Arrays;

/**
 * @Description:快速排序
 * @Author: chong
 * @Data: 2021/4/8 9:25 下午
 */
public class QuickSort {
    public static int[] quickSort(int[] a){
        int[] arr = Arrays.copyOf(a, a.length);
        return quickSort(a, 0, a.length - 1);
    }

    private static int[] quickSort(int[] a, int low, int high){
        if (low < high){
            int partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
        }
        return a;
    }

    private static int partition(int[] a, int low, int high){
        int left = low;
        int right = high;
        int pivot = a[low];
        while (left < right){
            while (left < right){
                if (a[right] >= pivot)
                    right--;
                else {
                    a[left] = a[right];
                    break;
                };
            }

            while (left < right){
                if (a[left] <= pivot)
                    left++;
                else {
                    a[right] = a[left];
                    break;
                }
            }
        }
        a[left] = pivot;
        return left;
    }


    public static void main(String[] args) {
        int[] array = {5, 9, 1, 9, 5, 3, 7, 6, 1, 32, 23, 42, 1, 57, 2, 6, 4, 67};
        int[] sortedArray = quickSort(array);
        for (int i : sortedArray){
            System.out.print(i + " ");
        }
    }
}
