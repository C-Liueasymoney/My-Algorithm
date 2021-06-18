package twoSum_57;


import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/30 8:29 下午
 */
public class MySolution {
    public int[] towSumWay(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int middle = (low + high) / 2;
            if (nums[middle] > target)
                high = middle - 1;
            else
                low = middle + 1;
        }
        if (nums[low] > target)
            low--;
        int j = low;
        for (int i = 0; i < j;){
            if (nums[i] + nums[j] == target)
                return new int[]{nums[i], nums[j]};
            else if (nums[i] + nums[j] < target)
                i++;
            else
                j--;
        }
        return null;
    }

    @Test
    public void test(){
        int[] nums = {10,26,30,31,47,60};
        int[] ints = towSumWay(nums, 40);
        System.out.println(Arrays.toString(ints));
    }
}
