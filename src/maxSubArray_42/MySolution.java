package maxSubArray_42;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/22 10:19 上午
 */
public class MySolution {
    public int maxSubArrayWay(int[] nums){
        int subSum = 0;
        int sumMaxSum = nums[0];

        for (int num : nums){
            subSum += num;
            if (subSum < num)
                subSum = num;
            if (sumMaxSum < subSum)
                sumMaxSum = subSum;
        }
        return sumMaxSum;
    }

    @Test
    public void test(){
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArrayWay(a);
        System.out.println(res);
    }
}
