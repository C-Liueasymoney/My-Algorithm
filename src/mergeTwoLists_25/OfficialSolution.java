package mergeTwoLists_25;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 8:59 下午
 */
public class OfficialSolution {
    //迭代
    public ListNode mergeTwoListsWay(ListNode l1, ListNode l2){
        //创建一个辅助节点，作为合并后链表的首节点
        ListNode res = new ListNode(0);
        //创建temp暂存res链表
        ListNode temp = res;
        while (l1 != null && l2 != null){
            //l1.val < l2.val -> l1加到res链表中，l1前进一位，temp前进一位
            if (l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }else {
                //同上
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        //进行判断哪个链表还没有遍历完，把它加到res中
        temp.next = l1 == null? l2 : l1;
        //不要辅助节点，返回res.next
        return res.next;
    }
}
