package missingNumber_53_2;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 9:26 上午
 */
public class MySolution {
    public int missingNumberWay(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
//            看middle处的元素是否与当前数组下标相等，相等说明缺失元素在右边，不相等说明在左边
//            因为数组元素既然是有序的，那么如果还没发生缺失，数据下标大小必定对应数组上的值
            if (nums[middle] == middle)
                left = middle + 1;
            else
                right = middle - 1;
        }
//        最后结束循环时left的数值就是缺失元素的数值
        return left;
    }

    @Test
    public void test(){
        int[] nums = {0};
        int res = missingNumberWay(nums);
        System.out.println(res);
    }
}
