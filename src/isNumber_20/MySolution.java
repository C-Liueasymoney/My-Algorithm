package isNumber_20;

import org.junit.Test;

import java.util.Scanner;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/20 8:25 下午
 */
public class MySolution {
    @Test
    public void test(){
        isNumberWay("4e+");
    }

    public boolean isNumberWay(String s){
        if (s.length() == 0 || s == null) return false;
        char[] c = s.trim().toCharArray();
        if (c.length == 0) return false;
        boolean numFlag = false, dotFlag = false, eFlag = false;
        int dotCount = 0, eCount = 0;
        for (int i = 0; i < c.length; i++){
            if (c[i] >= '0' && c[i] <= '9'){
                numFlag = true;
                dotFlag = false;
                eFlag = false;
            }else if (c[i] == '.'){
                dotCount++;
                if (eFlag == true || dotFlag == true || (i == 0 && i + 1 == c.length) || dotCount > 1 || eCount > 0)
                    return false;
                dotFlag = true;
                numFlag = false;
                eFlag = false;
            }else if (c[i] == 'e' || c[i] == 'E'){
                eCount++;
                if (i == 0 || i == c.length - 1 || dotFlag == true || eFlag == true || eCount > 1)
                    return false;
                eFlag = true;
                dotFlag = false;
                numFlag = false;
            }else if(c[i] == '+' || c[i] == '-'){
                if (i != 0 && c[i - 1] != 'e' && c[i - 1] != 'E')
                    return false;
            }else return false;
        }
        return true;
    }
}
