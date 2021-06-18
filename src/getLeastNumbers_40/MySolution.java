package getLeastNumbers_40;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/21 9:28 上午
 */
public class MySolution {
    public int[] getLeastNumbersWay(int[] nums, int k){
        Arrays.sort(nums);
        return Arrays.copyOfRange(nums, 0, k);
    }

    @Test
    public void test(){
        int[] ints = {3, 2, 1};
        int[] numbersWay = getLeastNumbersWay(ints, 2);
        System.out.println(Arrays.toString(numbersWay));
    }
}
