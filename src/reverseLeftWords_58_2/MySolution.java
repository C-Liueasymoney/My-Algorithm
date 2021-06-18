package reverseLeftWords_58_2;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/31 11:02 上午
 */
public class MySolution {
    public String reverseLeftWordsWay(String s, int n){
        return s.substring(n) + s.substring(0, n);
    }

    @Test
    public void test(){
        String s = "lrloseumgh";
        String s1 = reverseLeftWordsWay(s, 6);
        System.out.println(s1);
    }
}
