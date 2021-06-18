package reverseList_24;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 11:21 上午
 */
public class MySulotion {
    public ListNode reverseList(ListNode head){
        ListNode preNode = head;
        ListNode latterNode = null;
        while (preNode != null){
            ListNode temp = preNode.next;
            preNode.next = latterNode;
            latterNode = preNode;
            preNode = temp;
        }
        return latterNode;
    }
}
