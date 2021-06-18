package hammingWeight_15;

import org.junit.Test;

import java.util.logging.Handler;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/15 3:35 下午
 */
public class MySolution {

    @Test
    public void test1(){
        System.out.println(hammingWeightWay(0x00000000000000000000000000001011));
    }

    public int hammingWeightWay(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    @Test
    public void test2(){
        System.out.println(hammingWeightWay2(0x00000000000000000000000000001011));
    }

    //有符号类型
    public int hammingWeightWay2(int n){
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0)
                count++;
            flag = flag << 1;
        }
        return count;
    }
}
