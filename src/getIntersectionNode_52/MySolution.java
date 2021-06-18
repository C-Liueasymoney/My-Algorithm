package getIntersectionNode_52;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @Description:
 * 两个链表从后往前找，找到最后一个相同的节点，使用栈
 * 时间复杂度变成了O（M + N），但使用了额外的栈空间
 * @Author: chong
 * @Data: 2021/5/28 3:43 下午
 */
public class MySolution {
    public ListNode getIntersectionNodeWay(ListNode headA, ListNode headB){
        ListNode result = null;
        if (headA == null || headB == null)
            return result;
        LinkedList<ListNode> stack1 = new LinkedList<>();
        LinkedList<ListNode> stack2 = new LinkedList<>();
        while (headA != null){
            stack1.push(headA);
            headA = headA.next;
        }
        while (headB != null){
            stack2.push(headB);
            headB = headB.next;
        }
        while ((!stack1.isEmpty() || !stack2.isEmpty()) &&stack1.peek() == stack2.peek()){
            result = stack1.pop();
            stack2.pop();
        }
        return result;
    }
    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = listNode1;
        ListNode intersectionNodeWay = getIntersectionNodeWay(listNode1, listNode2);
//        System.out.println(intersectionNodeWay.val);
    }
}


//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}