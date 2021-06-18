package medianFinder_41;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/21 10:39 上午
 */
public class MySolution {
    Queue<Integer> a, b;
    public MySolution() {
        a = new PriorityQueue<>();
        b = new PriorityQueue<>((v1, v2) -> v2 - v1);
    }

    public void addNum(int num) {
        if (a.size() != b.size()){
            a.add(num);
            b.add(a.poll());
        }else {
            b.add(num);
            a.add(b.poll());
        }
    }

    public double findMedian() {
        return a.size() == b.size() ? (a.peek() + b.peek()) / 2.0 : a.peek();
    }
}
