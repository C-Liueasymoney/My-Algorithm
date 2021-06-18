package validateStackSequences_31;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/23 10:39 上午
 */
public class MySolution {

    public boolean validateStackSequencesWay(int[] pushed, int[] popped) {
        LinkedList<Integer> stack = new LinkedList<>();
        if (pushed.length != popped.length) return false;
        int i = 0, j = 0;

        while (j < popped.length){
            if (i < pushed.length) stack.addFirst(pushed[i++]);
            while (!stack.isEmpty() && stack.getFirst() == popped[j]){
                stack.removeFirst();
                j++;
            }
            if (!stack.isEmpty() && i == pushed.length && stack.getFirst() != popped[j]) return false;
        }
        return stack.isEmpty();
    }

    @Test
    public void test(){
        int[] push = {1,2,3,4,5};
        int[] pop = {4, 5, 3, 2, 1};
//        int[] push = {2, 1, 0};
//        int[] pop = {1, 2, 0};
        boolean res = validateStackSequencesWay(push, pop);
        System.out.println(res);
    }
}
