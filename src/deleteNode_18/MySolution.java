package deleteNode_18;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/19 8:10 下午
 */
public class MySolution {

    @Test
    public void test(){
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNode test = deleteNodeWay(head, 1);
        while (test != null){
            System.out.println(test.val);
            test = test.next;
        }
    }

    public ListNode deleteNodeWay(ListNode head, int val){
        if (head.val == val){
            head.val = head.next.val;
            head.next = head.next.next;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null){
            if (val == temp.next.val){
                temp.next = temp.next.next;
                return head;
            }else {
                temp = temp.next;
            }
        }
        return null;
    }
}

