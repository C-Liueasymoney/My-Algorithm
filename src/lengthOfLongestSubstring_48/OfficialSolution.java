package lengthOfLongestSubstring_48;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Description:
 * 1、状态定义：dp[i]代表以s[i]结尾的最大子字符串的长度
 * 2、转移方程：（1）当前方无与s[i]相同的字符时，dp[i]=dp[i-1]+1
 * （2）当前方有与s[i]相同的字符s[j]时，还要分为两种情况：
 * 1_ i-j<=dp[i-1]的情况下，说明s[i-1]的最大子字符串中间没有其他相同的字符，可以直接用，则dp[i]=i-j
 * 2_ i-j>dp[i-1]的情况下，说明s[j]到s[i]之间还有相同的字符，则dp[i]=dp[i-1]+1
 *
 * 3、输出：dp中最大值
 * @Author: chong
 * @Data: 2021/5/27 9:43 上午
 */
public class OfficialSolution {
    public int lengthOfLongestSubstringWay(String s){
        if (s.length() <= 1)
            return s.length();
        HashMap<Character, Integer> subStringMap = new HashMap<>();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int res = 1;
        subStringMap.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++){
            char ele = s.charAt(i);
            if (!subStringMap.containsKey(ele)){
                subStringMap.put(ele, i);
                dp[i] = dp[i - 1] + 1;
            }else {
                int j = subStringMap.get(ele);
//                更新map到最近的相同字符
                subStringMap.put(ele, i);
                if (i - j <= dp[i - 1]){
                    dp[i] = i - j;
                }else {
                    dp[i] = dp[i - 1] + 1;
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    @Test
    public void test(){
        String s = "aab";
        int res = lengthOfLongestSubstringWay(s);
        System.out.println(res);
    }
}
