package replaceSpace_05;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/10 4:46 下午
 */
public class OfficialSolution {
    @Test
    public void replaceSpaceTest(){
        String testStr = "We are happy.";
        String res = replaceSpaceWay(testStr);
        System.out.println(res);
    }

    //使用stringbuilder的方法
    public String replaceSpaceWay(String s){
        StringBuilder res = new StringBuilder();
        for (Character i : s.toCharArray()){
            if (i == ' '){
                res.append("%20");
            }else {
                res.append(i);
            }
        }
        return res.toString();
    }

    //书中使用双指针的方法
}
