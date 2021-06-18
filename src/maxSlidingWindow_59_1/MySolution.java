package maxSlidingWindow_59_1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description:
 * 主要思想是利用一个双端队列，令这个队列中的首位始终是滑动窗口的最大值
 * 实现方法是：
 * 1、在还未形成一个完整的窗口时，把遍历经过的元素加入队列末尾，如果发现这个元素比当前末尾的元素大，
 * 就把当前末尾移除，直到前面没有比他更大的或者队列为空只剩下它一个（此时它是遍历过的元素中的最大值）
 * 2、在形成完整窗口后，在窗口向右移动的过程中，检查刚刚被移出窗口的元素是否是队列中首位元素（最大元素）,
 * 如果是就要把它从队列首位移除。并且把新加入窗口的元素进行第一步中的比较，放入队列。最后记录下当前队列中的首位元素。
 * @Author: chong
 * @Data: 2021/5/31 1:09 下午
 */
public class MySolution {
    public int[] maxSlidingWindowWay(int[] nums, int k){
        if (nums.length == 0 || k == 0)
            return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
//        还未形成窗口
        for (int i = 0; i < k; i++){
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
//        别忘了把第一个窗口的最大值保存
        res[0] = deque.peekFirst();

//        已经形成了窗口
        for (int i = k; i < nums.length; i++){
//            检验刚刚出去窗口的值是不是最大值
            if (nums[i - k] == deque.peekFirst())
                deque.removeFirst();
//            把末尾比新值小的全移除
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }

        return res;
    }

    @Test
    public void test(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindowWay(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}
