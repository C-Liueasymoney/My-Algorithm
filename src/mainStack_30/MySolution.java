package mainStack_30;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/22 10:38 下午
 */
public class MySolution {
    LinkedList<Integer> stack;
    LinkedList<Integer> auxStack;

    public MySolution() {
        stack = new LinkedList<>();
        auxStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.addFirst(x);
        if (auxStack.isEmpty()) {
            auxStack.addFirst(x);
        } else if (x < auxStack.getFirst()) {
                auxStack.addFirst(x);
            } else
                auxStack.addFirst(auxStack.getFirst());
    }

    public void pop() {
        stack.removeFirst();
        auxStack.removeFirst();
    }

    public int top() {
        return stack.getFirst();
    }

    public int min() {
        return auxStack.getFirst();
    }
}
