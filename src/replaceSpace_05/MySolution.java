package replaceSpace_05;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/10 4:20 下午
 */
public class MySolution {

    @Test
    public void replaceSpaceTest(){
        String testStr = "We are happy.";
        String res = replaceSpace(testStr);
        System.out.println(res);
    }

    public String replaceSpace(String s){
        char[] chars = s.toCharArray();
        char[] charsCopy = new char[chars.length * 3];
        int size = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == ' '){
                charsCopy[size] = '%';
                charsCopy[size + 1] = '2';
                charsCopy[size + 2] = '0';
                size += 3;
            }else {
                charsCopy[size] = chars[i];
                size++;
            }
        }
        String res = new String(charsCopy, 0, size);
        return res;
    }
}
