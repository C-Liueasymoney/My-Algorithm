package printNumbers_17;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/17 11:55 下午
 */
public class MySolution {

    @Test
    public void test(){
        System.out.println(Arrays.toString(printNumbers(2)));
    }

    public int[] printNumbers(int n){
        int len = (int) Math.pow(10.0, n) - 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = i + 1;
        }
        return arr;
    }
}
