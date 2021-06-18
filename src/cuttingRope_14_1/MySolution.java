package cuttingRope_14_1;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/15 2:52 下午
 */
public class MySolution {

    @Test
    public void test(){
        System.out.println(cuttingRopeWay(10));
    }

    //动态规划
    public int cuttingRopeWay(int n){
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int[] products = new int[n + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;

        int max = 0;
        for (int i = 4; i <= n; i++){
            max = 0;
            for (int j = 1; j <= i / 2; j++){
                int product = products[j] * products[i - j];
                if (max < product)
                    max = product;
                products[i] = max;
            }
        }

        max = products[n];
        return max;
    }


    @Test
    public void test2(){
        System.out.println(cuttingRopeWay2(10));
    }

    //贪婪算法(没看懂)
    public int cuttingRopeWay2(int n){
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int times3 = n / 3;
        if (n - times3 * 3 == 1)
            times3 -= 1;
        int times2 = (n - times3 * 3) / 2;
        return (int) Math.pow(3, times3) * (int) (Math.pow(2, times2));
    }
}
