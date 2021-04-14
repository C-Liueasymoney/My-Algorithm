package PrintListRevers_06;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/8 11:35 上午
 */
public class OfficialSolution {
    //方式一：栈，考察Java的Stack类的用法
    public int[] reversePrintStack(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++){
            print[i] = stack.pop().val;
        }
        return print;
    }

    //方式二：递归
    ArrayList<ListNode> list = new ArrayList<>();
    public int[] reversePrintRecursion(ListNode head){
        recur(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i).val;
        }
        return res;
    }

    private void recur(ListNode head){
        if (head == null){
            return;
        }
        recur(head);
        list.add(head);
    }



    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
}
