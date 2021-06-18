package reverseWords_58_1;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/31 10:49 上午
 */
public class OfficialSolution {
    public String reverseWordsWay(String s){
        s = s.trim();
        StringBuilder result = new StringBuilder();
//        定义尾指针
        int j = s.length() - 1;
//        定义首指针
        int i = j;
        while (i >= 0){
//            寻找第一个空格出现的位置
            while (i >= 0 && s.charAt(i) != ' ')
                i--;
//            添加单词
            result.append(s.substring(i + 1, j + 1) + " ");
//            跳过单词中间的所有空格
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
//            把单词的尾部赋给j
            j = i;
        }
//        要去掉尾部多余的空格
        return result.toString().trim();
    }

    @Test
    public void test(){
        String s = "a good   example";
        String res = reverseWordsWay(s);
        System.out.println(res);
    }
}
