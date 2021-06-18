package exchange_21;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/20 10:15 下午
 */
public class MySolution {


    public int[] exchangeWay(int[] nums){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                list2.add(nums[i]);
            }else if (nums[i] % 2 == 1){
                list1.add(nums[i]);
            }
        }
        list1.addAll(list2);
        int[] res = new int[list1.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = list1.get(i);
        }
        return res;
    }
}
