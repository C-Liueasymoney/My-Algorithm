package findContinuousSequence_57_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/30 11:25 下午
 */
public class MySolution {
    public int[][] findContinuousSequenceWay(int target){
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        int j = 1;
        for (int i = 2; i < target;){
            if (i <= j){
                i++;
                continue;
            }
            for (int k = j; k <= i; k++){
                sum += k;
            }
            if (sum == target){
                int[] temp = new int[i - j + 1];
                for (int k = 0, h = j; k < temp.length; k++)
                    temp[k] = h++;
                result.add(temp);
                i++;
                j++;
            }else if (sum < target){
                i++;
            }else{
                j++;
            }
            sum = 0;
        }
        return result.toArray(new int[result.size()][]);
    }

    @Test
    public void test(){
        int[][] res = findContinuousSequenceWay(15);
        for (int[] r: res) {
            System.out.println(Arrays.toString(r));
        }
    }
}
