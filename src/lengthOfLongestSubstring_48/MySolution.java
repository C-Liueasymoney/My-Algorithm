package lengthOfLongestSubstring_48;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/27 9:16 上午
 */
public class MySolution {
    public int lengthOfLongestSubstringWay(String s){
        if (s == null || s.equals(""))
            return 0;
        HashMap<Character, Integer> subStringMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int result = 0;
//        在循环体内改变i的值，进入下一次循环时会进行i++
        for (int i = 0; i < chars.length; i++){
            char ele = chars[i];
            if (!subStringMap.containsKey(ele)){
                subStringMap.put(ele, i);
                result = Math.max(subStringMap.size(), result);
            }else {
//                跳到上一个相同字符的下一位
                i = subStringMap.get(ele);
                subStringMap.clear();
            }
        }
        return result;
    }

    @Test
    public void test(){
        String s = "pwwkew";
        int res = lengthOfLongestSubstringWay(s);
        System.out.println(res);
    }

}
