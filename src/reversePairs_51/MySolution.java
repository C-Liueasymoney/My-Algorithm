package reversePairs_51;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/28 7:55 上午
 */
public class MySolution {
//    辅助数组
    private int[] aux;
//    返回结果
    private int result;
    public int reversePairsWay(int[] nums){
        aux = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return result;
    }

    public void mergeSort(int[] nums, int low, int high){
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        mergeSort(nums, low, middle);
        mergeSort(nums, middle + 1, high);
        merge(nums, low, middle, high);
    }
//  以上部分与归并排序完全相同


    public void merge(int[] nums, int low, int middle, int high){
//        这里由于要求指针从后往前移动，所以这样初始化左右子数组的指针
        int i = middle;
        int j = high;
//        给辅助数组赋值
        for (int k = low; k <= high; k++){
            aux[k] = nums[k];
        }

//        从数组的高位开始填入
        for (int k = high; k >= low; k--){
//            左数组添加完毕
            if (i < low)
                nums[k] = aux[j--];
//            右数组添加完毕
            else if (j < middle + 1)
                nums[k] = aux[i--];
//            左数组指针位置比右数组指针位置大
            else if (aux[i] > aux[j]) {
//                关键：左比右大，说明存在逆序对，而存在几个就是j - middle个，因为右子数组中在aux[j]左边的都小于等于它，
//                所以这些元素都和aux[i]构成逆序对
                result += (j - middle);
//                把更大的元素放在数组末尾
                nums[k] = aux[i--];
            }
            else
                nums[k] = aux[j--];
        }
    }

    @Test
    public void test(){
        int[] nums = {4, 5, 6, 7};
        int res = reversePairsWay(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
