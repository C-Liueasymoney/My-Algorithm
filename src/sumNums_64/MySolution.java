package sumNums_64;

import org.junit.Test;

/**
 * @Description:
 * 短路效应
 * @Author: chong
 * @Data: 2021/6/2 1:36 下午
 */
public class MySolution {
    public int sumNumsWay(int n){
        boolean x = (n > 1) && (n +=sumNumsWay(n - 1)) > 0;
        return n;
    }


    @Test
    public void test(){
        int res = sumNumsWay(4);
        System.out.println(res);
    }
}
