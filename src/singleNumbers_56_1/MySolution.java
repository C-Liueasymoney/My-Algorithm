package singleNumbers_56_1;


import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * 使用异或的思想，一个数组中如果其他元素都出现两次，只有一个出现一次，把这个数组依次异或，得到的就是出现一次的元素
 * 所以要把包含两个只出现一次元素的数组分为两个，每个数组包含一个单独出现的数组
 * 就要对大数组依次异或，结果得到两个单独元素的异或，取其中第一次出现1的位置作为第n位
 * 把大数组按照第n位为1或者为0分为两个数组，由于两个单独元素第n位肯定不同就被分在了两个数组，其他相同的元素也会被分在相同的数组
 * @Author: chong
 * @Data: 2021/5/30 10:19 上午
 */
public class MySolution {
    public int[] singleNumbersWay(int[] nums){
//        定义两个返回结果
        int x = 0;
        int y = 0;
//        记录异或结果
        int k = 0;
//        用来寻找异或结果中的1
        int m = 1;

//        1、第一次异或整个数组得到两个单独元素的异或
        for (int num : nums){
            k ^= num;
        }
//        2、左移m找到两个单独元素异或值第一次出现1的位置,000100..相与一个数等于1表示此数此位为1
        while ((m & k) == 0){
            m <<= 1;
        }
//        3、上一步得到的m，可以作为分割nums数组的标准，不必创建辅助数组，直接在原数组中判断即可
        for (int num : nums){
//            分成两种类型的数组，依次对x和y异或
            if ((num & m) == 0)
                x ^= num;
            else
                y ^= num;
        }
        return new int[]{x, y};
    }

    @Test
    public void test(){
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] res = singleNumbersWay(nums);
        System.out.println(Arrays.toString(res));
    }
}
