package getKthFromEnd_22;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 12:20 上午
 */
public class OfficialSolution {
    public ListNode getKthFromEndWay(ListNode head, int k){
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++){
            former = former.next;
        }
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
