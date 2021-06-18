package isStraight_61;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/1 1:36 下午
 */
public class MySolution {
    public boolean isStraightWay(int[] nums){
        Arrays.sort(nums);
        int zero = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == 0)
                zero++;
            else {
                if (nums[i + 1] - nums[i] > 1)
                    zero -= nums[i + 1] - nums[i] - 1;
                if (nums[i + 1] - nums[i] == 0)
                    return false;
            }
        }

        return zero >= 0;
    }

    @Test
    public void test(){
        int[] nums = {0, 0, 2, 2, 5};
        boolean straightWay = isStraightWay(nums);
        System.out.println(straightWay);
    }
}
