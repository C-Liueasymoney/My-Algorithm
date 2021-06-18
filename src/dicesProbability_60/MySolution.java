package dicesProbability_60;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/1 9:12 上午
 */
public class MySolution {
    public double[] dicesProbabilityWay(int n){
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for (int i = 2; i <= n; i++){
            double[] temp = new double[(5 * i) + 1];
            for (int j = 0; j < dp.length; j++){
                for (int k = 0; k < 6; k++){
                    temp[j + k] += dp[j] / 6.0;
                }
            }
            dp = temp;
        }
        return dp;
    }

    @Test
    public void test(){
        double[] res = dicesProbabilityWay(3);
        System.out.println(Arrays.toString(res));
    }
}
