package fib_10_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/12 5:20 下午
 */
public class MySolution {
    @Test
    public void test(){
        System.out.println(fibWay(45));
    }

    public int fibWay(int n){
        int[] res = new int[]{0, 1};
        if (n < 2){
            return res[n];
        }
        for (int i = 2; i <= n; i++){
            int temp = res[0] + res[1];
            res[0] = res[1];
            res[1] = temp;
        }
        if (res[1] > 1E9 + 7){
            return (int) (res[1] % (1E9 + 7));
        }
        return res[1];
    }
}
