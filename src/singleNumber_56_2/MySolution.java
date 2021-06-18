package singleNumber_56_2;

import org.junit.Test;

/**
 * @Description:
 * 在nums数组中有出现三次的元素和出现一个一次的元素，那么重复出现的元素转化为二进制每一位相加结果都是3
 * 那么把整个数组按照此方法相加，不为3也不为0的位置就是单独出现的元素二进制为1的位置
 * 让数组每一位对3求余，所得结果就是单独元素1的位置
 * @Author: chong
 * @Data: 2021/5/30 1:51 下午
 */
public class MySolution {
    public int singleNumberWay(int[] nums){
//        创建一个32位数组，保存二进制int类型的每一位
        int[] count = new int[32];
        for (int num : nums){
            for (int i = 0; i < 32; i++){
//                取当前num的最低位加入count数组对应位置
                count[i] += num & 1;
//                无符号右移,把num相应的下一位移到最低位用来取出
                num >>>= 1;
            }
        }

        int result = 0;
//        依次把count中保存的位数%3赋给result的每一位
        for (int i = 0; i < 32; i++){
            result <<= 1;
            result |= count[31 - i] % 3;
        }
        return result;
    }

    @Test
    public void test(){
        int[] nums = {9,1,7,9,7,9,7};
        int res = singleNumberWay(nums);
        System.out.println(res);
    }
}
