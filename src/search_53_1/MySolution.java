package search_53_1;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 8:53 上午
 */
public class MySolution {
    public int searchWay(int[] nums, int target){
        int result = 0;
        if (nums.length == 0)
            return result;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target)
                result++;
            if (nums[i] > target)
                break;
        }
        return result;
    }

    @Test
    public void test(){
        int[] nums = {5,7,7,8,8,10};
        int res = searchWay(nums, 6);
        System.out.println(res);
    }

}
