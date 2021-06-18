package majorityElement_39;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/17 8:31 下午
 */
public class MySolution {
    public int majorityElementWay(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int res = 0;
        for (int i = 0; i < length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > (length / 2)){
                res = nums[i];
                return res;
            }
        }
        return res;
    }


    @Test
    public void test(){
        int[] ints = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int r = majorityElementWay(ints);
        System.out.println(r);
    }
}
