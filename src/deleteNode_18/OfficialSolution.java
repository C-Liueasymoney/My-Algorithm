package deleteNode_18;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/19 9:58 下午
 */
public class OfficialSolution {
    public ListNode deleteNodeWay(ListNode head, int val){
        if (head == null) return null;
        if (head.val == val){
            return head.next;
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
