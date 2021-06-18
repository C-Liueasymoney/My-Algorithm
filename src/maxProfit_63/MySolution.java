package maxProfit_63;

import org.junit.Test;



/**
 * @Description:
 * 思路总体是：遍历数组找到当前遍历过的数组中的最小值保存下来，一旦发现有比此最小值大的数字
 * 就用此数字减去最小值，并与结果res比较存入结果中，发现有比当前最小值小的数字就更换为当前最小值
 * @Author: chong
 * @Data: 2021/6/2 9:01 上午
 */
public class MySolution {
    public int maxProfitWay(int[] prices){
        if (prices.length == 0)
            return 0;
        int minValue = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > minValue && (prices[i] - minValue) > res) {
                res = prices[i] - minValue;
            }
            if (prices[i] < minValue){
                minValue = prices[i];
            }
        }

        return res;
    }


    @Test
    public void test(){
        int[] prices = {7,6,4,3,1};
        int res = maxProfitWay(prices);
        System.out.println(res);
    }
}
