package PrintListRevers_06;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/8 11:33 上午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MySolution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int length = list.size();
        int[] res = new int[length];
        for (int i = 0; i < length; i++){
            res[length - 1 - i] = list.get(i);
        }
        return res;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
}
