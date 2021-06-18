package getKthFromEnd_22;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/20 11:46 下午
 */
public class MySolution {
    public ListNode getKthFromEndWay(ListNode head, int k){
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            length++;
        }
        int point = length - k;
        for (int i = 0; i < point; i++){
            head = head.next;
        }
        return head;
    }
}
