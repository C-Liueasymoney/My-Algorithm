package reverseList_24;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 5:11 δΈε
 */
public class OfficialSolution {

    @Test
    public void test(){
        ListNode p1 = new ListNode(1);
        p1.next = new ListNode(2);
        p1.next.next = new ListNode(3);
        p1.next.next.next = new ListNode(4);

        reverseList(p1);
    }

    //ιε½
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode ret = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }
}
