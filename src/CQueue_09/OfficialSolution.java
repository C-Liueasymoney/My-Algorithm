package CQueue_09;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/12 1:44 下午
 */
public class OfficialSolution {
    class CQueue{
        private LinkedList<Integer> stack1;
        private LinkedList<Integer> stack2;

        public CQueue(){
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value){
            stack1.addLast(value);
        }

        public int deleteHead(){
            if (!stack2.isEmpty()) return stack2.removeLast();
            if (stack1.isEmpty()) return -1;
            while (!stack1.isEmpty()){
                stack2.addLast(stack1.removeLast());
            }
            return stack2.removeLast();
        }
    }
}
