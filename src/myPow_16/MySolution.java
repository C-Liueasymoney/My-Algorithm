package myPow_16;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/17 10:29 下午
 */
public class MySolution {

    @Test
    public void test(){
        System.out.println(myPowWay(2.10000, 3));
    }

    //超时的方法
    public double myPowWay(double x, int n){
        double res = 1.0;
        if (n > 0){
            for (int i = 0; i < n; i++){
                res *= x;
            }
        }else if (n == 0){
            return res;
        }else if (n < 0){
            for (int i = 0; i < -n; i++){
                res *= (1 / x);
            }
        }
        return res;
    }
}
