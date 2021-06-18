package firstUniqChar_50;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/27 5:11 下午
 */
public class MySolution {
    public char firstUniqCharWay(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if (!map.containsKey(temp)){
                map.put(temp, 1);
            }else {
                map.put(temp, map.get(temp) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return ' ';
    }

    @Test
    public void test(){
//        HashMap<String, Integer> map1 = new HashMap<>();
//        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
//        for (int i = 0; i < 100; i++){
//            map1.put("key" + i, i);
//        }
//        for (Map.Entry entry : map1.entrySet()){
//            System.out.println(entry.getKey());
//        }
        String str = "";
        char res = firstUniqCharWay(str);
        System.out.println(res);
    }
}
