package CQueue_09;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/12 1:09 下午
 */
public class MySolution {

    @Test
    public void test(){
        CQueue cQueue = new CQueue();
        cQueue.appendTail(5);
        cQueue.appendTail(6);
        cQueue.appendTail(8);
        System.out.println(cQueue.stack1);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.stack1);
    }


    class CQueue{
        private List<Integer> stack1;
        private List<Integer> stack2;

        public CQueue(){
            stack1 = new ArrayList<>();
            stack2 = new ArrayList<>();
        }

        public void appendTail(int value){
            stack1.add(value);
            stack2.clear();
            for (int i = 0; i < stack1.size(); i++){
                stack2.add(stack1.get(stack1.size() - i - 1));
            }
        }

        public int deleteHead(){
            if (stack2.isEmpty()){
                return -1;
            }
            int head = stack2.remove(stack2.size() - 1);
            stack1.clear();
            for (int i = 0; i < stack2.size(); i++){
                stack1.add(stack2.get(stack2.size() - i - 1));
            }
            return head;
        }
    }
}
