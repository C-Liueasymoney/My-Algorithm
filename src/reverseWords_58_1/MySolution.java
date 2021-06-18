package reverseWords_58_1;

import org.junit.Test;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/31 10:16 上午
 */
public class MySolution {
    public String reverseWordsWay(String s){
        s = s.trim();
        String[] split = s.split(" +");
        StringBuilder result = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--){
            result.append(split[i]);
            if (i != 0)
                result.append(" ");
        }
        return result.toString();
    }


    @Test
    public void test(){
        String s = "a good   example";
        String res = reverseWordsWay(s);
        System.out.println(res);
    }
}
