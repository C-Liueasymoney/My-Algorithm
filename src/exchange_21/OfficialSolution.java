package exchange_21;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/20 10:35 下午
 */
public class OfficialSolution {

    @Test
    public void test(){
        int[] ints = exchangeWay(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public int[] exchangeWay(int[] nums){
        for (int i = 0, j = 1; i < nums.length && j < nums.length; j++){
            if ((nums[i] & 1) == 1)
                i++;
            if ((nums[j] & 1) == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
