package hammingWeight_15;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/15 11:24 下午
 */
public class OfficialSolution {

    @Test
    public void test(){
        System.out.println(hammingWeightWay(0x00000000000000000000000000001011));
    }

    public int hammingWeightWay(int n){
        int count = 0;
        while (n != 0){
            n = (n - 1) & n;
            count++;
        }
        return count;
    }
}
