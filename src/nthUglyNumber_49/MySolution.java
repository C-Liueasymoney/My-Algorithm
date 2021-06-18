package nthUglyNumber_49;

import org.junit.Test;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @Description:
 * 一个丑数是由其前面的丑数乘2/3/5而来
 * @Author: chong
 * @Data: 2021/5/27 1:29 下午
 */
public class MySolution {
    public int nthUglyNumberWay(int n){
        int[] factors = {2, 3, 5};
        PriorityQueue<Long> heap = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        set.add(1L);
        heap.offer(1L);
        int result = 0;
        for (int i = 0; i < n; i++){
            long uglyNum = heap.poll();
            result = (int) uglyNum;
            for (int factor : factors){
//                add方法如果在set中没有添加的元素就返回true，可以用来判断是否有重复元素
                if (set.add(uglyNum * factor))
                    heap.offer(uglyNum * factor);
            }
        }
        return result;
    }

    @Test
    public void test(){
        int res = nthUglyNumberWay(10);
        System.out.println(res);
    }
}
