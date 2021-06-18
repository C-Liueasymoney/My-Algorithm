package MaxQueue_59_2;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * 主要借助双端队列保存队列中的最大值，如果最大值出队列，辅助队列也出队列
 * 如果不是当前最大值出队列，辅助队列不用出
 * 在最大值之后进队的小值都会被保留，保证最大值出队后还能找到次小值
 * 如果在之后进队一个更大的值，就把之前的小值全移除，因为这些小值必然在此最大值之前出队，在这之前最大值一直都是这个数
 * @Author: chong
 * @Data: 2021/5/31 6:51 下午
 */
public class MySolution {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public MySolution(){
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!deque.isEmpty() && deque.peekLast() < value)
            deque.removeLast();
        deque.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty())
            return -1;
        Integer poll = queue.poll();
        if (poll.equals(deque.peekFirst()))
            deque.removeFirst();
        return poll;
    }

    @Test
    public void test(){
        MySolution mySolution = new MySolution();
        mySolution.push_back(15);
        System.out.println(mySolution.max_value());
        mySolution.push_back(9);

        System.out.println(mySolution.max_value());
    }
}
