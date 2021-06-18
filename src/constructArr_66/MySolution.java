package constructArr_66;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * 分段处理+动态规划
 * @Author: chong
 * @Data: 2021/6/3 10:16 上午
 */
public class MySolution {
    public int[] constructArr(int[] a){
        if (a.length == 0)
            return new int[0];
        int[] dpC = new int[a.length];
        int[] dpD = new int[a.length];
        int[] b = new int[a.length];
        dpC[0] = 1;
        dpD[dpD.length - 1] = 1;
        for (int i = 1; i < dpC.length; i++){
            dpC[i] = dpC[i - 1] * a[i - 1];
        }
        for (int i = dpD.length - 2; i >= 0; i--){
            dpD[i] = dpD[i + 1] * a[i + 1];
        }

        for (int i = 0; i < a.length; i++){
            b[i] = dpC[i] * dpD[i];
        }
        return b;
    }

    @Test
    public void test(){
        int[] a = {1, 2};
        int[] res = constructArr(a);
        System.out.println(Arrays.toString(res));
    }
}
