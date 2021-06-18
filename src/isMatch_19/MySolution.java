package isMatch_19;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/19 10:29 下午
 */
public class MySolution {

    @Test
    public void test(){
        System.out.println(isMatch("ab", ".*"));
    }

    public boolean isMatch(String A, String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] f = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                // 正则表达式为空、字符串为空或非空的情况，
                if (j == 0) {   // 相当于固定正则表达式为空的情况
                    f[i][j] = i == 0;   // 此时字符串也为空，对应位置填入true，否则填入false
                } else {
                    // 正则表达式不为空时，分成当前位为*与非*的情况
                    if (B.charAt(j - 1) != '*') {  // 当前位不为*的情况，分为和字符串位相同，和为.两种情况
                        if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        // 正则表达式当前为*，分为字符串中最后字符不匹配，与匹配两种情况
                        //不匹配
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //匹配
                        if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }
}
