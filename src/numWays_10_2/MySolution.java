package numWays_10_2;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/12 11:21 下午
 */
public class MySolution {
    /*
    很容易看出在n=1和n=2时分别有1和2种跳法，在n>2时将问题分解，把跳法记做函数f(n)
    如果此时第一次选择向上跳一层台阶，此时的跳法就是n-1级台阶时的跳法，也就是f(n-1)
    如果此时第一次选择向上跳两层台阶，此时的跳法就是n-2级台阶时的跳法，也就是f(n-2)
    于是问题转化为斐波那契数列
     */

    //递归方法，耗费太大不好

    @Test
    public void test1(){
        System.out.println(numWays1(7));
    }

    public int numWays1(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        return (numWays1(n - 1) + numWays1(n - 2)) % 1000000007;
    }

    @Test
    public void test2(){
        System.out.println(numWays2(48));
    }

    public int numWays2(int n){
        int a = 1;
        int b = 1;
        int sum;
        if (n == 0) return 1;
        if (n == 1) return 1;

        for (int i = 2; i <= n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}
