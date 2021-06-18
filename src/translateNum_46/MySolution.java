package translateNum_46;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/25 9:08 下午
 */
public class MySolution {
    public int translateNumWay(int num){
        String nums = String.valueOf(num);
        int[] dp = new int[nums.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= nums.length(); i++){
            String substring = nums.substring(i - 2, i);
            if (substring.compareTo("10") >= 0 && substring.compareTo("25") <= 0){
                dp[i] = dp[i - 1] + dp[i - 2];
            }else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[nums.length()];
    }

    @Test
    public void test(){
        int res = translateNumWay(25);
        System.out.println(res);
    }
}
