package getLeastNumbers_40;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/21 10:17 上午
 */
public class OfficialSolution2 {
    public int[] getLeastNumbersWay(int[] nums, int k){
        if (k == 0 || nums.length == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : nums){
            if (priorityQueue.size() < k)
                priorityQueue.offer(num);
            else if (num < priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.offer(num);
            }
        }

        int[] res = new int[priorityQueue.size()];
        int index = 0;
        for (int num : priorityQueue)
            res[index++] = num;
        return res;
    }

    @Test
    public void test(){
        int[] ints = {0, 1, 2, 1};
        int[] numbersWay = getLeastNumbersWay(ints, 1);
        System.out.println(Arrays.toString(numbersWay));
    }
}
