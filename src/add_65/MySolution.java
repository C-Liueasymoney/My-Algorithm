package add_65;

import org.junit.Test;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/2 2:48 下午
 */
public class MySolution {
    public int addWay(int a, int b){
        // 循环是为了c与a进行相加（也就是异或）之后仍需要进位
        while (b != 0){
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

    @Test
    public void test(){
        int res = addWay(3, 7);
        System.out.println(res);
    }
}
