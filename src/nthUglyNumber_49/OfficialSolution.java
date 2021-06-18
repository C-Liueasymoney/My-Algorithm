package nthUglyNumber_49;


import org.junit.Test;

/**
 * @Description:
 * 三指针方法，就是要把丑数中每个元素都用2/3/5这三个因子乘一遍，
 * 一个元素乘到了相应的因子就把对应因子的指针后移，意思是不要再乘它了
 * 其中每次对结果取最小值是为了保证丑数数组有序
 * @Author: chong
 * @Data: 2021/5/27 2:42 下午
 */
public class OfficialSolution {
    public int nthUglyNumberWay(int n){
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++){
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;
        }
        return dp[n - 1];
    }

    @Test
    public void test(){
        int res = nthUglyNumberWay(10);
        System.out.println(res);
    }
}
