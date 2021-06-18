package lastRemaining_62;

import org.junit.Test;

/**
 * @Description:
 * 时间复杂度O(MN)，超时
 * @Author: chong
 * @Data: 2021/6/1 2:11 下午
 */
public class MySolution {
    public int lastRemainingWay(int n, int m){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 1; i < n; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = head;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < m - 1; j++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        return temp.val;
    }


    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }


    @Test
    public void test(){
        int res = lastRemainingWay(10, 17);
        System.out.println(res);

    }
}
